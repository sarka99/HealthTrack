package com.plcoding.composegooglesignincleanarchitecture.presentation.signIn;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0011\u0010\u0016\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/plcoding/composegooglesignincleanarchitecture/presentation/signIn/GoogleAuthUiClient;", "", "context", "Landroid/content/Context;", "oneTapClient", "Lcom/google/android/gms/auth/api/identity/SignInClient;", "(Landroid/content/Context;Lcom/google/android/gms/auth/api/identity/SignInClient;)V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "buildSignInRequest", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "getGoogleFitSignInIntent", "Landroid/content/Intent;", "getSignedInUser", "Lcom/plcoding/composegooglesignincleanarchitecture/presentation/signIn/UserData;", "signIn", "Landroid/content/IntentSender;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signInWithIntent", "Lcom/plcoding/composegooglesignincleanarchitecture/presentation/signIn/SignInResult;", "intent", "(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signOut", "", "app_debug"})
public final class GoogleAuthUiClient {
    private final android.content.Context context = null;
    private final com.google.android.gms.auth.api.identity.SignInClient oneTapClient = null;
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    
    public GoogleAuthUiClient(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.google.android.gms.auth.api.identity.SignInClient oneTapClient) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object signIn(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super android.content.IntentSender> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object signInWithIntent(@org.jetbrains.annotations.NotNull
    android.content.Intent intent, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.plcoding.composegooglesignincleanarchitecture.presentation.signIn.SignInResult> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object signOut(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.plcoding.composegooglesignincleanarchitecture.presentation.signIn.UserData getSignedInUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Intent getGoogleFitSignInIntent() {
        return null;
    }
    
    private final com.google.android.gms.auth.api.identity.BeginSignInRequest buildSignInRequest() {
        return null;
    }
}