package Button;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MenuKeyboard {
    public static SendMessage menu(long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add("Joke");
        keyboardFirstRow.add("Toasts");

        KeyboardRow keyboardSecondRow = new KeyboardRow();
        keyboardSecondRow.add("Status");
        keyboardSecondRow.add("Congratulation");

        KeyboardRow keyboardThirdRow = new KeyboardRow();
        keyboardThirdRow.add("return");

        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        keyboard.add(keyboardThirdRow);

        replyKeyboardMarkup.setKeyboard(keyboard);

        return new SendMessage().setChatId(chatId).setText("Menu").setReplyMarkup(replyKeyboardMarkup);
    }
}
