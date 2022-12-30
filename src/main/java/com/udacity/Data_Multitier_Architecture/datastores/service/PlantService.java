package com.udacity.Data_Multitier_Architecture.datastores.service;

import com.udacity.Data_Multitier_Architecture.datastores.entity.Plant;
import com.udacity.Data_Multitier_Architecture.datastores.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PlantService {

    @Autowired
    PlantRepository plantRepository;
    public Plant getPlantByName(String name){
        return new Plant();
    }

    public Long save(Plant plant){
        return plantRepository.save(plant).getId();
    }

    public Boolean delivered(Long id){
        return plantRepository.deliveryCompleted(id);
    }

    public List<Plant> findPlantsBelowPrice(BigDecimal price) {
        return plantRepository.findByPriceLessThan(price);
    }
}
