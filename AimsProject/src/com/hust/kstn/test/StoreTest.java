package com.hust.kstn.test;
import com.hust.kstn.models.Store;
import com.hust.kstn.models.DigitalVideoDisc;
public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc disc1 = new DigitalVideoDisc("Tran");
        DigitalVideoDisc disc2 = new DigitalVideoDisc("Dinh");
        DigitalVideoDisc disc3 = new DigitalVideoDisc("Nam");
        store.removeDVD(disc2);
        store.addDVD(disc1);
       // store.addDVD(disc2);
        store.addDVD(disc3);
        store.removeDVD(disc2);
    }
}
