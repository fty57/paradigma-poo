import Filme
import Jogo

fun main() {
    val filme1 = Filme(idItem = 1, genero = "Ação", classificacaoIndicativa = "Livre", titulo = "Aventuras de Patolino", disponivel = true)
    filme1.alugar(4)

    val jogo1 = Jogo(idItem = 2, plataforma = "PS4", tipoMidia = "Digital", titulo = "Sly Cooper 4", disponivel = true)

    jogo1.exibirDetalhes()

    jogo1.alugar(4)

    jogo1.exibirDetalhes()

}