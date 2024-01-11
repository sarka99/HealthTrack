package com.plcoding.composegooglesignincleanarchitecture;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u0016\u0010\u0019\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002J\u0012\u0010\u001d\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u0017H\u0002J\b\u0010!\u001a\u00020\u0017H\u0002R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006#"}, d2 = {"Lcom/plcoding/composegooglesignincleanarchitecture/MainActivity;", "Landroidx/activity/ComponentActivity;", "()V", "fitSignInLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "googleAuthUiClient", "Lcom/plcoding/composegooglesignincleanarchitecture/presentation/signIn/GoogleAuthUiClient;", "getGoogleAuthUiClient", "()Lcom/plcoding/composegooglesignincleanarchitecture/presentation/signIn/GoogleAuthUiClient;", "googleAuthUiClient$delegate", "Lkotlin/Lazy;", "stepCounterService", "Lcom/plcoding/composegooglesignincleanarchitecture/services/StepCounterService;", "stepCounterViewModel", "Lcom/plcoding/composegooglesignincleanarchitecture/presentation/steps/StepCounterViewModel;", "userRepository", "Lcom/plcoding/composegooglesignincleanarchitecture/data/UserRepository;", "getUserRepository", "()Lcom/plcoding/composegooglesignincleanarchitecture/data/UserRepository;", "userRepository$delegate", "DefaultPreview", "", "checkAndRequestPermissions", "handleGoogleFitSignInResult", "task", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "requestGoogleFitSignIn", "startBackgroundService", "Companion", "app_debug"})
public final class MainActivity extends androidx.activity.ComponentActivity {
    private final kotlin.Lazy googleAuthUiClient$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy userRepository$delegate = null;
    private com.plcoding.composegooglesignincleanarchitecture.services.StepCounterService stepCounterService;
    private com.plcoding.composegooglesignincleanarchitecture.presentation.steps.StepCounterViewModel stepCounterViewModel;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> fitSignInLauncher = null;
    @org.jetbrains.annotations.NotNull
    public static final com.plcoding.composegooglesignincleanarchitecture.MainActivity.Companion Companion = null;
    private static final int REQUEST_CODE_PERMISSIONS = 101;
    
    public MainActivity() {
        super();
    }
    
    private final com.plcoding.composegooglesignincleanarchitecture.presentation.signIn.GoogleAuthUiClient getGoogleAuthUiClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.composegooglesignincleanarchitecture.data.UserRepository getUserRepository() {
        return null;
    }
    
    private final void requestGoogleFitSignIn() {
    }
    
    private final void handleGoogleFitSignInResult(com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.signin.GoogleSignInAccount> task) {
    }
    
    private final void startBackgroundService() {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void checkAndRequestPermissions() {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    public final void DefaultPreview() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/plcoding/composegooglesignincleanarchitecture/MainActivity$Companion;", "", "()V", "REQUEST_CODE_PERMISSIONS", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}