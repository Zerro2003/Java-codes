public class Problem15SumAndAverageDoWhile {
    public static void main(String[] args) {
        final int upperBound = 100;
        int sum = 0;
        int i = 1;

        do {
            sum += i;
            i++;
        } while (i <= upperBound);

        double average = sum / (double) upperBound;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }
}
