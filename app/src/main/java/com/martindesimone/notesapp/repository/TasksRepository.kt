package com.martindesimone.notesapp.repository

import android.content.ContentValues
import android.content.ContentValues.TAG
import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.apollographql.apollo.ApolloCall
import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.api.Response
import com.apollographql.apollo.exception.ApolloException
import com.martindesimone.*
import com.martindesimone.notesapp.AuthInterceptor
import com.martindesimone.notesapp.constant.Constant
import okhttp3.OkHttpClient

class TasksRepository(context: Context) : Repository {

    private var apolloClient: ApolloClient? = null
    private val preferences: SharedPreferences = context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE);

    init {
        apolloClient = ApolloClient.builder()
            .serverUrl(Constant.BASE_URL)
            .okHttpClient(
                OkHttpClient.Builder()
                .addInterceptor(AuthInterceptor(preferences))
                .build())
            .build();
    }

    override suspend fun addTask(name: String, note: String, navigateToList: MutableLiveData<Boolean>) {
        val createTaskMutation = CreateTaskMutation(name, note)

        apolloClient?.mutate(createTaskMutation)
            ?.enqueue(object: ApolloCall.Callback<CreateTaskMutation.Data>() {
                override fun onResponse(response: Response<CreateTaskMutation.Data>) {
                    navigateToList.postValue(true)
                }

                override fun onFailure(e: ApolloException) {
                    Log.e(TAG, e.localizedMessage, e);
                }
            })
    }

    override suspend fun updateTask(taskId: String, isDone: Boolean, navigateToList: MutableLiveData<Boolean>) {
        val updateTaskMutation = UpdateTaskStatusMutation(taskId, isDone)

        apolloClient?.mutate(updateTaskMutation)
            ?.enqueue(object: ApolloCall.Callback<UpdateTaskStatusMutation.Data>() {
                override fun onResponse(response: Response<UpdateTaskStatusMutation.Data>) {
                    navigateToList.postValue(true)
                }

                override fun onFailure(e: ApolloException) {
                    Log.e(TAG, e.localizedMessage, e);
                }
            })
    }

    override fun getTasks(liveData: MutableLiveData<List<AllTasksQuery.AllTask>>?): MutableLiveData<List<AllTasksQuery.AllTask>> {
        var liveDataTasks: MutableLiveData<List<AllTasksQuery.AllTask>>

        if(liveData == null){
            liveDataTasks = MutableLiveData<List<AllTasksQuery.AllTask>>()
        }
        else{
            liveDataTasks = liveData
        }

        val allTasksQuery = AllTasksQuery()
        apolloClient?.query(allTasksQuery)
            ?.enqueue(object: ApolloCall.Callback<AllTasksQuery.Data>() {
                override fun onResponse(response: Response<AllTasksQuery.Data>) {
                    liveDataTasks.postValue(response.data?.allTasks())
                }

                override fun onFailure(e: ApolloException) {
                    Log.e(ContentValues.TAG, e.localizedMessage, e);
                }
            });
        return liveDataTasks
    }

    override fun generateAccessToken(userName: String): MutableLiveData<String> {
        val liveData = MutableLiveData<String>()
        val generateTokenMutation = GenerateAccessTokenMutation(userName, Constant.API_KEY)
        apolloClient?.mutate(generateTokenMutation)
            ?.enqueue(object: ApolloCall.Callback<GenerateAccessTokenMutation.Data>() {
                override fun onResponse(response: Response<GenerateAccessTokenMutation.Data>) {
                    preferences.edit().putString("AUTH_TOKEN", response.data?.generateAccessToken()).apply()
                    liveData.postValue(response.data?.generateAccessToken())
                }

                override fun onFailure(e: ApolloException) {
                    Log.e(TAG, e.localizedMessage, e);
                }
            })
        return liveData
    }

    override suspend fun deleteTask(taskId: String, navigateToList: MutableLiveData<Boolean>) {
        val deleteTaskMutation = DeleteTaskMutation(taskId)
        apolloClient?.mutate(deleteTaskMutation)
            ?.enqueue(object: ApolloCall.Callback<DeleteTaskMutation.Data>() {
                override fun onResponse(response: Response<DeleteTaskMutation.Data>) {
                    navigateToList.postValue(true)
                }

                override fun onFailure(e: ApolloException) {
                    Log.e(TAG, e.localizedMessage, e);
                }
            })
    }
}