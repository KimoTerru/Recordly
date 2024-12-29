package com.kimoterru.recordly.core.base

import androidx.lifecycle.ViewModel

abstract class BaseViewModel<State : BaseScreenState, Event : BaseScreenEvent> : ViewModel() {
  abstract var state: State
  abstract fun onEvent(event: Event)
}