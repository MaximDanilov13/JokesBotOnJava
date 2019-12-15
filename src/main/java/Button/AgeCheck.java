package Button;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class AgeCheck {
    public static SendMessage ageCheck(long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);

        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add("Yes");
        keyboardFirstRow.add("No");

        keyboard.add(keyboardFirstRow);

        replyKeyboardMarkup.setKeyboard(keyboard);

        return new SendMessage().setChatId(chatId).setText("Вам есть 18 лет?").setReplyMarkup(replyKeyboardMarkup);
    }
}
