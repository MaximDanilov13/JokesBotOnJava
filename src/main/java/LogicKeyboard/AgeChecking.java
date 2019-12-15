package LogicKeyboard;


import Button.MainMenuKeyboard;
import User.UserInform;
import org.json.JSONException;
import org.telegram.telegrambots.api.methods.send.SendMessage;

public class AgeChecking {
    public static SendMessage ageCheck(String update, long chatId) throws JSONException {
        if (update.equals("No"))
            UserInform.age = "";
        if (update.equals("Yes"))
            UserInform.age = "18";
        return MainMenuKeyboard.mainMenu(chatId);
    }
}
