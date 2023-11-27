package com.example.buscadordecep.data

import com.example.buscadordecep.api.ViaCep
import com.example.buscadordecep.listener.RespostaApi
import com.example.buscadordecep.model.Endereco
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

class DataSource @Inject constructor() {

    private val retrofit: ViaCep = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://viacep.com.br/")
        .build()
        .create(ViaCep::class.java)

    fun respostaApi(cep: String, respostaApi: RespostaApi ){
        if (cep.isEmpty()){
            respostaApi.onFailure("Preencha o campo de cep!")
        }else{
            retrofit.setEndereco(cep).enqueue(object : Callback<Endereco>{
                override fun onResponse(call: Call<Endereco>, response: Response<Endereco>) {
                    if (response.code() == 200){
                        val logradouro = response.body()?.logradouro.toString()
                        val bairro = response.body()?.bairro.toString()
                        val cidade = response.body()?.localidade.toString()
                        val estado = response.body()?.uf.toString()

                        respostaApi.onSucess(logradouro,bairro,cidade,estado)
                    }else{
                        respostaApi.onFailure("Cep inválido!")
                    }
                }

                override fun onFailure(call: Call<Endereco>, t: Throwable) {
                    respostaApi.onFailure("Erro inesperado!")
                }

            })
        }
    }
}