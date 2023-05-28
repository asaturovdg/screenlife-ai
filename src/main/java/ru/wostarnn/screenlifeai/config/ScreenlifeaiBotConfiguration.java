package ru.wostarnn.screenlifeai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import ru.wostarnn.screenlifeai.bot.AndreyBot;
import ru.wostarnn.screenlifeai.bot.MashaBot;
import ru.wostarnn.screenlifeai.bot.VitaliyBot;

@Configuration
public class ScreenlifeaiBotConfiguration {

    @Bean
    public TelegramBotsApi telegramBotsApiAndrey(AndreyBot bot) throws TelegramApiException {
        var api = new TelegramBotsApi(DefaultBotSession.class);
        api.registerBot(bot);
        return api;
    }

    @Bean
    public TelegramBotsApi telegramBotsApiMasha(MashaBot bot) throws TelegramApiException {
        var api = new TelegramBotsApi(DefaultBotSession.class);
        api.registerBot(bot);
        return api;
    }

    @Bean
    public TelegramBotsApi telegramBotsApiVitaliy(VitaliyBot bot) throws TelegramApiException {
        var api = new TelegramBotsApi(DefaultBotSession.class);
        api.registerBot(bot);
        return api;
    }
}
