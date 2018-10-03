package com.kotlin.application.miprimeraaplicacion

fun main(args : Array<String>) {
    println("ingrese una nota");
    var nota = readLine();

    /*if (nota!!.toInt()<=10) //menos de 10
        println("Jalado");
    else if (nota!!.toInt()>10 && nota!!.toInt()<=13) //entre 11 a 13
        println("Regular");
    else if (nota!!.toInt()>13 && nota!!.toInt()<=16) //entre 14 a 16
        println("Bueno");
    else if (nota!!.toInt()>16 && nota!!.toInt()<=18) //entre 17 a 18
        println("Excelente");
    else if (nota!!.toInt()>18 && nota!!.toInt()<=20) //entre 19 a 20
        println("Sobresaliente");
    else
        println("No tiene rango");
    */

   //usando when
    when (nota!!.toInt()) {
        in 0..10 -> print("Jalado")
        in 11..13 -> print("Regular")
        in 14..16 -> print("Bueno")
        in 17..18 -> print("Excelente")
        in 19..20 -> print("Sobresaliente")
        else-> println("No tiene rango")
    }
}