package com.springframework.services;

import com.springframework.model.Owner;
import com.springframework.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Owner owner);

    Set<Pet> findAll();
}
