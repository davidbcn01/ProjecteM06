package com.example.restservice.controller;

import com.example.restservice.model.Equipo;
import com.example.restservice.model.Estadisticas;
import com.example.restservice.repository.EquipoRepo;
import com.example.restservice.repository.EstadisticasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:8080", "http://localhost" })
@RequestMapping("/api")
public class EstadisticasController {
    @Autowired
    EstadisticasRepo estadisticasRepo;
    @GetMapping("/estadisticas")
    public List<Estadisticas> getAllStats(){
        return estadisticasRepo.findAll();

    }
    @PostMapping("/estadisticas")
    public Estadisticas createStats(@Valid @RequestBody Estadisticas estadisticas){
        return estadisticasRepo.save(estadisticas);
    }

}