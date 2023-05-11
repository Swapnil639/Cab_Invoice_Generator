package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class CabInvoiceGenerator {
    static final double COST_PER_KILOMETER = 10;
    static final double COST_PER_MINUTE = 1;
    static final double MIN_FARE = 5;
    static List<Customer> rideRepo = new ArrayList<>();

    public double calculateFare(double distance, int time) {
        double totalFare = distance * COST_PER_KILOMETER + time * COST_PER_MINUTE;
        return totalFare < MIN_FARE ? MIN_FARE : totalFare;
    }

    public double calculateFare(Ride[] rides) {
        double aggrigateFare = 0.0;
        for(Ride ride: rides){
            aggrigateFare = aggrigateFare + calculateFare(ride.getDistance(),ride.getTime());
        }
        return aggrigateFare;
    }

    public Invoice generateInvoice(Ride[] rides) {
        double totalFare = calculateFare(rides);
        int numberOfRides = rides.length;
        double average = totalFare / numberOfRides;
        return new Invoice(totalFare,numberOfRides,average);
    }

    public Invoice generateInvoiceByUserId(int userId) {
        for (Customer customer:rideRepo) {
            if(customer.userId == userId){
                return generateInvoice(customer.rides);
            }
        }
        return null;
    }
}