package com.example.kotlinbasic

fun main(){

    var x = 1
    while( x <= 10 ){
        println("$x")
        x++
    }
    println("while loop is done")


    var y=100
    while (y >= 0){
        print(y)
        y-=2
    }
    println("100 to 0 descending is done")


    x=1
    do{
       print(x)
       x++
    }while (x <= 10)
    println("\n1 to 10 do while loop is done")
}