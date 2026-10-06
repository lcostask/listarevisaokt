fun calcularDesconto(produto: Double, cupom: String?): Double {

    return when (cupom) {
        "PROMO10" -> produto - 10
         "PROMO20" -> produto - 20
        else -> produto
    }
}

fun main() {

    println("Digite o valor do produto:")
    val produto = readln().toDouble()

    println("Digite o cupom:")
    val cupom = readlnOrNull()
    val resultado = calcularDesconto(produto, cupom)

    println("Valor final: $resultado")
}