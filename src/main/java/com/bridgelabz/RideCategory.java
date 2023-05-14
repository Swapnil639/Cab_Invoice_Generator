package com.bridgelabz;

public enum RideCategory {
    NORMAL(10, 1),
    PREMIUM(15, 2);

    private final int MIN_FARE;
    private final int COST_PER_KILOMETER;

    RideCategory(int costPerKm, int costPerMinute) {
        this.MIN_FARE = costPerKm;
        this.COST_PER_KILOMETER = costPerMinute;
    }

    public int getMIN_FARE() {
        return MIN_FARE;
    }

    public int getCOST_PER_KILOMETER() {
        return COST_PER_KILOMETER;
    }
}