package com.example.myroomvmmv.viewmodelbasico

import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    var counter = 0

    fun increment() {
        counter++
    }
}
