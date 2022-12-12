package com.manas.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.List;

@Entity
@Table(name = "people")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    @SequenceGenerator(name = "person_seq",sequenceName = "person_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_seq")

    private Long id;
    private  String firstName;
    private  String lastName;
    private int age;
    private  String email;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Animal> animals;
}
