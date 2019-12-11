package ANTLR;// Generated from C:/Programacion/Universidad/Procesadores del lenguaje/Codigo/src\FibonacciParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FibonacciParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FibonacciParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(FibonacciParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#incluir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncluir(FibonacciParser.IncluirContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#definicionfuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicionfuncion(FibonacciParser.DefinicionfuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#bifurcacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBifurcacion(FibonacciParser.BifurcacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(FibonacciParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(FibonacciParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(FibonacciParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#llamadafuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadafuncion(FibonacciParser.LlamadafuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(FibonacciParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(FibonacciParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(FibonacciParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(FibonacciParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSino(FibonacciParser.SinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#nElemArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNElemArray(FibonacciParser.NElemArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(FibonacciParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#retornar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetornar(FibonacciParser.RetornarContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(FibonacciParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(FibonacciParser.VariableContext ctx);
}