package com.martindesimone.notesapp.databinding;
import com.martindesimone.notesapp.R;
import com.martindesimone.notesapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentListNoteBindingImpl extends FragmentListNoteBinding implements com.martindesimone.notesapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.nestedScrollView, 4);
        sViewsWithIds.put(R.id.notNotesImage, 5);
        sViewsWithIds.put(R.id.messageList, 6);
        sViewsWithIds.put(R.id.bottomAppBar, 7);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentListNoteBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentListNoteBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.bottomappbar.BottomAppBar) bindings[7]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (androidx.core.widget.NestedScrollView) bindings[4]
            , (android.view.View) bindings[5]
            );
        this.bottomAppNew.setTag(null);
        this.itemGrid.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.messageConstrainLayout.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.martindesimone.notesapp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setViewModel((com.martindesimone.notesapp.ui.list.NoteListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.martindesimone.notesapp.ui.list.NoteListViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsEmpty((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelProperties((androidx.lifecycle.MutableLiveData<java.util.List<com.martindesimone.AllTasksQuery.AllTask>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsEmpty(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelIsEmpty, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelProperties(androidx.lifecycle.MutableLiveData<java.util.List<com.martindesimone.AllTasksQuery.AllTask>> ViewModelProperties, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        java.lang.Boolean viewModelIsEmptyGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelIsEmpty = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.martindesimone.AllTasksQuery.AllTask>> viewModelProperties = null;
        com.martindesimone.notesapp.ui.list.NoteListViewModel viewModel = mViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmptyGetValue = false;
        java.util.List<com.martindesimone.AllTasksQuery.AllTask> viewModelPropertiesGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isEmpty()
                        viewModelIsEmpty = viewModel.isEmpty();
                    }
                    updateLiveDataRegistration(0, viewModelIsEmpty);


                    if (viewModelIsEmpty != null) {
                        // read viewModel.isEmpty().getValue()
                        viewModelIsEmptyGetValue = viewModelIsEmpty.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEmpty().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmptyGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsEmptyGetValue);
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.properties
                        viewModelProperties = viewModel.getProperties();
                    }
                    updateLiveDataRegistration(1, viewModelProperties);


                    if (viewModelProperties != null) {
                        // read viewModel.properties.getValue()
                        viewModelPropertiesGetValue = viewModelProperties.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.bottomAppNew.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.martindesimone.notesapp.util.BindingAdaptersKt.bindRecyclerView(this.itemGrid, viewModelPropertiesGetValue);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.martindesimone.notesapp.util.BindingAdaptersKt.isVisible(this.messageConstrainLayout, androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmptyGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.martindesimone.notesapp.ui.list.NoteListViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.navigateToEditor();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isEmpty()
        flag 1 (0x2L): viewModel.properties
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}