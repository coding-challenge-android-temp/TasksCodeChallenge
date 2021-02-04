package com.martindesimone.notesapp.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0018\u0019\u001aB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u000e2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lcom/martindesimone/notesapp/adapter/NoteAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/martindesimone/AllTasksQuery$AllTask;", "Lcom/martindesimone/notesapp/adapter/NoteAdapter$NoteViewHolder;", "onClickListener", "Lcom/martindesimone/notesapp/adapter/NoteAdapter$OnClickListener;", "(Lcom/martindesimone/notesapp/adapter/NoteAdapter$OnClickListener;)V", "tasks", "", "getTasks", "()Ljava/util/List;", "setTasks", "(Ljava/util/List;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "list", "DiffCallback", "NoteViewHolder", "OnClickListener", "app_debug"})
public final class NoteAdapter extends androidx.recyclerview.widget.ListAdapter<com.martindesimone.AllTasksQuery.AllTask, com.martindesimone.notesapp.adapter.NoteAdapter.NoteViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.martindesimone.AllTasksQuery.AllTask> tasks;
    private final com.martindesimone.notesapp.adapter.NoteAdapter.OnClickListener onClickListener = null;
    public static final com.martindesimone.notesapp.adapter.NoteAdapter.DiffCallback DiffCallback = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.martindesimone.AllTasksQuery.AllTask> getTasks() {
        return null;
    }
    
    public final void setTasks(@org.jetbrains.annotations.NotNull()
    java.util.List<com.martindesimone.AllTasksQuery.AllTask> p0) {
    }
    
    @java.lang.Override()
    public void submitList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.martindesimone.AllTasksQuery.AllTask> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.martindesimone.notesapp.adapter.NoteAdapter.NoteViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.martindesimone.notesapp.adapter.NoteAdapter.NoteViewHolder holder, int position) {
    }
    
    public NoteAdapter(@org.jetbrains.annotations.NotNull()
    com.martindesimone.notesapp.adapter.NoteAdapter.OnClickListener onClickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/martindesimone/notesapp/adapter/NoteAdapter$NoteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/martindesimone/notesapp/databinding/ItemNoteBinding;", "(Lcom/martindesimone/notesapp/databinding/ItemNoteBinding;)V", "bind", "", "task", "Lcom/martindesimone/AllTasksQuery$AllTask;", "app_debug"})
    public static final class NoteViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.martindesimone.notesapp.databinding.ItemNoteBinding binding;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.martindesimone.AllTasksQuery.AllTask task) {
        }
        
        public NoteViewHolder(@org.jetbrains.annotations.NotNull()
        com.martindesimone.notesapp.databinding.ItemNoteBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B(\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004R,\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/martindesimone/notesapp/adapter/NoteAdapter$OnClickListener;", "", "clickListener", "Lkotlin/Function1;", "Lcom/martindesimone/AllTasksQuery$AllTask;", "Lkotlin/ParameterName;", "name", "rickAndMorty", "", "(Lkotlin/jvm/functions/Function1;)V", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "onClick", "app_debug"})
    public static final class OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<com.martindesimone.AllTasksQuery.AllTask, kotlin.Unit> clickListener = null;
        
        public final void onClick(@org.jetbrains.annotations.NotNull()
        com.martindesimone.AllTasksQuery.AllTask rickAndMorty) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<com.martindesimone.AllTasksQuery.AllTask, kotlin.Unit> getClickListener() {
            return null;
        }
        
        public OnClickListener(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.martindesimone.AllTasksQuery.AllTask, kotlin.Unit> clickListener) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/martindesimone/notesapp/adapter/NoteAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/martindesimone/AllTasksQuery$AllTask;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.martindesimone.AllTasksQuery.AllTask> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.martindesimone.AllTasksQuery.AllTask oldItem, @org.jetbrains.annotations.NotNull()
        com.martindesimone.AllTasksQuery.AllTask newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.martindesimone.AllTasksQuery.AllTask oldItem, @org.jetbrains.annotations.NotNull()
        com.martindesimone.AllTasksQuery.AllTask newItem) {
            return false;
        }
        
        private DiffCallback() {
            super();
        }
    }
}