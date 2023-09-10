package com.example.datastore.service

import com.example.datastore.data.DataStoreManager
import com.example.datastore.data.Tasks
import javax.inject.Inject

class TaskServiceImpl @Inject constructor(
    private val DataStoreManager: DataStoreManager
) : TaskService {
    override fun getTasksFromPrefDataStore() =
        DataStoreManager.getTasks()
    override suspend fun addTasks(tasks: Tasks) {
        DataStoreManager.saveTasks(tasks)
    }
}