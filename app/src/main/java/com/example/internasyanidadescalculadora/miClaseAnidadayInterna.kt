package com.example.internasyanidadescalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class miClaseAnidadayInterna : AppCompatActivity() {
    //clase anidada es una clase que puede estar dentro de otra clase

    private val uno = 1
    private fun retornaUno():Int{
        return uno
    }

    class miClaseAnidada{
        fun suma(n1:Int,n2:Int):Int{
            return n1+n2
        }
    }

    inner class miClaseInterna{
        fun sumarDos(num:Int):Int{
            return num + uno + retornaUno()
        }
    }
}