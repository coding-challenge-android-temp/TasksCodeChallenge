package com.martindesimone.notesapp

import android.os.SystemClock
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TasksTest {

    @JvmField
    @Rule
    var mainActivity: ActivityTestRule<MainActivity> =
        ActivityTestRule(MainActivity::class.java)

    @Test
    fun newTaskTest(){
        onView(withId(R.id.bottomAppNew))
            .perform((click()))

        onView(withId(R.id.contentEditText))
            .perform(typeText("This is a TEST task"))
        onView(withId(R.id.titleEditText))
            .perform(typeText("This is a TEST task"))

        onView(withId(R.id.saveNoteBtn))
            .perform((click()))
    }

    @Test
    fun newEmptyTest(){
        onView(withId(R.id.bottomAppNew))
            .perform((click()))

        onView(withId(R.id.saveNoteBtn))
            .perform((click()))
    }

    @Test
    fun deleteTaskTest(){
        SystemClock.sleep(1000);

        if (getTasksCount() != null && getTasksCount()!! > 0){
            onView(withId(R.id.item_grid)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, clickOnViewChild(R.id.itemNoteCardView)))

            onView(withId(R.id.deleteNoteButton))
                .perform((click()))
        }
    }

    @Test
    fun seeTaskTest(){
        SystemClock.sleep(3000);

        if (getTasksCount() != null && getTasksCount()!! > 0){
            onView(withId(R.id.item_grid)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, clickOnViewChild(R.id.itemNoteCardView)))
        }
    }

    @Test
    fun seeAndBackTaskTest(){
        SystemClock.sleep(3000);

        if (getTasksCount() != null && getTasksCount()!! > 0){
            onView(withId(R.id.item_grid)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, clickOnViewChild(R.id.itemNoteCardView)))
            onView(withId(R.id.navigationUp))
                .perform((click()))
        }
    }

    private fun clickOnViewChild(viewId: Int) = object : ViewAction {
        override fun getConstraints() = null

        override fun getDescription() = "Click on a child view with specified id."

        override fun perform(uiController: UiController, view: View) = click().perform(uiController, view.findViewById<View>(viewId))
    }

    private fun getTasksCount(): Int? {
        val recyclerView = mainActivity.activity.findViewById<RecyclerView>(R.id.item_grid)
        return recyclerView.getAdapter()?.getItemCount();
    }
}