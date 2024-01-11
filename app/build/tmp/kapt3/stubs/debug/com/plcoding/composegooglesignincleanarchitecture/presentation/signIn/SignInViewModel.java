package com.plcoding.composegooglesignincleanarchitecture.presentation.signIn;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/plcoding/composegooglesignincleanarchitecture/presentation/signIn/SignInViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/plcoding/composegooglesignincleanarchitecture/data/UserRepository;", "(Lcom/plcoding/composegooglesignincleanarchitecture/data/UserRepository;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/plcoding/composegooglesignincleanarchitecture/presentation/signIn/SignInState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "onSignInResult", "", "result", "Lcom/plcoding/composegooglesignincleanarchitecture/presentation/signIn/SignInResult;", "resetState", "app_debug"})
public final class SignInViewModel extends androidx.lifecycle.ViewModel {
    private final com.plcoding.composegooglesignincleanarchitecture.data.UserRepository userRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.plcoding.composegooglesignincleanarchitecture.presentation.signIn.SignInState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.plcoding.composegooglesignincleanarchitecture.presentation.signIn.SignInState> state = null;
    
    public SignInViewModel(@org.jetbrains.annotations.NotNull
    com.plcoding.composegooglesignincleanarchitecture.data.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.plcoding.composegooglesignincleanarchitecture.presentation.signIn.SignInState> getState() {
        return null;
    }
    
    public final void onSignInResult(@org.jetbrains.annotations.NotNull
    com.plcoding.composegooglesignincleanarchitecture.presentation.signIn.SignInResult result) {
    }
    
    public final void resetState() {
    }
}