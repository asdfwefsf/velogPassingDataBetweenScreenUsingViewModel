package com.company.velogpassingdatabetweenscreenusingviewmodel.Screen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.company.velogpassingdatabetweenscreenusingviewmodel.ViewModel.ShareViewModel


@Composable
fun Sub(shareViewModel : ShareViewModel) {

    Text(text = shareViewModel.word)
}