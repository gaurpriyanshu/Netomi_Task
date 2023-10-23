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
        return petRepository.findAll();
    }

    public Optional<Pet> getPet(int id)
    {
        Optional<Pet> requiredPet =  petRepository.findById(id);
        return requiredPet;
    }
    @Override
    public Pet addPet(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public Pet deletePet(int id) {
        Pet pet = petRepository.findById(id).get();
        petRepository.delete(pet);
        return pet;
    }

    @Override
    public Pet updatePet(int id, Pet pet) {
        Pet petUpdate = petRepository.findById(id).get();
        petUpdate.setName(pet.getName());
        petUpdate.setStatus(pet.getStatus());
        petUpdate.setCategory(pet.getCategory());
      petRepository.save(petUpdate);
      return petUpdate;


    }
}
