import java.util.Arrays;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().replace("-", "").split("");

        System.out.println(Arrays.toString(countEvenOddDigits(array)).replace("[", "").replace("]", ""));
    }

    private static int[] countEvenOddDigits(String[] array) {
        int evenCount = 0;
        int oddCount = 0;

        for (String num : array) {
            if (Integer.parseInt(num) % 2 == 0) {
                evenCount++;
            }  else {
                oddCount++;
            }
        }

        return new int[]{evenCount, oddCount};
    }

}