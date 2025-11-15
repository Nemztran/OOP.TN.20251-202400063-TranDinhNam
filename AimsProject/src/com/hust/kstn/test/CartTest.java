package com.hust.kstn.test;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        System.out.println("Testing Cart with maximum capacity (20 DVDs)");
        System.out.println("==============================================");
        cart.removeDVD(new DigitalVideoDisc("Movie 0", "Category 0", "Director 0", 135, 36.3));
        // Create and add 20 DVDs
        for (int i = 1; i <= 20; i++) {
            DigitalVideoDisc dvd = new DigitalVideoDisc(
                    "Movie " + i,
                    "Category " + 10*i, // Rotating categories 1-5
                    "Director " + i,
                    100 + i,
                    36.36 + i
            );

            System.out.println("\nAdding DVD #" + i + ":");
            cart.addDVD(dvd);
        }
        cart.removeDVD(new DigitalVideoDisc("Movie 1", "Category 10", "Director 1", 101, 37.36));

        DigitalVideoDisc extraDvd = new DigitalVideoDisc("Movie 21", "Category plus", "Director plus", 120, 25.99);
        cart.addDVD(extraDvd);
        System.out.println("\n\nTotal cost: " + cart.calculateTotalCost() + "$");
    }
}