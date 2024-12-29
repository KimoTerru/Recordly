package com.kimoterru.recordly.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.kimoterru.recordly.ui.screen.detail.DetailScreen
import com.kimoterru.recordly.ui.screen.home.HomeScreen
import com.kimoterru.recordly.ui.screen.settings.SettingsScreen

@Composable
fun AppNavHost(
  navController: NavHostController,
  modifier: Modifier = Modifier,
  startDestination: Screen = Screen.Home,
) {
  NavHost(
    modifier = modifier,
    startDestination = startDestination,
    navController = navController
  ) {
    composable<Screen.Home> {
      HomeScreen(navController = navController)
    }
    
    composable<Screen.Detail> {
      DetailScreen(navController = navController)
    }
    
    composable<Screen.Settings> {
      SettingsScreen(navController = navController)
    }
  }
}