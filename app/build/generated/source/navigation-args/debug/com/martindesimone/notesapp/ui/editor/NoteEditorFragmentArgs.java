package com.martindesimone.notesapp.ui.editor;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class NoteEditorFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private NoteEditorFragmentArgs() {
  }

  private NoteEditorFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static NoteEditorFragmentArgs fromBundle(@NonNull Bundle bundle) {
    NoteEditorFragmentArgs __result = new NoteEditorFragmentArgs();
    bundle.setClassLoader(NoteEditorFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("taskName")) {
      String taskName;
      taskName = bundle.getString("taskName");
      if (taskName == null) {
        throw new IllegalArgumentException("Argument \"taskName\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("taskName", taskName);
    } else {
      throw new IllegalArgumentException("Required argument \"taskName\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("taskNote")) {
      String taskNote;
      taskNote = bundle.getString("taskNote");
      if (taskNote == null) {
        throw new IllegalArgumentException("Argument \"taskNote\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("taskNote", taskNote);
    } else {
      throw new IllegalArgumentException("Required argument \"taskNote\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("taskId")) {
      String taskId;
      taskId = bundle.getString("taskId");
      if (taskId == null) {
        throw new IllegalArgumentException("Argument \"taskId\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("taskId", taskId);
    } else {
      throw new IllegalArgumentException("Required argument \"taskId\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("taskDone")) {
      boolean taskDone;
      taskDone = bundle.getBoolean("taskDone");
      __result.arguments.put("taskDone", taskDone);
    } else {
      throw new IllegalArgumentException("Required argument \"taskDone\" is missing and does not have an android:defaultValue");
    }
    return __result;
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

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    NoteEditorFragmentArgs that = (NoteEditorFragmentArgs) object;
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
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getTaskName() != null ? getTaskName().hashCode() : 0);
    result = 31 * result + (getTaskNote() != null ? getTaskNote().hashCode() : 0);
    result = 31 * result + (getTaskId() != null ? getTaskId().hashCode() : 0);
    result = 31 * result + (getTaskDone() ? 1 : 0);
    return result;
  }

  @Override
  public String toString() {
    return "NoteEditorFragmentArgs{"
        + "taskName=" + getTaskName()
        + ", taskNote=" + getTaskNote()
        + ", taskId=" + getTaskId()
        + ", taskDone=" + getTaskDone()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(NoteEditorFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull String taskName, @NonNull String taskNote, @NonNull String taskId,
        boolean taskDone) {
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
    public NoteEditorFragmentArgs build() {
      NoteEditorFragmentArgs result = new NoteEditorFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setTaskName(@NonNull String taskName) {
      if (taskName == null) {
        throw new IllegalArgumentException("Argument \"taskName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("taskName", taskName);
      return this;
    }

    @NonNull
    public Builder setTaskNote(@NonNull String taskNote) {
      if (taskNote == null) {
        throw new IllegalArgumentException("Argument \"taskNote\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("taskNote", taskNote);
      return this;
    }

    @NonNull
    public Builder setTaskId(@NonNull String taskId) {
      if (taskId == null) {
        throw new IllegalArgumentException("Argument \"taskId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("taskId", taskId);
      return this;
    }

    @NonNull
    public Builder setTaskDone(boolean taskDone) {
      this.arguments.put("taskDone", taskDone);
      return this;
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
  }
}
