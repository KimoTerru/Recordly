package com.kimoterru.recordly.ui.screen.home

import com.kimoterru.recordly.core.base.BaseScreenEvent
import com.kimoterru.recordly.core.base.BaseScreenState

data class HomeScreenState(
  val id: Int = 1,
) : BaseScreenState()

class HomeScreenEvent : BaseScreenEvent()