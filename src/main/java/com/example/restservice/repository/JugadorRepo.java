package com.example.restservice.repository;



import com.example.restservice.model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorRepo extends JpaRepository<Jugador,Integer> {
}