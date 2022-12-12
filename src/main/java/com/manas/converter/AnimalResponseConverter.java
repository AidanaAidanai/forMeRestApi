package com.manas.converter;

import com.manas.dto.AnimalRequestDto;
import com.manas.dto.AnimalResponseDto;
import com.manas.entity.Animal;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AnimalResponseConverter {
    public AnimalResponseDto viewAnimal(Animal animal){
        if(animal == null){
            return null;
        }
        AnimalResponseDto animalResponseDto = new AnimalResponseDto();
        animalResponseDto.setName(animal.getName());
        animalResponseDto.setColor(animal.getColor());
        animalResponseDto.setAge(animal.getAge());
       // animalResponseDto.setPerson(animal.getPerson());
        return animalResponseDto;
    }

    public List<AnimalResponseDto> view(List<Animal> animals){
       List<AnimalResponseDto>  animalResponseDtos= new ArrayList<>();
        for (Animal animal:animals) {
            animalResponseDtos.add(viewAnimal(animal));
        }
        return animalResponseDtos;
    }
}
