package com.plcoding.composegooglesignincleanarchitecture.presentation.steps

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.livedata.observeAsState
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun StepCounterScreen(stepCounterViewModel: StepCounterViewModel = viewModel(),
                      startService: () -> Unit,
                      stopService: () -> Unit) {
    val stepCount by stepCounterViewModel.stepCount.observeAsState(initial = 0)

    Column {
        Text(text = "Steps: $stepCount")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = startService) {
            Text(text = "Start Run")
        }
        Button(onClick = stopService) {
            Text(text = "Stop Run")
        }
    }
}
