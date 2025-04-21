import Filme
import Jogo
import Cliente
import ItemLocadora
import Locacao
import utils.Locadora


fun main() {


    val filme1 = Filme(idItem = 1, genero = "Ação", classificacaoIndicativa = "Livre", titulo = "Aventuras de Patolino", disponivel = true)
    //filme1.alugar(4)

    val jogo1 = Jogo(idItem = 2, plataforma = "PS4", tipoMidia = "Digital", titulo = "Sly Cooper 4", disponivel = true)
/*
    jogo1.exibirDetalhes()

    jogo1.exibirDetalhes()
*/

    val cliente1 = Cliente(idCliente = 1, nome = "Lucas", cpf = "123.456.789-00", email = "0@g.com")

    val itens = mutableListOf<ItemLocadora>(filme1, jogo1)

    //TESTE TÍTULO ALUGADO MANUALMENTE
//    val itensLocados = mutableListOf<ItemLocadora>(filme1)
//    val locacao1 = Locacao(cliente = cliente1, itens = itensLocados)
//    cliente1.adicionarLocacao(locacao1)
//    filme1.alugar(11)
    //jogo1.alugar(15)

    println("🎬🎮 Bem-vindo(a) ao Locaí! 🎮🎬")
    println("Aqui você encontra os melhores filmes e jogos para alugar.\n")

    var opcao: Int

    do {
        println(
            "Digite o número correspondente à ação:\n" +
                    "1. Listar títulos disponíveis\n" +
                    "2. Listar títulos indisponíveis\n" +
                    "3. Alugar título\n" +
                    "4. Menu Admin\n" +
                    "5. Sair"
        )

        opcao = readLine()?.toIntOrNull() ?: -1

        when (opcao) {
            1 -> Locadora().listarItens(itens, true)
            2 -> Locadora().listarItens(itens, false)
            3 -> {
                val disponiveis = Locadora().listarItens(itens, true)

                if (!disponiveis.isEmpty()) {

                    println("Digite os números dos títulos que deseja alugar, separados por vírgula (ex: 1,2):")
                    val escolhas = readLine()
                        ?.split(",")
                        ?.mapNotNull { it.trim().toIntOrNull() }
                        ?.filter { it in 1..disponiveis.size }

                    if (escolhas.isNullOrEmpty()) {
                        println("Nenhuma escolha válida feita.\n")
                    } else {
                        for (numero in escolhas) {
                            val itemEscolhido = disponiveis[numero - 1]
                            if (itemEscolhido.disponivel) {
                                itemEscolhido.alugar(7) // Alugar por 7 dias
                                println("Você alugou: ${itemEscolhido.titulo}")
                            } else {
                                println("O título ${itemEscolhido.titulo} não está disponível.")
                            }
                        }
                    }
                }
            }
            4 -> {
                // lógica do menu Admin
            }
            5 -> println("Saindo... Até logo! 👋")
            else -> println("Opção inválida. Tente novamente.\n")
        }
    } while (opcao != 5)

    //Opção 4 do Menu - Menu Admin - Funções que os admins podem fazer, por exemplo: listar locações de determinado cliente

}