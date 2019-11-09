package com.example.kotlin_starter_app.ui.sample

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.kotlin_starter_app.R
import com.example.kotlin_starter_app.databinding.SampleFragmentBinding
import com.example.kotlin_starter_app.ui.BaseFragment
import com.example.kotlin_starter_app.ui.BaseViewModel

class SampleFragment : BaseFragment<SampleViewModel, SampleFragmentBinding>() {

  override fun getViewModel(): Class<SampleViewModel> {
    return SampleViewModel::class.java
  }

  override fun getLayoutRes(): Int {
    return R.layout.sample_fragment
  }


}
