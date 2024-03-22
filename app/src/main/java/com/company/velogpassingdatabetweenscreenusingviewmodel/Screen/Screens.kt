package com.company.velogpassingdatabetweenscreenusingviewmodel.Screen

sealed class Screens(val route : String) {
    object Main : Screens("Main")
    object Sub : Screens("Sub")
}
