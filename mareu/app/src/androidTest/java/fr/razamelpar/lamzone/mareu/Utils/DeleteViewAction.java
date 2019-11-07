package fr.razamelpar.lamzone.mareu.Utils;

import android.view.View;

import androidx.test.espresso.UiController;
import androidx.test.espresso.ViewAction;

import org.hamcrest.Matcher;

import fr.razamelpar.lamzone.mareu.R;

/**
 * Created by Alexandre Vanneçon "Razamelpar" on 07/11/2019.
 */
public class DeleteViewAction implements ViewAction {
    @Override
    public Matcher<View> getConstraints() {
        return null;
    }

    @Override
    public String getDescription() {
        return "Click on specific button";
    }

    @Override
    public void perform(UiController uiController, View view) {
        View button = view.findViewById(R.id.btnDelete);
        // Maybe check for null
        button.performClick();
    }
}
