import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AutoAtendimentoTest {

    @Test
    fun testarLerInteiroComSucesso() {
        val mockReadln: () -> String? = { "42" }
        val autoAtendimento = AutoAtendimento()

        val resultado = autoAtendimento.lerInteiro()

        assertEquals(42, resultado)
    }
}





