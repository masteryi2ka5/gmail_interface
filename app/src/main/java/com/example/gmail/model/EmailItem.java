package com.example.gmail.model;

import android.graphics.Color;

import java.util.Random;

public class EmailItem {
    char text;
    String fromName;
    String title;
    String content;
    String time;
    boolean checkImportant;
    int color;
    Random rd = new Random();

    public EmailItem(String fromName, String title, String content, String time) {
        this.text = fromName.charAt(0);
        this.fromName = fromName;
        this.title = title;
        this.content = content;
        this.time = time;
        this.checkImportant = false;
        this.color = Color.argb(255, rd.nextInt(256), rd.nextInt(256), rd.nextInt(256));
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getText() {
        return String.valueOf(text);
    }

    public void setText(char text) {
        this.text = text;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isCheckImportant() {
        return checkImportant;
    }

    public void setCheckImportant(boolean checkImportant) {
        this.checkImportant = checkImportant;
    }
}
