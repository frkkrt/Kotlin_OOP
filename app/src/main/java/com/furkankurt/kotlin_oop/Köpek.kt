package com.furkankurt.kotlin_oop

class Köpek :Hayvan() {

        fun kopekFonksiyonu()
        {
                super.sesCikar()
        }
        override fun sesCikar()
        {
            println("Köpek Sınıfı")
        }
}