package com.example.restservice.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table( name="equipo")
public class Equipo implements Serializable {
    @Id
    @Column(name = "idequipo")
    int idEquipo;
    @Column(name = "nombre")
    String nombre;
    @Column(name = "liga")
    String liga;
    @OneToMany(mappedBy = "equipo")
    //@JsonManagedReference
    private List<Jugador> jugadoresEquipo;

    public Equipo(int idEquipo, String nombre, String liga, List<Jugador> jugadoresEquipo) {
        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.liga = liga;
        this.jugadoresEquipo = jugadoresEquipo;
    }

    public Equipo() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public List<Jugador> getJugadoresEquipo() {
        return jugadoresEquipo;
    }

    public void setJugadoresEquipo(List<Jugador> jugadoresEquipo) {
        this.jugadoresEquipo = jugadoresEquipo;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "idEquipo=" + idEquipo +
                ", nombre='" + nombre + '\'' +
                ", liga='" + liga + '\'' +
                ", jugadoresEquipo=" + jugadoresEquipo +
                '}';
    }
}