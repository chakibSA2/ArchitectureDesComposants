package com.example.backend.controller;

import com.example.backend.dto.PersonDTO;
import com.example.backend.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<PersonDTO> getAllPersons() {
        return personService.getAllPersons();
    }

    @PostMapping
    public PersonDTO addPerson(@RequestBody PersonDTO personDTO) {
        return personService.addPerson(personDTO);
    }
}