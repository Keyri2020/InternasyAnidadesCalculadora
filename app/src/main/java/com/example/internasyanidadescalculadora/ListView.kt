package com.example.internasyanidadescalculadora

import android.icu.text.Transliterator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class ListView : AppCompatActivity() {
    private var lvLenguajes: ListView?=null
    private var tvSeleccion: TextView?=null

    private val lenguajes = arrayOf("Kotlin","Java","C++", "C#","PHP","VB.net")
    private val posicion = arrayOf("1","6","3","2","4","5")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        lvLenguajes=findViewById(R.id.lv_Lenguajes)
        tvSeleccion=findViewById(R.id.tv_Seleccion)

        var adaptador: ArrayAdapter<String> = ArrayAdapter<String>(this,R.layout.list_items_claseprogramacion, lenguajes)
        lvLenguajes?.adapter=adaptador

        lvLenguajes?.onItemClickListener = object : AdapterView.OnItemClickListener{
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                tvSeleccion?.text="La posicion del lenguaje ${lvLenguajes?.getItemAtPosition(position)} es ${posicion[position]}"
            }

        }

        /*lvLenguajes?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long)
            {
                tvSeleccion?.text = "La posicion del lenguaje ${lvLenguajes?.getItemAtPosition(position)} es ${posicion[position]}"
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }*/

    }
}