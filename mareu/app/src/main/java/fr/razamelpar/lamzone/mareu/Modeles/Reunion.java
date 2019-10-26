package fr.razamelpar.lamzone.mareu.Modeles;

/**
 * Created by Alexandre Vanneçon "Razamelpar" on 23/09/2019.
 */
public class Reunion{

    private String sujetReunion;
    private ReunionRoom numeroSalle;
    private String horaireReunion;
    private String dateReunion;
    private String participantsReunion;

    public Reunion(String sujetReunion,
                   ReunionRoom numeroSalle,
                   String dateReunion,
                   String horaireReunion,
                   String participantsReunion)
    {
        this.sujetReunion = sujetReunion;
        this.numeroSalle = numeroSalle;
        this.dateReunion = dateReunion;
        this.horaireReunion = horaireReunion;
        this.participantsReunion = participantsReunion;
    }

    public String getSujetReunion() {

        return sujetReunion;
    }

    public void setSujetReunion(String sujetReunion) {

        this.sujetReunion = sujetReunion;
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

    public String getParticipantsReunion() {

        return participantsReunion;
    }

    public void setParticipantsReunion(String participantsReunion) {
        this.participantsReunion = participantsReunion;
    }

}
