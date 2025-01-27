
package com.example.petapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cat 
{

    @Id
    private Long id;
    private String name;
    private String breed;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
