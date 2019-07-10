package ru.skillbranch.intensive.utils


object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?> {
        val parts: List<String>? = fullName?.split(" ")

        val firstName = parts?.getOrNull(0) ?: "null"
        val lastName = parts?.getOrNull(1) ?: "null"
//        return Pair(firstName, lastName)
        return firstName to lastName
    }

   fun transliteration(payload: String, divider:String):String{
        return ""
    }

    fun toInitials(firstName:String?, lastName:String?): String?{
        return ""
    }
}