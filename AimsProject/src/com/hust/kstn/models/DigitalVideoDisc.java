package com.hust.kstn.models;
import java.util.Objects;
public class DigitalVideoDisc extends Disc{
    private String director;
    private int length;
    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        super(title, category, cost);
        this.length = length;
        this.director = director;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        DigitalVideoDisc disc = (DigitalVideoDisc) obj;
        return Objects.equals(this.getTitle(), disc.getTitle()) &&
                Objects.equals(this.getCategory(), disc.getCategory()) &&
                Objects.equals(this.director, disc.director) &&
                this.length == disc.length &&
                Double.compare(this.getCost(), disc.getCost()) == 0;
    }
    @Override
    public String toString() {
        return  super.toString()
                + "[" + this.director + "]"
                + "[" + this.length + "]";
    }
}
