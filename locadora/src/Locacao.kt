import utils.Utils
import java.time.LocalDate

class Locacao(
    private val cliente: Cliente,
    private val item: ItemLocadora,
    private val dataLocacao: LocalDate = LocalDate.now()
){

    fun getCliente(): Cliente = cliente
    fun getItem(): ItemLocadora = item
    fun getDataLocacao(): String = Utils().formatarData(dataLocacao)
    fun getDataDevolucao(): String? {
        val dataDevolucao = item.dataDevolucao
        return if (dataDevolucao != null) {
            Utils().formatarData(dataDevolucao)
        } else {
            null
        }
    }
}

