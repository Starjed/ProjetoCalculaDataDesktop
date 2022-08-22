package br.com.biel

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.time.LocalDate


internal class EntreDiasTeste {
    @Test
    fun entreDias() {
        assertEquals(2, Conversor().entre(LocalDate.of(2012,12, 12), LocalDate.of(2012,12, 14),),"Teste de dias entre datas validado com sucesso")
    }
}
