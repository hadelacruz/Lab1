/*Problema no. 1
Autor: Humnerto Alexander de la Cruz
*/
fun main() {
    println("Introduce un número decimal:")
    val input = readLine() ?: "0"  // Leer la entrada del usuario
    val decimal = input.toIntOrNull() ?: 0  // Convertir la entrada a Int
    val binaryNumber = decimalToBinary(decimal)
    println("El número decimal $decimal en binario es:  $binaryNumber")
}

fun decimalToBinary(decimal: Int): String {
    if (decimal == 0) return "0"

    var number = decimal
    var binary = ""

    while (number > 0) {
        binary = (number % 2).toString() + binary
        number /= 2
    }
    return binary
}



