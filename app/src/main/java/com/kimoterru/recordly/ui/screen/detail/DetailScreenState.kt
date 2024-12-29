package com.kimoterru.recordly.ui.screen.detail

import com.kimoterru.recordly.core.base.BaseScreenEvent
import com.kimoterru.recordly.core.base.BaseScreenState

data class DetailScreenState(
  val id: Int = 1,
) : BaseScreenState()

class DetailScreenEvent : BaseScreenEvent()