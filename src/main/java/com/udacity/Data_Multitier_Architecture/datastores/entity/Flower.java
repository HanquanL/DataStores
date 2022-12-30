package com.udacity.Data_Multitier_Architecture.datastores.entity;


import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;

@Entity
public class Flower extends Plant {


    private String color;




    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
