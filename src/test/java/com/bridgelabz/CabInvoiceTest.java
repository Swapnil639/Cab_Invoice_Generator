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

}
