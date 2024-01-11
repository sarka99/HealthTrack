package com.plcoding.composegooglesignincleanarchitecture.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00060\nJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/plcoding/composegooglesignincleanarchitecture/data/UserRepository;", "", "firebaseDatabase", "Lcom/google/firebase/database/FirebaseDatabase;", "(Lcom/google/firebase/database/FirebaseDatabase;)V", "getUsersCurrentDailyStep", "", "userId", "", "callback", "Lkotlin/Function1;", "", "saveUserProfile", "userProfile", "Lcom/plcoding/composegooglesignincleanarchitecture/data/UserProfile;", "updateUserStepCount", "steps", "app_debug"})
public final class UserRepository {
    private final com.google.firebase.database.FirebaseDatabase firebaseDatabase = null;
    
    public UserRepository(@org.jetbrains.annotations.NotNull
    com.google.firebase.database.FirebaseDatabase firebaseDatabase) {
        super();
    }
    
    public final void saveUserProfile(@org.jetbrains.annotations.NotNull
    com.plcoding.composegooglesignincleanarchitecture.data.UserProfile userProfile) {
    }
    
    public final void getUsersCurrentDailyStep(@org.jetbrains.annotations.NotNull
    java.lang.String userId, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> callback) {
    }
    
    public final void updateUserStepCount(@org.jetbrains.annotations.NotNull
    java.lang.String userId, int steps) {
    }
}