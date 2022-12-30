package com.udacity.Data_Multitier_Architecture.datastores.service;

import com.udacity.Data_Multitier_Architecture.datastores.entity.Delivery;
import com.udacity.Data_Multitier_Architecture.datastores.entity.RecipientAndPrice;
import com.udacity.Data_Multitier_Architecture.datastores.repository.DeliveryRepository;
import com.udacity.Data_Multitier_Architecture.datastores.view.Views;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryServie {
    @Autowired
    DeliveryRepository deliveryRepository;

    public Long save(Delivery delivery){
        delivery.getPlants().forEach(plant -> plant.setDelivery(delivery));
        deliveryRepository.persist(delivery);
        return delivery.getId();
    }

    public RecipientAndPrice getBill(Long deliveryId){
        return deliveryRepository.getBill(deliveryId);
    }
}
