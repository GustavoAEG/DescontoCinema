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


3 - Codifique o app para calcular o preço correto do ingresso com base na idade e mostre esse
 retorno para o usuário.
4 - Caso o usuário não tenha desconto, crie um sistema para a quantidade de ingressos que ele quer e,
 se ele comprar dois ingressos ou mais, terá um desconto de 30% em cada um.

 */


    var idade = 0
    var ingresso = 18.0
    var qtde_ingresso =0
    var total=0.0

    println("Informe idade")
    idade = readLine()!!.toInt()

    if (idade <5 ) {

        println("Desconto de ${ingresso*0.6}")
    }else if (idade >= 60) {

        println("Desconto de ${ingresso * 0.55}")
    } else {
        println("Informe quantos ingressos deseja")
        qtde_ingresso = readLine()!!.toInt()
    }

    if (qtde_ingresso >= 2) {
        println("Desconto de ${ingresso*0.3}")
        total= ingresso+ingresso*0.3
        println("total de ${total}")
    }



}
