import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();


        input = input.replaceAll("\\[", "").replaceAll("\\]", "");

        String[] rows = input.split(",");

        int n = (int) Math.sqrt(rows.length);

        int[][] matrix = new int[n][n];

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(rows[index].trim());
                index++;
            }
        }

        System.out.println(diagonalSum(matrix));

    }

    public static int diagonalSum(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

}