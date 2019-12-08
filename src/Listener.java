import ANTLR.FibonacciParser;
import ANTLR.FibonacciParserBaseListener;

public class Listener extends FibonacciParserBaseListener {
    @Override
    public void enterDefinicionfuncion(FibonacciParser.DefinicionfuncionContext ctx) {
        System.out.print(ctx.IDENTIF());
    }

    @Override
    public void exitDefinicionfuncion(FibonacciParser.DefinicionfuncionContext ctx) {
        System.out.println(" UwU");
    }
}