package br.com.biel

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.autofill.Autofill
import androidx.compose.ui.autofill.AutofillType
import androidx.compose.ui.unit.dp
import calculaData
import dia
import java.util.*

@Composable
@Preview
fun App() {
    var text3 by remember { mutableStateOf("calcule a data!!") }
    var calcula = calculaData()
    MaterialTheme {
        Button(onClick = {
            text3 = calculaData()
        }) {
            Text(text3)
        }
        Column (
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            var text by remember { mutableStateOf("") }
            val maxChar = 8
            TextField(

                value = text,
                onValueChange = {
                    if (it.length <= maxChar) text = it
                },
                visualTransformation = DateTransformation(),
                label = {
                    Text(text = "Data")
                },
                singleLine = true,
                maxLines = 1,
                leadingIcon = {
                    IconButton(onClick = {

                    }) {
                        Icon(
                            imageVector = Icons.Filled.DateRange,
                            contentDescription = "DateRange Icon"
                        )
                    }
                },

                trailingIcon = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Filled.Check,
                            contentDescription = "Checkbox Icon"
                        )
                    }
                },
            )

        }
    }

}
