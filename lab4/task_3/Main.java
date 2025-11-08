package task_3;

public class Main {
    public static void main(String[] args) {

        int[] ages = {-2, 10, 30, 121};

        for (int age : ages) {
            try {
                checkAge(age);
            } catch (CustomAgeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void checkAge(int age) {
        if (age < 0 || age > 120) {
            throw new CustomAgeException();
        }
        System.out.println("Возраст коректный");
    }
}