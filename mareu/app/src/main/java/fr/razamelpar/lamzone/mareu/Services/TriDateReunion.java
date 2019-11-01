package fr.razamelpar.lamzone.mareu.Services;


import android.net.ParseException;

import java.text.SimpleDateFormat;
import java.util.Comparator;

import fr.razamelpar.lamzone.mareu.Modeles.Reunion;

/**
 * Created by Alexandre Vanneçon "Razamelpar" on 23/10/2019.
 */
public class TriDateReunion implements Comparator<Reunion> {

    SimpleDateFormat format;
    boolean ascending;

    public TriDateReunion(String pattern)
    {
        this(pattern, true);
    }
    public TriDateReunion(String pattern, boolean ascending)
    {
        this.format = new SimpleDateFormat(pattern);
        this.ascending = ascending;
    }

    @Override
    public int compare(Reunion o1, Reunion o2)
    {
        try
        {
            int n = format.parse(o1.getDateReunion().concat("-" + o1.getHoraireReunion())).compareTo(format.parse(o2.getDateReunion().concat("-" + o2.getHoraireReunion())));
            return ascending ? +n : -n;
        }
        catch (java.text.ParseException | NullPointerException e)
        {
            throw new IllegalArgumentException(e);
        }
    }

}
