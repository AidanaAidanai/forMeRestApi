package com.manas.service.impl;

import com.manas.converter.PersonRequestConverter;
import com.manas.converter.PersonResponseConverter;
import com.manas.dto.PersonRequestDto;
import com.manas.dto.PersonResponseDto;
import com.manas.entity.Person;
import com.manas.repository.PersonRepository;
import com.manas.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;
    private final PersonRequestConverter personRequestConverter;
    private  final PersonResponseConverter personResponseConverter;

    @Override
    public PersonResponseDto savePerson(PersonRequestDto personRequestDto) {
        Person person = personRequestConverter.create(personRequestDto);
        personRepository.save(person);
        return personResponseConverter.viewPerson(person);
    }

    @Override
    public List<PersonResponseDto> findAllPerson() {
        return personResponseConverter.view(personRepository.findAll());
    }

    @Override
    public PersonResponseDto findById(Long id) {
        Person person = personRepository.findById(id).get();
        return personResponseConverter.viewPerson(person);
    }

    @Override
    public PersonResponseDto deleteById(Long id) {
        Person person =personRepository.findById(id).get();
        personRepository.delete(person);
        return personResponseConverter.viewPerson(person);
    }

    @Override
    public PersonResponseDto updatePerson(Long id, PersonRequestDto personRequestDto) {
       Person person =personRepository.findById(id).get();
       personRequestConverter.update(person,personRequestDto);
        return personResponseConverter.viewPerson(personRepository.save(person));
    }
}
