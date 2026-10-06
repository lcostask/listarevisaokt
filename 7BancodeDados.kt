fun limparContas(emails: List<String?>) {

    var contasInvalidas = 0

    for (email in emails) {

        val tamanho = email?.length ?: 0

        if (email == null || tamanho == 0) {
            contasInvalidas++
            println("Conta será deletada")
        } else {
            println("Conta válida")
        }
    }

    println("Contas que precisam ser apagadas: $contasInvalidas")
}

fun main() {

    val emails = listOf<String?>(
        "lucas@gmail.com",
        null,
        "",
        "maria@gmail.com",
        null,
        "joao@gmail.com"
    )

    limparContas(emails)
}