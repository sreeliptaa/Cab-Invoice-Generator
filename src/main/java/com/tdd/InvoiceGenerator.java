package com.tdd;

/**
 * Purpose - To simulate a Cab Invoice Generator
 *
 * @author - Sreelipta
 * @since - 2021-09-30
 */

public class InvoiceGenerator {
    private static final double MINIMUM_COST_PER_KM = 10;
    private static final int COST_PER_TIME = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to Cab Invoice Generator");
    }

    public double calculateFare(double distance, int time) {
        return distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;
    }

    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += this.calculateFare(ride.distance, ride.time);
        }
        return new InvoiceSummary(rides.length, totalFare);
    }

}
