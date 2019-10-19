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
    public void triDateReunionCroissant() {
        //TODO
    }

    public void triDateReunionDecroissant() {
        //TODO
    }

    public void triSalleReunionCroissant() {
        //TODO
        Collections.sort(this.reunions, new TriSalleReunion());

    }

    public void triSalleReunionDecroissant() {
        //TODO
        Collections.sort(this.reunions, new TriSalleReunion());
        Collections.reverse(this.reunions);
    }

}
