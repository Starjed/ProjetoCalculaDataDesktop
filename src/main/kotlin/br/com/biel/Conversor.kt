package br.com.biel

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import java.text.SimpleDateFormat
import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit


class Conversor {
    fun converte(ano: Int, mes: Int, dia: Int): String {

        val diadeHoje = LocalDate.now()

        val dataUsuario = LocalDate.of(ano ?: 0, mes ?: 0, dia ?: 0)

        val diferenca = ChronoUnit.DAYS.between(dataUsuario,diadeHoje)

        return "$diferenca"
    }

    fun converte(calculaData: String): LocalDate {
        val formatter = DateTimeFormatter.ofPattern("d/M/yyyy")
        return LocalDate.parse(calculaData, formatter)
    }

    fun entre(of: LocalDate?, of1: LocalDate?): Int {
        return ChronoUnit.DAYS.between(of, of1).toInt()
    }
}
