// Generated from C:/Programacion/Universidad/Procesadores del lenguaje/Codigo/src\FibonacciParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FibonacciParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PR_BEGIN=1, PR_END=2, PR_WHILE=3, PR_FUNCTION=4, PR_TIPO=5, PR_INCLUDE=6, 
		PR_DEVOLVER=7, PR_VOID=8, PR_IF=9, PR_THEN=10, PR_ELSE=11, PR_ENDIF=12, 
		COMENTARIOBLOQUE=13, COMENTARIOLINEA=14, SUMA=15, TRUE=16, FALSE=17, RESTA=18, 
		MULT=19, DIV=20, ASIGNAR=21, OPLOGICOS=22, COMILLAS=23, COMA=24, CI=25, 
		CD=26, NUM_ELEM_ARRAY=27, DOSPUNTOS=28, FINALSENTENCIA=29, IDENTIF=30, 
		PI=31, PD=32, NUMERO=33, CADENA=34, TIPO_CADENA=35, WS=36, NEW_LINE=37;
	public static final int
		RULE_prog = 0, RULE_incluir = 1, RULE_definicionfuncion = 2, RULE_bifurcacion = 3, 
		RULE_sentencia = 4, RULE_declaracion = 5, RULE_asignacion = 6, RULE_llamadafuncion = 7, 
		RULE_expr = 8, RULE_parametros = 9, RULE_argumentos = 10, RULE_si = 11, 
		RULE_sino = 12, RULE_nElemArray = 13, RULE_array = 14, RULE_retornar = 15, 
		RULE_mientras = 16, RULE_variable = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "incluir", "definicionfuncion", "bifurcacion", "sentencia", "declaracion", 
			"asignacion", "llamadafuncion", "expr", "parametros", "argumentos", "si", 
			"sino", "nElemArray", "array", "retornar", "mientras", "variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'begin'", "'end'", "'while'", "'function'", null, "'include'", 
			"'devolver'", "'void'", "'if'", "'then'", "'else'", "'endif'", null, 
			null, "'+'", "'true'", "'false'", "'-'", "'*'", "'/'", "':='", null, 
			"'\"'", "','", "'['", "']'", null, "':'", "';'", null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PR_BEGIN", "PR_END", "PR_WHILE", "PR_FUNCTION", "PR_TIPO", "PR_INCLUDE", 
			"PR_DEVOLVER", "PR_VOID", "PR_IF", "PR_THEN", "PR_ELSE", "PR_ENDIF", 
			"COMENTARIOBLOQUE", "COMENTARIOLINEA", "SUMA", "TRUE", "FALSE", "RESTA", 
			"MULT", "DIV", "ASIGNAR", "OPLOGICOS", "COMILLAS", "COMA", "CI", "CD", 
			"NUM_ELEM_ARRAY", "DOSPUNTOS", "FINALSENTENCIA", "IDENTIF", "PI", "PD", 
			"NUMERO", "CADENA", "TIPO_CADENA", "WS", "NEW_LINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FibonacciParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FibonacciParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<IncluirContext> incluir() {
			return getRuleContexts(IncluirContext.class);
		}
		public IncluirContext incluir(int i) {
			return getRuleContext(IncluirContext.class,i);
		}
		public List<TerminalNode> FINALSENTENCIA() { return getTokens(FibonacciParser.FINALSENTENCIA); }
		public TerminalNode FINALSENTENCIA(int i) {
			return getToken(FibonacciParser.FINALSENTENCIA, i);
		}
		public List<DefinicionfuncionContext> definicionfuncion() {
			return getRuleContexts(DefinicionfuncionContext.class);
		}
		public DefinicionfuncionContext definicionfuncion(int i) {
			return getRuleContext(DefinicionfuncionContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FibonacciParserVisitor ) return ((FibonacciParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(40);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PR_INCLUDE:
					{
					setState(36);
					incluir();
					setState(37);
					match(FINALSENTENCIA);
					}
					break;
				case PR_FUNCTION:
					{
					setState(39);
					definicionfuncion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PR_FUNCTION || _la==PR_INCLUDE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncluirContext extends ParserRuleContext {
		public TerminalNode PR_INCLUDE() { return getToken(FibonacciParser.PR_INCLUDE, 0); }
		public TerminalNode IDENTIF() { return getToken(FibonacciParser.IDENTIF, 0); }
		public IncluirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incluir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).enterIncluir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).exitIncluir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FibonacciParserVisitor ) return ((FibonacciParserVisitor<? extends T>)visitor).visitIncluir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncluirContext incluir() throws RecognitionException {
		IncluirContext _localctx = new IncluirContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_incluir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(PR_INCLUDE);
			setState(45);
			match(IDENTIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinicionfuncionContext extends ParserRuleContext {
		public TerminalNode PR_FUNCTION() { return getToken(FibonacciParser.PR_FUNCTION, 0); }
		public TerminalNode IDENTIF() { return getToken(FibonacciParser.IDENTIF, 0); }
		public TerminalNode PI() { return getToken(FibonacciParser.PI, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode PD() { return getToken(FibonacciParser.PD, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(FibonacciParser.DOSPUNTOS, 0); }
		public TerminalNode PR_TIPO() { return getToken(FibonacciParser.PR_TIPO, 0); }
		public TerminalNode PR_BEGIN() { return getToken(FibonacciParser.PR_BEGIN, 0); }
		public TerminalNode PR_END() { return getToken(FibonacciParser.PR_END, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<BifurcacionContext> bifurcacion() {
			return getRuleContexts(BifurcacionContext.class);
		}
		public BifurcacionContext bifurcacion(int i) {
			return getRuleContext(BifurcacionContext.class,i);
		}
		public RetornarContext retornar() {
			return getRuleContext(RetornarContext.class,0);
		}
		public DefinicionfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicionfuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).enterDefinicionfuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).exitDefinicionfuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FibonacciParserVisitor ) return ((FibonacciParserVisitor<? extends T>)visitor).visitDefinicionfuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicionfuncionContext definicionfuncion() throws RecognitionException {
		DefinicionfuncionContext _localctx = new DefinicionfuncionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definicionfuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(47);
			match(PR_FUNCTION);
			setState(48);
			match(IDENTIF);
			setState(49);
			match(PI);
			setState(50);
			argumentos();
			setState(51);
			match(PD);
			setState(52);
			match(DOSPUNTOS);
			setState(53);
			match(PR_TIPO);
			setState(54);
			match(PR_BEGIN);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_WHILE) | (1L << PR_TIPO) | (1L << PR_IF) | (1L << IDENTIF))) != 0)) {
				{
				setState(57);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PR_TIPO:
				case IDENTIF:
					{
					setState(55);
					sentencia();
					}
					break;
				case PR_WHILE:
				case PR_IF:
					{
					setState(56);
					bifurcacion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PR_DEVOLVER) {
				{
				setState(62);
				retornar();
				}
			}

			setState(65);
			match(PR_END);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BifurcacionContext extends ParserRuleContext {
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public BifurcacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bifurcacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).enterBifurcacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).exitBifurcacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FibonacciParserVisitor ) return ((FibonacciParserVisitor<? extends T>)visitor).visitBifurcacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BifurcacionContext bifurcacion() throws RecognitionException {
		BifurcacionContext _localctx = new BifurcacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bifurcacion);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				mientras();
				}
				break;
			case PR_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				si();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenciaContext extends ParserRuleContext {
		public TerminalNode FINALSENTENCIA() { return getToken(FibonacciParser.FINALSENTENCIA, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public LlamadafuncionContext llamadafuncion() {
			return getRuleContext(LlamadafuncionContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FibonacciParserVisitor ) return ((FibonacciParserVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(71);
				asignacion();
				}
				break;
			case 2:
				{
				setState(72);
				declaracion();
				}
				break;
			case 3:
				{
				setState(73);
				llamadafuncion();
				}
				break;
			}
			setState(76);
			match(FINALSENTENCIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode PR_TIPO() { return getToken(FibonacciParser.PR_TIPO, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode NUM_ELEM_ARRAY() { return getToken(FibonacciParser.NUM_ELEM_ARRAY, 0); }
		public TerminalNode ASIGNAR() { return getToken(FibonacciParser.ASIGNAR, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FibonacciParserVisitor ) return ((FibonacciParserVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(PR_TIPO);
			setState(79);
			variable();
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASIGNAR:
			case FINALSENTENCIA:
				{
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASIGNAR) {
					{
					setState(80);
					match(ASIGNAR);
					setState(81);
					expr(0);
					}
				}

				}
				break;
			case NUM_ELEM_ARRAY:
				{
				setState(84);
				match(NUM_ELEM_ARRAY);
				setState(85);
				match(ASIGNAR);
				setState(86);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASIGNAR() { return getToken(FibonacciParser.ASIGNAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FibonacciParserVisitor ) return ((FibonacciParserVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			variable();
			setState(90);
			match(ASIGNAR);
			setState(91);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LlamadafuncionContext extends ParserRuleContext {
		public TerminalNode IDENTIF() { return getToken(FibonacciParser.IDENTIF, 0); }
		public TerminalNode PI() { return getToken(FibonacciParser.PI, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PD() { return getToken(FibonacciParser.PD, 0); }
		public LlamadafuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadafuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).enterLlamadafuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).exitLlamadafuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FibonacciParserVisitor ) return ((FibonacciParserVisitor<? extends T>)visitor).visitLlamadafuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamadafuncionContext llamadafuncion() throws RecognitionException {
		LlamadafuncionContext _localctx = new LlamadafuncionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_llamadafuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(IDENTIF);
			setState(94);
			match(PI);
			setState(95);
			parametros();
			setState(96);
			match(PD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public LlamadafuncionContext llamadafuncion() {
			return getRuleContext(LlamadafuncionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode CADENA() { return getToken(FibonacciParser.CADENA, 0); }
		public TerminalNode NUMERO() { return getToken(FibonacciParser.NUMERO, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(FibonacciParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(FibonacciParser.DIV, 0); }
		public TerminalNode SUMA() { return getToken(FibonacciParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(FibonacciParser.RESTA, 0); }
		public TerminalNode OPLOGICOS() { return getToken(FibonacciParser.OPLOGICOS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FibonacciParserVisitor ) return ((FibonacciParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(99);
				llamadafuncion();
				}
				break;
			case 2:
				{
				setState(100);
				variable();
				}
				break;
			case 3:
				{
				setState(101);
				match(CADENA);
				}
				break;
			case 4:
				{
				setState(102);
				match(NUMERO);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(114);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(106);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(107);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(109);
						_la = _input.LA(1);
						if ( !(_la==SUMA || _la==RESTA) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(110);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(111);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(112);
						match(OPLOGICOS);
						setState(113);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParametrosContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(FibonacciParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(FibonacciParser.COMA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FibonacciParserVisitor ) return ((FibonacciParserVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIF) | (1L << NUMERO) | (1L << CADENA))) != 0)) {
				{
				setState(119);
				expr(0);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(120);
					match(COMA);
					{
					setState(121);
					expr(0);
					}
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentosContext extends ParserRuleContext {
		public List<TerminalNode> PR_TIPO() { return getTokens(FibonacciParser.PR_TIPO); }
		public TerminalNode PR_TIPO(int i) {
			return getToken(FibonacciParser.PR_TIPO, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(FibonacciParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(FibonacciParser.COMA, i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).exitArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FibonacciParserVisitor ) return ((FibonacciParserVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PR_TIPO) {
				{
				setState(129);
				match(PR_TIPO);
				setState(130);
				variable();
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(131);
					match(COMA);
					{
					setState(132);
					match(PR_TIPO);
					setState(133);
					variable();
					}
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SiContext extends ParserRuleContext {
		public TerminalNode PR_IF() { return getToken(FibonacciParser.PR_IF, 0); }
		public TerminalNode PI() { return getToken(FibonacciParser.PI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PD() { return getToken(FibonacciParser.PD, 0); }
		public TerminalNode PR_THEN() { return getToken(FibonacciParser.PR_THEN, 0); }
		public TerminalNode PR_ENDIF() { return getToken(FibonacciParser.PR_ENDIF, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<BifurcacionContext> bifurcacion() {
			return getRuleContexts(BifurcacionContext.class);
		}
		public BifurcacionContext bifurcacion(int i) {
			return getRuleContext(BifurcacionContext.class,i);
		}
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).exitSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FibonacciParserVisitor ) return ((FibonacciParserVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(PR_IF);
			setState(142);
			match(PI);
			setState(143);
			expr(0);
			setState(144);
			match(PD);
			setState(145);
			match(PR_THEN);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_WHILE) | (1L << PR_TIPO) | (1L << PR_IF) | (1L << IDENTIF))) != 0)) {
				{
				setState(148);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PR_TIPO:
				case IDENTIF:
					{
					setState(146);
					sentencia();
					}
					break;
				case PR_WHILE:
				case PR_IF:
					{
					setState(147);
					bifurcacion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PR_ELSE) {
				{
				setState(153);
				sino();
				}
			}

			setState(156);
			match(PR_ENDIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SinoContext extends ParserRuleContext {
		public TerminalNode PR_ELSE() { return getToken(FibonacciParser.PR_ELSE, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<BifurcacionContext> bifurcacion() {
			return getRuleContexts(BifurcacionContext.class);
		}
		public BifurcacionContext bifurcacion(int i) {
			return getRuleContext(BifurcacionContext.class,i);
		}
		public SinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).enterSino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).exitSino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FibonacciParserVisitor ) return ((FibonacciParserVisitor<? extends T>)visitor).visitSino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinoContext sino() throws RecognitionException {
		SinoContext _localctx = new SinoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(PR_ELSE);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_WHILE) | (1L << PR_TIPO) | (1L << PR_IF) | (1L << IDENTIF))) != 0)) {
				{
				setState(161);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PR_TIPO:
				case IDENTIF:
					{
					setState(159);
					sentencia();
					}
					break;
				case PR_WHILE:
				case PR_IF:
					{
					setState(160);
					bifurcacion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NElemArrayContext extends ParserRuleContext {
		public TerminalNode CI() { return getToken(FibonacciParser.CI, 0); }
		public TerminalNode NUMERO() { return getToken(FibonacciParser.NUMERO, 0); }
		public TerminalNode CD() { return getToken(FibonacciParser.CD, 0); }
		public NElemArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nElemArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).enterNElemArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).exitNElemArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FibonacciParserVisitor ) return ((FibonacciParserVisitor<? extends T>)visitor).visitNElemArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NElemArrayContext nElemArray() throws RecognitionException {
		NElemArrayContext _localctx = new NElemArrayContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nElemArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(CI);
			setState(167);
			match(NUMERO);
			setState(168);
			match(CD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(FibonacciParser.PI, 0); }
		public TerminalNode PD() { return getToken(FibonacciParser.PD, 0); }
		public List<TerminalNode> NUMERO() { return getTokens(FibonacciParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(FibonacciParser.NUMERO, i);
		}
		public List<TerminalNode> COMA() { return getTokens(FibonacciParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(FibonacciParser.COMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FibonacciParserVisitor ) return ((FibonacciParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(PI);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMERO) {
				{
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(171);
						match(NUMERO);
						setState(172);
						match(COMA);
						}
						} 
					}
					setState(177);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(178);
				match(NUMERO);
				}
			}

			setState(181);
			match(PD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetornarContext extends ParserRuleContext {
		public TerminalNode PR_DEVOLVER() { return getToken(FibonacciParser.PR_DEVOLVER, 0); }
		public TerminalNode FINALSENTENCIA() { return getToken(FibonacciParser.FINALSENTENCIA, 0); }
		public TerminalNode PI() { return getToken(FibonacciParser.PI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PD() { return getToken(FibonacciParser.PD, 0); }
		public RetornarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retornar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).enterRetornar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).exitRetornar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FibonacciParserVisitor ) return ((FibonacciParserVisitor<? extends T>)visitor).visitRetornar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornarContext retornar() throws RecognitionException {
		RetornarContext _localctx = new RetornarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_retornar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(PR_DEVOLVER);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PI) {
				{
				setState(184);
				match(PI);
				setState(185);
				expr(0);
				setState(186);
				match(PD);
				}
			}

			setState(190);
			match(FINALSENTENCIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode PR_WHILE() { return getToken(FibonacciParser.PR_WHILE, 0); }
		public TerminalNode PI() { return getToken(FibonacciParser.PI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PD() { return getToken(FibonacciParser.PD, 0); }
		public TerminalNode PR_BEGIN() { return getToken(FibonacciParser.PR_BEGIN, 0); }
		public TerminalNode PR_END() { return getToken(FibonacciParser.PR_END, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<BifurcacionContext> bifurcacion() {
			return getRuleContexts(BifurcacionContext.class);
		}
		public BifurcacionContext bifurcacion(int i) {
			return getRuleContext(BifurcacionContext.class,i);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).exitMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FibonacciParserVisitor ) return ((FibonacciParserVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(PR_WHILE);
			setState(193);
			match(PI);
			setState(194);
			expr(0);
			setState(195);
			match(PD);
			setState(196);
			match(PR_BEGIN);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_WHILE) | (1L << PR_TIPO) | (1L << PR_IF) | (1L << IDENTIF))) != 0)) {
				{
				setState(199);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PR_TIPO:
				case IDENTIF:
					{
					setState(197);
					sentencia();
					}
					break;
				case PR_WHILE:
				case PR_IF:
					{
					setState(198);
					bifurcacion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			match(PR_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIF() { return getToken(FibonacciParser.IDENTIF, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FibonacciParserListener ) ((FibonacciParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FibonacciParserVisitor ) return ((FibonacciParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(IDENTIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00d3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\6\2+\n\2\r\2\16\2,\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\5\4B\n\4\3\4"+
		"\3\4\3\5\3\5\5\5H\n\5\3\6\3\6\3\6\5\6M\n\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7"+
		"U\n\7\3\7\3\7\3\7\5\7Z\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\5\nj\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nu\n\n\f\n"+
		"\16\nx\13\n\3\13\3\13\3\13\7\13}\n\13\f\13\16\13\u0080\13\13\5\13\u0082"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\7\f\u0089\n\f\f\f\16\f\u008c\13\f\5\f\u008e"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0097\n\r\f\r\16\r\u009a\13\r\3\r"+
		"\5\r\u009d\n\r\3\r\3\r\3\16\3\16\3\16\7\16\u00a4\n\16\f\16\16\16\u00a7"+
		"\13\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u00b0\n\20\f\20\16\20\u00b3"+
		"\13\20\3\20\5\20\u00b6\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00bf"+
		"\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00ca\n\22\f\22"+
		"\16\22\u00cd\13\22\3\22\3\22\3\23\3\23\3\23\2\3\22\24\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$\2\4\3\2\25\26\4\2\21\21\24\24\2\u00de\2*\3\2"+
		"\2\2\4.\3\2\2\2\6\61\3\2\2\2\bG\3\2\2\2\nL\3\2\2\2\fP\3\2\2\2\16[\3\2"+
		"\2\2\20_\3\2\2\2\22i\3\2\2\2\24\u0081\3\2\2\2\26\u008d\3\2\2\2\30\u008f"+
		"\3\2\2\2\32\u00a0\3\2\2\2\34\u00a8\3\2\2\2\36\u00ac\3\2\2\2 \u00b9\3\2"+
		"\2\2\"\u00c2\3\2\2\2$\u00d0\3\2\2\2&\'\5\4\3\2\'(\7\37\2\2(+\3\2\2\2)"+
		"+\5\6\4\2*&\3\2\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\3\3\2\2\2"+
		"./\7\b\2\2/\60\7 \2\2\60\5\3\2\2\2\61\62\7\6\2\2\62\63\7 \2\2\63\64\7"+
		"!\2\2\64\65\5\26\f\2\65\66\7\"\2\2\66\67\7\36\2\2\678\7\7\2\28=\7\3\2"+
		"\29<\5\n\6\2:<\5\b\5\2;9\3\2\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2"+
		"\2>A\3\2\2\2?=\3\2\2\2@B\5 \21\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\4\2"+
		"\2D\7\3\2\2\2EH\5\"\22\2FH\5\30\r\2GE\3\2\2\2GF\3\2\2\2H\t\3\2\2\2IM\5"+
		"\16\b\2JM\5\f\7\2KM\5\20\t\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2MN\3\2\2\2N"+
		"O\7\37\2\2O\13\3\2\2\2PQ\7\7\2\2QY\5$\23\2RS\7\27\2\2SU\5\22\n\2TR\3\2"+
		"\2\2TU\3\2\2\2UZ\3\2\2\2VW\7\35\2\2WX\7\27\2\2XZ\5\36\20\2YT\3\2\2\2Y"+
		"V\3\2\2\2Z\r\3\2\2\2[\\\5$\23\2\\]\7\27\2\2]^\5\22\n\2^\17\3\2\2\2_`\7"+
		" \2\2`a\7!\2\2ab\5\24\13\2bc\7\"\2\2c\21\3\2\2\2de\b\n\1\2ej\5\20\t\2"+
		"fj\5$\23\2gj\7$\2\2hj\7#\2\2id\3\2\2\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2j"+
		"v\3\2\2\2kl\f\7\2\2lm\t\2\2\2mu\5\22\n\bno\f\6\2\2op\t\3\2\2pu\5\22\n"+
		"\7qr\f\5\2\2rs\7\30\2\2su\5\22\n\6tk\3\2\2\2tn\3\2\2\2tq\3\2\2\2ux\3\2"+
		"\2\2vt\3\2\2\2vw\3\2\2\2w\23\3\2\2\2xv\3\2\2\2y~\5\22\n\2z{\7\32\2\2{"+
		"}\5\22\n\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0082\3"+
		"\2\2\2\u0080~\3\2\2\2\u0081y\3\2\2\2\u0081\u0082\3\2\2\2\u0082\25\3\2"+
		"\2\2\u0083\u0084\7\7\2\2\u0084\u008a\5$\23\2\u0085\u0086\7\32\2\2\u0086"+
		"\u0087\7\7\2\2\u0087\u0089\5$\23\2\u0088\u0085\3\2\2\2\u0089\u008c\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u0083\3\2\2\2\u008d\u008e\3\2\2\2\u008e\27\3\2\2"+
		"\2\u008f\u0090\7\13\2\2\u0090\u0091\7!\2\2\u0091\u0092\5\22\n\2\u0092"+
		"\u0093\7\"\2\2\u0093\u0098\7\f\2\2\u0094\u0097\5\n\6\2\u0095\u0097\5\b"+
		"\5\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009b\u009d\5\32\16\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\7\16\2\2\u009f\31\3\2\2\2\u00a0\u00a5\7\r\2"+
		"\2\u00a1\u00a4\5\n\6\2\u00a2\u00a4\5\b\5\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2"+
		"\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\33\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\33\2\2\u00a9\u00aa\7#\2"+
		"\2\u00aa\u00ab\7\34\2\2\u00ab\35\3\2\2\2\u00ac\u00b5\7!\2\2\u00ad\u00ae"+
		"\7#\2\2\u00ae\u00b0\7\32\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b4\u00b6\7#\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b8\7\"\2\2\u00b8\37\3\2\2\2\u00b9\u00be\7\t\2"+
		"\2\u00ba\u00bb\7!\2\2\u00bb\u00bc\5\22\n\2\u00bc\u00bd\7\"\2\2\u00bd\u00bf"+
		"\3\2\2\2\u00be\u00ba\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c1\7\37\2\2\u00c1!\3\2\2\2\u00c2\u00c3\7\5\2\2\u00c3\u00c4\7!\2\2"+
		"\u00c4\u00c5\5\22\n\2\u00c5\u00c6\7\"\2\2\u00c6\u00cb\7\3\2\2\u00c7\u00ca"+
		"\5\n\6\2\u00c8\u00ca\5\b\5\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7\4\2\2\u00cf#\3\2\2\2\u00d0\u00d1"+
		"\7 \2\2\u00d1%\3\2\2\2\34*,;=AGLTYitv~\u0081\u008a\u008d\u0096\u0098\u009c"+
		"\u00a3\u00a5\u00b1\u00b5\u00be\u00c9\u00cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}