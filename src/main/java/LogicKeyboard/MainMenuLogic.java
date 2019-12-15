package LogicKeyboard;

import Button.*;
import org.telegram.telegrambots.api.methods.send.SendMessage;


public class MainMenuLogic {
    public static SendMessage mainMenuLogic(String update, long chatId){
        if (update.equals("Help"))
            return ReturnKeyboard.help(chatId);
        if (update.equals("Menu"))
            return MenuKeyboard.menu(chatId);
        if(update.equals("return"))
            return StartKeyboard.startKeyboard(chatId);
        return null;
    }
}
