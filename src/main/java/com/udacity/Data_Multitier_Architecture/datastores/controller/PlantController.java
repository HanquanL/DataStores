package com.udacity.Data_Multitier_Architecture.datastores.controller;

import com.udacity.Data_Multitier_Architecture.datastores.entity.Plant;
import com.udacity.Data_Multitier_Architecture.datastores.service.PlantDTO;
import com.udacity.Data_Multitier_Architecture.datastores.service.PlantService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plant")
public class PlantController {
    @Autowired
    private PlantService plantService;

    public PlantDTO getPlantDTO(String name){

        return convertPlantToPlantDTO(plantService.getPlantByName(name));
    }

    public Plant getFilteredPlant(String name){
        return plantService.getPlantByName(name);
    }

    private PlantDTO convertPlantToPlantDTO(Plant plant){
        PlantDTO plantDTO = new PlantDTO();
        BeanUtils.copyProperties(plant, plantDTO);
        return plantDTO;
    }
}
