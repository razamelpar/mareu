package fr.razamelpar.lamzone.mareu.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fr.razamelpar.lamzone.mareu.Modeles.Reunion;
import fr.razamelpar.lamzone.mareu.Modeles.ReunionRoom;
import fr.razamelpar.lamzone.mareu.R;

/**
 * Created by Alexandre Vanneçon "Razamelpar" on 23/09/2019.
 */
public abstract class DummyReunionGenerator {

    /**
     * Fake list reunion
     */
    public  static List<Reunion> FAKE_REUNION = Arrays.asList(

            new Reunion("reunion test", ReunionRoom.DIDDYKONG,"12/02/2019","12:00","machin@test.fr"),
            new Reunion("reunion test 2", ReunionRoom.BOWSER,"12/02/2019","15:00","machin@test.fr"),
            new Reunion("reunion test 3", ReunionRoom.MARIO,"12/01/2019","18:00","machin@test.fr"),
            new Reunion("reunion test 4", ReunionRoom.TOAD,"12/09/2019","16:00","machin@test.fr"),
            new Reunion("reunion test 5", ReunionRoom.PEACH,"12/10/2019","09:00","machin@test.fr"),
            new Reunion("reunion test 6", ReunionRoom.LUIGI,"12/10/2018","08:00","machin@test.fr")

    );

    static List<Reunion> generateReunions() {

        return new ArrayList<>(FAKE_REUNION);
    }

}
