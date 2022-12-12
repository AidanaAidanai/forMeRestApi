package com.manas.dto;

import com.manas.entity.Animal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@NoArgsConstructor
public class PersonResponseDto {
    private  String firstName;
    private  String lastName;
    private int age;
    private  String email;
    private List<Animal> animals;
}
