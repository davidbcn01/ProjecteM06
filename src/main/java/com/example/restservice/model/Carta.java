package com.example.restservice.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Table( name="carta")
public class Carta implements Serializable  {
    @Id
    @Column(name = "idcarta")
    int idCarta;
    @Column(name ="nombretipo")
    String nombreTipo;
    @Column(name = "fechalanzamiento")
    Date fechaLanzamiento;



    @OneToMany(mappedBy = "carta")
    //@JsonManagedReference
    private List<Jugador> jugadors;

    public Carta(int idCarta, String nombreTipo, Date fechaLanzamiento, List<Jugador> jugadors) {
        this.idCarta = idCarta;
        this.nombreTipo = nombreTipo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.jugadors = jugadors;
    }

    public Carta() {
    }
//
//    public Carta(int idCarta, String nombreTipo, Date fechaLanzamiento) {
//        this.idCarta = idCarta;
//        this.nombreTipo = nombreTipo;
//        this.fechaLanzamiento = fechaLanzamiento;
//
//    }


    public List<Jugador> getJugadors() {
        return jugadors;
    }

    public void setJugadors(List<Jugador> jugadors) {
        this.jugadors = jugadors;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getIdCarta() {
        return idCarta;
    }

    public void setIdCarta(int idCarta) {
        this.idCarta = idCarta;
    }



    /*@Override
    public String toString() {
        return "Carta{" +
                "idCarta=" + idCarta +
                ", nombreTipo='" + nombreTipo + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                '}';
    }*/

    @Override
    public String toString() {
        return "Carta{" +
                "idCarta=" + idCarta +
                ", nombreTipo='" + nombreTipo + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                '}';
    }
}