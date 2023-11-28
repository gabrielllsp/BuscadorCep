package com.example.buscadordecep.components

import ORANGE
import WHITE
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun ButtonCustom(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier,
) {
    Button(
        onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = ORANGE
        ),
        modifier = modifier
    ) {
        Text(text = text, fontSize = 18.sp, color = WHITE, fontWeight = FontWeight.Bold)
    }
}

@Preview
@Composable
fun ButtonCustomPreview() {
    ButtonCustom(onClick = { }, text = "Buscar Cep", modifier = Modifier.fillMaxWidth())
}