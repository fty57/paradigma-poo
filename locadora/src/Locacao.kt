import utils.Utils
import java.time.LocalDate

class Locacao(
    private var cliente: Cliente?,
    private val itens: List<ItemLocadora>,
    private val dataLocacao: LocalDate = LocalDate.now()
){

    fun getCliente(): Cliente? = cliente
    fun getItens(): List<ItemLocadora> = itens
    fun getDataLocacao(): String = Utils().formatarData(dataLocacao)

    fun getDataDevolucao(): List<String?> {
        return itens.map { item ->
            item.dataDevolucao?.let { Utils().formatarData(it) }
        }
    }


}

