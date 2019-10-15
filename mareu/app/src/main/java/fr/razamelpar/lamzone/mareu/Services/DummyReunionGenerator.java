package fr.razamelpar.lamzone.mareu.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fr.razamelpar.lamzone.mareu.Modeles.Reunion;
import fr.razamelpar.lamzone.mareu.Modeles.ReunionRoom;

/**
 * Created by Alexandre Vanneçon "Razamelpar" on 23/09/2019.
 */
public abstract class DummyReunionGenerator {

    /**
     * Fake list reunion
     */
    public  static List<Reunion> FAKE_REUNION = Arrays.asList(

        new Reunion("reunion test", ReunionRoom.BOWSER.toString(),"12-12-2019","12:00","blabla du jour","machin@test.fr"),
        new Reunion("reunion test 2",ReunionRoom.LUIGI.getName(),"12-15-2019","15:00","blabla du jour","machin@test.fr"),
        new Reunion("reunion test 3",ReunionRoom.MARIO.getName(),"12-32-2019","18:00","blabla du jour","machin@test.fr"),
        new Reunion("reunion test 4",ReunionRoom.TOAD.getName(),"12-64-2019","16:00","blabla du jour","machin@test.fr"),
        new Reunion("reunion test 5",ReunionRoom.PEACH.getName(),"12-58-2019","09:00","blabla du jour","machin@test.fr")

    );

    static List<Reunion> generateReunions() {
        return new ArrayList<>(FAKE_REUNION);
    }

    /**
     * Fake liste participants
     */
    public static List<String> PARTICIPANT = Arrays.asList(
        new String("machin@test.fr"),
        new String("truc@test.fr"),
        new String("bidule@test.fr"),
        new String("dupont@test.fr"),
        new String("dupond@test.fr"),
        new String("tintin@test.fr")

    );

    //TODO
    // finir generation des participants
    public static List<String> getPARTICIPANT() {

        return PARTICIPANT;
    }

}
