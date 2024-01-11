package com.plcoding.composegooglesignincleanarchitecture.presentation.steps

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.plcoding.composegooglesignincleanarchitecture.data.UserRepository
import com.plcoding.composegooglesignincleanarchitecture.services.StepCounterService

class StepCounterViewModel(
    private val stepCounterService: StepCounterService,
    private val userRepository: UserRepository
) : ViewModel()  {

    val stepCount: LiveData<Int> = stepCounterService.stepCount

    init {
        /*stepCount.observeForever { steps ->
            Firebase.auth.currentUser?.uid?.let { userId ->
                userRepository.updateUserStepCount(userId, steps)
            }
        }*/
    }

    fun startStepCounting() {
        //stepCounterService.countListener()
        Log.d("View Model Counter", stepCount.toString())
    }




    fun showNotification(){
        stepCounterService.showHalfGoalNotification(stepCount)
    }
}

