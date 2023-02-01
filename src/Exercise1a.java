import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class Exercise1a {

    public static void main(String[] args) {

        String test0 = "xxx %d yyy%n";
        String test1 = "xxx%1$d yyy";
        String test2 = "%1$-02.3dyyy";
        String test3 = "Wochentag: %tA Uhrzeit: %tT";


        String text = "([a-z ]*)";
        String conversions = "[bBhHsScCdoxXeEfgGaAtT%n]";
        String flags = "[-#+ 0,(]*";
        String index = "([1-9][0-9]*\\$)*";
        String width = "(\\d*)?";
        String precision = "(\\.\\d*)?";

        Pattern regex = Pattern.compile("(%" + index + flags + width + precision + conversions + ")|" + text);
        Matcher matcher = regex.matcher(test3);

        while (matcher.find() && !matcher.group().equals("")) {
            if (matcher.group().startsWith("%"))
                System.out.printf("FORMAT(%s)", matcher.group());
            else
                System.out.printf("TEXT(%s)", matcher.group());
        }
    }
}
