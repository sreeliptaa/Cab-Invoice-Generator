package com.tdd;

/**
 * Purpose - To simulate a Cab Invoice Generator
 * @author - Sreelipta
 * @since - 2021-09-30
 */

public class InvoiceGenerator {
    private static final double RATE_PER_KM = 10.0, RATE_PER_MIN = 1.0;

    public static void main(String[] args) {
        System.out.println("Welcome to Cab Invoice Generator");
    }

    public double calculateFare(double distanceInKm, double timeInMin) {
        int minRate = 5;
        double totalFare = RATE_PER_KM * distanceInKm + RATE_PER_MIN * timeInMin;
        return minRate > totalFare ? minRate : totalFare;
    }
}
