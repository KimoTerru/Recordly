package com.kimoterru.recordly.ui.screen.settings

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.kimoterru.recordly.ui.navigation.Screen

@Composable
fun SettingsScreen(
  navController: NavController,
  viewModel: SettingsViewModel = hiltViewModel(),
) {
  SettingsScreenContent(
    state = viewModel.state,
    onEvent = viewModel::onEvent,
    onNavigateTo = navController::navigate
  )
}

@Composable
private fun SettingsScreenContent(
  modifier: Modifier = Modifier,
  state: SettingsScreenState = SettingsScreenState(),
  onEvent: (SettingsScreenEvent) -> Unit = {},
  onNavigateTo: (Screen) -> Unit = {},
) {
  Box(modifier = modifier.fillMaxSize()) {
    Text(
      modifier = modifier.align(Alignment.Center),
      text = "SettingsScreenContent"
    )
  }
}

@Preview(showBackground = true)
@Composable
private fun SettingsScreenPreview() {
  SettingsScreenContent()
}