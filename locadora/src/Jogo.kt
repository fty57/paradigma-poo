import ItemLocadora

class Jogo(
    // Atributos específicos de Jogo
    val plataforma: String,
    private val tipoMidia: String = "Física",

    // Atributos herdados de ItemLocadora, e sobrescritos
    override val idItem: Int,
    override val titulo: String,
    override var disponivel: Boolean = true,
    override var dataDevolucao: String? = null
) : ItemLocadora {
    override fun calcularValorAluguel(dias: Int) {
        println("O valor do aluguel de ${titulo} é R$ ${5.0 * dias}")
    }

    override fun exibirDetalhes() {
        println("""
           Jogo: $titulo
           Plataforma: $plataforma
           Mídia: $tipoMidia
           Disponivel: ${if(disponivel) "Sim, o jogo pode ser alugado." else "Não, o jogo não está disponível."}
           Data de Devolução: ${if(disponivel) "O jogo ainda está na loja." else "$dataDevolucao"} 
        """.trimIndent())
    }
}