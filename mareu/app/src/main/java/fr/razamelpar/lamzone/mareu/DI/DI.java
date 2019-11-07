package fr.razamelpar.lamzone.mareu.DI;

import fr.razamelpar.lamzone.mareu.Services.ReunionApiServices;

/**
 * Created by Alexandre Vanneçon "Razamelpar" on 23/09/2019.
 */
public class DI {

    private static ReunionApiServices service = new ReunionApiServices();

    public static ReunionApiServices getReunionApiServices() {
        return  service;
    }
    public static ReunionApiServices getNewInstanceApiService() {
        return new ReunionApiServices();
    }

}
