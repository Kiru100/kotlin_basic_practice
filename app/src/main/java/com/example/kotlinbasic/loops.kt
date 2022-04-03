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

    var feltTemp="cold"
    var roomTemp=10

    while(feltTemp=="cold"){
        roomTemp++
        if(roomTemp>=20){
            feltTemp="comfy"
            println("it's comfy now")
        }
    }

    for (num in 1..10){
        print("$num")
    }

    //until keyword
    for(i in 1 until 10){
        print("$i ")
    }

    //for loop down to and step
    for(y in 10 downTo 1 step 2){
        print("$y ")
    }

}