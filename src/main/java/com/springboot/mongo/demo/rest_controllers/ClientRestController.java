package com.springboot.mongo.demo.rest_controllers;

import com.springboot.mongo.demo.models.Client;
import com.springboot.mongo.demo.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientRestController {

    @Autowired
    public ClientRepository clientRepository;

    @GetMapping
    public List<Client> readAll() {
        return this.clientRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<String> saveClient(@RequestBody Client client) {
        this.clientRepository.save(client);
        return new ResponseEntity<>("Client created", HttpStatus.CREATED);
    }

    @GetMapping("/hello")
    public String sayHello () {
        return "Hello Mongo";
    }

}
