package com.plcoding.composegooglesignincleanarchitecture.services

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.fitness.Fitness
import com.google.android.gms.fitness.data.DataType
import com.google.android.gms.fitness.request.OnDataPointListener
import com.plcoding.composegooglesignincleanarchitecture.MainActivity
import com.plcoding.composegooglesignincleanarchitecture.R

class StepCounterService(
    private val context: Context,
    private val googleSignInAccount: GoogleSignInAccount?
) {

    private var stepCountListener: OnDataPointListener? = null

    private val _stepCount = MutableLiveData<Int>()
    val stepCount: LiveData<Int> = _stepCount



    fun getUserId(): String {
        return googleSignInAccount?.email.toString()
    }

    fun countListener(callback: (Int?) -> Unit) {
        var steps: Int? = 0
        Log.d("StepCounterService", "Attempting to add step count listener")

        if (googleSignInAccount == null) {
            Log.d("StepCounterService", "Google Sign-In account is null")
            callback(null)
            return
        }

        stepCountListener = OnDataPointListener { dataPoint ->
            for (field in dataPoint.dataType.fields) {
                val value = dataPoint.getValue(field).asInt()
                Log.d("StepCounterService", "Received step count: $value")
                _stepCount.postValue(value)
            }
        }



        Fitness.getHistoryClient(context, googleSignInAccount)
            .readDailyTotal(DataType.TYPE_STEP_COUNT_DELTA)
            .addOnSuccessListener { result ->
                val totalSteps = result.dataPoints.firstOrNull()
                    ?.getValue(DataType.TYPE_STEP_COUNT_DELTA.fields[0])?.asInt() ?: 0
                Log.d("StepCounterService", "Total steps for today: $totalSteps")
                _stepCount.postValue(totalSteps)
                callback(totalSteps)
                //Log.d("Service", "Service Counter: $steps")
            }
            .addOnFailureListener { e ->
                Log.e("StepCounterService", "There was a problem getting steps.", e)
                callback(null)
            }
    }

    fun showHalfGoalNotification(steps: LiveData<Int>) {
        if (steps.value?.equals(75) == true) {
            val activityIntent = Intent(context, MainActivity::class.java)
            val activityPendingIntent = PendingIntent.getActivity(
                context,
                1,
                activityIntent,
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) PendingIntent.FLAG_IMMUTABLE else 0
            )

            val notification = NotificationCompat.Builder(context, "halfGoal-channel")
                .setSmallIcon(R.drawable.baseline_directions_run_24)
                .setContentTitle("You have reached Half Way")
                .setContentText("steps: $steps")
                .setContentIntent(activityPendingIntent)
                .build()
            notificationManager.notify(2, notification)
        }
    }

    val notificationManager =
        context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

    constructor(parcel: Parcel) : this(
        TODO("context"),
        parcel.readParcelable(GoogleSignInAccount::class.java.classLoader)
    )

    fun removeStepCountListener() {
        stepCountListener?.let { listener ->
            if (googleSignInAccount == null) {
                Log.d(
                    "StepCounterService",
                    "Google Sign-In account is null, cannot remove listener"
                )
                return
            }

            Fitness.getSensorsClient(context, googleSignInAccount)
                .remove(listener)
                .addOnSuccessListener {
                    // Listener was successfully removed
                }
                .addOnFailureListener {
                    // Handle failure in removing the listener
                }
        }
    }


    companion object CREATOR : Parcelable.Creator<StepCounterService> {
        override fun createFromParcel(parcel: Parcel): StepCounterService {
            return StepCounterService(parcel)
        }

        override fun newArray(size: Int): Array<StepCounterService?> {
            return arrayOfNulls(size)
        }
    }
}

