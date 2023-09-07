package pl.egor.telegram.TelegramDefinitionBot;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class Definition {
	
	private String newWord;

    
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
            System.out.println("Definition hasn't been found!");
        }

        return content.toString(); // Получение строки с данными.
    }

    // Метод, который получает текущее определение для указанного слова.
    public String getDefinition(String word) {
        //Возвращаемое значение метода getUrlContent() присваивается строке output.
    	
        String output = getUrlContent("https://api.dictionaryapi.dev/api/v2/entries/en/"+word);

        

        /**
         * Если output не пустой, то создаём json объект из строки и извлекаем из нее
         * необходимые данные. В конце возвращаем данные в текстовом формате.
         */
     
        if (!output.isEmpty()) {
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
        	 newWord = "Definition of the word " + word + ":"
                     + "\n\nDefinition: " + definition;

            System.out.println("\n"+newWord);
        }
       
        return newWord;
    }
    
}
