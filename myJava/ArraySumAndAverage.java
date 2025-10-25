import java.util.Scanner;

public class ArraySumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer for the number of elements.");
            scanner.close();
            return;
        }

        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        double average = sum / (double) n;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        scanner.close();
    }
}
