package fr.razamelpar.lamzone.mareu.Services;

import java.util.Collections;
import java.util.List;

import fr.razamelpar.lamzone.mareu.Modeles.Reunion;

/**
 * Created by Alexandre Vanneçon "Razamelpar" on 23/09/2019.
 */
public class ReunionApiServices {

    private List<Reunion> reunions = DummyReunionGenerator.generateReunions();
    /**
     * Recuperer mes reunions
     * @return reunion
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


    /* Methode de tri */
    public void triDateReunionCroissant(List<Reunion> reunions) {
        //TODO
    }

    public void triDateReunionDecroissant(List<Reunion> reunions) {
        //TODO
    }

    public void triSalleReunionCroissant() {
        //TODO
        Collections.sort(this.reunions, new TriDateReunion());

    }

    public void triSalleReunionDecroissant(List<Reunion> reunions) {
        //TODO
        Collections.sort(reunions, new TriDateReunion());
        Collections.reverseOrder();
    }

}
