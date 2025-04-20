import ItemLocadora
import java.time.LocalDate

class Filme(
    // Atributos específicos de Filme
    val genero: String,
    val classificacaoIndicativa: String,

    // Atributos herdados de ItemLocadora, e sobrescritos
    override val idItem: Int,
    override val titulo: String,
    override var disponivel: Boolean = true,
    override var dataDevolucao: LocalDate? = null
) : ItemLocadora {
    override fun calcularValorAluguel(dias: Int) {
        println("O valor do aluguel de ${titulo} é R$ ${3.0 * dias}")
    }
    override fun exibirDetalhes() {
        println("""
           Filme: $titulo
           Gênero: $genero
           Classificação: $classificacaoIndicativa
           Disponivel: ${if(disponivel) "Sim, o filme pode ser alugado." else "Não, o filme não está disponível."}
           Data de Devolução: ${if(disponivel) "O filme ainda está na loja." else "$dataDevolucao"} 
        """.trimIndent())
    }
}