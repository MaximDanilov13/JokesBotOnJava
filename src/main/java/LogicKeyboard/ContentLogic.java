package LogicKeyboard;

import Tools.*;
import User.UserInform;
import org.telegram.telegrambots.api.methods.send.SendMessage;

public class ContentLogic {
    public static SendMessage contentLogic(String update, long chatId){
        if (update.equals("Joke"))
            return SendingMessage.sendMsg(chatId,
                    JsonFileRead.getContent("joke" + UserInform.age));
        if (update.equals("Toasts"))
            return SendingMessage.sendMsg(chatId,
                    JsonFileRead.getContent("toasts" + UserInform.age));
        if (update.equals("Status"))
            return SendingMessage.sendMsg(chatId,
                    JsonFileRead.getContent("status" + UserInform.age));
        if (update.equals("Congratulation"))
            return SendingMessage.sendMsg(chatId,
                    JsonFileRead.getContent("congratulation" + UserInform.age));
        return null;
    }
}
