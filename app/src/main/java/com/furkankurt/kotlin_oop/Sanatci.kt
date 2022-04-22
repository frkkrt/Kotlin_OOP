package com.furkankurt.kotlin_oop

//open yazılırsa bu sınıf açık bir sınıftır ve kalıtım alınabilir.
open class Sanatci(isim:String,yas:Int,meslek:String) {
        //Encapsülation
       //isim değiştirilemesin ama çekilebilsin.

        var isim:String?=isim
              private set
              get

       var yas:Int?=yas
              private set
              get


       private var meslek:String?=meslek

}