package com.deknow.muzique.navGraph

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.deknow.muzique.HomeScreen
import com.deknow.muzique.screen.AudioScreen
import com.deknow.muzique.screen.FileScreen
import com.deknow.muzique.screen.HomScreen
import com.deknow.muzique.screen.LoginScreen
import com.deknow.muzique.screen.SplashScrn
import com.deknow.muzique.screen.VideoScreen

@Composable
fun NavGraphScreen() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash" ) {
        composable("login") {
            LoginScreen(navController)
        }
        composable("home") {
            HomeScreen(navController)
        }
        composable("homie") {
            HomScreen(navController = navController)
        }
        composable("audio") {
            AudioScreen(navController = navController)
        }
        composable("splash") {
            SplashScrn(navController = navController)
        }
        composable("files") {
            FileScreen(navController = navController)
        }
        composable("video") {
            VideoScreen(navController = navController)
        }
    }
}