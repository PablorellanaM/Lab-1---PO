fun main() {
    println("Ingrese varias palabras separadas por espacios:")
    val input = readLine()?.trim()

    if (input.isNullOrEmpty()) {
        println("Por favor, ingrese palabras válidas.")
        return
    }

    val words = input.split("\\s+".toRegex())
    val palindromeCount = words.count { it.isPalindrome() }
    val wordsWithTwoDistinctVowelsCount = words.count { it.hasAtLeastTwoDistinctVowels() }
    val wordsStartingWithConsonantCount = words.count { it.startsWithConsonant() }

    println("Cantidad de palabras palíndromas: $palindromeCount")
    println("Cantidad de palabras con al menos 2 vocales distintas: $wordsWithTwoDistinctVowelsCount")
    println("Cantidad de palabras que inician con una letra consonante: $wordsStartingWithConsonantCount")
}

fun String.isPalindrome(): Boolean {
    return this == this.reversed()
}

fun String.hasAtLeastTwoDistinctVowels(): Boolean {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    val distinctVowels = this.lowercase().toSet().filter { it in vowels }
    return distinctVowels.size >= 2
}

fun String.startsWithConsonant(): Boolean {
    val consonants = "bcdfghjklmnpqrstvwxyz"
    return this.isNotEmpty() && this[0].lowercaseChar() in consonants
}


