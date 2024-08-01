import java.util.*;

public class Main {
    private static final Random RANDOM = new Random();
    private static final StringBuilder STRING_BUILDER = new StringBuilder();
    private static final String[] UPPER_CASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
    private static final String[] LOWER_CASE_CHARS = "abcdefghijklmnopqrstuvwxyz".split("");
    private static final String[] DIGITS = "0123456789".split("");

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // getting input from user
        int upperCaseCount = scanner.nextInt();
        int lowerCaseCount = scanner.nextInt();
        int digitsCount = scanner.nextInt();
        int length = scanner.nextInt();


        String[][] symbols = {UPPER_CASE_CHARS, LOWER_CASE_CHARS, DIGITS};

        // generating appropriate number of characters of each case and digits
        generateLetter(upperCaseCount, UPPER_CASE_CHARS);
        generateLetter(lowerCaseCount, LOWER_CASE_CHARS);
        generateLetter(digitsCount, DIGITS);

        // if password size < input length, append characters, each from random array
        while (STRING_BUILDER.length() < length) {
            generateLetter(1, symbols[RANDOM.nextInt(symbols.length)]);
        }

        System.out.println(STRING_BUILDER);
    }

    private static void generateLetter(int count, String[] array) {
        if (count <= 0) return;

        // append specified number of characters to password
        // ensure that there are no two or more identical characters in a row
        for (int i = 0; i < count; i++) {
            String generatedCharacter = getLetter(array);
            String lastCharacter = "";
            if (!STRING_BUILDER.isEmpty()) {
                lastCharacter = java.lang.String.valueOf(STRING_BUILDER.charAt(STRING_BUILDER.length() - 1));
            }

            // if generatedCharacter equals last character, generate new character
            while (generatedCharacter.equals(lastCharacter)) {
                generatedCharacter = getLetter(array);
            }
            STRING_BUILDER.append(generatedCharacter);
        }
    }

    private static String getLetter(String[] letters) {
        int bound = letters.length;
        return letters[RANDOM.nextInt(bound)];
    }
}