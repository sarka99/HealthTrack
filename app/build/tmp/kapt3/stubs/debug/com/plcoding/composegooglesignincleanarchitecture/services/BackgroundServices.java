package com.plcoding.composegooglesignincleanarchitecture.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\"\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\nH\u0002J\b\u0010\u001c\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/plcoding/composegooglesignincleanarchitecture/services/BackgroundServices;", "Landroid/app/Service;", "()V", "handler", "Landroid/os/Handler;", "notificationManager", "Landroid/app/NotificationManager;", "stepCountRunnable", "Ljava/lang/Runnable;", "steps", "", "buildNotification", "Landroid/app/Notification;", "onBind", "Landroid/os/IBinder;", "p0", "Landroid/content/Intent;", "onCreate", "", "onDestroy", "onStartCommand", "intent", "flags", "startId", "start", "startForegroundService", "updateDatabaseDailySteps", "currentSteps", "updateNotification", "Actions", "Companion", "app_debug"})
public final class BackgroundServices extends android.app.Service {
    private final android.os.Handler handler = null;
    private int steps = 0;
    private final java.lang.Runnable stepCountRunnable = null;
    private android.app.NotificationManager notificationManager;
    @org.jetbrains.annotations.NotNull
    public static final com.plcoding.composegooglesignincleanarchitecture.services.BackgroundServices.Companion Companion = null;
    private static final int NOTIFICATION_ID = 1;
    private static final java.lang.String CHANNEL_ID = "running-channel";
    @org.jetbrains.annotations.Nullable
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    private static com.plcoding.composegooglesignincleanarchitecture.services.StepCounterService stepCounterService;
    @org.jetbrains.annotations.Nullable
    private static com.plcoding.composegooglesignincleanarchitecture.data.UserRepository userRepository;
    @org.jetbrains.annotations.Nullable
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    private static com.plcoding.composegooglesignincleanarchitecture.presentation.signIn.GoogleAuthUiClient googleAuthUiClient;
    
    public BackgroundServices() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable
    android.content.Intent p0) {
        return null;
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @java.lang.Override
    public int onStartCommand(@org.jetbrains.annotations.Nullable
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    private final void start() {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    private final void startForegroundService() {
    }
    
    private final android.app.Notification buildNotification() {
        return null;
    }
    
    private final void updateNotification() {
    }
    
    private final void updateDatabaseDailySteps(int currentSteps) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/plcoding/composegooglesignincleanarchitecture/services/BackgroundServices$Actions;", "", "(Ljava/lang/String;I)V", "START", "STOP", "app_debug"})
    public static enum Actions {
        /*public static final*/ START /* = new START() */,
        /*public static final*/ STOP /* = new STOP() */;
        
        Actions() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/plcoding/composegooglesignincleanarchitecture/services/BackgroundServices$Companion;", "", "()V", "CHANNEL_ID", "", "NOTIFICATION_ID", "", "googleAuthUiClient", "Lcom/plcoding/composegooglesignincleanarchitecture/presentation/signIn/GoogleAuthUiClient;", "getGoogleAuthUiClient", "()Lcom/plcoding/composegooglesignincleanarchitecture/presentation/signIn/GoogleAuthUiClient;", "setGoogleAuthUiClient", "(Lcom/plcoding/composegooglesignincleanarchitecture/presentation/signIn/GoogleAuthUiClient;)V", "stepCounterService", "Lcom/plcoding/composegooglesignincleanarchitecture/services/StepCounterService;", "getStepCounterService", "()Lcom/plcoding/composegooglesignincleanarchitecture/services/StepCounterService;", "setStepCounterService", "(Lcom/plcoding/composegooglesignincleanarchitecture/services/StepCounterService;)V", "userRepository", "Lcom/plcoding/composegooglesignincleanarchitecture/data/UserRepository;", "getUserRepository", "()Lcom/plcoding/composegooglesignincleanarchitecture/data/UserRepository;", "setUserRepository", "(Lcom/plcoding/composegooglesignincleanarchitecture/data/UserRepository;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.plcoding.composegooglesignincleanarchitecture.services.StepCounterService getStepCounterService() {
            return null;
        }
        
        public final void setStepCounterService(@org.jetbrains.annotations.Nullable
        com.plcoding.composegooglesignincleanarchitecture.services.StepCounterService p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.plcoding.composegooglesignincleanarchitecture.data.UserRepository getUserRepository() {
            return null;
        }
        
        public final void setUserRepository(@org.jetbrains.annotations.Nullable
        com.plcoding.composegooglesignincleanarchitecture.data.UserRepository p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.plcoding.composegooglesignincleanarchitecture.presentation.signIn.GoogleAuthUiClient getGoogleAuthUiClient() {
            return null;
        }
        
        public final void setGoogleAuthUiClient(@org.jetbrains.annotations.Nullable
        com.plcoding.composegooglesignincleanarchitecture.presentation.signIn.GoogleAuthUiClient p0) {
        }
    }
}