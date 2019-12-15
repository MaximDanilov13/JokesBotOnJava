package Tools;


import org.telegram.telegrambots.api.methods.send.SendMessage;

public class SendingMessage {
     public static SendMessage sendMsg(long chatId, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);
        return sendMessage;
    }
}
