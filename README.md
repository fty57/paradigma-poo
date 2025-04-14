# Locaí - Sistema de Locadora de Filmes e Jogos
Este documento apresenta a implementação de um sistema de locadora utilizando Programação Orientada a Objetos (POO) em Kotlin.

## Membros da equipe
Francisco Álisson Véras Damasceno, 586622 - Engenharia de Software
Lucas Amorim, 000000 - Engenharia de Software

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
- nome <<String>>
- cpf <<String>>
- locacoes <<List<Locacao>>>
- cadastrarCliente()
- adicionarLocacao()
- listarLocacoes()

### ItemLocadora
- titulo <<String>>
- disponivel <<Boolean>>
- dataDevolucao <<LocalDate>>
- calcularValorAluguel(): Abstrato
- exibirDetalhes(): Abstrato

### Filme
- genero <<String>>
- classificacaoIndicativa <<String>>
- calcularValorAluguel()
- exibirDetalhes()

### Jogo
- plataforma <<String>>
- calcularValorAluguel()
- exibirDetalhes()

  ### Locacao
  - cliente <<Cliente>>
  - item <<ItemLocadora>>
  - dataLocacao <<LocalDate>>
  - dataDevolucao <<LocalDate>>
  - calcularMulta()
 
  ### Reservavel
  - reservar(cliente <<Cliente>>)
 
  ### Digital
  - enviarLink(email <<String>>)
