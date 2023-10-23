package com.example.Netmoi.repo;

import com.example.Netmoi.entity.Pet;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PetRepository extends MongoRepository<Pet,Integer> {
}
