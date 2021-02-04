package com.martindesimone.notesapp.databinding;
import com.martindesimone.notesapp.R;
import com.martindesimone.notesapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentNoteEditorBindingImpl extends FragmentNoteEditorBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.navigationUp, 5);
        sViewsWithIds.put(R.id.scroll_container_content_note, 6);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentNoteEditorBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentNoteEditorBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (androidx.appcompat.widget.AppCompatEditText) bindings[4]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ScrollView) bindings[6]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[3]
            );
        this.contentEditText.setTag(null);
        this.deleteNoteButton.setTag(null);
        this.noteEditorLayout.setTag(null);
        this.saveNoteBtn.setTag(null);
        this.titleEditText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.martindesimone.notesapp.ui.editor.NoteEditorViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.martindesimone.notesapp.ui.editor.NoteEditorViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsEdit((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelIsNewTask((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelTaskName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelTaskNote((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsEdit(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsEdit, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsNewTask(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsNewTask, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTaskName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelTaskName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTaskNote(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelTaskNote, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsNewTaskGetValue = false;
        java.lang.Boolean viewModelIsNewTaskGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsEditGetValue = false;
        java.lang.String viewModelTaskNameGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsEdit = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsNewTask = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelTaskName = null;
        java.lang.String viewModelTaskNoteGetValue = null;
        com.martindesimone.notesapp.ui.editor.NoteEditorViewModel viewModel = mViewModel;
        java.lang.Boolean viewModelIsEditGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelTaskNote = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isEdit()
                        viewModelIsEdit = viewModel.isEdit();
                    }
                    updateLiveDataRegistration(0, viewModelIsEdit);


                    if (viewModelIsEdit != null) {
                        // read viewModel.isEdit().getValue()
                        viewModelIsEditGetValue = viewModelIsEdit.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEdit().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsEditGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsEditGetValue);
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isNewTask()
                        viewModelIsNewTask = viewModel.isNewTask();
                    }
                    updateLiveDataRegistration(1, viewModelIsNewTask);


                    if (viewModelIsNewTask != null) {
                        // read viewModel.isNewTask().getValue()
                        viewModelIsNewTaskGetValue = viewModelIsNewTask.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNewTask().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsNewTaskGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsNewTaskGetValue);
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.taskName
                        viewModelTaskName = viewModel.getTaskName();
                    }
                    updateLiveDataRegistration(2, viewModelTaskName);


                    if (viewModelTaskName != null) {
                        // read viewModel.taskName.getValue()
                        viewModelTaskNameGetValue = viewModelTaskName.getValue();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.taskNote
                        viewModelTaskNote = viewModel.getTaskNote();
                    }
                    updateLiveDataRegistration(3, viewModelTaskNote);


                    if (viewModelTaskNote != null) {
                        // read viewModel.taskNote.getValue()
                        viewModelTaskNoteGetValue = viewModelTaskNote.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.contentEditText, viewModelTaskNoteGetValue);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            this.contentEditText.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelIsNewTaskGetValue);
            this.contentEditText.setFocusable(androidxDatabindingViewDataBindingSafeUnboxViewModelIsNewTaskGetValue);
            com.martindesimone.notesapp.util.BindingAdaptersKt.isVisible(this.saveNoteBtn, androidxDatabindingViewDataBindingSafeUnboxViewModelIsNewTaskGetValue);
            this.titleEditText.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelIsNewTaskGetValue);
            this.titleEditText.setFocusable(androidxDatabindingViewDataBindingSafeUnboxViewModelIsNewTaskGetValue);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            com.martindesimone.notesapp.util.BindingAdaptersKt.isVisible(this.deleteNoteButton, androidxDatabindingViewDataBindingSafeUnboxViewModelIsEditGetValue);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleEditText, viewModelTaskNameGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isEdit()
        flag 1 (0x2L): viewModel.isNewTask()
        flag 2 (0x3L): viewModel.taskName
        flag 3 (0x4L): viewModel.taskNote
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}