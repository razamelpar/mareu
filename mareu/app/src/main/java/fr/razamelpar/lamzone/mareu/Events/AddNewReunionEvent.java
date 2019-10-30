package fr.razamelpar.lamzone.mareu.Events;

import fr.razamelpar.lamzone.mareu.Modeles.Reunion;

/**
 * Created by Alexandre Vanneçon "Razamelpar" on 29/10/2019.
 */
public class AddNewReunionEvent {
    /**
     * reunion a supprimer
     */
    public Reunion reunion;

    /**
     *
     * @param reunion
     */
    public AddNewReunionEvent(Reunion reunion){
        this.reunion = reunion;
    }
}
