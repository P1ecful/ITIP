import java.util.Scanner;

public class Task_2 {
    
    public static int countVowels(String input) {
        int count = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char c = Character.toLowerCase(input.charAt(i));
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        int result = countVowels(input);
        System.out.println(result);
        
        scanner.close();
    }
}