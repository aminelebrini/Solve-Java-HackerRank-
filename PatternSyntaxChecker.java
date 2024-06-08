import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PatternSyntaxChecker {

    public static void main(String[] args)
    {
        String x = "12345";
        String t = "123456";

        Pattern pattern = Pattern.compile(t);
        Matcher matcher = pattern.matcher(x);
        if (matcher.matches()) {
            System.out.println("valid");
        }else
        {
            System.out.println("Invalid");
        }
    }
}