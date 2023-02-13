package exercise1;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class Exercise1a {

    public static void main(String[] args) {

        String test0 = "xxx %d yyy%n";
        String test1 = "xxx%1$d yyy";
        String test2 = "%1$-02.3dyyy";
        String test3 = "Wochentag: %tA Uhrzeit: %tT";
        String[] test = {test0, test1, test2, test3};


        String text = "([a-zA-Z: ]*)";
        String conversions = "[bBhHsScCdoxXeEfgGaAtT%n]";
        String flags = "[-#+ 0,(]*";
        String index = "([1-9][0-9]*\\$)*";
        String width = "(\\d*)?";
        String precision = "(\\.\\d*)?";
        String time = "[AT]?";

        Pattern regex = Pattern.compile("(%" + index + flags + width + precision + conversions + time + ")|" + text);


        for (String teststring : test) {
            boolean prev = false;
            Matcher matcher = regex.matcher(teststring);
            while (matcher.find() && !matcher.group().equals("")) {
                if (matcher.group().startsWith("%"))
                    System.out.printf("FORMAT(\"%s\")", matcher.group());
                else {
                    if (matcher.group().startsWith(" ") && matcher.group().endsWith(": ") && prev) {
                        System.out.printf("TEXT(\"%s\")", matcher.group().substring(1, matcher.group().length() - 1));
                    } else if (matcher.group().startsWith(" ") && prev) {
                        System.out.printf("TEXT(\"%s\")", matcher.group().substring(1));
                    } else if (matcher.group().endsWith(": ")) {
                        System.out.printf("TEXT(\"%s\")", matcher.group().substring(0, matcher.group().length() - 1));
                    } else {
                        System.out.printf("TEXT(\"%s\")", matcher.group());
                    }
                }
                prev = matcher.group().contains("%t");
            }
            System.out.println("");
        }
    }
}

