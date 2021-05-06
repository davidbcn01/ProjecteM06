package com.example.restservice.controller;

import com.example.restservice.model.Carta;
import com.example.restservice.model.Equipo;
import com.example.restservice.repository.CartaRepo;
import com.example.restservice.repository.EquipoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


    @RestController
    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost" })
    @RequestMapping("/api")
    public class CartaController {

        @Autowired
        CartaRepo cartaRepo;
        @GetMapping("/carta")
        public List<Carta> getAllCarta(){
            return cartaRepo.findAll();

        }
        @PostMapping("/carta")
        public Carta createCarta(@Valid @RequestBody Carta carta){
            return cartaRepo.save(carta);
        }

    }

