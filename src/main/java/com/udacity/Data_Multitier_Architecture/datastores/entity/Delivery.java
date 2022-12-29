package com.udacity.Data_Multitier_Architecture.datastores.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.Type;

import java.time.LocalDateTime;

@Entity
@Table
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Nationalized
    private String name;
    @Column(name = "address_full", length = 500)
    private String address;
    private LocalDateTime deliveryTime;
    @Type (type = "yes_no")
    private Boolean completed;
}
