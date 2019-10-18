package fr.razamelpar.lamzone.mareu.Services;

import java.util.Comparator;

import fr.razamelpar.lamzone.mareu.Modeles.Reunion;

/**
 * Created by Alexandre Vanneçon "Razamelpar" on 18/10/2019.
 */
public class TriDateReunion implements Comparator<Reunion> {

    @Override
    public int compare(Reunion o1, Reunion o2) {
        return o1.getIntSalle() - o2.getIntSalle();
    }
}
