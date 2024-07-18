fun main() {
    println("Ingrese un numero entero:")
    val decimal = readLine()?.toIntOrNull()


    if (decimal == null) {
        println("Por favor, ingrese un número válido.")
        return
    }

    val binario = convertDecimalToBinary(decimal)
    println("El numero $decimal convertido a binario es: $binario")
}

fun convertDecimalToBinary(decimal: Int): String {
    return Integer.toBinaryString(decimal)
}

