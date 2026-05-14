import java.util.Scanner;

public class FactorialRecursion {
    
    // Recursive method to find factorial
    static long factorial(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive call
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        long result = factorial(n);
        System.out.println("Factorial of " + n + " = " + result);
        
        sc.close();
    }
}
