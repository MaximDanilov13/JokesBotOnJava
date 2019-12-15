package main;

import LogicKeyboard.AgeChecking;
import LogicKeyboard.ContentLogic;
import LogicKeyboard.MainMenuLogic;
import LogicKeyboard.StartAndReturn;

import org.json.JSONException;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import java.util.Objects;


public class Telegram extends TelegramLongPollingBot {

    @Override
    public String getBotToken() {
        return "765452665:AAGT8KJh1RrQaJifePHpHIKjjDLyQ4Y6gvw";
    }

    @Override
    public String getBotUsername() { return "Jokes_best_bot"; }

    @Override
    public void onUpdateReceived(Update update) {
        if(update.hasMessage()){
            if(update.getMessage().hasText()) {
                try {
                    if(update.getMessage().getText().equals("/start")
                            ||update.getMessage().getText().equals("Start")
                            ||update.getMessage().getText().equals("return"))
                        execute(Objects.requireNonNull(StartAndReturn.startAndReturn(update.getMessage().getText(),
                                update.getMessage().getChatId())));
                    if(update.getMessage().getText().equals("Yes")
                            ||update.getMessage().getText().equals("No"))
                        execute(AgeChecking.ageCheck(update.getMessage().getText(), update.getMessage().getChatId()));
                    if(update.getMessage().getText().equals("Help")
                            ||update.getMessage().getText().equals("Menu")
                            ||update.getMessage().getText().equals("Good"))
                        execute(Objects.requireNonNull(MainMenuLogic.mainMenuLogic(update.getMessage().getText(), update.getMessage().getChatId())));
                    if(update.getMessage().getText().equals("Joke")
                            ||update.getMessage().getText().equals("Status")
                            ||update.getMessage().getText().equals("Congratulation")
                            ||update.getMessage().getText().equals("Toasts"))
                        execute(Objects.requireNonNull(ContentLogic.contentLogic(update.getMessage().getText(), update.getMessage().getChatId())));
                } catch (TelegramApiException | JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
