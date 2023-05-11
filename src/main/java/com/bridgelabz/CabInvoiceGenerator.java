package com.bridgelabz;

public class CabInvoiceGenerator {
    static final double COST_PER_KILOMETER = 10;
    static final double COST_PER_MINUTE = 1;
    static final double MIN_FARE = 5;

    public double calculateFare(double distance, int time) {
        double totalFare = distance * COST_PER_KILOMETER + time * COST_PER_MINUTE;
        return totalFare < MIN_FARE ? MIN_FARE : totalFare;

    }
}
