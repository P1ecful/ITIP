import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split(", ");

        System.out.println(clamp(array));
    }

    private static int clamp(String[] array) {

        int value = Integer.parseInt(array[0]);
        int min = Integer.parseInt(array[1]);
        int max = Integer.parseInt(array[2]);

        if (value < min) return min;
        if (value > max) return max;
        return value;

    }

}