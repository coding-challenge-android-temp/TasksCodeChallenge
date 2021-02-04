package com.martindesimone.notesapp.ui.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\tJ\u0006\u0010\u001a\u001a\u00020\u0016J\u0006\u0010\u001b\u001a\u00020\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013\u00a8\u0006\u001c"}, d2 = {"Lcom/martindesimone/notesapp/ui/list/NoteListViewModel;", "Landroidx/lifecycle/ViewModel;", "noteRepository", "Lcom/martindesimone/notesapp/repository/TasksRepository;", "(Lcom/martindesimone/notesapp/repository/TasksRepository;)V", "_navigateToEditor", "Landroidx/lifecycle/MutableLiveData;", "", "_navigateToNoteDetail", "Lcom/martindesimone/AllTasksQuery$AllTask;", "_tasksList", "", "isEmpty", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "navigateToEditor", "getNavigateToEditor", "navigateToNoteDetail", "getNavigateToNoteDetail", "()Landroidx/lifecycle/MutableLiveData;", "properties", "getProperties", "", "navigateToEditorDone", "onNoteClicked", "task", "onNoteNavigated", "refreshTasks", "app_debug"})
public final class NoteListViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.MutableLiveData<java.util.List<com.martindesimone.AllTasksQuery.AllTask>> _tasksList;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isEmpty = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _navigateToEditor = null;
    private final androidx.lifecycle.MutableLiveData<com.martindesimone.AllTasksQuery.AllTask> _navigateToNoteDetail = null;
    private final com.martindesimone.notesapp.repository.TasksRepository noteRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.martindesimone.AllTasksQuery.AllTask>> getProperties() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isEmpty() {
        return null;
    }
    
    public final void refreshTasks() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getNavigateToEditor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.martindesimone.AllTasksQuery.AllTask> getNavigateToNoteDetail() {
        return null;
    }
    
    public final void navigateToEditor() {
    }
    
    public final void navigateToEditorDone() {
    }
    
    public final void onNoteClicked(@org.jetbrains.annotations.NotNull()
    com.martindesimone.AllTasksQuery.AllTask task) {
    }
    
    public final void onNoteNavigated() {
    }
    
    public NoteListViewModel(@org.jetbrains.annotations.NotNull()
    com.martindesimone.notesapp.repository.TasksRepository noteRepository) {
        super();
    }
}