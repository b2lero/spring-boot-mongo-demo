package com.springboot.mongo.demo.repositories;

import com.springboot.mongo.demo.models.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<Client, String> {
}
