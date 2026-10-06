fun main (){
  val transf = listOf<Double?>(50.0, null, 120.5, null, 10.5)
  var soma: Double =0.0
        for (item in transf) {
        if (item == null){
            println("Transção ignorada")
        }
            else {
            soma += item
        }
    }
    println("total de transações do dia: $soma")
}