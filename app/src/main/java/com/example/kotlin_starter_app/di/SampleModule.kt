package com.example.kotlin_starter_app.di

import androidx.lifecycle.ViewModel
import com.example.kotlin_starter_app.ui.sample.SampleFragment
import com.example.kotlin_starter_app.ui.sample.SampleViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class SampleModule {
  @ContributesAndroidInjector(modules = [
    ViewModelBuilder::class
  ])
  internal abstract fun sampleFragment(): SampleFragment

  @Binds
  @IntoMap
  @ViewModelKey(SampleViewModel::class)
  abstract fun bindViewModel(viewModel: SampleViewModel): ViewModel
}