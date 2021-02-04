package com.martindesimone.notesapp.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.martindesimone.AllTasksQuery

interface Repository {
    suspend fun addTask(name: String, note: String, navigateToList: MutableLiveData<Boolean>)

    suspend fun updateTask(taskId: String, isDone: Boolean, navigateToList: MutableLiveData<Boolean>)

    fun getTasks(liveData: MutableLiveData<List<AllTasksQuery.AllTask>>?): MutableLiveData<List<AllTasksQuery.AllTask>>

    fun generateAccessToken(userName: String): LiveData<String>

    suspend fun deleteTask(taskId: String, navigateToList: MutableLiveData<Boolean>)
}