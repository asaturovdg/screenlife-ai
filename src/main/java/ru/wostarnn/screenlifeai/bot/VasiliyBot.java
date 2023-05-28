package ru.wostarnn.screenlifeai.bot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public class VasiliyBot extends TelegramLongPollingBot {
    @Value("${vasiliy.name}")
    private String botUsername;

    public VasiliyBot(@Value("${vasiliy.token}") String botToken) {
        super(botToken);
    }

    @Override
    public void onUpdateReceived(Update update) {
    }

    @Override
    public String getBotUsername() {
        return botUsername;
    }

    public void sendMessage(String message, String chatId) throws TelegramApiException {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(message);
        execute(sendMessage);
        System.out.println();
    }

}
