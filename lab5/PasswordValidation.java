import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
    public static void main(String[] args) {

        String password = "12345Aaa";

        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,16}$");
        Matcher matcher = pattern.matcher(password);

        System.out.println(matcher.matches());

    }
}