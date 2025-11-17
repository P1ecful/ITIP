import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindUpperAfterLower {

    public static void main(String[] args) {

        String text = "asdsada dasd aADdsads asdaSds";

        Pattern pattern = Pattern.compile("([a-z])([A-Z])"); // Находит строчную букву, за которой сразу следует заглавная буква
        Matcher matcher = pattern.matcher(text);

        String result = matcher.replaceAll("!$1$2!");
        System.out.println(result);
    }
}