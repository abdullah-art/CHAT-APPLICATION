package com.example.chatbox;

public class Messages {

    private String to,from,message,type;

    public Messages(){

    }

    public Messages(String to, String from, String message, String type) {
        this.to = to;
        this.from = from;
        this.message = message;
        this.type = type;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
