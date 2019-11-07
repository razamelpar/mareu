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

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Alexandre Vanneçon "Razamelpar" on 04/11/2019.
 */

@RunWith(JUnit4.class)
public class ReunionApiServicesTest {

    private ReunionApiServices mApiServices;

    @Before
    public void setUp() throws Exception {

        mApiServices = DI.getNewInstanceApiService();
    }

    @Test
    public void getReunions() {

        List<Reunion> reunionList = mApiServices.getReunions();
        List<Reunion> listeAttendu = DummyReunionGenerator.FAKE_REUNION;
        assertThat(reunionList, IsIterableContainingInAnyOrder.containsInAnyOrder(listeAttendu.toArray()));

    }

    @Test
    public void deleteReunion() {

        List<Reunion> reunionList = mApiServices.getReunions();
        Reunion reunionASupprimer = reunionList.get(0);
        mApiServices.deleteReunion((reunionASupprimer));
        assertFalse(mApiServices.getReunions().contains(reunionASupprimer));
    }

    @Test
    public void addReunion() {

        List<Reunion> reunionList = mApiServices.getReunions();
        Reunion newReunion = new Reunion("sujet", ReunionRoom.MARIO, "01/01/2020", "00:00", "participants@contact.fr");
        reunionList.add((newReunion));
        assertTrue(mApiServices.getReunions().contains(newReunion));
    }

    @Test
    public void triDateReunionCroissant() {
        List<Reunion> reunionList = mApiServices.getReunions();
        mApiServices.triDateReunionCroissant();
        assertEquals("12/10/2018",reunionList.get(0).getDateReunion());
        assertEquals("08:00",reunionList.get(0).getHoraireReunion());

    }

    @Test
    public void triDateReunionDecroissant() {
        List<Reunion> reunionList = mApiServices.getReunions();
        mApiServices.triDateReunionDecroissant();
        assertEquals("12/10/2019",reunionList.get(0).getDateReunion());
        assertEquals("09:00",reunionList.get(0).getHoraireReunion());
    }

    @Test
    public void triSalleReunionCroissant() {
        List<Reunion> reunionList = mApiServices.getReunions();
        mApiServices.triSalleReunionCroissant();
        assertEquals("Bowser",reunionList.get(0).getNumeroSalle().getName());
    }

    @Test
    public void triSalleReunionDecroissant() {
        List<Reunion> reunionList = mApiServices.getReunions();
        mApiServices.triSalleReunionDecroissant();
        assertEquals("Diddy Kong",reunionList.get(0).getNumeroSalle().getName());
    }
}