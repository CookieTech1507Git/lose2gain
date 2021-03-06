package com.cookieTech.cookieandroid.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.cookieTech.cookieandroid.modules.login.LoginScreen
import com.cookieTech.cookieandroid.modules.splash.SplashScreen
import com.cookieTech.cookieandroid.navigation.Route
import com.cookieTech.cookieandroid.navigation.Screen


fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
){
    navigation(
        startDestination = Screen.Splash.route,
        route = Route.AUTH_ROUTE
    ){

        composable(
            route = Screen.Splash.route
        ) {
            SplashScreen(
                navController = navController
            )
        }
        composable(
            route = Screen.Login.route
        ) {
            LoginScreen(
                navController = navController
            )
        }



    }
}