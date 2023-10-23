package com.example.Netmoi.service;

import com.example.Netmoi.entity.Pet;

import java.util.List;
import java.util.Optional;

public interface PetService {

    public List<Pet> getPets();

    public Optional<Pet> getPet(int id);

    public Pet addPet(Pet pet);

    public Pet deletePet(int id );

    public Pet updatePet(int id , Pet pet);
}
