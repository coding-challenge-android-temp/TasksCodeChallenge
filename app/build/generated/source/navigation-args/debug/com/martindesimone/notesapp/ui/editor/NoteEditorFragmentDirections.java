package com.martindesimone.notesapp.ui.editor;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.martindesimone.notesapp.R;

public class NoteEditorFragmentDirections {
  private NoteEditorFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionNoteEditorFragmentToNoteListFragment() {
    return new ActionOnlyNavDirections(R.id.action_noteEditorFragment_to_noteListFragment);
  }
}
