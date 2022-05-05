fun main(args: Array<String>) {
    val alphabet = args[0]
    val alphabetLowercase = alphabet.lowercase()
    val text = args[1]

    println("\nАлфавіт:\n$alphabet\n$alphabetLowercase\n")
    println("Оригінал:\t$text")

    for (shift in 1..alphabet.length) {
        val result = text.asSequence()
            .map {
                if (alphabet.contains(it)) {
                    shiftChar(it, shift, alphabet)
                } else if (alphabetLowercase.contains(it)) {
                    shiftChar(it, shift, alphabetLowercase)
                } else {
                    it
                }
            }
            .joinToString("")
        println("Зсув = $shift:\t$result")
    }
    println()
}

private fun shiftChar(c: Char, shift: Int, alphabet: String): Char {
    return alphabet[
            (alphabet.indexOf(c) + shift) % alphabet.length
    ]
}