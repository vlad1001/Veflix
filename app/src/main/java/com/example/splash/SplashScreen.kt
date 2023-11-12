package com.example.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.veflix.R
import com.example.veflix.main.MainActivity.Companion.SPLASH_TIMEOUT
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    onScreenTimeOut: () -> Unit
) {
    val splashTimeOut by rememberUpdatedState(newValue = onScreenTimeOut)

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.splash),
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )
    }

    LaunchedEffect(key1 = true){
        delay(SPLASH_TIMEOUT)
        splashTimeOut()
    }


}

@Preview
@Composable
fun LobbyScreenPreview() {
    SplashScreen(){}
}