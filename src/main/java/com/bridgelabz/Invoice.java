package com.bridgelabz;

import java.util.Objects;

public class Invoice {
    private int numberOfRides;
    private double average;
    private double totalFare;
    RideCategory rideCategory;


    public Invoice(double totalFare, int numberOfRides, double average, RideCategory rideCategory) {
        this.totalFare = totalFare;
        this.numberOfRides = numberOfRides;
        this.average = average;
        this.rideCategory = rideCategory;
    }

    public int getNumberOfRides() {
        return numberOfRides;
    }

    public void setNumberOfRides(int numberOfRides) {
        this.numberOfRides = numberOfRides;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }

    public RideCategory getRideCategory() {
        return rideCategory;
    }

    public void setRideCategory(RideCategory rideCategory) {
        this.rideCategory = rideCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return numberOfRides == invoice.numberOfRides && Double.compare(invoice.average, average) == 0 && Double.compare(invoice.totalFare, totalFare) == 0 && rideCategory == invoice.rideCategory;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfRides, average, totalFare, rideCategory);
    }
}