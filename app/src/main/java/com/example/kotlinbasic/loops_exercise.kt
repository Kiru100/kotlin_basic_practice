package com.example.kotlinbasic

fun main() {

    var over = 0
    for (i in 1..10000){
        if (i<=9001){
           println(i)
        }else{
            println(i)
            println("It's over 9000")
        }
    }

    var humidityLevel = 80
    var humidity = "humid"
    while (humidity=="humid"){
        if (humidityLevel<60){
            humidity="comfy"
        }
        if(humidity=="comfy"){
            println("It's comfy now")
        }else{
            println("humidity decreased")
            humidityLevel-=5
        }
    }

    ///solution
    for(num in 1..10000) {
        if(num == 9001)
            print("IT'S OVER 9000!!!")
    }

    humidity = "humid"
    humidityLevel = 80
    while (humidity == "humid"){
        humidityLevel-=5
        println("humidity decreased")
        if(humidityLevel < 60){
            humidity = "comfy"
            println("it's comfy now")
        }
    }
}