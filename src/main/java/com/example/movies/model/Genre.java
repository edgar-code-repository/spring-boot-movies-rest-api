package com.example.movies.model;

public class Genre {

    private int genreId;
    private String name;

    public Genre() {
    }

    @Override
    public String toString() {
        return "Genre {" + "genreId=" + genreId + ", name=" + name + "}";
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
