package fr.razamelpar.lamzone.mareu.Events;

import fr.razamelpar.lamzone.mareu.Modeles.Reunion;

/**
 * Created by Alexandre Vanneçon "Razamelpar" on 26/10/2019.
 */
public class DeleteReunionEvent {
    /**
     * reunion a supprimer
     */
    public Reunion reunion;

    /**
     *
     * @param reunion
     */
    public DeleteReunionEvent(Reunion reunion){
        this.reunion = reunion;
    }
}
