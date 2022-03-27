package com.example.kotlinbasic

fun main(){
    //Arithmetic operators (+, - , *, /, %)
    var addition = 5+3
    addition  += 10
    println("Addition: $addition")

    var difference = 5-3
    difference -=1
    println("Difference: $difference")

    //Modulo
    var modulo = 5+3
    val number1= 15
    val number2= 2
    modulo = number1%number2
    println("$number1 divide $number2 has remainder $modulo")

    //double divide
    val a = 5.0
    val b = 3
    var result: Double = a / b
    println("a/b = $result")
}