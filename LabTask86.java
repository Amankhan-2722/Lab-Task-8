import java.util.Scanner;
public class LabTask86{
    public static String capitalize(String lower_case_word) {
        if (lower_case_word.length() == 0) {
            return lower_case_word;
        }
        return Character.toUpperCase(lower_case_word.charAt(0)) + lower_case_word.substring(1);
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line of lowercase words: ");
        String line = input.nextLine();
        String[] words = line.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = capitalize(words[i]);
        }
        String result = String.join(" ", words);
        System.out.println("Capitalized line: " + result);
    }
}
