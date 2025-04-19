import java.time.LocalDate

interface ItemLocadora {
    val idItem: Int
    val titulo: String
    var disponivel: Boolean
    var dataDevolucao: String?

    // Polimorfismo
    // Essas funções são diferentes em Jogo / Filme
    fun calcularValorAluguel(dias: Int)
    fun exibirDetalhes()

    fun alugar(dias: Int){
        // Uma vez alugado, o item não está mais disponível
        // O item foi alugado no dia de hoje

        // Se o item já não estiver disponível, não existe data de Devolução
        if(!disponivel){
            dataDevolucao = null
        }else{
            disponivel = false
            dataDevolucao = LocalDate.now().plusDays(dias.toLong()).toString();
        }
    }

    fun devolver(){
        // Uma vez devolvido, o item está novamente disponível
        // A data de devolução volta a null
        disponivel = true
        dataDevolucao = null
    }
}