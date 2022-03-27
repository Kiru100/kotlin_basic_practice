package com.example.kotlinbasic

fun main(){
    //Assignment operators (+=, -=, *=, /=, %=)

    var myNum=5
    myNum += 3

    println("myNum += ${myNum}")

    myNum *=4
    println("myNum *= ${myNum}")

    //Increment and Decrement operators (++, --)

    //++
    myNum++
    println("myNum ++ ${myNum}")
    println("myNum ++ ${myNum++}")//will execute after the line
    println("myNum ++ ${++myNum}")//increment before executing

    //--
    println("myNum -- ${--myNum}")



}