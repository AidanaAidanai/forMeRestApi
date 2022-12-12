package com.manas.dto;

import com.manas.entity.Animal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class PersonRequestDto {
    private  String firstName;
    private  String lastName;
    private int age;
    private  String email;
    private List<Animal> animals;
}
