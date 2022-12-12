package com.manas.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "animals")
public class Animal {
    @Id
    @SequenceGenerator(name = "animal_seq", sequenceName = "animal_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "animal_seq")

    private  Long id;
    private  String name;
    private String color;
    private  int age;
//    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    private Person person;
}
