package com.example.kotlinbasic

fun main(){
    var season = 3
   when(season){
       1 -> println("Sprint")
       2 -> println("Summer")
       3 -> {
           println("Fall")
           println("Autumn")
       }
       4 -> println("Winter")
       else -> println("Invalid Season")
   }

    var month=3
    when (month){
        in 3..5 -> println("Spring")
        in 8..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12,1,2 -> println("Winter")
        else-> println("Invalid Season")
    }

    var age = 1

    when(age){
        in 21..Int.MAX_VALUE -> println("You may drink is the US")
        in 18..20 -> println("You may vote")
        in 16..17 -> println("You may drive")
        else -> println("You're too young")
    }

    var x : Any = 13.37F
    when(x){
        is Int -> println("$x is an Int")
        is Double -> println("$x is a Double")
        is String -> println("$x is String")
        else -> println("$x is none of the above")
    }
}