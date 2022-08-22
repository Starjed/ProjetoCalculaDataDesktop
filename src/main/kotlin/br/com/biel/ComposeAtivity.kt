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
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import java.text.SimpleDateFormat
import java.util.*

@Composable
@Preview


fun App() {

    val formatter = SimpleDateFormat("dd/MM/yyyy")
    var text3 by remember { mutableStateOf("calcule a data!!") }
    var textoData by remember { mutableStateOf("") }

    MaterialTheme {


        //COMEÇO DA ROW DO TEXFIELD DE DATA!
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically


        )
        {

        }

        //COMEÇO DA COLUMN DO TEXFIELD DE DATA!
        Column(
            modifier = Modifier.fillMaxSize().fillMaxHeight().offset(y = 200.dp),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,

            )
        {
            val maxChar = 8


            TextField(


                value = textoData,
                onValueChange = {
                    if (it.length <= maxChar) textoData = it
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


                )   //FIM DO TEXTFIELD DE DATA


            //INICIO DO BOTAO PARA CLICK DO USUÁRIO
            Column(
                modifier = Modifier.fillMaxSize().offset(y = -190.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

            ) {

                Button(onClick = {
//                    boxAparece()

                }) {
                    Text(textoData)
                }

            }       // FIM DOS PARAMETROS DO BOTÃO DE CLICK

        }


    }

    botaoCalcula(textoData)


}

// FIM DO APP()





