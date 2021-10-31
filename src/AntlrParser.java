import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class AntlrParser {
    public static void main(String[] args) {
        String input = "1 + 1 = 2";
        CharStream charStream = CharStreams.fromString(input);
        calcLexer calculateLexer = new calcLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(calculateLexer);
        calcParser calculateParser = new calcParser(commonTokenStream);
        ParseTree tree = calculateParser.calculator();
        Visitor visitor = new Visitor();
        visitor.visit(tree);
    }
}
