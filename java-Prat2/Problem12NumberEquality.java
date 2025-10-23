import java.util.Scanner;

public class Problem12NumberEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double first = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double second = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double third = scanner.nextDouble();

        boolean firstEqualSecond = Double.compare(first, second) == 0;
        boolean secondEqualThird = Double.compare(second, third) == 0;

        if (firstEqualSecond && secondEqualThird) {
            System.out.println("All numbers are equal");
        } else if (!firstEqualSecond && Double.compare(first, third) != 0 && !secondEqualThird) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

        scanner.close();
    }
}
