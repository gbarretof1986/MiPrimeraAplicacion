package com.kotlin.application.miprimeraaplicacion

class Archivo<T>{
    var nombre:T?=null
    var ruta:T?=null
}

fun main (args: Array<String>){
    var archivo1 = Archivo<Array<String>>()
}