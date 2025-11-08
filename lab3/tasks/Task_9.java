import java.util.Scanner;

public class Task_9 {
    
    public static int differenceMaxMin(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        
        int min = arr[0];
        int max = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        return max - min;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        input = input.replace("[", "").replace("]", "").replace(" ", "");
        String[] numbers = input.split(",");
        int[] arr = new int[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }
        
        int result = differenceMaxMin(arr);
        System.out.println(result);
        
        scanner.close();
    }
}