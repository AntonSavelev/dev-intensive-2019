package ru.skillbranch.intensive.models

class Chat (
    val id:String,
    val memebers:MutableList<User> = mutableListOf(),
    val messages:MutableList<BaseMessage> = mutableListOf()
){
}