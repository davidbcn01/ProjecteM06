package com.example.restservice.controller;

import com.example.restservice.model.Estadisticas;
import com.example.restservice.model.Jugador;
import com.example.restservice.repository.EstadisticasRepo;
import com.example.restservice.repository.JugadorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:8080", "http://localhost" })
@RequestMapping("/api")
public class JugadorController {
    @Autowired
    JugadorRepo jugadorRepo;
    @GetMapping("/jugador")
    public List<Jugador> getAllPlayers(){
        return jugadorRepo.findAll();

    }
    @PostMapping("/jugador")
    public Jugador createPlayer(@Valid @RequestBody Jugador jugador){
        return jugadorRepo.save(jugador);
    }

}