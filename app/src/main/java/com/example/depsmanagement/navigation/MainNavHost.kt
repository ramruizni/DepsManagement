package com.example.depsmanagement.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.depsmanagement.feature.first.view.navigation.firstFeatureNavigationRoute
import com.example.depsmanagement.feature.first.view.navigation.firstFeatureScreen
import com.example.depsmanagement.feature.second.view.navigation.navigateToSecondFeature
import com.example.depsmanagement.feature.second.view.navigation.secondFeatureScreen

@Composable
fun MainNavHost(
    modifier: Modifier = Modifier,
    startDestination: String = firstFeatureNavigationRoute
) {
    val navController = rememberNavController()
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination,
    ) {
        firstFeatureScreen(onNavigateToSecondFeature = navController::navigateToSecondFeature)
        secondFeatureScreen()
    }
}