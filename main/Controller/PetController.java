package com.example.petapi.controller;

import com.example.petapi.model.Cat;
import com.example.petapi.model.Dog;
import com.example.petapi.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pets")
public class PetController 
{

    @Autowired
    private PetService petService;

    //---- Cat Endpoints----
    @GetMapping("/cats")
    public List<Cat> getAllCats() 
        {
            return petService.getAllCats();
        }

    @GetMapping("/cats/{id}")
    public Optional<Cat> getCatById(@PathVariable Long id) 
        {
        return petService.getCatById(id);
        }

    @PostMapping("/cats")
    public Cat createCat(@RequestBody Cat cat) 
        {
        return petService.saveCat(cat);
        }

    @DeleteMapping("/cats/{id}")
    public void deleteCat(@PathVariable Long id) 
        {
        petService.deleteCat(id);
        }

    //---- Dog Endpoints----
    @GetMapping("/dogs")
    public List<Dog> getAllDogs() 
        {
        return petService.getAllDogs();
        }

    @GetMapping("/dogs/{id}")
    public Optional<Dog> getDogById(@PathVariable Long id) 
        {
        return petService.getDogById(id);
        }

    @PostMapping("/dogs")
    public Dog createDog(@RequestBody Dog dog) {
        return petService.saveDog(dog);
    }

    @DeleteMapping("/dogs/{id}")
    public void deleteDog(@PathVariable Long id) {
        petService.deleteDog(id);
    }
}

