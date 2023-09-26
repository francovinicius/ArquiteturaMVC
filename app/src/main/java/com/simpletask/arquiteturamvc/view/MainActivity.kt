package com.simpletask.arquiteturamvc.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simpletask.arquiteturamvc.R
import com.simpletask.arquiteturamvc.controller.UsuarioController
import com.simpletask.arquiteturamvc.model.Usuario

class MainActivity : AppCompatActivity() {

    private lateinit var usuarioController: UsuarioController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usuarioController = UsuarioController(
            this
        )
       // usuarioController.recuperarUsuarios() //Ativa
    }
    //Passiva
    fun listarUsuarios( lista: List<Usuario> ){

        //Exibir os dados

        println( lista )

    }
}