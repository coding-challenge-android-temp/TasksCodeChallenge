package com.martindesimone.notesapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.martindesimone.notesapp.databinding.FragmentListNoteBindingImpl;
import com.martindesimone.notesapp.databinding.FragmentNoteEditorBindingImpl;
import com.martindesimone.notesapp.databinding.ItemNoteBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTLISTNOTE = 1;

  private static final int LAYOUT_FRAGMENTNOTEEDITOR = 2;

  private static final int LAYOUT_ITEMNOTE = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.martindesimone.notesapp.R.layout.fragment_list_note, LAYOUT_FRAGMENTLISTNOTE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.martindesimone.notesapp.R.layout.fragment_note_editor, LAYOUT_FRAGMENTNOTEEDITOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.martindesimone.notesapp.R.layout.item_note, LAYOUT_ITEMNOTE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTLISTNOTE: {
          if ("layout/fragment_list_note_0".equals(tag)) {
            return new FragmentListNoteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_list_note is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNOTEEDITOR: {
          if ("layout/fragment_note_editor_0".equals(tag)) {
            return new FragmentNoteEditorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_note_editor is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMNOTE: {
          if ("layout/item_note_0".equals(tag)) {
            return new ItemNoteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_note is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "task");
      sKeys.put(2, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_list_note_0", com.martindesimone.notesapp.R.layout.fragment_list_note);
      sKeys.put("layout/fragment_note_editor_0", com.martindesimone.notesapp.R.layout.fragment_note_editor);
      sKeys.put("layout/item_note_0", com.martindesimone.notesapp.R.layout.item_note);
    }
  }
}
