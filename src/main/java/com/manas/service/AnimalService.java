package com.manas.service;

import com.manas.dto.AnimalRequestDto;
import com.manas.dto.AnimalResponseDto;

import java.util.List;

public interface AnimalService {
    AnimalResponseDto saveAnimal(AnimalRequestDto animalRequestDto);
    List<AnimalResponseDto> findAllAnimal();
    AnimalResponseDto findById(Long id);
    AnimalResponseDto deleteById(Long id);
    AnimalResponseDto updateAnimal(Long id, AnimalRequestDto animalRequestDto);
}
