package com.example.restservice.controller;

import com.example.restservice.model.Equipo;
import com.example.restservice.repository.EquipoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:8080", "http://localhost" })
@RequestMapping("/api")
public class EquipoController {
    @Autowired
    EquipoRepo equipoRepo;
    @GetMapping("/equipo")
    public List<Equipo> getAllEquipo(){
        return equipoRepo.findAll();

    }
    @PostMapping("/equipo")
    public Equipo createEquipo(@Valid @RequestBody Equipo equipo){
        return equipoRepo.save(equipo);
    }
    @DeleteMapping("/equipo/{id}")
    public void deleteTeam(@PathVariable Integer id){
        equipoRepo.deleteById(id);
    }
    @PutMapping("/equipo/{id}")
    private Equipo replaceEquipo(@RequestBody Equipo equipo, @PathVariable Integer id){
        return equipoRepo.findById(id).map(equipo1 -> {
            equipo1.setLiga(equipo.getLiga());
            equipo1.setNombre(equipo.getNombre());
            return equipoRepo.save(equipo1);
        })
                .orElseGet(()->{
                    equipo.setIdEquipo(id);
                    return equipoRepo.save(equipo);
                });
    }

}
