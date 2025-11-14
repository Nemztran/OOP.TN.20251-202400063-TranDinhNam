package com.hust.kstn.models;
import com.hust.kstn.models.DigitalVideoDisc;
public class Store {
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[100];
    private static int numItems = 0;
    public void addDVD(DigitalVideoDisc disc) {
         itemsInStore[numItems++] = disc;
         System.out.println("===============Add DVD successfully!===============");
    }
    public void removeDVD(DigitalVideoDisc disc) {
         if (numItems <= 0) {
             System.out.println("===============The store is empty now!===============");
         }
         else {
             int rmIdx = -1;
             for (int i = 0; i < numItems; i++) {
                 if (itemsInStore[i].equals(disc)) {
                     rmIdx = i;
                     break;
                 }
             }
             if (rmIdx == -1) {
                 System.out.println("===============This DVD doesn't exist in the store now!===============");
             }
             else {
                 for (int j = rmIdx; j < numItems - 1; j++) {
                     itemsInStore[j] = itemsInStore[j+1];
                 }
                 itemsInStore[numItems - 1] = null;
                 numItems --;
                 System.out.println("===============The DVD has been removed successfully!===============");
             }
         }
    }
}
