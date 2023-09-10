package com.example.datastore.util

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.datastore.data.TaskDataSource
import com.example.datastore.data.Tasks
import com.example.datastore.service.TaskService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TaskViewModel @Inject constructor(
    private val taskService: TaskService
) : ViewModel() {

    private var saveFinish: (() -> Unit)? = null

    fun saveTaskData(tasks: Tasks) {
        viewModelScope.launch {
            Log.d("Task", "Data was inserted correctly")
            Log.d("", "$tasks.firstTask")
            Log.d("", "$tasks.secondTask")
            Log.d("", "$tasks.thirdTask")
            taskService.addTasks(tasks)
        }
    }


}