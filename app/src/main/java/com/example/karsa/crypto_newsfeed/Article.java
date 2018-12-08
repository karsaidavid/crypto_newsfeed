package com.example.karsa.crypto_newsfeed;

public class Article {
    private String title, text, date,imageurl;

    public Article() {
    }

    public Article(String title, String text, String date,String imageurl) {
        this.title = title;
        this.text = text;
        this.date = date;
        this.imageurl = imageurl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
}
