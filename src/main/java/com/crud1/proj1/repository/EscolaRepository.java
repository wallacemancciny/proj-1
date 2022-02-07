package com.crud1.proj1.repository;

import com.crud1.proj1.models.entities.Escola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EscolaRepository extends JpaRepository<Escola, Integer> {

}