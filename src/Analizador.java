import ANTLR.FibonacciLexer;
import ANTLR.FibonacciParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Analizador {
    static FibonacciLexer lexer;
    static FibonacciParser parser;

    static String raiz(ParseTree arbol){
        String s=arbol.toStringTree(parser);
        if(s.length()>1 && s.charAt(0)=='(') s = s.substring(1,s.length()-1); //Se tienen en cuenta los parentesis propios del formato
        boolean cadena= s.charAt(0)=='"';   //Se esta almacenando una string?

        int nFinal=0;   //Almacena la posicion donde acaba la substring

        if(cadena) nFinal=(s.substring(1,s.length())).indexOf('"')+2;   //Trata los datos de acuerdo a su formato
        else  while(nFinal<s.length() && s.charAt(nFinal) != ' ')nFinal++;

        return s.substring(0,nFinal);
    }

    static void recorrerArbol(ParseTree arbol, String ruta){
        String id = ruta+'\\'+raiz(arbol);
        System.out.println(id);
        for(int i = 0; i < arbol.getChildCount(); i++){
            recorrerArbol(arbol.getChild(i), id);
        }
    }


    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("test.prog");

        lexer = new FibonacciLexer(input);
        parser = new FibonacciParser(new CommonTokenStream(lexer));

        ParseTree arbol = parser.prog();
        Listener escuchador = new Listener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(escuchador, arbol);


    }
}
