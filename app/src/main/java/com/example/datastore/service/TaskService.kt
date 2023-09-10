package com.example.datastore.service

import com.example.datastore.data.Tasks
import kotlinx.coroutines.flow.Flow

interface TaskService {
    fun getTasksFromPrefDataStore(): Flow<Tasks>
    suspend fun addTasks(tasks: Tasks)
}