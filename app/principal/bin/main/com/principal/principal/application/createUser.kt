package com.principal.principal
class creteUser{
    fun run => (userRepository) => (nombre : String, apellidos: String) { 
        userRepository.create();
    }
}
