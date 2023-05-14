package com.bridgelabz;

public class Ride {
    private double distance;
    private int time;
    RideCategory rideCategory;

    public Ride(double distance, int time, RideCategory rideCategory) {
        this.distance = distance;
        this.time = time;
        this.rideCategory = rideCategory;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public RideCategory getRideCategory() {
        return rideCategory;
    }

    public void setRideCategory(RideCategory rideCategory) {
        this.rideCategory = rideCategory;
    }
}