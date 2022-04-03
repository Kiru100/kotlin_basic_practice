package com.example.kotlinbasic

fun main(){
    for (i in 1 until 20){

        //skip if condition is met which is why it skip 10 and 11
            // because 11/2 and 10/2 ==5
        if(i/2==5){
           continue
        }
        print("$i ")
    }
    print("done")
}