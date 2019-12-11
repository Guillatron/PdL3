import ANTLR.FibonacciLexer;
import ANTLR.FibonacciParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Analizador {
    static FibonacciLexer lexer;
    static FibonacciParser parser;

    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("test.prog");

        lexer = new FibonacciLexer(input);
        parser = new FibonacciParser(new CommonTokenStream(lexer));

        ParseTree arbol = parser.prog();
        TablaSimbolos escuchador = new TablaSimbolos();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(escuchador, arbol);
        escuchador.resumen();

    }
}
