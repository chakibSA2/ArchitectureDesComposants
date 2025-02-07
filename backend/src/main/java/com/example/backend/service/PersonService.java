package com.example.backend.service;

import com.example.backend.dto.PersonDTO;
import com.example.backend.model.Person;
import com.example.backend.repository.PersonRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<PersonDTO> getAllPersons() {
        return personRepository.findAll().stream()
                .map(person -> new PersonDTO(person.getName(), person.getAge()))
                .collect(Collectors.toList());
    }

    public PersonDTO addPerson(PersonDTO personDTO) {
        Person person = new Person(personDTO.getName(), personDTO.getAge());
        person = personRepository.save(person);
        return new PersonDTO(person.getName(), person.getAge());
    }
}