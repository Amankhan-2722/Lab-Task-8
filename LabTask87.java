import java.util.Scanner;
public class LabTask87{
    public static void printMatrix(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int value = (int)(Math.random() * 2);
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();

        printMatrix(n);
    }
}

