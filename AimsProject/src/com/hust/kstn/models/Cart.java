package com.hust.kstn.models;
import com.hust.kstn.models.DigitalVideoDisc;
import javax.accessibility.AccessibleEditableText;

public class Cart {
    private static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered = 0;
    public void addDVD(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBER_ORDERED) {
            System.out.println("The cart is almost full !");
        }
        else {
            itemsInCart[qtyOrdered] = disc;
            qtyOrdered ++;
            System.out.println("The dish has been added successfully !");
        }
    }
    public void addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        addDVD(disc1);
        addDVD(disc2);
    }
    public void addDVD(DigitalVideoDisc ...discs) {
        for (DigitalVideoDisc disc : discs) {
            addDVD(disc);
        }
    }
    public void removeDVD(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty !");
        }
        else {
            int removeIdx = -1;
            for (int i = 0; i < qtyOrdered; i++) {
                if (itemsInCart[i].equals(disc)) {
                    removeIdx = i;
                    break;
                }
            }
            if (removeIdx == -1) {
                System.out.println("The disc was not found in cart !");
            }
            else {
                for (int j = removeIdx; j < qtyOrdered - 1; j++) {
                    itemsInCart[j] = itemsInCart[j+1];
                }
                itemsInCart[qtyOrdered - 1] = null;
                System.out.println("The disc has been removed successfully");
                qtyOrdered--;
            }
        }
    }
    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (int i = 0; i < qtyOrdered; i++)
            totalCost += itemsInCart[i].getCost();
        return totalCost;
    }
    public void print() {
        System.out.println("=== Total items in cart: " + qtyOrdered + "===");
        System.out.println("=== All items in cart ===");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println("[Title]: " + itemsInCart[i].getTitle() + ", " +
                    "[Cost]: " + itemsInCart[i].getCost());
        }
    }
}

