package com.hust.kstn.garbage;
import java.util.Random;
public class GarbageCreator {
    public static void main(String[] args) {
        int fileSize = 1000000;
        byte[] inputBytes = new byte[fileSize];
        new Random().nextBytes(inputBytes);
        long startTime = System.currentTimeMillis();
        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char) b;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time: " + (endTime - startTime));

    }
}