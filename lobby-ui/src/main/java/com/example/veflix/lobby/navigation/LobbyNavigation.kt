package com.example.veflix.lobby.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.veflix.lobby.LobbyScreen
import com.example.veflix.lobby.LobbyViewModel

const val lobbyRoute = "lobby"

fun NavGraphBuilder.lobbyScreen() {
    composable(lobbyRoute) {
        val viewModel: LobbyViewModel = hiltViewModel()
        LobbyScreen(viewModel)
    }
}

fun NavController.navigateToLobby() {
    this.navigate(lobbyRoute)
}