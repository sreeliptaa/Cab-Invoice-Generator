package com.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class InvoiceGeneratorTest {
    InvoiceService invoiceService = null;

    @BeforeEach
    public void setUp() {
        invoiceService = new InvoiceService();
    }

    @Test
    public void givenUserIdAndRides_ShouldReturnInvoiceSummary() {
        String userId = "sree@gmail.com";
        Ride[] rides = {new Ride(2.0, 5),
                new Ride(0.1, 1)
        };
        invoiceService.addRides(userId, rides);
        InvoiceSummary summary = invoiceService.getInvoiceSummary(userId);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
        Assertions.assertEquals(expectedInvoiceSummary, summary);
    }

}



