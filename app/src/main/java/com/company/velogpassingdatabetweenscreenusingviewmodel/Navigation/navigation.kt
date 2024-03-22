package com.company.velogpassingdatabetweenscreenusingviewmodel.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.company.velogpassingdatabetweenscreenusingviewmodel.Screen.Main
import com.company.velogpassingdatabetweenscreenusingviewmodel.Screen.Screens
import com.company.velogpassingdatabetweenscreenusingviewmodel.Screen.Sub
import com.company.velogpassingdatabetweenscreenusingviewmodel.ViewModel.ShareViewModel

@Composable
fun Nav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.Main.route) {
        val shareViewModel = ShareViewModel()

        composable(Screens.Main.route) {
            Main(navController , shareViewModel)
        }
        composable(Screens.Sub.route) {
            Sub(shareViewModel)
        }
    }
}