public class Problem16HarmonicSum {
    public static void main(String[] args) {
        final int n = 50000;

        double leftToRightSum = 0.0;
        for (int i = 1; i <= n; i++) {
            leftToRightSum += 1.0 / i;
        }

        double rightToLeftSum = 0.0;
        for (int i = n; i >= 1; i--) {
            rightToLeftSum += 1.0 / i;
        }

        double difference = Math.abs(leftToRightSum - rightToLeftSum);

        System.out.println("Left-to-right sum: " + leftToRightSum);
        System.out.println("Right-to-left sum: " + rightToLeftSum);
        System.out.println("Difference between sums: " + difference);
        System.out.println("The right-to-left sum is more accurate due to reduced rounding error.");
    }
}
