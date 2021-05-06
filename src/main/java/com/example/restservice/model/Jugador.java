package com.example.restservice.model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table( name="jugador")
@DiscriminatorValue("JUGADOR_INFO")
public class Jugador implements Serializable {
    @Id
    @Column(name = "idjugador")
    int idJugador;


     @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "idcarta")
     @JsonBackReference
     private Carta carta;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idequipo")
    @JsonBackReference
    private Equipo equipo;

    @Column(name = "nombre")
    String nombre;
    @Column(name = "apellidos")
    String apellidos;
    @Column(name = "nacionalidad")
    String nacionalidad;
    @Column(name = "fechanacimiento")
    Date fechaNacimiento;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idjugador")
    Estadisticas estadisticas;
    /*public Jugador(Carta carta, int idEquipo, int idJugador) {
        this.carta= carta;
        this.idEquipo = idEquipo;
        this.idJugador = idJugador;
    }

     */
    public Jugador() {
    }
    public Jugador(int idJugador, Carta carta, Equipo equipo, String nombre, String apellidos, String nacionalidad, Date fechaNacimiento,Estadisticas estadisticas) {
        this.idJugador = idJugador;
        this.estadisticas = estadisticas;
        this.carta = carta;
        this.equipo = equipo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }





    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public Estadisticas getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(Estadisticas estadisticas) {
        this.estadisticas = estadisticas;
    }

    public Carta getCarta() {
        return carta;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "idJugador=" + idJugador +
                ", carta=" + carta +
                ", equipo=" + equipo +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", estadisticas=" + estadisticas +
                '}';
    }
}