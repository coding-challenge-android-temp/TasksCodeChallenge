package com.martindesimone.notesapp.ui.editor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016J\b\u0010\u000e\u001a\u00020!H\u0002J\u0006\u0010#\u001a\u00020!J\b\u0010$\u001a\u00020!H\u0014J\u0016\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020\u0016J\u0016\u0010(\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u000bR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u000bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/martindesimone/notesapp/ui/editor/NoteEditorViewModel;", "Landroidx/lifecycle/ViewModel;", "notesRepository", "Lcom/martindesimone/notesapp/repository/TasksRepository;", "(Lcom/martindesimone/notesapp/repository/TasksRepository;)V", "_navigateToList", "Landroidx/lifecycle/MutableLiveData;", "", "isEdit", "()Landroidx/lifecycle/MutableLiveData;", "setEdit", "(Landroidx/lifecycle/MutableLiveData;)V", "isNewTask", "setNewTask", "navigateToList", "Landroidx/lifecycle/LiveData;", "getNavigateToList", "()Landroidx/lifecycle/LiveData;", "taskDone", "getTaskDone", "setTaskDone", "taskName", "", "getTaskName", "setTaskName", "taskNote", "getTaskNote", "setTaskNote", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "deleteNote", "", "taskId", "navigateToListDone", "onCleared", "saveNote", "name", "note", "updateTask", "isDone", "app_debug"})
public final class NoteEditorViewModel extends androidx.lifecycle.ViewModel {
    private kotlinx.coroutines.CompletableJob viewModelJob;
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _navigateToList = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isEdit;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNewTask;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> taskDone;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> taskNote;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> taskName;
    private final com.martindesimone.notesapp.repository.TasksRepository notesRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getNavigateToList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isEdit() {
        return null;
    }
    
    public final void setEdit(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNewTask() {
        return null;
    }
    
    public final void setNewTask(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getTaskDone() {
        return null;
    }
    
    public final void setTaskDone(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTaskNote() {
        return null;
    }
    
    public final void setTaskNote(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTaskName() {
        return null;
    }
    
    public final void setTaskName(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final void saveNote(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String note) {
    }
    
    public final void deleteNote(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId) {
    }
    
    public final void updateTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, boolean isDone) {
    }
    
    private final void navigateToList() {
    }
    
    public final void navigateToListDone() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public NoteEditorViewModel(@org.jetbrains.annotations.NotNull()
    com.martindesimone.notesapp.repository.TasksRepository notesRepository) {
        super();
    }
}