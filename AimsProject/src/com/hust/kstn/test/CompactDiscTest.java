package com.hust.kstn.test;
import com.hust.kstn.models.CompactDisc;
import com.hust.kstn.models.Track;

import java.util.ArrayList;
import java.util.Arrays;

public class CompactDiscTest {
    public static void main(String[] args) {
        Track track1 = new Track("Track one", 36);
        Track track2 = new Track("Track two", 37);
        Track track3 = new Track("Track three", 38);
        CompactDisc disc = new CompactDisc("Disc 1th", "Category 1", 12, Arrays.asList(track1, track2));
        disc.removeTrack(track1);
        disc.removeTrack(track3);
        disc.addTrack(track3);
    }
}
