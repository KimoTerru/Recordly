package com.kimoterru.recordly.ui.screen.detail

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
fun DetailScreen(
  navController: NavController,
  viewModel: DetailViewModel = hiltViewModel(),
) {
  DetailScreenContent(
    state = viewModel.state,
    onEvent = viewModel::onEvent,
    onNavigateTo = navController::navigate
  )
}

@Composable
private fun DetailScreenContent(
  modifier: Modifier = Modifier,
  state: DetailScreenState = DetailScreenState(),
  onEvent: (DetailScreenEvent) -> Unit = {},
  onNavigateTo: (Screen) -> Unit = {},
) {
  Box(modifier = modifier.fillMaxSize()) {
    Text(
      modifier = modifier.align(Alignment.Center),
      text = "DetailScreenContent"
    )
  }
}

@Preview(showBackground = true)
@Composable
private fun DetailScreenPreview() {
  DetailScreenContent()
}