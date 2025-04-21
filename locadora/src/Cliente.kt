class Cliente(
    private val idCliente: Int,
    private val nome: String,
    private val cpf: String,
    private val email: String,
){
    private val locacoes = mutableListOf<Locacao>()

    fun adicionarLocacao(locacao: Locacao){
        locacoes.add(locacao)
    }
    fun listarLocacoes(){
        if(locacoes.isEmpty()){
            println("Nenhuma locação disponível de $nome")
        }else{
            locacoes.forEach{locacao ->
                println("Locações de ${locacao.getCliente()?.getNome()}:")
                locacao.getItens().forEach { item ->
                    println("Item alugado: ${item.titulo}")
                }
                println("Alugado no dia: ${locacao.getDataLocacao()}")
                println("A ser devolvido no dia: ${locacao.getDataDevolucao()}")
            }
        }
    }
    fun removerLocacao(locacao: Locacao) {
        locacoes.remove(locacao)

    }


    fun getIdCliente(): Int = idCliente
    fun getNome(): String = nome
    fun getCpf(): String = cpf
    fun getEmail(): String  = email

    fun getLocacoes(): List<Locacao> = locacoes.toList()

}