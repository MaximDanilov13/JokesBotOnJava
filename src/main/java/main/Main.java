package main;

import Tools.JsonFileRead;
import org.json.JSONException;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;


import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, JSONException {
        JsonFileRead.baseData = JsonFileRead.fileRead(new File("").getAbsolutePath() + "/Botik/src/main/java/DatabaseGeneration/joke.txt");
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();

        Telegram bot = new Telegram();
        try {
            telegramBotsApi.registerBot(bot);
        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }
    }

}
