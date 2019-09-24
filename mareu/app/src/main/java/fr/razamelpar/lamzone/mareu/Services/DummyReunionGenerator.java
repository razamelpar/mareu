package fr.razamelpar.lamzone.mareu.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fr.razamelpar.lamzone.mareu.Modeles.Reunion;

/**
 * Created by Alexandre Vanneçon "Razamelpar" on 23/09/2019.
 */
public abstract class DummyReunionGenerator {

    public  static List<Reunion> DUMMY_REUNION = Arrays.asList(

        new Reunion("reunion test","11","12-12-2019","blabla du jour","machin@truc.fr"),
        new Reunion("reunion test 2","34","12-15-2019","blabla du jour","machin@truc.fr"),
        new Reunion("reunion test 3","21","12-32-2019","blabla du jour","machin@truc.fr"),
        new Reunion("reunion test 4","8","12-64-2019","blabla du jour","machin@truc.fr"),
        new Reunion("reunion test 5","24","12-58-2019","blabla du jour","machin@truc.fr")

    );

    static List<Reunion> generateReunions() {
        return new ArrayList<>(DUMMY_REUNION);
    }
}
