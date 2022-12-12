package com.manas.controller;

import com.manas.dto.AnimalRequestDto;
import com.manas.dto.AnimalResponseDto;
import com.manas.service.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AnimalController {
    private  final AnimalService animalService;

    @PostMapping("/save")
    public AnimalResponseDto saveAnimal(@RequestBody AnimalRequestDto animalRequestDto){
        return animalService.saveAnimal(animalRequestDto);
    }

    @GetMapping("/all")
    public List<AnimalResponseDto> findAllAnimal(){
        return animalService.findAllAnimal();
    }

    @GetMapping("/{id}")
    public  AnimalResponseDto findById(@PathVariable Long id){
        return animalService.findById(id);
    }

    @DeleteMapping("/{id}")
    public  AnimalResponseDto deleteById(@PathVariable Long id){
        return animalService.deleteById(id);
    }

    @PutMapping("/{id}")
    public AnimalResponseDto updateAnimal(@PathVariable Long id,
                                          @RequestBody AnimalRequestDto animalRequestDto){
        return animalService.updateAnimal(id, animalRequestDto);
    }
}
