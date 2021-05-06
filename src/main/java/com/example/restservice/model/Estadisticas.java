package com.example.restservice.model;


import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table( name="estadisticas")
public class Estadisticas implements Serializable {
    @Id
    @Column(name = "idjugador")
    private int idJugador;
    @Column(name = "valoracion")
    int valoracion;
    @Column(name = "ritmo")
    int ritmo;
    @Column(name = "tiro")
    int tiro;
    @Column(name = "pase")
    int pase;
    @Column(name = "regate")
    int regate;
    @Column(name = "defensa")
    int defensa;
    @Column(name = "fisico")
    int fisico;
    @Column(name = "piernamala")
    int piernaMala;
    @Column(name = "filigranas")
    int filigranas;
    @Column(name = "estiloquimica")
    String estiloQuimica;
    @Column(name = "piernabuena")
    String piernaBuena;
/*    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idJugador")
    @MapsId
    Jugador jugador;
*/

    public Estadisticas(int idJugador, int valoracion, int ritmo, int tiro, int pase, int regate, int defensa, int fisico, int piernaMala, int filigranas, String estiloQuimica, String piernaBuena) {
        this.idJugador = idJugador;
        this.valoracion = valoracion;
        this.ritmo = ritmo;
        this.tiro = tiro;
        this.pase = pase;
        this.regate = regate;
        this.defensa = defensa;
        this.fisico = fisico;
        this.piernaMala = piernaMala;
        this.filigranas = filigranas;
        this.estiloQuimica = estiloQuimica;
        this.piernaBuena = piernaBuena;
    }

    public Estadisticas() {
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public int getRitmo() {
        return ritmo;
    }

    public void setRitmo(int ritmo) {
        this.ritmo = ritmo;
    }

    public int getTiro() {
        return tiro;
    }

    public void setTiro(int tiro) {
        this.tiro = tiro;
    }

    public int getPase() {
        return pase;
    }

    public void setPase(int pase) {
        this.pase = pase;
    }

    public int getRegate() {
        return regate;
    }

    public void setRegate(int regate) {
        this.regate = regate;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getFisico() {
        return fisico;
    }

    public void setFisico(int fisico) {
        this.fisico = fisico;
    }

    public int getPiernaMala() {
        return piernaMala;
    }

    public void setPiernaMala(int piernaMala) {
        this.piernaMala = piernaMala;
    }

    public int getFiligranas() {
        return filigranas;
    }

    public void setFiligranas(int filigranas) {
        this.filigranas = filigranas;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getEstiloQuimica() {
        return estiloQuimica;
    }

    public void setEstiloQuimica(String estiloQuimica) {
        this.estiloQuimica = estiloQuimica;
    }

    public String getPiernaBuena() {
        return piernaBuena;
    }

    public void setPiernaBuena(String piernaBuena) {
        this.piernaBuena = piernaBuena;
    }

    @Override
    public String toString() {
        return "Estadisticas{" +
                "idJugador=" + idJugador +
                ", valoracion=" + valoracion +
                ", ritmo=" + ritmo +
                ", tiro=" + tiro +
                ", pase=" + pase +
                ", regate=" + regate +
                ", defensa=" + defensa +
                ", fisico=" + fisico +
                ", piernaMala=" + piernaMala +
                ", filigranas=" + filigranas +
                ", estiloQuimica='" + estiloQuimica + '\'' +
                ", piernaBuena='" + piernaBuena + '\'' +
                '}';
    }
}