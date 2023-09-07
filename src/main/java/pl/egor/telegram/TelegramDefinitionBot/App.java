package pl.egor.telegram.TelegramDefinitionBot;


import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
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
            
		} catch (TelegramApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
