package ru.wostarnn.screenlifeai.manager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.wostarnn.screenlifeai.bot.*;

@Component
public class ScreenlifeManager implements ApplicationListener<ContextRefreshedEvent> {

    private final PromptManager promptManager;
    @Value("${group.chatId}")
    private String groupChatId;
    @Value("${mafia.chatId}")
    private String mafiaChatId;
    private final AndreyBot andrey;
    private final MashaBot masha;
    private final VitaliyBot vitaliy;
    private final AngelicaBot angelica;
    private final VasiliyBot vasiliy;
    private final StanislavBot stanislav;
    private final PetyaBot petya;

    public ScreenlifeManager(PromptManager promptManager, AndreyBot andrey, MashaBot masha, VitaliyBot vitaliy, AngelicaBot angelica, VasiliyBot vasiliy, StanislavBot stanislav, PetyaBot petya) {
        this.promptManager = promptManager;
        this.andrey = andrey;
        this.masha = masha;
        this.vitaliy = vitaliy;
        this.angelica = angelica;
        this.vasiliy = vasiliy;
        this.stanislav = stanislav;
        this.petya = petya;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        try {
            makePlot();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void makePlot() throws TelegramApiException, InterruptedException {
//        andrey.sendMessage("Я Андрей", groupChatId);
//        Thread.sleep(2000L);
//        masha.sendMessage("Привет, Андрей", groupChatId);
//        andrey.sendMessage("Сегодня будет вечеринка по случаю моего дня рождения!", groupChatId);
//        Thread.sleep(750L);
//        vitaliy.sendMessage("Спасибо, что пригласили!", groupChatId);
//        String gptAnswer = promptManager.generateMessage("Расскажи, сколько тебе лет?", "Тебя зовут Василий");
//        vitaliyBot.sendMessage(gptAnswer, groupChatId);
//        Thread.sleep(1000L);
//        vasiliy.sendMessage("Рад всех видеть!", groupChatId);
//        Thread.sleep(200L);
//        andrey.sendMessage("А я тебя нет", groupChatId);
//        andrey.kick(6001971415L, groupChatId);
        andrey.sendMessage("Ребята, приветствую.\nСоздал беседу по случаю моего дня рождения.\n Жду вас всех.", groupChatId);
        Thread.sleep(2200L);
        angelica.sendMessage("Приветик, Андрюш!\nДавно не виделись, поздравляю тебя, мой сладкий.", groupChatId);
        Thread.sleep(1200L);
        vitaliy.sendMessage("Желаю быть всегда в строю,\nСчастливо строить жизнь свою.\nЛюбви, огромного везенья,\nИ боевого настроенья!", groupChatId);
        Thread.sleep(800L);
        vasiliy.sendMessage("Важнее всего здоровье!!!\nКак можно реже появляйся у меня на приемах!", groupChatId);
        masha.sendMessage("Сосед, привет! С днюхой тебя, сахар верну чуть позже...", groupChatId);
        Thread.sleep(1200L);
        stanislav.sendMessage("Вот это улов, сегодня развлечемся!", groupChatId);
        Thread.sleep(1100L);
        petya.sendMessage("с др короч", groupChatId);
        Thread.sleep(2000L);
        andrey.sendMessage("Коллеги, всем спасибо за тёплые слова. Мы собрались не просто так, нас ждет игра.", groupChatId);
        Thread.sleep(1200L);
        angelica.sendMessage("Как классно, я люблю всякие игры ;)", groupChatId);
        Thread.sleep(300L);
        petya.sendMessage("-_-", groupChatId);
        Thread.sleep(600L);
        vitaliy.sendMessage("Анжел, поубавь пыл, ты не на работе", groupChatId);
        Thread.sleep(12000L);
        //Коллеги, соберитесь! Город засыпает.
        //Просыпается мафия. Мафия делает свой выбор.
        andrey.sendMessage("С кого начнем?", mafiaChatId);
        Thread.sleep(1200L);
        stanislav.sendMessage("Это неважно...", mafiaChatId);
        masha.sendMessage("Что ещё за мафия?", groupChatId);
        petya.sendMessage("лол", groupChatId);
        Thread.sleep(950L);
        stanislav.sendMessage("Живым отсюда никто не уйдет", mafiaChatId);
        andrey.sendMessage("Это мой день рождения, и я хочу развлекаться всю ночь.", mafiaChatId);
        vasiliy.sendMessage("Что это за подстава?\nКто распределял роли?", groupChatId);
        Thread.sleep(1000L);
        angelica.sendMessage("А мне вот моя роль нравится!", groupChatId);
        Thread.sleep(800L);
        stanislav.sendMessage("Ла-адно, тогда начнем с этой рыжей стервы. Давно хотел её задушить", mafiaChatId);
        Thread.sleep(11000L);
        //Мафия сделала свой выбор. Просыпается комиссар
        vitaliy.sendMessage("Так, и что я должен делать?", groupChatId);
        Thread.sleep(900L);
        vasiliy.sendMessage("Ты когда в последний раз ко мне на МРТ приходил?\nЗачем в общий чат пишешь?", groupChatId);
        Thread.sleep(900L);
        vitaliy.sendMessage("А я че знаю правила игры?!", groupChatId);
        Thread.sleep(1100L);
        stanislav.sendMessage("Правила довольно просты :)\nПобеждает только мафия, а вы умираете", groupChatId);
        Thread.sleep(700L);
        masha.sendMessage("Андрей, ты говорил, что будет весело\nЭто че за фигня", groupChatId);
        Thread.sleep(700L);
        andrey.sendMessage("Веселье каждому своё.\nСтас, мы так не договаривались.", groupChatId);
        Thread.sleep(1100L);
        stanislav.kick(6070771192L, groupChatId);
        Thread.sleep(1200L);
        stanislav.sendMessage("Ой, ты что-то сказал?", groupChatId);
        Thread.sleep(900L);
        vasiliy.sendMessage("Господи Боже!!\nНе волнуйтесь, я врач, я её подлатаю и вер-", groupChatId);
        stanislav.kick(6001971415L, groupChatId);
        Thread.sleep(900L);
        petya.sendMessage("кек", groupChatId);
        vitaliy.sendMessage("НИ С МЕСТА! ЭТО ПОЛИЦИЯ! РУКИ ЗА ГОЛОВУ!", groupChatId);
        Thread.sleep(1100L);
        angelica.sendMessage("Ну мальчики, не ссорьтесь!", groupChatId);
        stanislav.sendMessage("Бах!", groupChatId);
        Thread.sleep(500L);
        stanislav.kick(5863579343L, groupChatId);
        Thread.sleep(1000L);
        petya.sendMessage("как хорошо что я не пришел лол", groupChatId);
        Thread.sleep(1200L);
        angelica.sendMessage("Намёк поняла, бегу!", groupChatId);
        Thread.sleep(1100L);
        stanislav.sendMessage("Хах, не так быстро", groupChatId);
        Thread.sleep(600L);
        stanislav.kick(6140375948L, groupChatId);
        Thread.sleep(8000L);
        andrey.sendMessage("Чтож, мафия сделала свой выбор...", mafiaChatId);
        Thread.sleep(900L);
        stanislav.sendMessage("После стольких лет.\nПосле такой плодотворной дружбы\nТы думаешь, что сможешь убить меня, дружок?\nНУ ПОПРОБУЙ", mafiaChatId);
        Thread.sleep(1000L);
        andrey.sendMessage("Ты дебил? Я про ведущего.", mafiaChatId);
        Thread.sleep(1500L);
        andrey.kick(290647931L, mafiaChatId);
        andrey.kick(290647931L, groupChatId);
    }
}
