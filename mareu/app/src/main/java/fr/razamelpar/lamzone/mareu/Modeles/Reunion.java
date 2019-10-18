package fr.razamelpar.lamzone.mareu.Modeles;

/**
 * Created by Alexandre Vanneçon "Razamelpar" on 23/09/2019.
 */
public class Reunion{

    private String nomReunion;
    private ReunionRoom numeroSalle;
    private String horaireReunion;
    private String dateReunion;
    private String sujetReunion;
    private String participantsReunion;

    public Reunion(String nomReunion, ReunionRoom numeroSalle, String dateReunion, String horaireReunion, String sujetReunion, String participantsReunion)
    {
        this.nomReunion = nomReunion;
        this.numeroSalle = numeroSalle;
        this.dateReunion = dateReunion;
        this.horaireReunion = horaireReunion;
        this.sujetReunion = sujetReunion;
        this.participantsReunion = participantsReunion;
    }

    public String getNomReunion() {
        return nomReunion;
    }

    public void setNomReunion(String nomReunion) {
        this.nomReunion = nomReunion;
    }

    public ReunionRoom getNumeroSalle() {
        return numeroSalle;
    }

    public void setNumeroSalle(ReunionRoom numeroSalle) {
        this.numeroSalle = numeroSalle;
    }

    public int getIntSalle(){
        return this.numeroSalle.getRoomNumber();
    }

    public String getHoraireReunion() {
        return horaireReunion;
    }

    public void setHoraireReunion(String horaireReunion) {
        this.horaireReunion = horaireReunion;
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
