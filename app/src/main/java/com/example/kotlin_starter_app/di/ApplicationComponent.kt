package com.example.kotlin_starter_app.di

import android.content.Context
import com.example.kotlin_starter_app.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
  modules = [
    ApplicationModule::class,
    AndroidInjectionModule::class,
    SampleModule::class
  ]
)
interface ApplicationComponent : AndroidInjector<App> {

  @Component.Factory
  interface Factory {
    fun create(@BindsInstance appContext: Context): ApplicationComponent
  }
}