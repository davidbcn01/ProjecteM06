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
    @DeleteMapping("/estadisticas/{id}")
    public void deleteStats(@PathVariable Integer id){
        estadisticasRepo.deleteById(id);
    }
    @PutMapping("/estadisticas/{id}")
    private Estadisticas replaceEstadisticas(@RequestBody Estadisticas stats, @PathVariable Integer id){
        return estadisticasRepo.findById(id).map(stats1 -> {
            stats1.setValoracion(stats.getValoracion());
            stats1.setRitmo(stats.getRitmo());
            stats1.setTiro(stats.getTiro());
            stats1.setDefensa(stats.getDefensa());
            stats1.setFiligranas(stats.getFiligranas());
            stats1.setEstiloQuimica(stats.getEstiloQuimica());
            stats1.setPase(stats.getPase());
            stats1.setPiernaBuena(stats.getPiernaBuena());
            stats1.setRegate(stats.getRegate());
            stats1.setFisico(stats.getFisico());
            stats1.setPiernaMala(stats.getPiernaMala());
            return estadisticasRepo.save(stats1);
        })
                .orElseGet(()->{
                    stats.setIdJugador(id);
                    return estadisticasRepo.save(stats);
                });
    }

}