# Locaí - Sistema de Locadora de Filmes e Jogos
Este documento apresenta a implementação de um sistema de locadora utilizando Programação Orientada a Objetos (POO) em Kotlin.

## Membros da equipe
- Francisco Álisson Véras Damasceno, 586622 - Engenharia de Software
- José Lucas Amorim Silva, 586623 - Engenharia de Software

## Papéis ou tipos de usuário da aplicação

- Cliente
- ItemLocadora: Abstrata
- Filme (Herda de ItemLocadora)
- Jogo (Herda de ItemLocadora)
- Locacao
- Reservavel (Interface)
- Digital (Interface)

## Principais funcionalidades da aplicação
- Um cliente pode ser cadastrado.
- Um filme ou jogo pode ser cadastrado.
- A opção de alugar um item (filme/jogo) pode ser realizada.
- O valor do aluguel será calculado diferente para cada item (filme/jogo).
- Um item pode ser reservado.

### Cliente
- idCliente: Int
- nome: String
- cpf: String
- email: String
- locacoes: List: Locacao 
- cadastrarCliente()
- adicionarLocacao()
- listarLocacoes()

### ItemLocadora
- idItem: Int
- titulo: String
- disponivel: Boolean
- dataDevolucao: Date / String
- calcularValorAluguel(): Abstrato
- exibirDetalhes(): Abstrato

### Filme
- genero: String
- classificacaoIndicativa: String
- calcularValorAluguel()
- exibirDetalhes()

### Jogo
- plataforma: String
- calcularValorAluguel()
- exibirDetalhes()

### Locacao
- cliente: Cliente
- item: ItemLocadora
- dataLocacao: Date
- dataDevolucao: Date
- calcularMulta()

### Físico 
- reservarFisico(cliente: Cliente, locacao: Locacao)

### Digital
- reservarDigital(emailCliente: String, locacao: Locacao)
