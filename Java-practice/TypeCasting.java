public class TypeCasting {
    public static void main(String[] args) {
        int myInt = 10;
        double myDouble = myInt;
        float myFloat = myInt;

        System.out.println("--- Widening Conversion ---");
        System.out.println("Original int value: " + myInt);
        System.out.println("Converted to double: " + myDouble);
        System.out.println("Converted to float: " + myFloat);
        System.out.println();

        double anotherDouble = 15.85;
        int anotherInt = (int) anotherDouble;
        
        System.out.println("--- Narrowing Conversion ---");
        System.out.println("Original double value: " + anotherDouble);
        System.out.println("Casted back to int: " + anotherInt);
        System.out.println();

        System.out.println("--- Explanation ---");
        System.out.println("Widening Conversion (or automatic type promotion) is when a smaller data type is converted to a larger data type (e.g., int to double). It's safe and happens automatically because there's no risk of losing data.");
        System.out.println("Narrowing Conversion is when a larger data type is converted to a smaller one (e.g., double to int). It must be done manually (casting) because you might lose information (like the decimal part), as seen above where 15.85 became 15.");
    }
}