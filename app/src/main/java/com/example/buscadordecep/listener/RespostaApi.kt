package com.example.buscadordecep.listener

interface RespostaApi {
    fun onSucess(logradouro: String, bairro: String, cidade: String, estado: String)
    fun onFailure(erro: String)
}