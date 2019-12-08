package ANTLR;// Generated from C:/Programacion/Universidad/Procesadores del lenguaje/Codigo/src\ANTLR.FibonacciParser.g4 by ANTLR 4.7.2
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
	 * Enter a parse tree produced by {@link FibonacciParser#llamadavariable}.
	 * @param ctx the parse tree
	 */
	void enterLlamadavariable(FibonacciParser.LlamadavariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#llamadavariable}.
	 * @param ctx the parse tree
	 */
	void exitLlamadavariable(FibonacciParser.LlamadavariableContext ctx);
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
	 * Enter a parse tree produced by {@link FibonacciParser#parametros_definicion}.
	 * @param ctx the parse tree
	 */
	void enterParametros_definicion(FibonacciParser.Parametros_definicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#parametros_definicion}.
	 * @param ctx the parse tree
	 */
	void exitParametros_definicion(FibonacciParser.Parametros_definicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FibonacciParser#expr_sin_devolver}.
	 * @param ctx the parse tree
	 */
	void enterExpr_sin_devolver(FibonacciParser.Expr_sin_devolverContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#expr_sin_devolver}.
	 * @param ctx the parse tree
	 */
	void exitExpr_sin_devolver(FibonacciParser.Expr_sin_devolverContext ctx);
	/**
	 * Enter a parse tree produced by {@link FibonacciParser#llaves}.
	 * @param ctx the parse tree
	 */
	void enterLlaves(FibonacciParser.LlavesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#llaves}.
	 * @param ctx the parse tree
	 */
	void exitLlaves(FibonacciParser.LlavesContext ctx);
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
	 * Enter a parse tree produced by {@link FibonacciParser#declaracion_asignacion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_asignacion(FibonacciParser.Declaracion_asignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#declaracion_asignacion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_asignacion(FibonacciParser.Declaracion_asignacionContext ctx);
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
	 * Enter a parse tree produced by {@link FibonacciParser#logica}.
	 * @param ctx the parse tree
	 */
	void enterLogica(FibonacciParser.LogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#logica}.
	 * @param ctx the parse tree
	 */
	void exitLogica(FibonacciParser.LogicaContext ctx);
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
	 * Enter a parse tree produced by {@link FibonacciParser#cuerpomientras}.
	 * @param ctx the parse tree
	 */
	void enterCuerpomientras(FibonacciParser.CuerpomientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#cuerpomientras}.
	 * @param ctx the parse tree
	 */
	void exitCuerpomientras(FibonacciParser.CuerpomientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link FibonacciParser#cuerpomientraslinea}.
	 * @param ctx the parse tree
	 */
	void enterCuerpomientraslinea(FibonacciParser.CuerpomientraslineaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#cuerpomientraslinea}.
	 * @param ctx the parse tree
	 */
	void exitCuerpomientraslinea(FibonacciParser.CuerpomientraslineaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FibonacciParser#variables_en_cadena}.
	 * @param ctx the parse tree
	 */
	void enterVariables_en_cadena(FibonacciParser.Variables_en_cadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FibonacciParser#variables_en_cadena}.
	 * @param ctx the parse tree
	 */
	void exitVariables_en_cadena(FibonacciParser.Variables_en_cadenaContext ctx);
}