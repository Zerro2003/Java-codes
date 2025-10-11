// A Java program that checks if the first of three integers is greater than the other two and if any of them is negative
import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();
        
        System.out.print("Enter the third integer: ");
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Message: The first number (" + num1 + ") is greater than the second and third numbers.");
        } else {
            System.out.println("Message: The first number is NOT greater than both the second and third numbers.");
        }

        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Message: At least one of the numbers is negative.");
        } else {
            System.out.println("Message: None of the numbers are negative.");
        }

        input.close();
    }
}