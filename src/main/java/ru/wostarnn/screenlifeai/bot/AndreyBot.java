package ru.wostarnn.screenlifeai.bot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.groupadministration.BanChatMember;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public class AndreyBot extends TelegramLongPollingBot {
    @Value("${andrey.name}")
    private String botUsername;

    public AndreyBot(@Value("${andrey.token}") String botToken) {
        super(botToken);
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getChatId());
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
    }

    public void kick(Long id, String chatId) throws TelegramApiException {
        BanChatMember banChatMember = new BanChatMember();
        banChatMember.setChatId(chatId);
        banChatMember.setUserId(id);
        execute(banChatMember);
    }
}
