package com.plcoding.composegooglesignincleanarchitecture.presentation.steps;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/plcoding/composegooglesignincleanarchitecture/presentation/steps/StepCounterViewModel;", "Landroidx/lifecycle/ViewModel;", "stepCounterService", "Lcom/plcoding/composegooglesignincleanarchitecture/services/StepCounterService;", "userRepository", "Lcom/plcoding/composegooglesignincleanarchitecture/data/UserRepository;", "(Lcom/plcoding/composegooglesignincleanarchitecture/services/StepCounterService;Lcom/plcoding/composegooglesignincleanarchitecture/data/UserRepository;)V", "stepCount", "Landroidx/lifecycle/LiveData;", "", "getStepCount", "()Landroidx/lifecycle/LiveData;", "showNotification", "", "startStepCounting", "app_debug"})
public final class StepCounterViewModel extends androidx.lifecycle.ViewModel {
    private final com.plcoding.composegooglesignincleanarchitecture.services.StepCounterService stepCounterService = null;
    private final com.plcoding.composegooglesignincleanarchitecture.data.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Integer> stepCount = null;
    
    public StepCounterViewModel(@org.jetbrains.annotations.NotNull
    com.plcoding.composegooglesignincleanarchitecture.services.StepCounterService stepCounterService, @org.jetbrains.annotations.NotNull
    com.plcoding.composegooglesignincleanarchitecture.data.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Integer> getStepCount() {
        return null;
    }
    
    public final void startStepCounting() {
    }
    
    public final void showNotification() {
    }
}