package com.example.demo.repositories;

import com.example.demo.entities.Responsavel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsavelRepository extends CrudRepository<Responsavel, Integer> { }
