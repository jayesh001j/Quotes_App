package com.example.quotes_app.Moden;

public class Quotes_Model {

    public Integer image;
    public String Quotes;



    public Quotes_Model(Integer image, String Quotes) {
        this.image = image;
        this.Quotes = Quotes;

    }

    public int getImage() {
        return image;
    }



    public String getQuotes() {
        return Quotes;
    }

}
