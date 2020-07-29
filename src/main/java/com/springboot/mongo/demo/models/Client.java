package com.springboot.mongo.demo.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "clients")
public class Client {

    @Id
    private int id;
    private String name;
    private String lastname;

    public Client() {
    }

    public Client(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
