package com.manas.converter;

import com.manas.dto.AnimalRequestDto;
import com.manas.entity.Animal;
import org.springframework.stereotype.Component;

@Component
public class AnimalRequestConverter {
    public Animal create(AnimalRequestDto animalRequestDto){
        if(animalRequestDto == null){
            return  null;
        }
        Animal animal = new Animal();
        animal.setName(animalRequestDto.getName());
        animal.setAge(animalRequestDto.getAge());
        animal.setColor(animalRequestDto.getColor());
       // animal.setPerson(animalRequestDto.getPerson());
        return animal;
    }

    public  void update(Animal animal, AnimalRequestDto animalRequestDto){
        animal.setName(animalRequestDto.getName());
        animal.setAge(animalRequestDto.getAge());
        animal.setColor(animalRequestDto.getColor());
       // animal.setPerson(animalRequestDto.getPerson());
    }
}
