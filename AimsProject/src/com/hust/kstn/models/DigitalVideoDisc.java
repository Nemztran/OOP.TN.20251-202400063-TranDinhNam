package com.hust.kstn.models;
import java.util.Objects;
public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private double cost;
    private String id;
    // Improvement
    private static int nbDigitalVideoDisc= 0;
    private static String generateId() {
        String formatId = String.format("%08d", nbDigitalVideoDisc);
        nbDigitalVideoDisc ++;
        return formatId;
    }
    public DigitalVideoDisc(String title) {
        this.title = title;
    }
    public DigitalVideoDisc(String category, String title, double cost) {
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.id = generateId();
    }
    public DigitalVideoDisc(String director, String category, String title, double cost) {
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.id = generateId();
    }
    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        this.id = generateId();
    }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public String getId() {
        return id;
    }
    public int getLength() {
        return length;
    }
    public double getCost() {
        return cost;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        DigitalVideoDisc disc = (DigitalVideoDisc) obj;
        return Objects.equals(this.title, disc.title) &&
                Objects.equals(this.category, disc.category) &&
                Objects.equals(this.director, disc.director) &&
                Objects.equals(this.length, disc.length) &&
                Objects.equals(this.cost, disc.cost);
    }
}
