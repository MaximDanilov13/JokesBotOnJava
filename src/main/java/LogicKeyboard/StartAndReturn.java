package LogicKeyboard;

import Button.*;
import org.telegram.telegrambots.api.methods.send.SendMessage;


public class StartAndReturn {
    public static SendMessage startAndReturn(String update, long chatId) {
        if (update.equals("Start"))
            return AgeCheck.ageCheck(chatId);
        if (update.equals("/start"))
            return StartKeyboard.startKeyboard(chatId);
        if(update.equals("return"))
            return MainMenuKeyboard.mainMenu(chatId);
        return null;
    }
}

/*

 */

