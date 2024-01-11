package com.plcoding.composegooglesignincleanarchitecture.presentation.signIn

data class SignInState(
    val isSignInSuccessful: Boolean = false,
    val signInErrorMessage: String? = null,
)
