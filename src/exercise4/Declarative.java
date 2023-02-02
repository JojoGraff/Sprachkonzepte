package exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;

public class Declarative {

    private Declarative() {}
    private static final int MIN_LENGTH = 20;

    public static void main(String[] args) throws IOException {

        long start = System.nanoTime();

        var data = Files
                .lines(Paths.get(args[0]))
                .filter(i -> !i.isEmpty())
                .map(String::length)
                .filter(i -> i > MIN_LENGTH)
                .reduce(0, Integer::sum);

        long stop = System.nanoTime();
        System.out.printf("result = %d (%d microsec)%n", data, (stop - start) / 1000);
    }
}
