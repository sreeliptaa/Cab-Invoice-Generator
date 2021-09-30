package com.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceGeneratorTest {
    @Test
    public void givenDistanceAndTime_shouldReturnTotalFare() {
        InvoiceGenerator invoice = new InvoiceGenerator();
        double distance = 2.0, time = 5.0;
        double fare = invoice.calculateFare(distance, time);
        Assertions.assertTrue(fare == 25);
    }
}
