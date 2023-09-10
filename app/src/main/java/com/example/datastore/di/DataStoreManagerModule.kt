package com.example.datastore.di

import com.example.datastore.data.DataStoreManager
import com.example.datastore.data.DataStoreManagerImpl
import com.example.datastore.service.TaskService
import com.example.datastore.service.TaskServiceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataStoreManagerModule {

    @Singleton
    @Binds
    abstract fun bindDataStoreRepository(dataStoreManagerImpl: DataStoreManagerImpl): DataStoreManager

    @Singleton
    @Binds
    abstract fun bindTaskService(taskServiceImpl: TaskServiceImpl): TaskService
}