package com.example.unittesting

object RegistrationUtil {

    private val existingUsers = listOf("ishika","sonu")

    /*
    * the input is not valid if...
    * ...the username/ password is not empty
    * ...the username is already taken
    * ...the confirmed password is not the same of real password
    * ...the password contains less than 2 digits
    * */

    fun validateRegistrationInput(
        userName: String,
        password: String,
        confirmedPassword: String
    ): Boolean{
       if(userName.isEmpty() || password.isEmpty() || confirmedPassword.isEmpty()){
           return false
       }
        if(existingUsers.contains(userName)){
            return false
        }

        if(password!=confirmedPassword){
            return false
        }

        if(password.count { it.isDigit() } <2){
            return false
        }

        return true

    }
}