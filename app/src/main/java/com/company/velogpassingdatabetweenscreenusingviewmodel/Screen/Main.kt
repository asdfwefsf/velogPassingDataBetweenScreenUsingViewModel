package com.company.velogpassingdatabetweenscreenusingviewmodel.Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavController
import com.company.velogpassingdatabetweenscreenusingviewmodel.ViewModel.ShareViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Main(navController: NavController , shareViewModel: ShareViewModel) {
    Column {
        var text by remember { mutableStateOf("기본값") }
        TextField(value = text, onValueChange = { text = it })

        Button(onClick = {
            shareViewModel.changeWord(text)
            navController.navigate(Screens.Sub.route)
        }) {
            Text("Sub 이동")
        }
    }
}