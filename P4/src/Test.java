// import de librerias de runtime de ANTLR
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;

public class Test {
    public static void main(String[] args) throws Exception {
        try{
            // crear un analizador lexico que se alimenta a partir de la entrada (archivo  o consola)
            ArrayInitLexer lexer;
            if (args.length>0)
                lexer = new ArrayInitLexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new ArrayInitLexer(CharStreams.fromStream(System.in));
            // Identificar al analizador lexico como fuente de tokens para el sintactico
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Crear el analizador sintactico que se alimenta a partir del buffer de tokens
            ArrayInitParser parser = new ArrayInitParser(tokens);
            ParseTree tree = parser.init(); // comienza el analisis en la regla inicial
            System.out.println(tree.toStringTree(parser)); // imprime el arbol en forma textual
        } catch (Exception e){
            System.err.println("Error (Test): " + e);
        }
    }
}
