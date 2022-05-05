public class CaesarCipher {

    public static void main(String[] args) {
        final String alphabet = args[0];
        final String alphabetLowercase = alphabet.toLowerCase();
        final String text = args[1];

        System.out.println("\nАлфавіт:\n" + alphabet + "\n" + alphabetLowercase + "\n");
        System.out.println("Оригінал:\t" + text);

        for (int shift = 1; shift < alphabet.length(); shift++) {
            StringBuilder result = new StringBuilder();
            for (char textChar : text.toCharArray()) {
                String textCharStr = String.valueOf(textChar);
                if (alphabet.contains(textCharStr)) {
                    result.append(shiftChar(textChar, shift, alphabet));
                } else if (alphabetLowercase.contains(textCharStr)) {
                    result.append(shiftChar(textChar, shift, alphabetLowercase));
                } else {
                    result.append(textChar);
                }
            }
            System.out.println("Зсув = " + shift + ":\t" + result);
        }
        System.out.println();
    }

    private static char shiftChar(char c, int shift, String alphabet) {
        return alphabet.charAt(
                (alphabet.indexOf(c) + shift) % alphabet.length()
        );
    }
}
