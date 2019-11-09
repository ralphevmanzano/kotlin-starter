package com.example.kotlin_starter_app

import com.example.kotlin_starter_app.di.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class App : DaggerApplication() {
  override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
    return DaggerApplicationComponent.factory().create(applicationContext)
  }
}