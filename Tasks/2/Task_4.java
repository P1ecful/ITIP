import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        String[] array = scanner.nextLine().split(", ");

        System.out.println(hasDuplicates(array));
    }

    private static boolean hasDuplicates(String[] array) {

        Set<Integer> set = new HashSet<>();

        for (String num : array) {
            int number = Integer.parseInt(num);
            if (set.contains(number)) return true;

            set.add(number);
        }

        return false;
    }

}