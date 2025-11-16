import java.util.Scanner;
public class LabTask81{
    public static int sumDigits(long n) {
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10; 
        }
        return sum;
    }
    public static void reverse(int number) {
        int n = Math.abs(number);
        int reversed = 0;

        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        if (number < 0) {
            reversed = -reversed;
        }

        System.out.println("Reversed Number: " + reversed);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("Sum of digits: " + sumDigits(number));
        reverse(number);
    }
}
