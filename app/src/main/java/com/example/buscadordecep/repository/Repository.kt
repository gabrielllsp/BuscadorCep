package com.example.buscadordecep.repository

import com.example.buscadordecep.data.DataSource
import com.example.buscadordecep.listener.RespostaApi
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class Repository @Inject constructor(private val dataSource: DataSource) {

    fun respostaApi(cep: String, respostaApi: RespostaApi){
        dataSource.respostaApi(cep, respostaApi)

    }
}