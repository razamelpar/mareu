package fr.razamelpar.lamzone.mareu.Modeles;

import java.util.Date;
import java.util.List;

/**
 * Created by Alexandre Vanneçon "Razamelpar" on 23/09/2019.
 */
public class Reunion {

    private String nomReunion;
    private String numeroSalle;
    private String dateReunion;
    private String sujetReunion;
    private String participantsReunion;

    public Reunion(String nomReunion, String numeroSalle, String dateReunion, String sujetReunion, String participantsReunion)
    {
        this.nomReunion = nomReunion;
        this.numeroSalle = numeroSalle;
        this.dateReunion = dateReunion;
        this.sujetReunion = sujetReunion;
        this.participantsReunion = participantsReunion;
    }

    public String getNomReunion() {
        return nomReunion;
    }

    public void setNomReunion(String nomReunion) {
        this.nomReunion = nomReunion;
    }

    public String getNumeroSalle() {
        return numeroSalle;
    }

    public void setNumeroSalle(String numeroSalle) {
        this.numeroSalle = numeroSalle;
    }

    public String getDateReunion() {
        return dateReunion;
    }

    public void setDateReunion(String dateReunion) {
        this.dateReunion = dateReunion;
    }

    public String getSujetReunion() {
        return sujetReunion;
    }

    public void setSujetReunion(String sujetReunion) {
        this.sujetReunion = sujetReunion;
    }

    public String getParticipantsReunion() {
        return participantsReunion;
    }

    public void setParticipantsReunion(String participantsReunion) {
        this.participantsReunion = participantsReunion;
    }

}
