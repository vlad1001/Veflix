package com.example.veflix.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.splash.SplashScreen
import com.example.veflix.lobby.navigation.lobbyRoute
import com.example.veflix.lobby.navigation.lobbyScreen
import com.example.veflix.lobby.navigation.navigateToLobby

const val splashScreen = "splash"

const val LOBBY_GRAPH_ROUTE = "lobby_graph"

@Composable
fun MainNavigation(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = splashScreen
    ) {

        composable(splashScreen) {
            SplashScreen(
                onScreenTimeOut = {
                    navController.navigateToLobby()
                }
            )
        }

        navigation(
            startDestination = lobbyRoute,
            route = LOBBY_GRAPH_ROUTE
        ) {
            lobbyScreen()
        }
    }
}
