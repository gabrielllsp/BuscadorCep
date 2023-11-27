package com.example.buscadordecep.data

import com.example.buscadordecep.api.ViaCep
import com.example.buscadordecep.listener.RespostaApi
import com.example.buscadordecep.model.Address
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DataSource {

    private val retrofit: ViaCep = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("http://viacep.com.br/")
        .build()
        .create(ViaCep::class.java)

    fun RespostaApi(cep: String, respostaApi: RespostaApi) {
        if (cep.isEmpty()) {
            respostaApi.onFailure("Preencha o campo cep!")
        } else {
            retrofit.setEndereco(cep).enqueue(object : Callback<Address> {
                override fun onResponse(call: Call<Address>, response: Response<Address>) {
                    if (response.code() == 200) {
                        val logradouro = response.body()?.logradouro.toString()
                        val bairro = response.body()?.bairro.toString()
                        val cidade = response.body()?.localidade.toString()
                        val estado = response.body()?.uf.toString()

                        respostaApi.onSucess(logradouro, bairro, cidade, estado)
                    } else {
                        respostaApi.onFailure("Cep inválido")
                    }
                }

                override fun onFailure(call: Call<Address>, t: Throwable) {
                    respostaApi.onFailure("Erro inesperado")
                }
            })
        }
    }
}