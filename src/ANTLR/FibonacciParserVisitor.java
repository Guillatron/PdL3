package ANTLR;// Generated from C:/Programacion/Universidad/Procesadores del lenguaje/Codigo/src\ANTLR.FibonacciParser.g4 by ANTLR 4.7.2
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
	 * Visit a parse tree produced by {@link FibonacciParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(FibonacciParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#llamadafuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadafuncion(FibonacciParser.LlamadafuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#llamadavariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadavariable(FibonacciParser.LlamadavariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(FibonacciParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#parametros_definicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros_definicion(FibonacciParser.Parametros_definicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#expr_sin_devolver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_sin_devolver(FibonacciParser.Expr_sin_devolverContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#llaves}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlaves(FibonacciParser.LlavesContext ctx);
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
	 * Visit a parse tree produced by {@link FibonacciParser#declaracion_asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_asignacion(FibonacciParser.Declaracion_asignacionContext ctx);
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
	 * Visit a parse tree produced by {@link FibonacciParser#definicionfuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicionfuncion(FibonacciParser.DefinicionfuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#retornar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetornar(FibonacciParser.RetornarContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#incluir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncluir(FibonacciParser.IncluirContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogica(FibonacciParser.LogicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(FibonacciParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#cuerpomientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpomientras(FibonacciParser.CuerpomientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#cuerpomientraslinea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpomientraslinea(FibonacciParser.CuerpomientraslineaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FibonacciParser#variables_en_cadena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables_en_cadena(FibonacciParser.Variables_en_cadenaContext ctx);
}