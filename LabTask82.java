import java.util.Scanner;
public class LabTask82{
    public static int reverse(int number) {
        int n = Math.abs(number);
        int reversed = 0;

        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return number < 0 ? -reversed : reversed;
    }
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome ");
        } else {
            System.out.println(number + " is NOT a palindrome ");
        }
    }
}
