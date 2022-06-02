package com.krillinator.android_studio_lab_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel


data class User(
    val id : String,
    val email:String,
    val password:String
)
class UserViewModel(
    val repo: IUserRepository,
){

    //The actual data model is kept private to avoid unwanted tampering
    private val userState = MutableLiveData<User>()

    //Control Logic
    internal val authAttemptState = MutableLiveData<Unit>()
    internal val startAnimation = MutableLiveData<Unit>()

    //UI Binding
    internal val signInStatusText = MutableLiveData<String>()
    internal val authButtonText = MutableLiveData<String>()
    internal val satelliteDrawable = MutableLiveData<String>()

    private fun showErrorState() {
        signInStatusText.value = LOGIN_ERROR
        authButtonText.value = SIGN_IN
        satelliteDrawable.value = ANTENNA_EMPTY
    }
    //...
}
private fun observeViewModel() {
    viewModel.user.observe(
        viewLifecycleOwner,
        Observer { notes: List<User> ->
            if (notes.isEmpty()) showEmptyState()
            else showUserList(notes)
        }
    )
    //..
}