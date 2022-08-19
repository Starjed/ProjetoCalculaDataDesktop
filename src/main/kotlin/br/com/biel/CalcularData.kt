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

import java.awt.Label
import java.util.*
import javax.swing.text.LabelView


open class CalcularData {
    @Composable
    @Preview
    fun calcula() {
        //Função para inserir o Dia!
        fun dia(): String? {
            println("Insira o Dia para pesquisa")
            var dia = readLine()

            while (dia?.toIntOrNull()!! > 31) {
                println("Não entendi, insira um dia de 1 a 31")
                dia()
            }

            return dia

        }

        //Função para inserir o Mês!
        fun mes(): String? {
            println("Insira o Mês para pesquisa")
            var mes = readLine()

            while (mes?.toIntOrNull()!! > 12) {
                println("Não entendi, insira um mês de 1 a 12")
                return mes()
            }
            return mes
        }


        //Função para inserir o Ano!
        fun ano(): String? {
            println("Insira o Ano para pesquisa")
            var ano = readLine()

            while (ano?.toIntOrNull()!! > 2022) {
                println("Não entendi, insira um ano de 0 até 2022")
                ano()
            }
            return ano
        }


    }

}