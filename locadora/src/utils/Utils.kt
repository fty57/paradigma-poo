package utils

import ItemLocadora
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Utils {
    fun formatarData(data: LocalDate): String{
        val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
        return data.format(formatter)
    }
}

class Locadora{
    fun listarItens(itens: List<ItemLocadora>, mostrarDisponiveis: Boolean) {
        val filtrados = if (mostrarDisponiveis) {
            itens.filter { it.disponivel }
        } else {
            itens.filter { !it.disponivel }
        }

        if (filtrados.isEmpty()) {
            if (mostrarDisponiveis) {
                println("Todos os títulos estão alugados no momento! Por favor, tente mais tarde.\n")
            } else {
                println("Nenhum título está alugado no momento!\n")
            }
        } else {
            if (mostrarDisponiveis) {
                println("Mídias disponíveis:")
            } else {
                println("Mídias indisponíveis:")
            }
            filtrados.forEach { item ->
                println(item.titulo)
            }
            println()
        }
    }
}