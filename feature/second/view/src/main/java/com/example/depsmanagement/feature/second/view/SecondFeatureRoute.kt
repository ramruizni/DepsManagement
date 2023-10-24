package com.example.depsmanagement.feature.second.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
internal fun SecondFeatureRoute(
    modifier: Modifier = Modifier,
    viewModel: SecondFeatureViewModel = hiltViewModel(),
) {
    SecondFeatureScreen(
        modifier = modifier
    )
}

@Composable
internal fun SecondFeatureScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Text(text = "Second Feature")
    }
}