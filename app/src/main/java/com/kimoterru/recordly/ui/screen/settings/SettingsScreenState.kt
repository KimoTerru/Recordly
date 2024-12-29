package com.kimoterru.recordly.ui.screen.settings

import com.kimoterru.recordly.core.base.BaseScreenEvent
import com.kimoterru.recordly.core.base.BaseScreenState

data class SettingsScreenState(
  val id: Int = 1,
) : BaseScreenState()

class SettingsScreenEvent : BaseScreenEvent()