import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindUpperAfterLower {

    public static void main(String[] args) {

        String text = "asdsada dasd aADdsads asdaSds";

        Pattern pattern = Pattern.compile("([a-z])([A-Z])");
        Matcher matcher = pattern.matcher(text);

        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, "!$1$2!");
        }

        matcher.appendTail(sb);
        System.out.println(sb);

    }
}