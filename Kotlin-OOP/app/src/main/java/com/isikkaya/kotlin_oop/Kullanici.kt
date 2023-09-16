package com.isikkaya.kotlin_oop

class Kullanici : Insan {

    var isim: String? = null
    var yas: Int? = null

    constructor(isim: String, yas: Int){
        this.isim = isim
        this.yas =  yas
        println("constructor cagrıldı  ")
    }

    init {  //baslatma kodu constructordan önce o cagrılıyor
        println("init cagrıldı")

    }
}