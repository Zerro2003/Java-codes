public class Problem14SumAndAverageWhileLoop {
    public static void main(String[] args) {
        final int upperBound = 100;
        int sum = 0;
        int i = 1;

        while (i <= upperBound) {
            sum += i;
            i++;
        }

        double average = sum / (double) upperBound;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }
}
