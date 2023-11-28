package com.example.buscadordecep.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun DetalhesEndereco(
    navController: NavController,
    logradouro: String,
    bairro: String,
    cidade: String,
    estado: String,
) {
    Column() {
        Text(text = logradouro, modifier = Modifier.padding(20.dp, 50.dp,0.dp, 0.dp), fontSize = 18.sp, fontWeight = FontWeight.Bold)
        Text(text = bairro, modifier = Modifier.padding(20.dp, 0.dp,0.dp, 0.dp), fontSize = 18.sp, fontWeight = FontWeight.Bold)
        Text(text = cidade, modifier = Modifier.padding(20.dp, 0.dp,0.dp, 0.dp), fontSize = 18.sp, fontWeight = FontWeight.Bold)
        Text(text = estado, modifier = Modifier.padding(20.dp, 0.dp,0.dp, 0.dp), fontSize = 18.sp, fontWeight = FontWeight.Bold)

    }
}