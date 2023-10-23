package com.example.Netmoi.service.impl;

import com.example.Netmoi.entity.Pet;
import com.example.Netmoi.repo.PetRepository;
import com.example.Netmoi.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetServiceImpl implements PetService {
    @Autowired
    private PetRepository petRepository;
    @Override
    public List<Pet> getPets() {
        //GET To get List of all the pets.
        return petRepository.findAll();
    }

    public Optional<Pet> getPet(int id)
    {
        //GET To get details of a single pet as per the id.
        Optional<Pet> requiredPet =  petRepository.findById(id);
        return requiredPet;
    }
    @Override
    public Pet addPet(Pet pet) {
        //POST To insert a data of a Pet into the database
        return petRepository.save(pet);
    }

    @Override
    public Pet deletePet(int id) {
        // DELETE To remove the data of a Pet entity form the database as per the given Id.
        Pet pet = petRepository.findById(id).get();
        petRepository.delete(pet);
        return pet;
    }

    @Override
    public Pet updatePet(int id, Pet pet) {
        //PUT To update the existing data into the database as per the Id.
        Pet petUpdate = petRepository.findById(id).get();
        petUpdate.setName(pet.getName());
        petUpdate.setStatus(pet.getStatus());
        petUpdate.setCategory(pet.getCategory());
      petRepository.save(petUpdate);
      return petUpdate;


    }
}
