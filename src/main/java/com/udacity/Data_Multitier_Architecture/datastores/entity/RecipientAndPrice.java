package com.udacity.Data_Multitier_Architecture.datastores.entity;

import java.math.BigDecimal;

// This is a projection class
public class RecipientAndPrice {
    private String recipientName;
    private BigDecimal price;

    public RecipientAndPrice(String recipientName, BigDecimal price) {
        this.recipientName = recipientName;
        this.price = price;
    }
}
