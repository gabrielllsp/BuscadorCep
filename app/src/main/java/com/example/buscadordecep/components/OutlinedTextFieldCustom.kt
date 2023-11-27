package com.example.buscadordecep.components

import BLUE
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
    fun OutlinedTextFieldCustom(
        value: String,
        onValue: (String) -> Unit,
        label: String,
        modifier: Modifier,
        keyboardOptions: KeyboardOptions,
    ) {
        OutlinedTextField(
            value,
            onValue,
            label = {
                Text(text = label)
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = BLUE,
                cursorColor = BLUE,
                focusedLabelColor = BLUE
            ),
            modifier = modifier,
            keyboardOptions = keyboardOptions,
            maxLines = 1
        )
    }
