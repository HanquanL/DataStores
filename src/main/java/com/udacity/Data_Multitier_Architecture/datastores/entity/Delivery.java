package com.udacity.Data_Multitier_Architecture.datastores.entity;




import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;
import org.hibernate.type.YesNoConverter;


import java.time.LocalDateTime;
import java.util.List;

@NamedQuery(name = "Delivery.findByName",
               query = "select d from Delivery d where d.name = :name")
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

    //Lazy fetch optional,but often a good idea for collection attributes
    // added CascadeType.REMOVE to automatically clear any associated plants when removed
    //Set the cascade to CascadeType.ALL for List<Plant> plants in Delivery.java,
    // to make it easier for us to persist everything at once for testing.
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "delivery", cascade = CascadeType.ALL)
    private List<Plant> plants;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public void setPlants(List<Plant> plants) {
        this.plants = plants;
    }
}
