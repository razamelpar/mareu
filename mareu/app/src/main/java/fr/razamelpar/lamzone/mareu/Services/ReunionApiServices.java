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

    /**
     * ajouter une reunion
     */
    public void addReunion(Reunion reunion) {

        reunions.add(reunion);
    }

    /**
     * Methodes de tri
      */

    public void triDateReunionCroissant() {
        //TODO
        Collections.sort(this.reunions, new TriDateReunion("dd/MM/yyyy-HH:mm"));
    }

    public void triDateReunionDecroissant() {
        //TODO
        Collections.sort(this.reunions, new TriDateReunion("dd/MM/yyyy-HH:mm"));
        Collections.reverse(this.reunions);
    }

    public void triSalleReunionCroissant() {
        Collections.sort(this.reunions, new TriSalleReunion());

    }

    public void triSalleReunionDecroissant() {
        Collections.sort(this.reunions, new TriSalleReunion());
        Collections.reverse(this.reunions);
    }

}
