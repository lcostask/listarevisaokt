fun substituirNulos(enderecos: List<String?>) {

    val resultado = mutableListOf<String>()
    for (endereco in enderecos) {
        resultado.add(endereco ?: "Endereço não informado")
    }

    println(resultado)
}

fun main() {

    val enderecos = listOf(
        "Rua A, 123",
        null,
        "Rua B, 456",
        null
    )

    substituirNulos(enderecos)
}