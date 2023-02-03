package exercise2;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class ComputerTest {

    private ComputerTest() {}

    public static void main(String[] args) throws IOException {
        computerLanguage lexer = new computerLanguage(CharStreams.fromStream(System.in));
        computerGrammar parser = new computerGrammar(new CommonTokenStream(lexer));
        ParseTree tree = parser.start();
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.printf("%d error(s) detected%n", parser.getNumberOfSyntaxErrors());
            System.exit(1);
        }

        Computer ast = new ComputerBuild().build(tree);
        System.out.println(ast.toString());
        System.out.println(ast.dynamicSemantic());
    }
}
