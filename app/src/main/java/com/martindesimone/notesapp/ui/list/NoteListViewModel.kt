package com.martindesimone.notesapp.ui.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.martindesimone.AllTasksQuery
import com.martindesimone.notesapp.repository.TasksRepository

class NoteListViewModel (private val noteRepository: TasksRepository) : ViewModel() {

    private var _tasksList = noteRepository.getTasks(null)

    val properties: MutableLiveData<List<AllTasksQuery.AllTask>>
        get() = _tasksList


    val isEmpty: LiveData<Boolean> = Transformations.map(properties) {
        it.isEmpty()
    }

    fun refreshTasks() {
        if(properties.value != null){
            noteRepository.getTasks(properties)
        }
    }

    private val _navigateToEditor = MutableLiveData<Boolean>()
    val navigateToEditor: LiveData<Boolean>
        get() = _navigateToEditor

    private val _navigateToNoteDetail = MutableLiveData<AllTasksQuery.AllTask>()
    val navigateToNoteDetail
        get() = _navigateToNoteDetail

    fun navigateToEditor() {
        _navigateToEditor.value = true
    }

    fun navigateToEditorDone() {
        _navigateToEditor.value = false
    }

    fun onNoteClicked(task: AllTasksQuery.AllTask) {
        _navigateToNoteDetail.value = task
    }

    fun onNoteNavigated() {
        _navigateToNoteDetail.value = null
    }
}