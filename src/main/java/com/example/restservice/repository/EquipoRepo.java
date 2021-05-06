package com.example.restservice.repository;

import com.example.restservice.model.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoRepo extends JpaRepository<Equipo,Integer> {
}
