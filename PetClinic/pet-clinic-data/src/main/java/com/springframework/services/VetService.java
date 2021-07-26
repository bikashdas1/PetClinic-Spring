package com.springframework.services;

import com.springframework.model.Owner;
import com.springframework.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Owner owner);

    Set<Vet> findAll();
}
