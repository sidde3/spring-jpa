package com.example.demo.controller;

import com.example.demo.bean.PersonRepository;
import com.example.demo.jpa.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    PersonRepository repository;

    @GetMapping(value = "/get-users", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> getAllUser(){
        return repository.findAll();
    }

    @PostMapping(value = "add-user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person addUser(@RequestBody Person person){
        repository.save(person);
        return person;
    }
}
