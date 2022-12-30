package com.udacity.Data_Multitier_Architecture.datastores.service;

import java.math.BigDecimal;

public class PlantDTO {

    private String nam;
    private BigDecimal price;

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
