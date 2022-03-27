package com.example.kotlinbasic

fun main(){
    //immutable variable
    //TODO: Add new Functionality

    //string
    val myName = "Noel"

    //int 32 bit
    var myAge=31

    /*
    * Integer Types: Bytes (8 bit)
    * Short (16 bit)
    * Int (32 bit)
    * Long (64 bit)
    * */
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 1234567891
    val myLong: Long = 12_039_812_309_487_120_3

    /*
    *   Floating Point Numbers
    *   Types:
    *   Float (32 bit)
    *   Double (64 bit)
    * */
    val myFloat: Float= 13.37F
    val myDouble: Double= 3.13123123

    /*
    *   Booleans he type Boolean is used to represent logical values.
    *   It can have two possible values true and false.
    *  */
    var isSunny: Boolean= true
    isSunny= false

    //Characters
    val letterChar = 'A'
    val digitChar= '$'

    //Strings
    val myString="Hello World"
    var firstCharInStr=myString[0]
    var lastCharInStr=myString[myString.length-1]

    println("First Character $firstCharInStr and the length of myStr is ${myString.length}")





}

