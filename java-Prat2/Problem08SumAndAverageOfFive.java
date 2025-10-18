import java.util.Scanner;

public class Problem08SumAndAverageOfFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            sum += scanner.nextDouble();
        }

        double average = sum / 5.0;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
        scanner.close();
    }
}
