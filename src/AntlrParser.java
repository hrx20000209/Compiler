import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class AntlrParser {
    public static void main(String[] args) {
        String input = "1919 * 810\n" + "123.456 - 654.321\n" + "4. * .6\n" + "1 + 1 * 4\n" + "(5 - 1) * 4\n";

        CharStream inputStream = CharStreams.fromString(input); // 获取输入流
        calcLexer lexer = new calcLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer); // 词法分析获取 token 流
        calcParser parser = new calcParser(tokenStream);
        ParseTree tree = parser.calculator(); // 获取语法树的根节点
        System.out.println(tree.toStringTree(parser)); // 打印字符串形式的语法树
    }
}