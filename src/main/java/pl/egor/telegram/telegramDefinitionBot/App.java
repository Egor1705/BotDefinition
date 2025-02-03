package pl.egor.telegram.telegramDefinitionBot;


import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;



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
            
		} catch (TelegramApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Translate translate = TranslateOptions.newBuilder().setApiKey("AIzaSyD894lVRW4xnfNDDO0Egq40ejmNchRZYvs").build().getService();
//		Translation t = translate.translate("Hello", Translate.TranslateOption.targetLanguage("ru"),Translate.TranslateOption.sourceLanguage("en"));
//		System.out.println(t.getTranslatedText());
		
	}
}
