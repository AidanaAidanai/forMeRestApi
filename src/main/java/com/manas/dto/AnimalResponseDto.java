package com.manas.dto;

import com.manas.entity.Person;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class AnimalResponseDto {
    private  String name;
    private String color;
    private  int age;
}
