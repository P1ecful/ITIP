import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task_1 {
    public static String reverseWords(String input) {
        List<String> words = Arrays.asList(input.split(" "));
        Collections.reverse(words);
        return String.join(" ", words);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        String reversed = reverseWords(input);
        System.out.println(reversed);
        
        scanner.close();
    }
}