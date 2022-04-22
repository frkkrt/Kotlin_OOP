package com.furkankurt.kotlin_oop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val kullanici=Users("Furkan",27)
        val digerKullanici=Users("Selin",25)

        val faruk=Sanatci("Ahmet",50,"Müzisyen")
        println(faruk.isim)
        //faruk.isim="Faruk2"
        println(faruk.isim)
        //faruk.cinsiyet

        println("----Inheritance----")

        val mehmet=Ozel_Sanatci("Mehmet",40,"Sinemacı")
        mehmet.sarkiSoyle()

        //Statik Polymorphism

        val islem=Islemler()
        println(islem.carpma())
        println(islem.carpma(2,3))
        println(islem.carpma(2,3,4))


        //Dinamik Polymorphism

        val kedi=Hayvan()
        kedi.sesCikar()

        val barley=Köpek()
        barley.sesCikar()
        barley.kopekFonksiyonu()

        println("---------Abstraction & Interface--------")

        kullanici.insanFonksiyonu()
        var gitar=Gitar()
        gitar.marka="Gitar Markası"
        gitar.elektro=true
        gitar.bilgi()
        println(gitar.oda)

        println("------Lambda Expressions------")
        yazdir("test")
        val yazdirlambda={verilenString:String -> println(verilenString)}
        yazdirlambda("test lambda")

        val carpmaIslemiLambda={a:Int,b:Int->a*b}
        println(carpmaIslemiLambda(6,7))

        val carpmaLambdaV2:(Int,Int)->Int={a,b->a*b}
        println(carpmaLambdaV2(6,7))

    }
    fun yazdir(string:String)
    {
        println(string)
    }



}