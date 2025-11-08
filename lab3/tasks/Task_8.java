import java.util.Scanner;

public class Fibonacci2 {
    
    public static int fibonacci(int n) {
        if (n < 0) {
            return -1; 
        }
        
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int result = fibonacci(n);
        
        
        System.out.println(result);

        
        scanner.close();
    }
}