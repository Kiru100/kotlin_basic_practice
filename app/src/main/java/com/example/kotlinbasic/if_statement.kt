package com.example.kotlinbasic

fun main(){


    var Person1 = 170
    var Person2 = 159

    if(Person1 > Person2){
        println("use raw force")
    }
    else if(Person1==Person2){
        println("Use your Power Technique 1177")
    }
    else{
        println("use strategy")
    }

    var age = 31


    if(age >= 21){
        println("You may drink is the US")
    }else if(age >= 18){
        println("You may vote")
    }else if(age > 16){
        println("You may drive")
    }else{
        println("You're too young")
    }

    var name = "noel"

    if(name == "noel"){
        println("Welcome home Noel")
    }else{
        println("Who are you?")
    }

    var isRainy = true
    if(isRainy){
        println("It's Rainy")
    }
}