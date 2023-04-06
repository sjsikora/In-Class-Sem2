package L6;

public class L6_Errors {
    public static void main(String[] args) {
        int x = 0;
        compute(x);

        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //     at L6.L6_Errors.compute(L6_Errors.java:10)
        //     at L6.L6_Errors.main(L6_Errors.java:6)

    }
    private static void compute(int x) {

        //if and else here, to not compute 0 would be considered defensive programming

        try {
            System.out.println("method start"); // Try will process commands line by line
            System.out.println(1 / x); 
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Errors will become objects, and if there is no catch statment in the place where the
        // error was made, the error will be thrown to the main method, then from there,
        // it will be thrown to the JVM, and the JVM will terminate the program
        
    }
}
