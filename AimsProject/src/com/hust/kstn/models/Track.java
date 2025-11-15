package com.hust.kstn.models;

public class Track {
    private String title;
    private int length;
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
    public String getTitle() {
        return title;
    }
    public int getLength() {
        return length;
    }
    @Override
    public String toString() {
        return "[" + this.title + "]["
                + this.length + "]";
    }
}
