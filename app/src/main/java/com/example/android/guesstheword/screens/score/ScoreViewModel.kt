package com.example.android.guesstheword.screens.score

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// adding ViewModelFactory
class ScoreViewModel(finalScore: Int) : ViewModel() {

    private var _eventPlayAgain = MutableLiveData<Boolean>() // internal version. By default = null
    val eventPlayAgain: LiveData<Boolean> //external version
        get() = _eventPlayAgain

    private var _score = MutableLiveData<Int>() // internal version. By default = null
    val score: LiveData<Int> //external version
        get() = _score

    init {
        _score.value = finalScore
    }

    fun onPlayAgain() {
        _eventPlayAgain.value = true
    }

    fun onPlayAgainComplete() {
        _eventPlayAgain.value = false
    }
}