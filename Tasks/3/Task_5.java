import java.util.Scanner;

public class Task_5 {
    
    public static boolean isAnagram(String str1, String str2) {
        String s1 = str1.toLowerCase().replaceAll("[^a-z]", "");
        String s2 = str2.toLowerCase().replaceAll("[^a-z]", "");
        
        if (s1.length() != s2.length()) {
            return false;
        }
        
        for (char c = 'a'; c <= 'z'; c++) {
            int count1 = 0;
            int count2 = 0;
            
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == c) {
                    count1++;
                }
            }
            
            for (int i = 0; i < s2.length(); i++) {
                if (s2.charAt(i) == c) {
                    count2++;
                }
            }
            
            if (count1 != count2) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        String[] parts = input.split(",");
        String str1 = parts[0].trim();
        String str2 = parts[1].trim();
        
        boolean result = isAnagram(str1, str2);
        System.out.println(result);
        
        scanner.close();
    }
}