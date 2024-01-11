package com.plcoding.composegooglesignincleanarchitecture.services

import android.annotation.SuppressLint
import android.app.Notification
import android.app.NotificationManager
import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.Handler
import android.os.IBinder
import android.util.Log
import androidx.core.app.NotificationCompat
import com.plcoding.composegooglesignincleanarchitecture.R
import com.plcoding.composegooglesignincleanarchitecture.data.UserRepository
import com.plcoding.composegooglesignincleanarchitecture.presentation.signIn.GoogleAuthUiClient


class BackgroundServices: Service() {
    private val handler = Handler()
    private var steps : Int = 0
    private val stepCountRunnable = object : Runnable {
        override fun run() {
            stepCounterService?.countListener { counter ->
                if (counter != null) {
                    if (steps != counter){
                        steps = counter
                        updateNotification()
                        updateDatabaseDailySteps(steps)
                    }
                } else {
                    Log.d("Background Counter", "Error or no data available")
                }
                handler.postDelayed(this, 1 * 60 * 1000)
            }
        }
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    private lateinit var notificationManager: NotificationManager

    override fun onCreate() {
        super.onCreate()
        notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
    }


    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        when(intent?.action){
            Actions.START.toString() -> start()
            Actions.STOP.toString() -> {
                handler.removeCallbacks(stepCountRunnable)
                stopSelf()
            }
        }

        return super.onStartCommand(intent, flags, startId)
    }

    private fun start() {
        handler.post(stepCountRunnable)
        startForegroundService()
    }

    override fun onDestroy() {
        handler.removeCallbacks(stepCountRunnable)
        super.onDestroy()
    }


    private fun startForegroundService() {

        val notification = buildNotification()
        startForeground(NOTIFICATION_ID, notification)
    }

    private fun buildNotification(): Notification {
        return NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle("Step Tracking Active")
            .setContentText("Your steps: $steps")
            .setSmallIcon(R.drawable.baseline_directions_run_24)
            .build()
    }

    private fun updateNotification() {
        val notification = buildNotification()
        notificationManager.notify(NOTIFICATION_ID, notification)
    }

    private fun updateDatabaseDailySteps(currentSteps: Int) {
        val userId = googleAuthUiClient?.getSignedInUser()?.userId

        if (userId != null) {
            userRepository?.getUsersCurrentDailyStep(userId) { dataBaseCount ->
                val newStepCount = if (dataBaseCount != null && currentSteps > dataBaseCount) {
                    currentSteps
                } else {
                    dataBaseCount ?: currentSteps
                }
                userRepository?.updateUserStepCount(userId, newStepCount)
            }
        }
    }

    companion object {

        private const val NOTIFICATION_ID = 1
        private const val CHANNEL_ID = "running-channel"
        @SuppressLint("StaticFieldLeak")
        var stepCounterService: StepCounterService? = null
        var userRepository: UserRepository? = null
        @SuppressLint("StaticFieldLeak")
        var googleAuthUiClient: GoogleAuthUiClient? = null
    }

    enum class Actions {
        START, STOP
    }
}