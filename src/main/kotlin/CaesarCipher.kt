class CaesarCipher {
    companion object {
        @JvmStatic
        fun decode(alphabet: String, encodedText: String): List<String> {
            val alphabetLowercase = alphabet.lowercase()

            return (1..alphabet.length).map { shift ->
                encodedText.asSequence()
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
            }
        }

        private fun shiftChar(c: Char, shift: Int, alphabet: String): Char {
            return alphabet[
                    (alphabet.indexOf(c) + shift) % alphabet.length
            ]
        }
    }
}