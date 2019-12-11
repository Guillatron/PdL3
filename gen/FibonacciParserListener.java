// Generated from C:/Programacion/Universidad/Procesadores del lenguaje/Codigo/src\FibonacciParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FibonacciParser}.
 */
public interface FibonacciParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FibonacciParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(FibonacciParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(FibonacciParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FibonacciParser#incluir}.
	 * @param ctx the parse tree
	 */
	void enterIncluir(FibonacciParser.IncluirContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#incluir}.
	 * @param ctx the parse tree
	 */
	void exitIncluir(FibonacciParser.IncluirContext ctx);
	/**
	 * Enter a parse tree produced by {@link FibonacciParser#definicionfuncion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicionfuncion(FibonacciParser.DefinicionfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#definicionfuncion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicionfuncion(FibonacciParser.DefinicionfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FibonacciParser#bifurcacion}.
	 * @param ctx the parse tree
	 */
	void enterBifurcacion(FibonacciParser.BifurcacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#bifurcacion}.
	 * @param ctx the parse tree
	 */
	void exitBifurcacion(FibonacciParser.BifurcacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FibonacciParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(FibonacciParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(FibonacciParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FibonacciParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(FibonacciParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(FibonacciParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FibonacciParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(FibonacciParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(FibonacciParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FibonacciParser#llamadafuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadafuncion(FibonacciParser.LlamadafuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#llamadafuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadafuncion(FibonacciParser.LlamadafuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FibonacciParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(FibonacciParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(FibonacciParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FibonacciParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(FibonacciParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(FibonacciParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link FibonacciParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(FibonacciParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(FibonacciParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link FibonacciParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(FibonacciParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(FibonacciParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link FibonacciParser#sino}.
	 * @param ctx the parse tree
	 */
	void enterSino(FibonacciParser.SinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#sino}.
	 * @param ctx the parse tree
	 */
	void exitSino(FibonacciParser.SinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FibonacciParser#nElemArray}.
	 * @param ctx the parse tree
	 */
	void enterNElemArray(FibonacciParser.NElemArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#nElemArray}.
	 * @param ctx the parse tree
	 */
	void exitNElemArray(FibonacciParser.NElemArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link FibonacciParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(FibonacciParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(FibonacciParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link FibonacciParser#retornar}.
	 * @param ctx the parse tree
	 */
	void enterRetornar(FibonacciParser.RetornarContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#retornar}.
	 * @param ctx the parse tree
	 */
	void exitRetornar(FibonacciParser.RetornarContext ctx);
	/**
	 * Enter a parse tree produced by {@link FibonacciParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(FibonacciParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(FibonacciParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link FibonacciParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(FibonacciParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(FibonacciParser.VariableContext ctx);
}