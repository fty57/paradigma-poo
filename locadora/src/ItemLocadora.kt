import java.time.LocalDate

interface ItemLocadora {
    val idItem: Int
    val titulo: String
    var disponivel: Boolean
    var dataDevolucao: LocalDate?

    fun getTítulo(): String = titulo
    fun getDisponibilidade(): Boolean = disponivel
    fun setDisponibilidade(disponivel: Boolean){ this.disponivel = disponivel }
    fun getDataDeDevolucao(): LocalDate? = dataDevolucao
    fun setDataDeDevolucao(dataDevolucao: LocalDate?){ this.dataDevolucao = dataDevolucao}

    fun calcularValorAluguel(dias: Int)
    fun exibirDetalhes()

    fun alugar(dias: Int){
        if(!getDisponibilidade()){
            setDataDeDevolucao(null)
        }else{
            setDisponibilidade(false)
            setDataDeDevolucao(LocalDate.now().plusDays(dias.toLong()))
        }
    }

    fun devolver(){
        setDisponibilidade(true)
        setDataDeDevolucao(null)
    }

    fun listarItensDisponiveis(itens: List<ItemLocadora>){
        println("Mídias disponíveis:")
        itens.forEach{ item ->
            if(item.getDisponibilidade()){
                println(item.getTítulo())
            }
        }
    }

    fun listarItensIndisponiveis(itens: List<ItemLocadora>){
        println("Mídias indisponíveis:")
        itens.forEach{ item ->
            if(!item.getDisponibilidade()){
                println(item.getTítulo())
            }
        }
    }
}