package com.plcoding.composegooglesignincleanarchitecture.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\u0017\u001a\u00020\u00182\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00180\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u0018J\u0014\u0010\u001e\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u0012R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/plcoding/composegooglesignincleanarchitecture/services/StepCounterService;", "", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "context", "Landroid/content/Context;", "googleSignInAccount", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V", "_stepCount", "Landroidx/lifecycle/MutableLiveData;", "", "notificationManager", "Landroid/app/NotificationManager;", "getNotificationManager", "()Landroid/app/NotificationManager;", "stepCount", "Landroidx/lifecycle/LiveData;", "getStepCount", "()Landroidx/lifecycle/LiveData;", "stepCountListener", "Lcom/google/android/gms/fitness/request/OnDataPointListener;", "countListener", "", "callback", "Lkotlin/Function1;", "getUserId", "", "removeStepCountListener", "showHalfGoalNotification", "steps", "CREATOR", "app_debug"})
public final class StepCounterService {
    private final android.content.Context context = null;
    private final com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = null;
    private com.google.android.gms.fitness.request.OnDataPointListener stepCountListener;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _stepCount = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Integer> stepCount = null;
    @org.jetbrains.annotations.NotNull
    private final android.app.NotificationManager notificationManager = null;
    @org.jetbrains.annotations.NotNull
    public static final com.plcoding.composegooglesignincleanarchitecture.services.StepCounterService.CREATOR CREATOR = null;
    
    public StepCounterService(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Integer> getStepCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserId() {
        return null;
    }
    
    public final void countListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> callback) {
    }
    
    public final void showHalfGoalNotification(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<java.lang.Integer> steps) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.app.NotificationManager getNotificationManager() {
        return null;
    }
    
    public StepCounterService(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel) {
        super();
    }
    
    public final void removeStepCountListener() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/plcoding/composegooglesignincleanarchitecture/services/StepCounterService$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/plcoding/composegooglesignincleanarchitecture/services/StepCounterService;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/plcoding/composegooglesignincleanarchitecture/services/StepCounterService;", "app_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.plcoding.composegooglesignincleanarchitecture.services.StepCounterService> {
        
        private CREATOR() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.plcoding.composegooglesignincleanarchitecture.services.StepCounterService createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.plcoding.composegooglesignincleanarchitecture.services.StepCounterService[] newArray(int size) {
            return null;
        }
    }
}