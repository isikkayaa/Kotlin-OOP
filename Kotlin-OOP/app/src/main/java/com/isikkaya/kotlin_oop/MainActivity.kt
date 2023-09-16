package com.isikkaya.kotlin_oop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("-----------Sınıflar--------")

        val kullanici = Kullanici("Işık", 22)
        val digerkullanici = Kullanici("ülkü",23)


        println("-------Encapsulation------")

        val ahmet = Sanatci("Ahmet", 54,"Muzisyen")
        println(ahmet.isim)
        //ahmet.isim   ="Ahmet2"
        println(ahmet.isim) //Ahmet2 geldi logcatte

        println("------Inheritance----")

        val mehmet = OzelSanatci("Mehmet",43,"tiyatrocu")
        mehmet.sarkiSoyle()

        println("----Polymorphism-------")

        // Static Polymorphism

        val islem = Islemler()
        println(islem.carpma())
        println(islem.carpma(2,5))
        println(islem.carpma(3,4,2))


        //Dinamik Polymorphism

        val kedi = Hayvan()
        kedi.sesCikar()   // hayvan sınıfı yazdırcak loggcatte

        val barley = Kopek()
        barley.sesCikar()
        barley.kopekFonksiyonu()

        println("----Abstraction & Interface-------")
        kullanici.insanFonksiyonu()

        var gitar = Gitar()
        gitar.marka = "Gitar markası"
        gitar.elektro = true

        gitar.bilgi()
        println(gitar.oda)

        println("----Lambda Gösterimleri (expressions)-------")

        yazdigimiYazdir("test")

        val yazdigimiYazdirLambda = {verilenString: String -> println(verilenString)}
        yazdigimiYazdirLambda("test lambda")

        val carpmaIslemiLambda = {a: Int, b: Int -> a * b}
        println(carpmaIslemiLambda(6,6))

        val carpmaLambdaV2 : (Int, Int) -> Int = {a,b -> a*b}
        println(carpmaLambdaV2(7,4))



     }

    fun yazdigimiYazdir(string: String){
        println(string)
    }



}