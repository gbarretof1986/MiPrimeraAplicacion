package com.kotlin.application.miprimeraaplicacion

enum class TipoArchivo {
    XLS(1, "EXCEL"),
    TXT(2, "TEXT"),
    PDF(3, "ADOBE"),
    AVI(4, "MEDIA PLAYER"),
    FTL(5, "FREEMARKET");

    var indices: Int? = null
    var valor: String? = null
    constructor(indices: Int, valor:String){
        this.indices = indices
        this.valor = valor
    }
}

fun main (args: Array<String>){
    println(TipoArchivo.AVI)
}