package com.martindesimone.notesapp.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u000b\u001a\u0014\u0010\f\u001a\u00020\u0001*\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0014\u0010\u000f\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u00a8\u0006\u0014"}, d2 = {"bindRecyclerView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "data", "", "Lcom/martindesimone/AllTasksQuery$AllTask;", "hideKeyboard", "Landroid/content/Context;", "view", "Landroid/view/View;", "Landroidx/fragment/app/Fragment;", "isVisible", "bool", "", "setFormattedDate", "Landroid/widget/TextView;", "date", "", "setFormattedDateAdd", "app_debug"})
public final class BindingAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"listData"})
    public static final void bindRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    java.util.List<com.martindesimone.AllTasksQuery.AllTask> data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setFormattedDate"})
    public static final void setFormattedDate(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setFormattedDate, long date) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setFormattedDateAdd"})
    public static final void setFormattedDateAdd(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setFormattedDateAdd, long date) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"isVisible"})
    public static final void isVisible(@org.jetbrains.annotations.NotNull()
    android.view.View $this$isVisible, boolean bool) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$hideKeyboard, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$hideKeyboard) {
    }
}