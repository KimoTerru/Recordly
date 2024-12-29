package com.kimoterru.recordly.ui.screen.home

import androidx.compose.foundation.clickable
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
fun HomeScreen(
  navController: NavController,
  viewModel: HomeViewModel = hiltViewModel(),
) {
  HomeScreenContent(
    state = viewModel.state,
    onEvent = viewModel::onEvent,
    onNavigateTo = navController::navigate
  )
}

@Composable
private fun HomeScreenContent(
  modifier: Modifier = Modifier,
  state: HomeScreenState = HomeScreenState(),
  onEvent: (HomeScreenEvent) -> Unit = {},
  onNavigateTo: (Screen) -> Unit = {},
) {
  Box(modifier = modifier.fillMaxSize()) {
    Text(
      modifier = modifier
        .align(Alignment.Center)
        .clickable {
          onNavigateTo(Screen.Detail)
        },
      text = "HomeScreenContent"
    )
  }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
  HomeScreenContent()
}