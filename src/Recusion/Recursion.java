package Recusion;

public class Recursion {
    public static void main(String[] args) {

    print(3);
        
        


    }
    // A recursive method calls itself. The method will make many instances of itself.
    // When no more methods are being made, the call stack will be followed back up
    // and the rest of the methods will be excuted.
    public static void print(int n) {
        if (n > 0) {
            System.out.println(n);
            print(n - 1);
            System.out.println(n);
        }
    }
    
    // 5! = 5 * 4!
    // 4! = 4 * 3!
    // 3! = 3 * 2!
    // 2! = 2 * 1!
    // 1! = 1 * 0!
    // 0! = 1
    // 1! = 1
    // 2! = 2 * 1
    // 3! = 3 * 2 * 1
    // 4! = 4 * 3 * 2 * 1
    // 5! = 5 * 4 * 3 * 2 * 1

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } 
        
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
