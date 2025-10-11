// increament and decrement operators in java

public class IncrementDecrementDemo {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Initial value: " + number);

        System.out.println("\n--- Post-Increment (number++) ---");
        System.out.println("Value during operation: " + (number++));
        System.out.println("Value after operation: " + number);

        System.out.println("\n--- Pre-Increment (++number) ---");
        System.out.println("Value after operation: " + (++number));

        System.out.println("\n--- Post-Decrement (number--) ---");
        System.out.println("Value during operation: " + (number--));
        System.out.println("Value after operation: " + number);
        
        System.out.println("\n--- Pre-Decrement (--number) ---");
        System.out.println("Value after operation: " + (--number));
    }
}