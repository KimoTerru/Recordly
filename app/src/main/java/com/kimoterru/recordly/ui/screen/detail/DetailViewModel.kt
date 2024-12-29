package com.kimoterru.recordly.ui.screen.detail

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.kimoterru.recordly.core.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor() : BaseViewModel<DetailScreenState, DetailScreenEvent>() {
  
  override var state by mutableStateOf(DetailScreenState())
  
  override fun onEvent(event: DetailScreenEvent) = when (event) {
    else -> {}
  }
  
}