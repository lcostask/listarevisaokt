fun validarBioInfantil(bio: String?) {
    val tam = bio?.length ?: 0

    if (bio == null) {
        println("Bio desconhecida")
    } else if (tam <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }
}

fun main() {
    println("Digite a bio do perfil infantil:")
    val bio: String? = readlnOrNull()

    validarBioInfantil(bio)
}