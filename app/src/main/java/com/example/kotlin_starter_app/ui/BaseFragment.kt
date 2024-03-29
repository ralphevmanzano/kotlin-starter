package com.example.kotlin_starter_app.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin_starter_app.BR
import com.example.kotlin_starter_app.utils.setupSnackbar
import com.google.android.material.snackbar.Snackbar
import dagger.android.support.DaggerFragment
import javax.inject.Inject

abstract class BaseFragment<VM : BaseViewModel, DB : ViewDataBinding> :
  DaggerFragment() {

  @Inject
  lateinit var viewModelFactory: ViewModelProvider.Factory

  protected abstract fun getViewModel(): Class<VM>

  @LayoutRes
  protected abstract fun getLayoutRes(): Int

  protected lateinit var viewModel: VM
  protected lateinit var binding: DB

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    viewModel = ViewModelProvider(this, viewModelFactory).get(getViewModel())
  }

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)
    setupSnackbar()
  }

  private fun setupSnackbar() {
    view?.setupSnackbar(viewLifecycleOwner, viewModel.snackbarText, Snackbar.LENGTH_SHORT)
  }

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    binding = DataBindingUtil.inflate(inflater, getLayoutRes(), container, false)
    binding.lifecycleOwner = viewLifecycleOwner
    binding.setVariable(BR.viewModel, viewModel)
    return binding.root
  }

  protected fun hideKeyboard() {
    (activity as MainActivity).hideKeyboard()
  }
}