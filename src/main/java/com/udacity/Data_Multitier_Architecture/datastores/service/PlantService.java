package com.udacity.Data_Multitier_Architecture.datastores.service;

import com.udacity.Data_Multitier_Architecture.datastores.entity.Plant;
import org.springframework.stereotype.Service;

@Service
public class PlantService {
    public Plant getPlantByName(String name){
        return new Plant();
    }
}
