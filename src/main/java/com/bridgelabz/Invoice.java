package com.bridgelabz;

import java.util.Objects;

public class Invoice {
    private int numberOfRides;
    private double average;
    private double totalFare;


    public Invoice(double totalFare, int numberOfRides, double average) {
        this.totalFare = totalFare;
        this.numberOfRides = numberOfRides;
        this.average = average;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return numberOfRides == invoice.numberOfRides && Double.compare(invoice.average, average) == 0 && Double.compare(invoice.totalFare, totalFare) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfRides, average, totalFare);
    }
}
