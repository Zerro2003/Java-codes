public class Problem13SumAndAverageForLoop {
    public static void main(String[] args) {
        final int upperBound = 100;
        int sum = 0;

        for (int i = 1; i <= upperBound; i++) {
            sum += i;
        }

        double average = sum / (double) upperBound;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }
}
