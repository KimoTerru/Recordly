package com.kimoterru.recordly.ui.screen.settings

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.kimoterru.recordly.core.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SettingsViewModel @Inject constructor() : BaseViewModel<SettingsScreenState, SettingsScreenEvent>() {
  
  override var state by mutableStateOf(SettingsScreenState())
  
  override fun onEvent(event: SettingsScreenEvent) = when (event) {
    else -> {}
  }
  
}