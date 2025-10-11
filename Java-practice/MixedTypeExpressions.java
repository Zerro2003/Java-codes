// Demonstration of mixed-type expressions in Java

public class MixedTypeExpressions {
    public static void main(String[] args) {
        int x = 10;
        double y = 5.5;
        char z = 'A';

        // 1. x + y
        // Explanation: When an int (x=10) is added to a double (y=5.5), Java automatically 
        // promotes the int to a double to avoid losing precision. So, 10 becomes 10.0, 
        // and the result is a double (10.0 + 5.5 = 15.5).
        double result1 = x + y;
        System.out.println("1. x + y = " + result1);
        
        // 2. x + z
        // Explanation: When an int (x=10) is added to a char (z='A'), the char is promoted 
        // to an int. The int value of 'A' is its ASCII value, which is 65. The result is 
        // an int (10 + 65 = 75).
        int result2 = x + z;
        System.out.println("\n2. x + z = " + result2);
        
        /* * 3. (x * y) + z
         * Explanation: First, x (int) is multiplied by y (double), so x is promoted to 
         * double (10.0 * 5.5 = 55.0). Then, the char 'A' (z) is added to this double result. 
         * The char is promoted to its ASCII int value (65), which is then promoted to a 
         * double (65.0). The final result is a double (55.0 + 65.0 = 120.0).
         */
        double result3 = (x * y) + z;
        System.out.println("\n3. (x * y) + z = " + result3);
    }
}