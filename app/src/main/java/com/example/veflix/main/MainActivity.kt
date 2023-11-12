package com.example.veflix.main

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.veflix.core.extentions.launchAndRepeatWithViewLifecycle
import com.example.veflix.lobby.navigation.navigateToLobby
import com.example.veflix.navigation.MainNavigation
import com.example.veflix.ui.theme.VeflixTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

//    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            VeflixTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val navController = rememberNavController()
                    MainNavigation(navController = navController)
                    navController.navigateToLobby()
                }
            }
        }
    }

//    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
//        launchAndRepeatWithViewLifecycle {
//            viewModel.navigationActions.collect{
//                when(it){
//                    NavigationActions.NavigateToLobby -> {
//                        navController.navigateToLobby()
//                    }
//                }
//            }
//        }
//
//        return super.onCreateView(name, context, attrs)
//
//    }
}