package com.example.api_diseaselist;

public class Disease {

    private String title; //제목
    private String message; //내용


    public Disease(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }
}