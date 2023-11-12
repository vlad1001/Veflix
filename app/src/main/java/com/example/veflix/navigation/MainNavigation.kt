package com.example.veflix.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.veflix.lobby.navigation.lobbyRoute
import com.example.veflix.lobby.navigation.lobbyScreen
import com.example.veflix.lobby.navigation.navigateToLobby


const val LOBBY_GRAPH_ROUTE = "lobby"

@Composable
fun MainNavigation(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = lobbyRoute
    ) {

        composable(
            route = LOBBY_GRAPH_ROUTE
        ) {
            lobbyScreen()
        }
    }
}
