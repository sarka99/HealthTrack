package com.plcoding.composegooglesignincleanarchitecture.data


import android.util.Log
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener


class UserRepository(private val firebaseDatabase: FirebaseDatabase) {

    fun saveUserProfile(userProfile: UserProfile) {
        Log.d("Email", "${userProfile.email}")
        val databaseReference = firebaseDatabase.getReference("users")
        databaseReference.child(userProfile.userId).setValue(userProfile)


    }

    fun getUsersCurrentDailyStep(userId: String, callback: (Int?) -> Unit) {
        val databaseReference = firebaseDatabase.getReference("users/$userId/currentDailyStep")
        databaseReference.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // Försök att hämta värdet för currentDailyStep
                val stepCount = dataSnapshot.getValue(Int::class.java)
                callback(stepCount)
            }
            override fun onCancelled(databaseError: DatabaseError) {
                Log.d("GetUserStepCount", "Error: ${databaseError.message}")
                callback(null) // Skicka null vid fel
            }
        })
    }

    fun updateUserStepCount(userId: String, steps: Int) {
        val databaseReference = firebaseDatabase.getReference("users/$userId")
        databaseReference.child("currentDailyStep").setValue(steps)
    }

}
