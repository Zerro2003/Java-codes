import java.util.Scanner;

public class Problem11ContinuousNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        if (rows <= 0) {
            System.out.println("Please enter a positive integer.");
            scanner.close();
            return;
        }

        int current = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(current + " ");
                current++;
            }
            System.out.println();
        }

        scanner.close();
    }
}
