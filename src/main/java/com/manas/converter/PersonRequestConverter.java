package com.manas.converter;

import com.manas.dto.PersonRequestDto;
import com.manas.entity.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonRequestConverter {
    public Person create(PersonRequestDto personRequestDto){
        if(personRequestDto == null){
            return null;
        }
        Person person = new Person();
        person.setFirstName(personRequestDto.getFirstName());
        person.setLastName(personRequestDto.getLastName());
        person.setEmail(personRequestDto.getEmail());
        person.setAge(personRequestDto.getAge());
        person.setAnimals(personRequestDto.getAnimals());
        return person;
    }

    public  void update(Person person, PersonRequestDto personRequestDto){
        person.setFirstName(personRequestDto.getFirstName());
        person.setLastName(personRequestDto.getLastName());
        person.setEmail(personRequestDto.getEmail());
        person.setAge(personRequestDto.getAge());
        person.setAnimals(personRequestDto.getAnimals());
    }
}
