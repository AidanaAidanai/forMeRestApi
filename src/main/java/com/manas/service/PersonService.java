package com.manas.service;

import com.manas.dto.PersonRequestDto;
import com.manas.dto.PersonResponseDto;

import java.util.List;

public interface PersonService {
    PersonResponseDto savePerson(PersonRequestDto personRequestDto);
    List<PersonResponseDto> findAllPerson();
    PersonResponseDto findById(Long id);
    PersonResponseDto deleteById(Long id);
    PersonResponseDto updatePerson(Long id, PersonRequestDto personRequestDto);
}
