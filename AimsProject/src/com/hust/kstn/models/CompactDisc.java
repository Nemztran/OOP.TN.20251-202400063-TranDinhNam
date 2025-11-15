package com.hust.kstn.models;
import com.hust.kstn.models.Track;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;

public class CompactDisc {
    private static int nbCompactDiscs = 0;
    private int id;
    private String title;
    private String category;
    private double cost;
    private List<Track> tracks = new ArrayList<>();
    public CompactDisc(String title, String category, double cost, List<Track> tracks) {
        this.id = nbCompactDiscs++;
        this.title = title;
        this.category = category;
        this.tracks = new ArrayList<>(tracks);
    }
    public int getId() {
        return id;
    }
    public double getCost() {
        return cost;
    }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public List<Track> getTracks() {
        return new ArrayList<>(tracks);
    }
    @Override
    public String toString() {
        return "Disc:[" + this.id + "]["
                + this.title + "]["
                + this.category + "]["
                + this.cost + "]"
                + "\nTracks: " + this.tracks;
    }
    public int totalLength() {
        int total = 0;
        for (Track track : tracks) {
            total += track.getLength();
        }
        return total;
    }
    public void addTrack(Track track) {
        tracks.add(track);
        System.out.println("============ Added successfully ============");
        System.out.println("============ The current track =============");
        System.out.println(this.tracks);
    }
    public void removeTrack(Track track) {
        if (!tracks.contains(track)) {
            System.out.println("============ This track hasn't existed in the Disc ============");
        }
        else {
            tracks.remove(track);
            System.out.println("============ Removed successfully ============");
            System.out.println("============ The current track =============");
            System.out.println(this.tracks);
        }
    }

}
