package com.manas.converter;

import com.manas.dto.PersonRequestDto;
import com.manas.dto.PersonResponseDto;
import com.manas.entity.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonResponseConverter {
    public PersonResponseDto viewPerson(Person person){
     if(person == null){
         return  null;
     }
        PersonResponseDto personResponseDto = new PersonResponseDto();
     personResponseDto.setFirstName(person.getFirstName());
     personResponseDto.setLastName(person.getLastName());
     personResponseDto.setEmail(person.getEmail());
     personResponseDto.setAge(person.getAge());
     personResponseDto.setAnimals(person.getAnimals());
     return personResponseDto;
    }

    public List<PersonResponseDto> view(List<Person> personList){
        List<PersonResponseDto> personResponseDtos = new ArrayList<>();
        for (Person person:personList) {
           personResponseDtos.add(viewPerson(person));
        }
        return personResponseDtos;
    }
}
