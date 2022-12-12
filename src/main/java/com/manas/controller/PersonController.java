package com.manas.controller;

import com.manas.dto.PersonRequestDto;
import com.manas.dto.PersonResponseDto;
import com.manas.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/person")
public class PersonController {
    private  final PersonService personService;

    @PostMapping("/save")
    public PersonResponseDto savePerson(@RequestBody PersonRequestDto personRequestDto){
        return personService.savePerson(personRequestDto);
    }

    @PutMapping("/all")
    public List<PersonResponseDto> findAllPerson(){
        return personService.findAllPerson();
    }

    @GetMapping("{id}")
    public PersonResponseDto findById(@PathVariable Long id){
        return  personService.findById(id);
    }

    @DeleteMapping("{id}")
    public  PersonResponseDto deleteById(@PathVariable Long id){
        return personService.deleteById(id);
    }

    @PutMapping("/{id}")
    public PersonResponseDto updatePerson(@PathVariable Long id,
                                          @RequestBody PersonRequestDto personRequestDto){
        return personService.updatePerson(id, personRequestDto);
    }
}
