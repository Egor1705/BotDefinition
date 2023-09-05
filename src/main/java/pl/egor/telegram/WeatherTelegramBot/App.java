package pl.egor.telegram.WeatherTelegramBot;

import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.BotSession;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;



/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {
			Bot bot = new Bot();
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(bot);
            
String str = "[{\"word\":\"home\",\"phonetic\":\"/(h)əʊm/\",\"phonetics\":[{\"text\":\"/(h)əʊm/\",\"audio\":\"\"},{\"text\":\"/hoʊm/\",\"audio\":\"https://api.dictionaryapi.dev/media/pronunciations/en/home-us.mp3\",\"sourceUrl\":\"https://commons.wikimedia.org/w/index.php?curid=711130\",\"license\":{\"name\":\"BY-SA 3.0\",\"url\":\"https://creativecommons.org/licenses/by-sa/3.0\"}}],\"meanings\":[{\"partOfSpeech\":\"noun\",\"definitions\":[{\"definition\":\"A dwelling.\",\"synonyms\":[],\"antonyms\":[]},{\"definition\":\"One’s native land; the place or country in which one dwells; the place where one’s ancestors dwell or dwelt.\",\"synonyms\":[],\"antonyms\":[]},{\"definition\":\"The locality where a thing is usually found, or was first found, or where it is naturally abundant; habitat; seat.\",\"synonyms\":[],\"antonyms\":[],\"example\":\"the home of the pine\"},{\"definition\":\"A focus point.\",\"synonyms\":[],\"antonyms\":[]}],\"synonyms\":[\"home base\",\"abode\",\"domicile\",\"dwelling\",\"house\",\"residence\",\"tenement\"],\"antonyms\":[]},{\"partOfSpeech\":\"verb\",\"definitions\":[{\"definition\":\"(of animals) To return to its owner.\",\"synonyms\":[],\"antonyms\":[],\"example\":\"The dog homed.\"},{\"definition\":\"(always with \\\"in on\\\") To seek or aim for something.\",\"synonyms\":[],\"antonyms\":[],\"example\":\"The missile was able to home in on the target.\"}],\"synonyms\":[],\"antonyms\":[]},{\"partOfSpeech\":\"adjective\",\"definitions\":[{\"definition\":\"Of or pertaining to one’s dwelling or country; domestic; not foreign; as home manufactures; home comforts.\",\"synonyms\":[],\"antonyms\":[]},{\"definition\":\"(except in phrases) That strikes home; direct, pointed.\",\"synonyms\":[],\"antonyms\":[]},{\"definition\":\"Personal, intimate.\",\"synonyms\":[],\"antonyms\":[]},{\"definition\":\"Relating to the home team (the team at whose venue a game is played).\",\"synonyms\":[],\"antonyms\":[\"away\",\"road\",\"visitor\"],\"example\":\"the home end, home advantage, home supporters\"}],\"synonyms\":[],\"antonyms\":[\"away\",\"road\",\"visitor\"]},{\"partOfSpeech\":\"adverb\",\"definitions\":[{\"definition\":\"To one's home\",\"synonyms\":[],\"antonyms\":[]},{\"definition\":\"At or in one's place of residence or one's customary or official location; at home\",\"synonyms\":[],\"antonyms\":[],\"example\":\"Everyone's gone to watch the game; there's nobody home.\"},{\"definition\":\"To a full and intimate degree; to the heart of the matter; fully, directly.\",\"synonyms\":[],\"antonyms\":[]},{\"definition\":\"Into the goal\",\"synonyms\":[],\"antonyms\":[]},{\"definition\":\"Into the right, proper or stowed position\",\"synonyms\":[],\"antonyms\":[],\"example\":\"sails sheeted home\"}],\"synonyms\":[\"homeward\"],\"antonyms\":[]},{\"partOfSpeech\":\"noun\",\"definitions\":[{\"definition\":\"A directory that contains a user's files.\",\"synonyms\":[],\"antonyms\":[]}],\"synonyms\":[],\"antonyms\":[]}],\"license\":{\"name\":\"CC BY-SA 3.0\",\"url\":\"https://creativecommons.org/licenses/by-sa/3.0\"},\"sourceUrls\":[\"https://en.wiktionary.org/wiki/home\",\"https://en.wiktionary.org/wiki/home%20directory\"]}]";
            System.out.println("hi");
            JSONArray object = new JSONArray(str);
          //  JSONObject ob = object.getJSONObject(0);
         //  System.out.println(object);
           
		//System.out.println(o.get("meanings"));
//		
//		List<String> list = Arrays.asList(str.split("definitions"));
//	//	System.out.println(list.get(1));
//		
//		String str1 = list.get(1);
//		
//		
//		str1 = str1.substring(2);
//		System.out.println("-------");
//		System.out.println(str1);
//		JSONArray array = new JSONArray(str1);
//		JSONObject o = array.getJSONObject(0);
//		System.out.println(o.get("synonyms")+" "+o.get("antonyms")+" "+o.get("definition"));
		
		
		} catch (TelegramApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
