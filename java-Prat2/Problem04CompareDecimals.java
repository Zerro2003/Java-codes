import java.util.Scanner;

public class Problem04CompareDecimals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first floating-point number: ");
        double first = scanner.nextDouble();
        System.out.print("Enter the second floating-point number: ");
        double second = scanner.nextDouble();

        double difference = Math.abs(first - second);
        if (difference < 0.001) {
            System.out.println("The numbers are the same up to three decimal places.");
        } else {
            System.out.println("The numbers are different.");
        }

        scanner.close();
    }
}
