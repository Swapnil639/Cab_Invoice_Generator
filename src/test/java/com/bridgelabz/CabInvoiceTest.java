package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CabInvoiceTest {
    @Test
    public void givenDistanceAndTimeShouldReturnTotalFare(){
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double result = cabInvoiceGenerator.calculateFare(3.0,3);
        Assertions.assertEquals(33.0,result);
    }

    @Test
    public void givenDistanceAndTimeShouldReturnMinimumFare(){
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double result = cabInvoiceGenerator.calculateFare(0.2,1);
        Assertions.assertEquals(5.0,result);
    }

    @Test
    public void givenMultipleRidesShouldReturnTotalFare(){
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        Ride[] rides = {
                new Ride(2.0,2), new Ride(3.0,1)
        };

        double result = cabInvoiceGenerator.calculateFare(rides);
        Assertions.assertEquals(53.0,result);
    }

    @Test
    public void givenMultipleRidesShouldReturnInvoice(){
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        Ride[] rides = {
                new Ride(2.0,2),
                new Ride(3.0,1),
                new Ride(0.2,1)
        };

        Invoice invoice = cabInvoiceGenerator.generateInvoice(rides);
        Invoice expectedInvoice = new Invoice(58.0,3,58.0/3);
        Assertions.assertEquals(expectedInvoice,invoice);
    }

}
