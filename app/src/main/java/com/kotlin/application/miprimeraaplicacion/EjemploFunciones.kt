package com.kotlin.application.miprimeraaplicacion

fun main(args: Array<String>){
    factorial()
}

fun factorial(){
    var numero = 5
    var resultado = 1
    for (x in 1..numero){
        resultado*= x
    }

    println("resultado : $resultado")
}