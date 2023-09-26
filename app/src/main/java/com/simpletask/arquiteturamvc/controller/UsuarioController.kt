package com.simpletask.arquiteturamvc.controller

import com.simpletask.arquiteturamvc.model.Usuario
import com.simpletask.arquiteturamvc.model.api.UsuarioAPI
import com.simpletask.arquiteturamvc.view.MainActivity

class UsuarioController (
    private val mainActivity: MainActivity
){
    private val usuarioAPI = UsuarioAPI()

    init {
        recuperarUsuarios()
    }

    //regra de negocio
    fun recuperarUsuarios(){
        val lista = usuarioAPI.recuperarUsuarios()

        //exibir os dados na interface
        mainActivity.listarUsuarios( lista )
    }

}