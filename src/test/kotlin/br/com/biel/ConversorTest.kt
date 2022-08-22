package br.com.biel


import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.time.LocalDate

class ConversorTest {

    @Test
    fun converte() {
        assertEquals(LocalDate.of(2012, 12, 12), Conversor().converte("12/12/2012"), "data válida")
        assertEquals(LocalDate.of(2012, 12, 13), Conversor().converte("13/12/2012"), "data válida + 1")
        assertEquals(LocalDate.of(2012,1, 10), Conversor().converte("10/1/2012"), "data válida apenas 1 digito mes e dia")

    }

}
