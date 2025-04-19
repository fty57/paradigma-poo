import java.time.LocalDate
import java.time.format.DateTimeFormatter

val hoje = LocalDate.now()
val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
val dataAtualFormatada = hoje.format(formatter)

class Locacao(
    private val cliente: Cliente,
    private val item: ItemLocadora,
    private val dataLocacao: String = dataAtualFormatada,
){

    fun getCliente(): Cliente = cliente
    fun getItem(): ItemLocadora = item
    fun getDataLocacao(): String = dataLocacao
    fun getDataDevolucao(): String? = item.dataDevolucao
}

