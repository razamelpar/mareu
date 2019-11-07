package fr.razamelpar.lamzone.mareu.Vues;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.DataInteraction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import fr.razamelpar.lamzone.mareu.R;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TestAjoutReunion {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAjoutReunion() {
        ViewInteraction appCompatImageButton = onView(
                allOf(withId(R.id.btnDelete),
                        childAtPosition(
                                allOf(withId(R.id.layoutPrincipal),
                                        childAtPosition(
                                                withId(R.id.mRecyclerView),
                                                0)),
                                2),
                        isDisplayed()));
        appCompatImageButton.perform(click());

        ViewInteraction appCompatImageButton2 = onView(
                allOf(withId(R.id.btnDelete),
                        childAtPosition(
                                allOf(withId(R.id.layoutPrincipal),
                                        childAtPosition(
                                                withId(R.id.mRecyclerView),
                                                0)),
                                2),
                        isDisplayed()));
        appCompatImageButton2.perform(click());

        ViewInteraction appCompatImageButton3 = onView(
                allOf(withId(R.id.btnDelete),
                        childAtPosition(
                                allOf(withId(R.id.layoutPrincipal),
                                        childAtPosition(
                                                withId(R.id.mRecyclerView),
                                                0)),
                                2),
                        isDisplayed()));
        appCompatImageButton3.perform(click());

        ViewInteraction appCompatImageButton4 = onView(
                allOf(withId(R.id.btnDelete),
                        childAtPosition(
                                allOf(withId(R.id.layoutPrincipal),
                                        childAtPosition(
                                                withId(R.id.mRecyclerView),
                                                0)),
                                2),
                        isDisplayed()));
        appCompatImageButton4.perform(click());

        ViewInteraction appCompatImageButton5 = onView(
                allOf(withId(R.id.btnDelete),
                        childAtPosition(
                                allOf(withId(R.id.layoutPrincipal),
                                        childAtPosition(
                                                withId(R.id.mRecyclerView),
                                                0)),
                                2),
                        isDisplayed()));
        appCompatImageButton5.perform(click());

        ViewInteraction appCompatImageButton6 = onView(
                allOf(withId(R.id.btnDelete),
                        childAtPosition(
                                allOf(withId(R.id.layoutPrincipal),
                                        childAtPosition(
                                                withId(R.id.mRecyclerView),
                                                0)),
                                2),
                        isDisplayed()));
        appCompatImageButton6.perform(click());

        ViewInteraction floatingActionButton = onView(
                allOf(withId(R.id.btnReunion),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        floatingActionButton.perform(click());

        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.txtSujet),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText.perform(replaceText("reunion"), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btnDate), withText("Choisir une date"),
                        childAtPosition(
                                allOf(withId(R.id.layoutDate),
                                        childAtPosition(
                                                withClassName(is("com.google.android.material.circularreveal.CircularRevealRelativeLayout")),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(android.R.id.button1), withText("OK"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                2),
                        isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.btnHoraire), withText("Choisir l'horaire"),
                        childAtPosition(
                                allOf(withId(R.id.layoutHoraire),
                                        childAtPosition(
                                                withClassName(is("com.google.android.material.circularreveal.CircularRevealRelativeLayout")),
                                                2)),
                                0),
                        isDisplayed()));
        appCompatButton3.perform(click());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(android.R.id.button1), withText("OK"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                2),
                        isDisplayed()));
        appCompatButton4.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction appCompatSpinner = onView(
                allOf(withId(R.id.spinnerSalle),
                        childAtPosition(
                                allOf(withId(R.id.layoutSalle),
                                        childAtPosition(
                                                withClassName(is("com.google.android.material.circularreveal.CircularRevealRelativeLayout")),
                                                3)),
                                0),
                        isDisplayed()));
        appCompatSpinner.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DataInteraction appCompatTextView = onData(anything())
                .inAdapterView(childAtPosition(
                        withClassName(is("android.widget.PopupWindow$PopupBackgroundView")),
                        0))
                .atPosition(2);
        appCompatTextView.perform(click());

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(R.id.btnParticipants), withText("Choisir les participants"),
                        childAtPosition(
                                allOf(withId(R.id.layoutParticipants),
                                        childAtPosition(
                                                withClassName(is("com.google.android.material.circularreveal.CircularRevealRelativeLayout")),
                                                4)),
                                0),
                        isDisplayed()));
        appCompatButton5.perform(click());

        DataInteraction appCompatCheckedTextView = onData(anything())
                .inAdapterView(allOf(withId(R.id.select_dialog_listview),
                        childAtPosition(
                                withId(R.id.contentPanel),
                                0)))
                .atPosition(0);
        appCompatCheckedTextView.perform(click());

        ViewInteraction appCompatButton6 = onView(
                allOf(withId(android.R.id.button1), withText("Valider"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttonPanel),
                                        0),
                                3)));
        appCompatButton6.perform(scrollTo(), click());

        ViewInteraction appCompatButton7 = onView(
                allOf(withId(R.id.btnSave), withText("Enregistré"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                5),
                        isDisplayed()));
        appCompatButton7.perform(click());

        ViewInteraction textView = onView(
                allOf(withId(R.id.txtSujetReunion), withText("reunion"),
                        childAtPosition(
                                allOf(withId(R.id.premier),
                                        childAtPosition(
                                                withId(R.id.conteneur),
                                                0)),
                                0),
                        isDisplayed()));
        textView.check(matches(withText("reunion")));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.txtReunionSalle), withText("Mario"),
                        childAtPosition(
                                allOf(withId(R.id.premier),
                                        childAtPosition(
                                                withId(R.id.conteneur),
                                                0)),
                                2),
                        isDisplayed()));
        textView2.check(matches(withText("Mario")));

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.txtReunionParticipants), withText("machin@test.fr, "),
                        childAtPosition(
                                allOf(withId(R.id.troisieme),
                                        childAtPosition(
                                                withId(R.id.conteneur),
                                                1)),
                                0),
                        isDisplayed()));
        textView3.check(matches(withText("machin@test.fr, ")));

        ViewInteraction textView4 = onView(
                allOf(withId(R.id.txtReunionParticipants), withText("machin@test.fr, "),
                        childAtPosition(
                                allOf(withId(R.id.troisieme),
                                        childAtPosition(
                                                withId(R.id.conteneur),
                                                1)),
                                0),
                        isDisplayed()));
        textView4.check(matches(withText("machin@test.fr, ")));
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
