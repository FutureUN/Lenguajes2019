import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;

public class Interpreter {

    public static void main(String[] args) throws Exception {
        srLexer lexer;
        if (args.length>0)
            lexer = new srLexer(CharStreams.fromFileName(args[0]));
        else
            lexer = new srLexer(CharStreams.fromStream(System.in));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        srParser parser = new srParser(tokens);
        ParseTree tree = parser.init();

        MyVisitor<Object> loader = new MyVisitor<Object>();
        loader.visit(tree);
    }
}
