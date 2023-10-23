package com.example.Netmoi.controller;

import com.example.Netmoi.entity.Pet;
import com.example.Netmoi.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pets")
public class PetController {
    @Autowired
    private PetService petService;
    @GetMapping("/all")
    public List<Pet> getPets() {
//        http://localhost:8080/pets/all
        return petService.getPets();
    }

    @GetMapping("/pet/{id}")
//    http://localhost:8080/pets/pet/{id}. Replace {id} with a valid integer.
    public Optional<Pet> getPet(@PathVariable int id)
    {
        Optional<Pet> requiredPet =  petService.getPet(id);
        return requiredPet;
    }
    @PostMapping("/insert")
    public Pet insert(@RequestBody Pet product){
//        http://localhost:8080/pets/insert
        return  petService.addPet(product);
    }

    @PutMapping("/update/{id}")
   public Pet update(@PathVariable int id, @RequestBody Pet product ){
//        http://localhost:8080/pets/update/{id}. Replace {id} with a valid integer.
       return petService.updatePet(id,product);
    }

    @DeleteMapping("/delete/{id}")
    public Pet delete(@PathVariable int id ){
//        http://localhost:8080/pets/delete/{id}. Replace {id} with a valid integer.
        // Be sure to give vaild id(integer).
        return  petService.deletePet(id);
    }
}
