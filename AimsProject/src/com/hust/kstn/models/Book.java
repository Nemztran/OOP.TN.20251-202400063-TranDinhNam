package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private int numOfTokens;
    private List<BookAuthor> authors = new ArrayList<>();
    public Book(String title, String category, double cost, int numOfTokens, List<BookAuthor> authors) {
            super(title, category, cost);
            this.authors = new ArrayList<>(authors);
            this.numOfTokens = numOfTokens;
    }
    public int getNumOfTokens() {
        return numOfTokens;
    }
    public List<BookAuthor> getAuthors() {
        return new ArrayList<>(authors);
    }
    @Override
    public String toString() {
        return super.toString() +
                + this.numOfTokens + "]"
                + "\nAuthors: " + this.authors;
    }

}
