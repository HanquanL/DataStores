package com.udacity.Data_Multitier_Architecture.datastores.controller;

import com.udacity.Data_Multitier_Architecture.datastores.entity.Delivery;
import com.udacity.Data_Multitier_Architecture.datastores.entity.RecipientAndPrice;
import com.udacity.Data_Multitier_Architecture.datastores.service.DeliveryServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {
    @Autowired
    DeliveryServie deliveryServie;

    @PostMapping
    public Long scheduleDelivery(@RequestBody Delivery delivery){
        return deliveryServie.save(delivery);
    }

    @GetMapping("/bill/{deliveryId}")
    public RecipientAndPrice getBill(@PathVariable Long deliveryId){
        return deliveryServie.getBill(deliveryId);
    }

}
