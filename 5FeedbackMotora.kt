fun notaMotora (nota: Int?){
       val NotaFinal = nota?: 0

    when (NotaFinal) {
        0 -> println("Nota não informada")
        1,2,3 -> println("Precisa melhorar")
        4 -> println("Boa corrida")
        5 -> println("Excelente corrida!")

    }
}

fun main(){
    println("Dê uma nota de 1 a 5")
    val nota = readln()?.toIntOrNull()
    notaMotora(nota)
}