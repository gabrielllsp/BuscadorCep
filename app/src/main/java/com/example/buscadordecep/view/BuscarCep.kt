package com.example.buscadordecep.view

import BLUE
import WHITE
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.buscadordecep.components.ButtonCustom
import com.example.buscadordecep.components.OutlinedTextFieldCustom

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun BuscarCep(navController: NavController) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Buscador de Cep", fontSize = 18.sp)
                },
                contentColor = WHITE,
                backgroundColor = BLUE
            )
        }
    ) {

        var inputCep by remember{
            mutableStateOf("")
        }

        var inputLogradouro by remember {
            mutableStateOf("")
        }

        var inputBairro by remember{
            mutableStateOf("")
        }

        var inputCidade by remember{
            mutableStateOf("")
        }

        var inputEstado by remember{
            mutableStateOf("")
        }


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
        ) {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                OutlinedTextFieldCustom(
                    value = inputCep,
                    onValue = {
                              inputCep = it
                    },
                    label = "Cep",
                    modifier = Modifier
                        .width(200.dp)
                        .padding(20.dp, 50.dp, 20.dp, 10.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    )
                )
                ButtonCustom(
                    onClick = {

                         },
                    text = "Buscar Cep",
                    modifier = Modifier
                        .padding(0.dp, 59.dp, 20.dp, 10.dp)
                        .height(55.dp)
                )
            }
            Column (modifier = Modifier.fillMaxWidth()){
                OutlinedTextFieldCustom(
                    value = inputLogradouro,
                    onValue = {
                        inputLogradouro = it
                    },
                    label = "Logradouro",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 0.dp, 20.dp, 10.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    )
                )

                OutlinedTextFieldCustom(
                    value = inputBairro,
                    onValue = {
                        inputBairro = it
                    },
                    label = "Bairro",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 0.dp, 20.dp, 10.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    )
                )

                OutlinedTextFieldCustom(
                    value = inputCidade,
                    onValue = {
                        inputCidade = it
                    },
                    label = "Cidade",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 0.dp, 20.dp, 10.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    )
                )

                OutlinedTextFieldCustom(
                    value = inputEstado,
                    onValue = {
                        inputEstado = it
                    },
                    label = "Estado",
                    modifier = Modifier
                        .width(150.dp)
                        .padding(20.dp, 0.dp, 20.dp, 10.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    )
                )

                ButtonCustom(
                    onClick = {

                    },
                    text = "Avançar",
                    modifier = Modifier
                        .padding(20.dp)
                        .height(55.dp)
                )
            }

        }
    }
}

@Preview
@Composable
fun BuscaCepPreview() {
    BuscarCep(navController = rememberNavController())
}