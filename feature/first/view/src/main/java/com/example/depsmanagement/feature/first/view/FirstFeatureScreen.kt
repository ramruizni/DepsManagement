package com.example.depsmanagement.feature.first.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
internal fun FirstFeatureRoute(
    modifier: Modifier = Modifier,
    onNavigateToSecondFeatureClick: () -> Unit,
    viewModel: FirstFeatureViewModel = hiltViewModel(),
) {
    FirstFeatureScreen(
        modifier = modifier,
        onNavigateToSecondFeatureClick = onNavigateToSecondFeatureClick
    )
}

@Composable
internal fun FirstFeatureScreen(
    modifier: Modifier = Modifier,
    onNavigateToSecondFeatureClick: () -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Text(text = "Feature A")
        Button(
            onClick = {
                onNavigateToSecondFeatureClick()
            }) {
            Text(text = "Go to Second Feature")
        }
    }
}