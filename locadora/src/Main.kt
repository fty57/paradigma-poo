import Filme
import Jogo
import Cliente
import ItemLocadora
import Locacao


fun main() {


    val filme1 = Filme(idItem = 1, genero = "Ação", classificacaoIndicativa = "Livre", titulo = "Aventuras de Patolino", disponivel = true)
    //filme1.alugar(4)
/*
    val jogo1 = Jogo(idItem = 2, plataforma = "PS4", tipoMidia = "Digital", titulo = "Sly Cooper 4", disponivel = true)

    jogo1.exibirDetalhes()

    jogo1.alugar(4)

    jogo1.exibirDetalhes()
*/
    val cliente1 = Cliente(idCliente = 1, nome = "Lucas", cpf = "123.456.789-00", email = "0@g.com")
    val itemLocadora1 = filme1
    val locacao1 = Locacao(cliente = cliente1, item = itemLocadora1)
    cliente1.adicionarLocacao(locacao1)
    //cliente1.removerLocacao(locacao1)
    cliente1.listarLocacoes()

}