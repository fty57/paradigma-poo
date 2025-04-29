import ItemLocadora
import java.time.LocalDate

class Filme(
    // Atributos específicos de Filme
    private val genero: String,
    private val classificacaoIndicativa: String,

    // Atributos herdados de ItemLocadora, e sobrescritos
    override val idItem: Int,
    override val titulo: String,
    override var disponivel: Boolean = true,
    override var dataDevolucao: LocalDate? = null
) : ItemLocadora {

    fun getGeneroFilme(): String = genero
    fun getClassificacaoFilme(): String = classificacaoIndicativa

    override fun calcularValorAluguel(dias: Int) {
        println("O valor do aluguel de ${this.getTítulo()} é R$ ${3.0 * dias}")
    }
    override fun exibirDetalhes() {
        println("""
           Filme: ${this.getTítulo()}
           Gênero: ${getGeneroFilme()}
           Classificação: ${getClassificacaoFilme()}
           Disponivel: ${if(this.getDisponibilidade()) "Sim, o filme pode ser alugado." else "Não, o filme não está disponível."}
           Data de Devolução: ${if(this.getDisponibilidade()) "O filme ainda está na loja." else "${this.getDataDeDevolucao()}"} 
        """.trimIndent())
    }
}