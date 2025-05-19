package com.example.quotes_app.Sad_Modenclass;

public class Sad_moden_class {
    public Integer Image_passing;
    public String Sad_name;
    public String Author_name;

    public Sad_moden_class(Integer Image_passing, String Sad_name, String Author_name) {
        this.Image_passing = Image_passing;
        this.Sad_name = Sad_name;
        this.Author_name = Author_name;

    }


    public int getImage_passing() {
        return Image_passing;
    }

    public String getSad_name() {
        return Sad_name;
    }


    public String getAuthor_name() {
        return Author_name;
    }

}
