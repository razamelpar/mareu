package fr.razamelpar.lamzone.mareu.Services;

import java.util.List;

import fr.razamelpar.lamzone.mareu.Modeles.Reunion;

/**
 * Created by Alexandre Vanneçon "Razamelpar" on 23/09/2019.
 */
public class ReunionApiServices {

    private List<Reunion> reunions = DummyReunionGenerator.generateReunions();
    /**
     * Recuperer mes reunions
     * @return
     */
    public List<Reunion> getReunions() {
        return reunions;
    }

    /**
     * Supprimer un reunion
     * @param reunion
     */
    public void deleteReunion(Reunion reunion) {
        reunions.remove(reunion);
    }

}
