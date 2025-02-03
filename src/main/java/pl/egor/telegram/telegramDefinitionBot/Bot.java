package pl.egor.telegram.telegramDefinitionBot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {
	
	private final String BOT_TOKEN = "6621838514:AAFSMolUjJKxMb33nFASElJMJpe4kpoXiWY";
	private final String BOT_NAME = "wef1999bot";

	private final Definition definition = new Definition();
	
	@Override
	public void onUpdateReceived(Update update) {
		// TODO Auto-generated method stub
		if(update.hasMessage()) {
		Long chatId =	update.getMessage().getChatId();
		String userText = update.getMessage().getText();
		
		switch(userText) {
		
		case "/start" :
			sendMessage(chatId,"I will help you with definitions");
		break;
		
		
		case "/help" :
			sendMessage(chatId,"Just input a word");
			break;
			
	    default : sendMessage(chatId,definition.getDefinition(userText));
		
		}
	}
	}

	@Override
	public String getBotUsername() {
		// TODO Auto-generated method stub
		return BOT_NAME;
	}

	@Override
	public String getBotToken() {
		// TODO Auto-generated method stub
		return BOT_TOKEN;
	}

	public void sendMessage(Long chatId, String textMessage) {
		SendMessage sendMessage = new SendMessage();
		sendMessage.setChatId(chatId);
		sendMessage.setText(textMessage);
		
		try {
			executeAsync(sendMessage);
		} catch (TelegramApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
