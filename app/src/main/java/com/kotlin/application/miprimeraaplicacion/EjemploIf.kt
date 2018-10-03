package com.kotlin.application.miprimeraaplicacion

fun main(args: Array<String>){
    println("ingrese su edad:");
    var edad = readLine();

    if (edad!!.toInt()>20) //permit convertir en una sola linea
        println("Es joven");
}