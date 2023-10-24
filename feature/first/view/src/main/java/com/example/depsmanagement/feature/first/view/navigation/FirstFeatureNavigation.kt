package com.example.depsmanagement.feature.first.view.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.depsmanagement.feature.first.view.FirstFeatureRoute

const val firstFeatureNavigationRoute = "first_feature_route"

fun NavController.navigateToFirstFeature(
    navOptions: NavOptions? = null
) {
    this.navigate(firstFeatureNavigationRoute, navOptions)
}

fun NavGraphBuilder.firstFeatureScreen(
    onNavigateToSecondFeature: () -> Unit,
) {
    composable(
        route = firstFeatureNavigationRoute
    ) {
        FirstFeatureRoute(
            onNavigateToSecondFeatureClick = onNavigateToSecondFeature
        )
    }
}