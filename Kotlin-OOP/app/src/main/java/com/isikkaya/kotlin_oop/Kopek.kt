package com.isikkaya.kotlin_oop

class Kopek : Hayvan() {
    fun kopekFonksiyonu(){
        super.sesCikar()   //inherit ettiği(kalıtım yaptıgı) -> hayvan sınıfa referans veriyor

    }
    override fun sesCikar() { //hayvanda aynı isimde fonksiyon oldugu icin override ediyoruz
        println("kopek sınıfı")

    }

}