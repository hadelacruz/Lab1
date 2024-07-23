/*Problema no. 2
Autor: Humnerto Alexander de la Cruz
*/
fun main() {
    println("Ingresar palabras:")
    val input = readln()
    val cadenaString = input.toString()
    val palindromas  = palabrasPalindromas(cadenaString)
    val conDosVocalesDistintas = palabrasConDosVocalesDistintas(cadenaString)
    palabrasQueInicianConConsonante(cadenaString)
}

fun palabrasPalindromas(frase: String){
    var contador: Int = 0
    val words = frase.split(" ")
    words.forEach { word ->
        //Verificar si la palabra es Palindroma
        if(word == word.reversed()){
            contador++
        }
    }
    println("Palabras Palíndromas: $contador")
}

fun vocalesDistinas(frase: String){
    var contador: Int = 0
    val words = frase.split(" ")
    var vocales = setOf('a','e', 'i','o', 'u')
    words.forEach { word ->
        //Verificar si la palabra tiene al menos dos vocales distintas
        //if(word)
    }
    println("Palabras con más de dos vocales distintas: $contador")
}

fun palabrasConDosVocalesDistintas(frase: String) {
    var contador: Int = 0
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    val words = frase.split(" ")

    words.forEach { word ->
        val distinctVowels = word.filter { it in vowels }.toSet()
        if (distinctVowels.size >= 2) {
            contador++
        }
    }
    println("Palabras con al menos 2 vocales distintas: $contador")
}

fun palabrasQueInicianConConsonante(frase: String) {
    var contador: Int = 0
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    val words = frase.split(" ")

    words.forEach { word ->
        if (word.isNotEmpty() && word[0].lowercaseChar() !in vowels) {
            contador++
        }
    }
    println("Palabras que inician con consonante: $contador")
}



