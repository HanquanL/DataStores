package com.udacity.Data_Multitier_Architecture.datastores.entity;




import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;
import org.hibernate.type.YesNoConverter;


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
    @Convert(converter = YesNoConverter.class) // @Type(type = "yes_no") replacement
    private Boolean completed;

}
