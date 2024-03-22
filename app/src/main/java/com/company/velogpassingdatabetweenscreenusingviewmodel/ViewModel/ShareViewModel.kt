package com.company.velogpassingdatabetweenscreenusingviewmodel.ViewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel


class ShareViewModel : ViewModel() {

    var word by mutableStateOf("기본값")
        private set

    fun changeWord(newWord : String) {
        word = newWord
    }

}