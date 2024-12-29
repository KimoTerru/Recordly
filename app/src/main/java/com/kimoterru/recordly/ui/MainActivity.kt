package com.kimoterru.recordly.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.compose.rememberNavController
import com.kimoterru.recordly.R
import com.kimoterru.recordly.ui.navigation.AppNavHost
import com.kimoterru.recordly.ui.navigation.Screen
import com.kimoterru.recordly.ui.theme.RecordlyTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
  @OptIn(ExperimentalMaterial3Api::class)
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      
      val navController = rememberNavController()
      
      RecordlyTheme {
        Scaffold(
          modifier = Modifier.fillMaxSize(),
          topBar = {
            CenterAlignedTopAppBar(
              title = {
                Text(text = stringResource(R.string.app_name))
              },
              actions = {
                IconButton(
                  onClick = {
                    navController.navigate(Screen.Settings)
                  }
                ) {
                  Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = null
                  )
                }
              }
            )
          }
        ) { innerPadding ->
          AppNavHost(
            navController = navController,
            modifier = Modifier.padding(innerPadding)
          )
        }
      }
    }
  }
}