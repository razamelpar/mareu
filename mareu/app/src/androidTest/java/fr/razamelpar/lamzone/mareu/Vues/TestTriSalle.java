package fr.razamelpar.lamzone.mareu.Vues;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import fr.razamelpar.lamzone.mareu.R;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(JUnit4.class)
public class TestTriSalle {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testTriSalle() {
        ViewInteraction textView = onView(
                allOf(withId(R.id.txtReunionSalle), withText("Diddy Kong"),
                        childAtPosition(
                                allOf(withId(R.id.premier),
                                        childAtPosition(
                                                withId(R.id.conteneur),
                                                0)),
                                2),
                        isDisplayed()));
        textView.check(matches(withText("Diddy Kong")));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.txtReunionSalle), withText("Bowser"),
                        childAtPosition(
                                allOf(withId(R.id.premier),
                                        childAtPosition(
                                                withId(R.id.conteneur),
                                                0)),
                                2),
                        isDisplayed()));
        textView2.check(matches(withText("Bowser")));

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.txtReunionSalle), withText("Mario"),
                        childAtPosition(
                                allOf(withId(R.id.premier),
                                        childAtPosition(
                                                withId(R.id.conteneur),
                                                0)),
                                2),
                        isDisplayed()));
        textView3.check(matches(withText("Mario")));

        ViewInteraction textView4 = onView(
                allOf(withId(R.id.txtReunionSalle), withText("Toad"),
                        childAtPosition(
                                allOf(withId(R.id.premier),
                                        childAtPosition(
                                                withId(R.id.conteneur),
                                                0)),
                                2),
                        isDisplayed()));
        textView4.check(matches(withText("Toad")));

        ViewInteraction textView5 = onView(
                allOf(withId(R.id.txtReunionSalle), withText("Peach"),
                        childAtPosition(
                                allOf(withId(R.id.premier),
                                        childAtPosition(
                                                withId(R.id.conteneur),
                                                0)),
                                2),
                        isDisplayed()));
        textView5.check(matches(withText("Peach")));

        ViewInteraction textView6 = onView(
                allOf(withId(R.id.txtReunionSalle), withText("Luigi"),
                        childAtPosition(
                                allOf(withId(R.id.premier),
                                        childAtPosition(
                                                withId(R.id.conteneur),
                                                0)),
                                2),
                        isDisplayed()));
        textView6.check(matches(withText("Luigi")));

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction overflowMenuButton = onView(
                allOf(withContentDescription("filter icon menu"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.action_bar),
                                        1),
                                0),
                        isDisplayed()));
        overflowMenuButton.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction appCompatTextView = onView(
                allOf(withId(R.id.title), withText("Tri par salle"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatTextView.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction appCompatTextView2 = onView(
                allOf(withId(R.id.title), withText("Tri croissant"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatTextView2.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction overflowMenuButton2 = onView(
                allOf(withContentDescription("filter icon menu"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.action_bar),
                                        1),
                                0),
                        isDisplayed()));
        overflowMenuButton2.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction appCompatTextView3 = onView(
                allOf(withId(R.id.title), withText("Tri par salle"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatTextView3.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction appCompatTextView4 = onView(
                allOf(withId(R.id.title), withText("Tri décroissant"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatTextView4.perform(click());
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
