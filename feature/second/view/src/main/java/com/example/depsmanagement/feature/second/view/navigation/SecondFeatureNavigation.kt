package com.example.depsmanagement.feature.second.view.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.depsmanagement.feature.second.view.SecondFeatureRoute

const val secondFeatureNavigationRoute = "second_feature_route"

fun NavController.navigateToSecondFeature(
    navOptions: NavOptions? = null
) {
    this.navigate(secondFeatureNavigationRoute, navOptions)
}

fun NavGraphBuilder.secondFeatureScreen() {
    composable(
        route = secondFeatureNavigationRoute
    ) {
        SecondFeatureRoute()
    }
}