package fr.razamelpar.lamzone.mareu.Vues;


import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import fr.razamelpar.lamzone.mareu.R;
import fr.razamelpar.lamzone.mareu.Utils.DeleteViewAction;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.hasMinimumChildCount;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static fr.razamelpar.lamzone.mareu.Utils.RecyclerViewItemCountAssertion.withItemCount;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.IsNull.notNullValue;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TestListView {

    private static int ITEMS_COUNT = 6;

    private MainActivity mActivity;

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() {
        mActivity = mActivityTestRule.getActivity();
        assertThat(mActivity, notNullValue());
    }

    @Test
    public void listViewNonVide() {
        // First scroll to the position that needs to be matched and click on it.
        onView(allOf(withId(R.id.mRecyclerView),isDisplayed()))
                .check(matches(hasMinimumChildCount(1)));
    }

    @Test
    public void myNeighboursList_deleteAction_shouldRemoveItem() {
        // Given : We remove the element at position 2
        onView(allOf(withId(R.id.mRecyclerView),isDisplayed())).check(withItemCount(ITEMS_COUNT));
        // When perform a click on a delete icon
        onView(allOf(withId(R.id.mRecyclerView),isDisplayed()))
                .perform(actionOnItemAtPosition(1, new DeleteViewAction()));
        // Then : the number of element is 11
        onView(allOf(withId(R.id.mRecyclerView),isDisplayed())).check(withItemCount(ITEMS_COUNT-1));
    }
}
