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
    @DeleteMapping("/jugador/{id}")
    public void deletePlayer(@PathVariable Integer id){
        jugadorRepo.deleteById(id);
    }
    @PutMapping("/jugador/{id}")
    private Jugador replacePlayer(@RequestBody Jugador player, @PathVariable Integer id){
        return jugadorRepo.findById(id).map(player1 -> {
            player1.setApellidos(player.getApellidos());
            player1.setFechaNacimiento(player.getFechaNacimiento());
            player1.setNombre(player.getNombre());
            player1.setCarta(player.getCarta());
            player1.setEstadisticas(player.getEstadisticas());
            player1.setNacionalidad(player.getNacionalidad());
            player1.setEquipo(player.getEquipo());
            return jugadorRepo.save(player1);
        })
                .orElseGet(()->{
                    player.setIdJugador(id);
                    return jugadorRepo.save(player);
                });
    }

}