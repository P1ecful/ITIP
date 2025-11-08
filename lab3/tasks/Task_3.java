import java.util.Scanner;

public class Task_3 {
    
    public static int secondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
        return secondLargest;
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
        
        int result = secondLargest(arr);
        System.out.println(result);
        
        scanner.close();
    }
}