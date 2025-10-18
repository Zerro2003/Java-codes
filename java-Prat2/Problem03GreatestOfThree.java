import java.util.Scanner;

public class Problem03GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double first = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double second = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double third = scanner.nextDouble();

        double greatest = first;
        if (second > greatest) {
            greatest = second;
        }
        if (third > greatest) {
            greatest = third;
        }

        System.out.println("The greatest number is " + greatest);
        scanner.close();
    }
}
