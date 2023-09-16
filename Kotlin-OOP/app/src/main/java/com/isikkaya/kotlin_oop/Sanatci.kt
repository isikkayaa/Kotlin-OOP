package com.isikkaya.kotlin_oop

open class Sanatci(isim: String, yas: Int, meslek: String) {

    //Encapsulation

    var isim  : String? = isim
        private set     //isim'in değerini değiştiren şeyler private
        get             // ama degerini alan işlemler her yerden ulasilabilir olcak

    var yas : Int? = yas
        private set
        get


    private var meslek : String? = meslek



}

