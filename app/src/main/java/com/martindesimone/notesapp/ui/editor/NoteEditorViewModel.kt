package com.martindesimone.notesapp.ui.editor

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.martindesimone.notesapp.repository.TasksRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class NoteEditorViewModel (private val notesRepository: TasksRepository,) : ViewModel() {

    private var viewModelJob = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    private val _navigateToList = MutableLiveData<Boolean>()
    val navigateToList: LiveData<Boolean>
        get() = _navigateToList

    var isEdit =  MutableLiveData<Boolean>()
    var isNewTask =  MutableLiveData<Boolean>()

    var taskDone =  MutableLiveData<Boolean>()
    var taskNote =  MutableLiveData<String>()
    var taskName =  MutableLiveData<String>()

    fun saveNote(name: String, note: String) {
        uiScope.launch {
            notesRepository.addTask(name, note, _navigateToList)
        }
    }

    fun deleteNote(taskId: String) {
        uiScope.launch {
            notesRepository.deleteTask(taskId, _navigateToList)
        }
    }

    fun updateTask(taskId: String, isDone: Boolean) {
        uiScope.launch {
            notesRepository.updateTask(taskId, isDone, _navigateToList)
        }
    }

    fun navigateToListDone() {
        _navigateToList.value = false
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}