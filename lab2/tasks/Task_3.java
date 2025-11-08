import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(", ");

        System.out.println(sumOfPositives(array));

    }

    private static int sumOfPositives(String[] array) {
        int sum = 0;

        for (String num : array) {
            if (!num.startsWith("-")) {
                sum += Integer.parseInt(num);
            }
        }
        return sum;
    }

}