package br.com.biel

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import java.time.LocalDate
import java.time.temporal.ChronoUnit


class Conversor {
    fun converte(ano: Int, mes: Int, dia: Int) {

        val diadeHoje = LocalDate.now()

        val dataUsuario = LocalDate.of(ano ?: 0, mes ?: 0, dia ?: 0)

        val diferenca = ChronoUnit.DAYS.between(dataUsuario,diadeHoje)

        println("A diferença de dias entre a data inserida e a data de hoje é $diferenca dias!")
    }
}
