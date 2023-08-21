import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);
        scanner.close();
        String ch = identifyCharacter(inputChar);

        System.out.println(ch);
    }

    public static String identifyCharacter(char ch) {
        if (Character.isLowerCase(ch) && "aeiou".contains(String.valueOf(ch))) {
            return "Lower-case vowel";
        } else if (Character.isUpperCase(ch) && "AEIOU".contains(String.valueOf(ch))) {
            return "Upper-case vowel";
        } else if (Character.isLowerCase(ch) && Character.isLetter(ch)) {
            return "Lower-case consonant";
        } else if (Character.isUpperCase(ch) && Character.isLetter(ch)) {
            return "Upper-case consonant";
        } else if (Character.isDigit(ch)) {
            return "Digit";
        } else {
            return "Special character";
        }
    }
}
