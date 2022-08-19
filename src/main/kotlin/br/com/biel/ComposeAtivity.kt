package br.com.biel

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape

import androidx.compose.material.*
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.BottomEnd
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.autofill.Autofill
import androidx.compose.ui.autofill.AutofillType
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import calculaData
import java.awt.Color.*

import java.awt.Label
import java.awt.SystemColor.text
import java.util.*
import javax.swing.text.LabelView

@Composable
@Preview


fun App() {
    var text3 by remember { mutableStateOf("calcule a data!!") }

    val calcularDia = CalcularData()

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
                    Text(text3)
                }

            }       // FIM DOS PARAMETROS DO BOTÃO DE CLICK

        }


    }
    botaoCalcula()
}

// FIM DO APP()





