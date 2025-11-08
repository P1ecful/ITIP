import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        String[] parts = scanner.nextLine().split("], ");
        int k = Integer.parseInt(parts[1]);
        if (parts[0].equals("[")) {
            System.out.println("[]");
            return;
        }
        String[] array = parts[0].replace("[", "").split(", ");
        System.out.println(Arrays.toString(rotateRight(array, k)));

    }

    private static int[] rotateRight(String[] array, int k) {

        int n = array.length;
        if (n == 0) return new int[0];

        k = k % n;

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            result[newIndex] = Integer.parseInt(array[i]);
        }

        return result;
    }

}