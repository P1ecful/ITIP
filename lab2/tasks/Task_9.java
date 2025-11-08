import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Task9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().trim();

        String[] parts = input.split("\\],\\s*\\[");

        String arrayAStr = parts[0].replaceAll("\\[", "").replaceAll("\\]", "").trim();
        String arrayBStr = parts.length > 1 ? parts[1].replaceAll("\\[", "").replaceAll("\\]", "").trim() : "";

        String[] arrayA = arrayAStr.isEmpty() ? new String[0] : arrayAStr.split("\\s*,\\s*");
        String[] arrayB = arrayBStr.isEmpty() ? new String[0] : arrayBStr.split("\\s*,\\s*");


        System.out.println(Arrays.toString(mergeUniqueSorted(arrayA, arrayB)).replaceAll(" ", ""));


    }

    private static int[] mergeUniqueSorted(String[] arrayA, String[] arrayB) {

        Set<Integer> set = new TreeSet<>();

        for (String s : arrayA) {
            if (!s.isEmpty()) set.add(Integer.parseInt(s));
        }

        for (String s : arrayB) {
            if (!s.isEmpty()) set.add(Integer.parseInt(s));
        }

        return set.stream().mapToInt(Integer::intValue).toArray();

    }

}