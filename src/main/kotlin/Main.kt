fun main(args: Array<String>) {

/*

Um cinema aplica descontos dependendo da idade do cliente.

1 - Crie um projeto chamado DescontosCinema
2 - O App pede para um usuário digitar a sua idade e
checa se ele está apto para o deconto do ingresso. A tabela de descontos é a seguinte

Idade                            Preço do Ingresso
Ingresso inteiro           18 Reais
Abaixo de 5 anos        60% de Desconto
Acima de 60 anos       55% Discount


 */


    var idade = 0
    var ingresso = 18.0

    println("Informe idade")
    idade = readLine()!!.toInt()

    if (idade <5 ) {

        println("Desconto de ${ingresso*0.6}")
    }else if (idade >= 60) {

        println("Desconto de ${ingresso * 0.55}")
    } else {
        println("Sem desconto")
    }




}