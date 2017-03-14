package com.eryuzhisen.model.message;

import com.eryuzhisen.model.attach.Attach;

public class MessageDataPackage {
    
    private UserProfile sender;
    
    private UserProfile receiver;
    
    private MessageContent content;
    
    private Attach attach;

    public UserProfile getSender() {
        return sender;
    }

    public void setSender(UserProfile sender) {
        this.sender = sender;
    }

    public UserProfile getReceiver() {
        return receiver;
    }

    public void setReceiver(UserProfile receiver) {
        this.receiver = receiver;
    }

    public MessageContent getContent() {
        return content;
    }

    public void setContent(MessageContent content) {
        this.content = content;
    }

    public Attach getAttach() {
        return attach;
    }

    public void setAttach(Attach attach) {
        this.attach = attach;
    }
    
    
}
