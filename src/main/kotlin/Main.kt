fun main(args: Array<String>) {
    val alphabet = args[0]
    val text = args[1]

    println("\nАлфавіт:\n$alphabet\n${alphabet.lowercase()}\n")
    println("Оригінал:\t$text")

    CaesarCipher.decode(alphabet, text)
        .forEachIndexed { index, decodedStr -> println("Зсув = ${index + 1}:\t$decodedStr") }

    println()
}