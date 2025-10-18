import java.util.Scanner;

public class Problem07NaturalNumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            scanner.close();
            return;
        }

        int sum = 0;
        System.out.println("The natural numbers are:");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            sum += i;
        }

        System.out.println("The sum of natural numbers up to " + n + " terms is " + sum);
        scanner.close();
    }
}
