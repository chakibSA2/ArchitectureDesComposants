package com.example.backend.dto;

public class PersonDTO {
    private String name;
    private int age;

    public PersonDTO() {}

    public PersonDTO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}