package com.okres.springlibrary.objects;

/**
 * Created by Alex on 08.07.2017.
 */
public class Genre {

    private String name;

    public Genre() {
    }

    public Genre(String genre) {
        this.name = genre;
    }

    public String getGenre() {
        return name;
    }

    public void setGenre(String genre) {
        this.name = genre;
    }
}
