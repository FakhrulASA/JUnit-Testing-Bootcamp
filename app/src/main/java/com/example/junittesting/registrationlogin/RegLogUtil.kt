package com.example.junittesting.registrationlogin

object RegLogUtil {

    var listOfUser : List<String> = listOf("fakhrulasa", "abcd")
    fun validateRegistration(
        userName: String,
        password: String,
        confirmPassword: String
    ) :Boolean {
        return if(listOfUser.contains(userName)) false
        else if(password!=confirmPassword) false
        else userName.isNotEmpty()
    }
}