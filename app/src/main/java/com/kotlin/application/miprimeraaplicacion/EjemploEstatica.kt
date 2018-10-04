package com.kotlin.application.miprimeraaplicacion

class Jugador{
    companion object {
        val nombre:String = "Nombre Completo"
    }
}

fun main(args: Array<String>){
    println(Jugador.nombre)
}