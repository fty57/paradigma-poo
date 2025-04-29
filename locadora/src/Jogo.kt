import ItemLocadora
import java.time.LocalDate

class Jogo(
    // Atributos específicos de Jogo
    private val plataforma: String,
    private var tipoMidia: String = "Física",

    // Atributos herdados de ItemLocadora, e sobrescritos
    override val idItem: Int,
    override val titulo: String,
    override var disponivel: Boolean = true,
    override var dataDevolucao: LocalDate? = null
) : ItemLocadora {

    fun getPlataformaJogo(): String = plataforma
    fun getTipoMidiaJogo(): String = tipoMidia
    fun setTipoMidiaJogo(tipoMidia: String) = { this.tipoMidia = tipoMidia }

    override fun calcularValorAluguel(dias: Int) {
        println("O valor do aluguel de ${this.getTítulo()} é R$ ${5.0 * dias}")
    }

    override fun exibirDetalhes() {
        println("""
           Jogo: ${this.getTítulo()}
           Plataforma: ${this.getPlataformaJogo()}
           Mídia: ${this.getTipoMidiaJogo()}
           Disponivel: ${if(this.getDisponibilidade()) "Sim, o jogo pode ser alugado." else "Não, o jogo não está disponível."}
           Data de Devolução: ${if(this.getDisponibilidade()) "O jogo ainda está na loja." else "${this.getDataDeDevolucao()}"} 
        """.trimIndent())
    }
}