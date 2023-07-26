package TestarDesafio
import io.mockk.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

data class ItemLanche(var nome: String, var quantidade: Int, var valorUnitario: Double)

class CarrinhoTest {

    @Test
    fun testarTotalLanchesEImpressao() {

        val mockCarrinhoLanche = mutableListOf<ItemLanche>()

        mockCarrinhoLanche.add(ItemLanche("X-Burguer", 2, 10.0))
        mockCarrinhoLanche.add(ItemLanche("X-Salada", 3, 12.0))

        val codigo = 1
        val receberLanche = slot<ItemLanche>()
        val captorTotalLanches = slot<Double>()

        mockCarrinhoLanche.forEach { itemLanche ->
            println("Lanche: ${itemLanche.nome}\nQuantidade: ${itemLanche.quantidade}\nCódigo: $codigo\nTotal: R$${itemLanche.valorUnitario * itemLanche.quantidade}")
        }

        assertEquals(receberLanche, captorTotalLanches.captured)
    }
}

