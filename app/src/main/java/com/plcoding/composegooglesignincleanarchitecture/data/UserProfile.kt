package com.plcoding.composegooglesignincleanarchitecture.data

import java.time.LocalDateTime

data class UserProfile(
    val userId: String,
    val email: String?,
    val username: String,
    val dailyStepGoal: Int = 0,
    val currentDailyStep: Int = 0,
    val weekTotalSteps: Int = 0,
    val currentDailyHydration: Double = 0.0,
    val weekPrognosis: Map<String, DailyActivity> = emptyMap()
)

data class DailyActivity(
    val dailyStep: Int,
    val date: LocalDateTime,
    val hydration: Double
)
