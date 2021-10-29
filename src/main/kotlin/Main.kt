/*
Exercício

1. Crie um projeto chamado cadastroDeConvidados
2. Crie um loop (pode ser usado o while) e coloque um when dentro da estrutura,
para simular um menu de escolhas:]
- O Loop precisa ficar ativo enquanto uma variável simNao estiver como "Sim",
a partir do momento que o usuário digitar "Não" ou qualquer outra coisa, o programa precisa ser finalizado.
- Se o usuário escolher 1, abre as instruções para adicionar um novo convidado
- Se o usuário escolher 2, abre as instruções para remover um convidado
- Se o usuário escolher 3, lista os convidados
3. Use a List para cadastrar cada convidado
4. Teste para ver se tudo funciona
 */

fun main(args: Array<String>) {

    var num = 0
    val convidados = mutableListOf<String>()
    var simNao = ""


     do {
        println("Digite o que você deseja fazer com a lista de convidados: ")
        println("1 - Adicionar um novo convidado. ")
        println("2 - Remover um convidado. ")
        println("3 - Abrir a lista de convidado. ")
        num = readLine()!!.toInt()

            if (num == 1) {
                println("Você escolheu a opção 1 - Adicionar um novo convidado.")
                println("Digite o nome do convidado que deseja adicionar na lista: ")
                val name = readLine()!!
                convidados.add(name)

            } else if (num == 2) {
                 println("Você escolheu a opção 2 - Remover um convidado.")
                 println("Digite o nome do convidado que deseja remover na lista: ")
                 val name = readLine()!!
                 convidados.remove(name)

             }else if (num == 3) {
                println("Você escolheu a opção 3 - Abrir a lista de convidados.")
                println(convidados)
            }else{
                println("Opção selecionada inválida.")
            }

         println("Se você deseja modificar a lista, digite SIM.")
         println("Se você não deseja modificar a lista, digite NÃO.")
         var simNao = readLine()!!

    }while (simNao == "SIM")

    println("Sua lista de convidados ficou da seguinte forma: ")
    println(convidados)

}
