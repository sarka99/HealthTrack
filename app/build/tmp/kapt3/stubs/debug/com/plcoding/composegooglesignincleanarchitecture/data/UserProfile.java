package com.plcoding.composegooglesignincleanarchitecture.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003J\t\u0010 \u001a\u00020\u0007H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\u000bH\u00c6\u0003J\u0015\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003Jg\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020\u0007H\u00d6\u0001J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013\u00a8\u0006*"}, d2 = {"Lcom/plcoding/composegooglesignincleanarchitecture/data/UserProfile;", "", "userId", "", "email", "username", "dailyStepGoal", "", "currentDailyStep", "weekTotalSteps", "currentDailyHydration", "", "weekPrognosis", "", "Lcom/plcoding/composegooglesignincleanarchitecture/data/DailyActivity;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIDLjava/util/Map;)V", "getCurrentDailyHydration", "()D", "getCurrentDailyStep", "()I", "getDailyStepGoal", "getEmail", "()Ljava/lang/String;", "getUserId", "getUsername", "getWeekPrognosis", "()Ljava/util/Map;", "getWeekTotalSteps", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class UserProfile {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String userId = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String username = null;
    private final int dailyStepGoal = 0;
    private final int currentDailyStep = 0;
    private final int weekTotalSteps = 0;
    private final double currentDailyHydration = 0.0;
    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, com.plcoding.composegooglesignincleanarchitecture.data.DailyActivity> weekPrognosis = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.composegooglesignincleanarchitecture.data.UserProfile copy(@org.jetbrains.annotations.NotNull
    java.lang.String userId, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String username, int dailyStepGoal, int currentDailyStep, int weekTotalSteps, double currentDailyHydration, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, com.plcoding.composegooglesignincleanarchitecture.data.DailyActivity> weekPrognosis) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public UserProfile(@org.jetbrains.annotations.NotNull
    java.lang.String userId, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String username, int dailyStepGoal, int currentDailyStep, int weekTotalSteps, double currentDailyHydration, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, com.plcoding.composegooglesignincleanarchitecture.data.DailyActivity> weekPrognosis) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUsername() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getDailyStepGoal() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getCurrentDailyStep() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getWeekTotalSteps() {
        return 0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double getCurrentDailyHydration() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, com.plcoding.composegooglesignincleanarchitecture.data.DailyActivity> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, com.plcoding.composegooglesignincleanarchitecture.data.DailyActivity> getWeekPrognosis() {
        return null;
    }
}