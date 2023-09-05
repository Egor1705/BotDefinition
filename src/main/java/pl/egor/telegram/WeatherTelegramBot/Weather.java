package pl.egor.telegram.WeatherTelegramBot;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class Weather {
	
	private String newWord;
    private final String APIkey = "50be56eaed2b7cf97bfa4078ce455a2f";

    
    public String getUrlContent(String urlAddress) {
        StringBuffer content = new StringBuffer();
        try {
            URL url = new URL(urlAddress);
            URLConnection urlConnection = url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                content.append(line + "\n");
            } // Считываем содержимое страницы построчно и добавляем его в объект StringReader
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("Город не найден!");
        }

        return content.toString(); // Получение строки с данными.
    }

    // Метод, который получает текущую погоду в указанном городе.
    public String getWeather(String word) {
        // Делаем запрос к OpenWeatherMap. Возвращаемое значение метода getUrlContent() присваивается строке output.
    	
        String output = getUrlContent("https://api.dictionaryapi.dev/api/v2/entries/en/"+word);
//                "https://api.openweathermap.org/data/2.5/weather?q="
//                        + city
//                        + "&appid=" + APIkey + "&units=metric"
        

        /**
         * Если output не пустой, то создаём json объект из строки и извлекаем из нее
         * необходимые данные. В конце возвращаем данные в текстовом формате.
         */
        System.out.println("\nHey");
      //  System.out.println(output);
        if (!output.isEmpty()) {
           // JSONObject object = new JSONObject(output);
        	List<String> text = Arrays.asList(output.split("definitions"));
        	String s[] = new String[text.size()];
        	String definition = "";
        	JSONArray array[] = new JSONArray[text.size()];
        	JSONObject objects[] = new JSONObject[text.size()];
        	for(int i=1;i<text.size();i++) {
        		s[i] = text.get(i).substring(2);
        		array[i] = new JSONArray(s[i]);
                objects[i] = array[i].getJSONObject(0);
                definition += objects[i].get("definition")+";  ";
               
        	}
        	 newWord = "Описание слова " + word + ":"
                     + "\n\nDefinition: " + definition;
//        	System.out.println("000 "+text.get(1));
//           String str = text.get(1).substring(2);
//           System.out.println(str);
//           
//            JSONArray array = new JSONArray(str);
//            JSONObject obj = array.getJSONObject(0);
//            System.out.println("\nobj "+obj);
//            
//           
//            System.out.println("\n"+obj.get("definition"));
//            newWord = "Описание слова " + word + ":"
//                    + "\n\nDefinition: " + obj.get("definition")
//                    + "\nСинонимы: " + obj.get("synonyms")
//                    + "\nАнтонимы: " + obj.get("antonyms");

            System.out.println("\n"+newWord);
        }
       
        return newWord;
    }
    
}
