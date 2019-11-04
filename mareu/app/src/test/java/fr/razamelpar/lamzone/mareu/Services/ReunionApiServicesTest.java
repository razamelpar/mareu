package fr.razamelpar.lamzone.mareu.Services;

import org.hamcrest.collection.IsIterableContainingInAnyOrder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

import fr.razamelpar.lamzone.mareu.DI.DI;
import fr.razamelpar.lamzone.mareu.Modeles.Reunion;
import fr.razamelpar.lamzone.mareu.Modeles.ReunionRoom;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by Alexandre Vanneçon "Razamelpar" on 04/11/2019.
 */

@RunWith(JUnit4.class)
public class ReunionApiServicesTest {

    private ReunionApiServices services;
    private List<Reunion> reunionList;
    private Reunion newReunion;

    @Before
    public void setUp() throws Exception {

        services = DI.getReunionApiServices();
        reunionList = services.getReunions();
        newReunion = new Reunion("sujet",
                ReunionRoom.MARIO,
                "01/01/2020",
                "00:00",
                "participants@contact.fr");
    }

    @Test
    public void getReunions() {

        List<Reunion> listAttendu = DummyReunionGenerator.FAKE_REUNION;
        assertThat(reunionList, IsIterableContainingInAnyOrder.containsInAnyOrder(listAttendu.toArray()));

    }

    @Test
    public void deleteReunion() {

        Reunion reunionASupprimer = reunionList.get(0);
        services.deleteReunion((reunionASupprimer));
        assertFalse(services.getReunions().contains(reunionASupprimer));
    }

    @Test
    public void addReunion() {

        reunionList.add((newReunion));
        assertTrue(services.getReunions().contains(newReunion));
    }

    //@Test
    //public void triDateReunionCroissant() {
    //}

    //@Test
    //public void triDateReunionDecroissant() {
    //}

    //@Test
    //public void triSalleReunionCroissant() {
    //}

    //@Test
    //public void triSalleReunionDecroissant() {
    //}
}