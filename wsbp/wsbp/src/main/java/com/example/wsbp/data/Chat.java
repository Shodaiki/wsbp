package com.example.wsbp.data;

import java.io.Serializable;
import java.sql.Timestamp;

public class Chat implements Serializable {

    private final String userName;

    private final String msgBody;

    private final Timestamp chatTime;

    public Chat(String userName, String msgBody, Timestamp chatTime) {
        this.userName = userName;
        this.msgBody = msgBody;
        this.chatTime = chatTime;
    }

    public String getUserName() {
        return userName;
    }

    public String getMsgBody() {
        return msgBody;
    }

    public Timestamp getChatTime() {return chatTime;}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chat chat = (Chat) o;

        if (!userName.equals(chat.userName)) return false;
        return msgBody.equals(chat.msgBody);
    }

    @Override
    public int hashCode() {
        int result = userName.hashCode();
        result = 31 * result + msgBody.hashCode();
        return result;
    }
}
