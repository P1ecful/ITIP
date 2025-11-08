import java.util.Scanner;

public class Task_10 {
    
    public static boolean isTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        String[] sides = input.split(",");
        int a = Integer.parseInt(sides[0].trim());
        int b = Integer.parseInt(sides[1].trim());
        int c = Integer.parseInt(sides[2].trim());
        
        boolean result = isTriangle(a, b, c);
        System.out.println(result);
        
        scanner.close();
    }
}