import io.mockk.every
import io.mockk.mockkStatic
import io.mockk.spyk
import io.mockk.verify
import kotlin.test.Test

class MenuTest {

    @Test
    fun testarSelecaoDeLanchesNoMenu() {

        val menu = spyk(Menu())
        val opcaoSelecionada = "1"
        mockkStatic("MenuKt")
        every { readln() } returns opcaoSelecionada

        menu.menuInicial()

        verify(exactly = 1) { menu.executar.lanche() }
        verify(exactly = 0) { menu.executar.bebidas() }
    }
}
