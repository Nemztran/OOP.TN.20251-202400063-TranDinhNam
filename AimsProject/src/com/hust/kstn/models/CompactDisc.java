package com.hust.kstn.models;
import com.hust.kstn.models.Track;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;

public class CompactDisc extends Disc{
    private List<Track> tracks = new ArrayList<>();
    public CompactDisc(String title, String category, double cost, List<Track> tracks) {
        super(title, category, cost);
        this.tracks = new ArrayList<>(tracks);
    }
    public List<Track> getTracks() {
        return new ArrayList<>(tracks);
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nTracks: " + this.tracks;
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
