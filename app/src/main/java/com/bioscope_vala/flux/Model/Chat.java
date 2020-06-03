package com.bioscope_vala.flux.Model;

public class Chat {

    private String sender;
    private boolean iseen;
    private String receiver;
    private String message;

    public Chat(String sender, String receiver, String message,boolean iseen) {
        this.iseen = iseen;
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
    }

    public Chat() {
    }

    public boolean isIseen() {
        return iseen;
    }

    public void setIseen(boolean iseen) {
        this.iseen = iseen;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
