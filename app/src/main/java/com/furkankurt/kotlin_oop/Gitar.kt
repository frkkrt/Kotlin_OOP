package com.furkankurt.kotlin_oop

class Gitar: Enstruman,Dekorasyon {

    var marka:String?=null
    var elektro:Boolean?=null

    override var oda: String
        get() = "Salonda Duruyor"
        set(value) {}


}