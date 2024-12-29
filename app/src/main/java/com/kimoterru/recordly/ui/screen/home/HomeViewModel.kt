package com.kimoterru.recordly.ui.screen.home

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.kimoterru.recordly.core.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : BaseViewModel<HomeScreenState, HomeScreenEvent>() {
  
  override var state by mutableStateOf(HomeScreenState())
  
  override fun onEvent(event: HomeScreenEvent) = when (event) {
    else -> {}
  }
  
}