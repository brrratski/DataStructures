


import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String potentialPalindrome = scanner.nextLine();
        String potentialPalindromeReversed = "";

        int strLength = potentialPalindrome.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            potentialPalindromeReversed = potentialPalindromeReversed + potentialPalindrome.charAt(i);
        }

        if (potentialPalindrome.toLowerCase().equals(potentialPalindromeReversed.toLowerCase())) {
            System.out.println(potentialPalindrome + " is a Palindrome.");
        } else {
            System.out.println(potentialPalindrome + " is not a Palindrome.");
        }
    }
}
