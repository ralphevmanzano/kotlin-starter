package com.example.kotlin_starter_app.di

import dagger.Module

@Module(includes = [ApplicationModuleBinds::class])
object ApplicationModule {
  // TODO: Add provides methods here like below
//  @JvmStatic
//  @Singleton
//  @Provides
//  fun provideTasksLocalDataSource(
//      database: TaskDatabase,
//      @Named("io") ioDispatcher: CoroutineDispatcher
//  ): TasksDataSource {
//    return TasksLocalDataSource(database.taskDao(), ioDispatcher)
//  }
}

@Module
abstract class ApplicationModuleBinds {
  // TODO: Add binds methods here like below
//  @Singleton
//  @Binds
//  abstract fun bindRepository(repository: DefaultTasksRepository): TasksRepository
}