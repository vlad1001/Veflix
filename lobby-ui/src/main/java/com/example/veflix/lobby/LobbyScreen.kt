package com.example.veflix.lobby

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LobbyScreen(viewModel: LobbyViewModel) {
    Scaffold { paddingVlues ->
        Column(modifier = Modifier.padding(paddingVlues)) {
            Text(text = "LobbyScreen")
        }
    }

}

@Preview
@Composable
fun LobbyScreenPreview(){
    LobbyScreen(LobbyViewModel())
}