package com.manas.service.impl;

import com.manas.converter.AnimalRequestConverter;
import com.manas.converter.AnimalResponseConverter;
import com.manas.dto.AnimalRequestDto;
import com.manas.dto.AnimalResponseDto;
import com.manas.entity.Animal;
import com.manas.repository.AnimalRepository;
import com.manas.service.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimalServiceImpl implements AnimalService {
    private final AnimalRepository animalRepository;
    private  final AnimalRequestConverter animalRequestConverter;
    private  final AnimalResponseConverter animalResponseConverter;

    @Override
    public AnimalResponseDto saveAnimal(AnimalRequestDto animalRequestDto) {
        Animal animal = animalRequestConverter.create(animalRequestDto);
        animalRepository.save(animal);
        return animalResponseConverter.viewAnimal(animal);
    }

    @Override
    public List<AnimalResponseDto> findAllAnimal() {
        return animalResponseConverter.view(animalRepository.findAll());
    }

    @Override
    public AnimalResponseDto findById(Long id) {
        Animal animal = animalRepository.findById(id).get();
        return animalResponseConverter.viewAnimal(animal);
    }

    @Override
    public AnimalResponseDto deleteById(Long id) {
        Animal animal = animalRepository.findById(id).get();
        animalRepository.delete(animal);
        return animalResponseConverter.viewAnimal(animal);
    }

    @Override
    public AnimalResponseDto updateAnimal(Long id, AnimalRequestDto animalRequestDto) {
        Animal animal = animalRepository.findById(id).get();
        animalRequestConverter.update(animal,animalRequestDto);
        return animalResponseConverter.viewAnimal(animalRepository.save(animal));
    }
}
