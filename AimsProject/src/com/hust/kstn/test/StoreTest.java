package com.hust.kstn.test;
import com.hust.kstn.models.Store;
import com.hust.kstn.models.DigitalVideoDisc;
public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc disc1 = new DigitalVideoDisc("Video 1", "Category 1", "Director 1", 13, 23);
        DigitalVideoDisc disc2 = new DigitalVideoDisc("Video 2", "Category 2", "Director 2", 14, 26);
        DigitalVideoDisc disc3 = new DigitalVideoDisc("Video 3", "Category 3", "Director 3", 15, 27);
        store.removeDVD(disc2);
        store.addDVD(disc1);
       // store.addDVD(disc2);
        store.addDVD(disc3);
        store.removeDVD(disc2);
    }
}
