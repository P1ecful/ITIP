import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int start = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);

        System.out.println(sumRange(start, end));

    }

    private static int sumRange(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }

        return sum;
    }

}