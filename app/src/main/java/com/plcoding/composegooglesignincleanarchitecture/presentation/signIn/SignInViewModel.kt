package com.plcoding.composegooglesignincleanarchitecture.presentation.signIn

import androidx.lifecycle.ViewModel
import com.plcoding.composegooglesignincleanarchitecture.data.UserProfile
import com.plcoding.composegooglesignincleanarchitecture.data.UserRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SignInViewModel(private val userRepository: UserRepository): ViewModel() {

    private val _state = MutableStateFlow(SignInState())
    val state = _state .asStateFlow()

    fun onSignInResult(result: SignInResult) {
        _state.update { it.copy(
            isSignInSuccessful = result.data != null,
            signInErrorMessage = result.errorMessage
        ) }
        result.data?.let { data ->
            userRepository.saveUserProfile(UserProfile(userId = data.userId, email = data.email, username = data.username.toString()))
        }
    }

    fun resetState() {
        _state.update { SignInState() }
    }
}