package com.example.restservice.repository;


import com.example.restservice.model.Carta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaRepo extends JpaRepository<Carta,Integer> {
}