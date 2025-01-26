package com.example.petapi.service;

import com.example.petapi.model.Cat;
import com.example.petapi.model.Dog;
import com.example.petapi.repository.CatRepository;
import com.example.petapi.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetService 
{
    @Autowired
    private CatRepository catRepository;

    @Autowired
    private DogRepository dogRepository;

    
    //--- Cat CRUD Operations---
    public List<Cat> getAllCats() 
        {
        return catRepository.findAll();
        }

    public Optional<Cat> getCatById(Long id) 
        {
        return catRepository.findById(id);
        }

    public Cat saveCat(Cat cat) 
        {
        return catRepository.save(cat);
        }

    public void deleteCat(Long id) {
        catRepository.deleteById(id);
    }

  
    //--- Dog CRUD Operations---
    public List<Dog> getAllDogs() {
        return dogRepository.findAll();
    }

    public Optional<Dog> getDogById(Long id) {
        return dogRepository.findById(id);
    }

    public Dog saveDog(Dog dog) {
        return dogRepository.save(dog);
    }

    public void deleteDog(Long id) {
        dogRepository.deleteById(id);
    }
}

