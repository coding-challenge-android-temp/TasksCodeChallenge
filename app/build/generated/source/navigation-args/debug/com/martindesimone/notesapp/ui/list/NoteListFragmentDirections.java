package com.martindesimone.notesapp.ui.list;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.martindesimone.notesapp.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class NoteListFragmentDirections {
  private NoteListFragmentDirections() {
  }

  @NonNull
  public static ActionNoteListFragmentToNoteEditorFragment actionNoteListFragmentToNoteEditorFragment(
      @NonNull String taskName, @NonNull String taskNote, @NonNull String taskId,
      boolean taskDone) {
    return new ActionNoteListFragmentToNoteEditorFragment(taskName, taskNote, taskId, taskDone);
  }

  @NonNull
  public static ActionNoteListFragmentToNoteEditorFragment2 actionNoteListFragmentToNoteEditorFragment2(
      @NonNull String taskName, @NonNull String taskNote, @NonNull String taskId,
      boolean taskDone) {
    return new ActionNoteListFragmentToNoteEditorFragment2(taskName, taskNote, taskId, taskDone);
  }

  public static class ActionNoteListFragmentToNoteEditorFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionNoteListFragmentToNoteEditorFragment(@NonNull String taskName,
        @NonNull String taskNote, @NonNull String taskId, boolean taskDone) {
      if (taskName == null) {
        throw new IllegalArgumentException("Argument \"taskName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("taskName", taskName);
      if (taskNote == null) {
        throw new IllegalArgumentException("Argument \"taskNote\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("taskNote", taskNote);
      if (taskId == null) {
        throw new IllegalArgumentException("Argument \"taskId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("taskId", taskId);
      this.arguments.put("taskDone", taskDone);
    }

    @NonNull
    public ActionNoteListFragmentToNoteEditorFragment setTaskName(@NonNull String taskName) {
      if (taskName == null) {
        throw new IllegalArgumentException("Argument \"taskName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("taskName", taskName);
      return this;
    }

    @NonNull
    public ActionNoteListFragmentToNoteEditorFragment setTaskNote(@NonNull String taskNote) {
      if (taskNote == null) {
        throw new IllegalArgumentException("Argument \"taskNote\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("taskNote", taskNote);
      return this;
    }

    @NonNull
    public ActionNoteListFragmentToNoteEditorFragment setTaskId(@NonNull String taskId) {
      if (taskId == null) {
        throw new IllegalArgumentException("Argument \"taskId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("taskId", taskId);
      return this;
    }

    @NonNull
    public ActionNoteListFragmentToNoteEditorFragment setTaskDone(boolean taskDone) {
      this.arguments.put("taskDone", taskDone);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("taskName")) {
        String taskName = (String) arguments.get("taskName");
        __result.putString("taskName", taskName);
      }
      if (arguments.containsKey("taskNote")) {
        String taskNote = (String) arguments.get("taskNote");
        __result.putString("taskNote", taskNote);
      }
      if (arguments.containsKey("taskId")) {
        String taskId = (String) arguments.get("taskId");
        __result.putString("taskId", taskId);
      }
      if (arguments.containsKey("taskDone")) {
        boolean taskDone = (boolean) arguments.get("taskDone");
        __result.putBoolean("taskDone", taskDone);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_noteListFragment_to_noteEditorFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getTaskName() {
      return (String) arguments.get("taskName");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getTaskNote() {
      return (String) arguments.get("taskNote");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getTaskId() {
      return (String) arguments.get("taskId");
    }

    @SuppressWarnings("unchecked")
    public boolean getTaskDone() {
      return (boolean) arguments.get("taskDone");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionNoteListFragmentToNoteEditorFragment that = (ActionNoteListFragmentToNoteEditorFragment) object;
      if (arguments.containsKey("taskName") != that.arguments.containsKey("taskName")) {
        return false;
      }
      if (getTaskName() != null ? !getTaskName().equals(that.getTaskName()) : that.getTaskName() != null) {
        return false;
      }
      if (arguments.containsKey("taskNote") != that.arguments.containsKey("taskNote")) {
        return false;
      }
      if (getTaskNote() != null ? !getTaskNote().equals(that.getTaskNote()) : that.getTaskNote() != null) {
        return false;
      }
      if (arguments.containsKey("taskId") != that.arguments.containsKey("taskId")) {
        return false;
      }
      if (getTaskId() != null ? !getTaskId().equals(that.getTaskId()) : that.getTaskId() != null) {
        return false;
      }
      if (arguments.containsKey("taskDone") != that.arguments.containsKey("taskDone")) {
        return false;
      }
      if (getTaskDone() != that.getTaskDone()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getTaskName() != null ? getTaskName().hashCode() : 0);
      result = 31 * result + (getTaskNote() != null ? getTaskNote().hashCode() : 0);
      result = 31 * result + (getTaskId() != null ? getTaskId().hashCode() : 0);
      result = 31 * result + (getTaskDone() ? 1 : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionNoteListFragmentToNoteEditorFragment(actionId=" + getActionId() + "){"
          + "taskName=" + getTaskName()
          + ", taskNote=" + getTaskNote()
          + ", taskId=" + getTaskId()
          + ", taskDone=" + getTaskDone()
          + "}";
    }
  }

  public static class ActionNoteListFragmentToNoteEditorFragment2 implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionNoteListFragmentToNoteEditorFragment2(@NonNull String taskName,
        @NonNull String taskNote, @NonNull String taskId, boolean taskDone) {
      if (taskName == null) {
        throw new IllegalArgumentException("Argument \"taskName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("taskName", taskName);
      if (taskNote == null) {
        throw new IllegalArgumentException("Argument \"taskNote\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("taskNote", taskNote);
      if (taskId == null) {
        throw new IllegalArgumentException("Argument \"taskId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("taskId", taskId);
      this.arguments.put("taskDone", taskDone);
    }

    @NonNull
    public ActionNoteListFragmentToNoteEditorFragment2 setTaskName(@NonNull String taskName) {
      if (taskName == null) {
        throw new IllegalArgumentException("Argument \"taskName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("taskName", taskName);
      return this;
    }

    @NonNull
    public ActionNoteListFragmentToNoteEditorFragment2 setTaskNote(@NonNull String taskNote) {
      if (taskNote == null) {
        throw new IllegalArgumentException("Argument \"taskNote\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("taskNote", taskNote);
      return this;
    }

    @NonNull
    public ActionNoteListFragmentToNoteEditorFragment2 setTaskId(@NonNull String taskId) {
      if (taskId == null) {
        throw new IllegalArgumentException("Argument \"taskId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("taskId", taskId);
      return this;
    }

    @NonNull
    public ActionNoteListFragmentToNoteEditorFragment2 setTaskDone(boolean taskDone) {
      this.arguments.put("taskDone", taskDone);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("taskName")) {
        String taskName = (String) arguments.get("taskName");
        __result.putString("taskName", taskName);
      }
      if (arguments.containsKey("taskNote")) {
        String taskNote = (String) arguments.get("taskNote");
        __result.putString("taskNote", taskNote);
      }
      if (arguments.containsKey("taskId")) {
        String taskId = (String) arguments.get("taskId");
        __result.putString("taskId", taskId);
      }
      if (arguments.containsKey("taskDone")) {
        boolean taskDone = (boolean) arguments.get("taskDone");
        __result.putBoolean("taskDone", taskDone);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_noteListFragment_to_noteEditorFragment2;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getTaskName() {
      return (String) arguments.get("taskName");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getTaskNote() {
      return (String) arguments.get("taskNote");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getTaskId() {
      return (String) arguments.get("taskId");
    }

    @SuppressWarnings("unchecked")
    public boolean getTaskDone() {
      return (boolean) arguments.get("taskDone");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionNoteListFragmentToNoteEditorFragment2 that = (ActionNoteListFragmentToNoteEditorFragment2) object;
      if (arguments.containsKey("taskName") != that.arguments.containsKey("taskName")) {
        return false;
      }
      if (getTaskName() != null ? !getTaskName().equals(that.getTaskName()) : that.getTaskName() != null) {
        return false;
      }
      if (arguments.containsKey("taskNote") != that.arguments.containsKey("taskNote")) {
        return false;
      }
      if (getTaskNote() != null ? !getTaskNote().equals(that.getTaskNote()) : that.getTaskNote() != null) {
        return false;
      }
      if (arguments.containsKey("taskId") != that.arguments.containsKey("taskId")) {
        return false;
      }
      if (getTaskId() != null ? !getTaskId().equals(that.getTaskId()) : that.getTaskId() != null) {
        return false;
      }
      if (arguments.containsKey("taskDone") != that.arguments.containsKey("taskDone")) {
        return false;
      }
      if (getTaskDone() != that.getTaskDone()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getTaskName() != null ? getTaskName().hashCode() : 0);
      result = 31 * result + (getTaskNote() != null ? getTaskNote().hashCode() : 0);
      result = 31 * result + (getTaskId() != null ? getTaskId().hashCode() : 0);
      result = 31 * result + (getTaskDone() ? 1 : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionNoteListFragmentToNoteEditorFragment2(actionId=" + getActionId() + "){"
          + "taskName=" + getTaskName()
          + ", taskNote=" + getTaskNote()
          + ", taskId=" + getTaskId()
          + ", taskDone=" + getTaskDone()
          + "}";
    }
  }
}
