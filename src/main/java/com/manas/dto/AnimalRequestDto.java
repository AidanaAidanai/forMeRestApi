package com.manas.dto;

import com.manas.entity.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class AnimalRequestDto {
    private  String name;
    private String color;
    private  int age;

}
