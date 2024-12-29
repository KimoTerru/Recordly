package com.kimoterru.recordly.ui.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Screen {
  
  @Serializable
  data object Home : Screen()
  
  @Serializable
  data object Detail : Screen()
  
  @Serializable
  data object Settings : Screen()
  
}