package ru.skillbranch.intensive.models

import java.util.*

data class User(
    val id : String,
    var firstName : String?,
    var lastName : String?,
    var avatar : String?,
    var rating : Int = 0,
    var respect : Int = 0,
    var lastVisit : Date? = Date(),
    var isOnline : Boolean = false
) {

    constructor(id : String, firstName : String?, lastName : String?):this(
        id = id,
        firstName = firstName,
        lastName = lastName,
        avatar = null
    )


    companion object Factory {
        private var lastId = -1
        fun makeUser(fullName:String?): User{
            lastId++

            val parst : List<String>? = fullName?.split(" ")

            val firstName = parst?.getOrNull(0)
            val lastName = parst?.getOrNull(1)

            return User(id = "$lastId", firstName = firstName, lastName = lastName)
        }
    }
}