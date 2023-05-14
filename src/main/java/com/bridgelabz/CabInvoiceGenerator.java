package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class CabInvoiceGenerator {
    static List<Customer> rideRepo = new ArrayList<>();

    public double calculateFare(double distance, int time, RideCategory rideCategory) {
        double totalFare = distance * rideCategory.getMIN_FARE() + time * rideCategory.getCOST_PER_KILOMETER();
        return totalFare < rideCategory.getMIN_FARE() ? rideCategory.getMIN_FARE() : totalFare;
    }

    public double calculateFare(Ride[] rides) {
        double aggrigateFare = 0.0;
        for(Ride ride: rides){
            aggrigateFare = aggrigateFare + calculateFare(ride.getDistance(),ride.getTime(),ride.getRideCategory());
        }
        return aggrigateFare;
    }

    public Invoice generateInvoice(Ride[] rides) {
        RideCategory rideCategoryValue = null;
        for(Ride ride: rides){
            rideCategoryValue = ride.getRideCategory();
        }
        double totalFare = calculateFare(rides);
        int numberOfRides = rides.length;
        double average = totalFare / numberOfRides;
        return new Invoice(totalFare,numberOfRides,average,rideCategoryValue);
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