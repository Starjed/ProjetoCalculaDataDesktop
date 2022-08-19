package br.com.biel

sealed class CalcularAction {
    data class Number(val number: Int): CalcularAction()
    object Calcular: CalcularAction()
}