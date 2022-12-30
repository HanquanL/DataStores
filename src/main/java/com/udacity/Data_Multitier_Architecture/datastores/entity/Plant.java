package com.udacity.Data_Multitier_Architecture.datastores.entity;

import com.fasterxml.jackson.annotation.JsonView;
import com.udacity.Data_Multitier_Architecture.datastores.view.Views;
import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;

@Entity
@Table(name ="plant")
@Inheritance(strategy = InheritanceType.JOINED)
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JsonView(Views.Public.class)
    @Nationalized
    private String name;
    @JsonView(Views.Public.class)
    @Column(precision = 12, scale = 4)
    private BigDecimal price;
    @ManyToOne
            @JoinColumn(name = "delivery_id") //map the join column in the plant table
    Delivery delivery;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
