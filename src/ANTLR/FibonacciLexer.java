package ANTLR;// Generated from C:/Programacion/Universidad/Procesadores del lenguaje/Codigo/src\ANTLR.FibonacciLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FibonacciLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PR_BEGIN=1, PR_END=2, PR_WHILE=3, PR_FUNCTION=4, PR_TIPO=5, PR_INCLUDE=6, 
		PR_DEVOLVER=7, PR_VOID=8, PR_IF=9, PR_THEN=10, PR_ELSE=11, PR_ENDIF=12, 
		COMENTARIOBLOQUE=13, COMENTARIOLINEA=14, SUMA=15, TRUE=16, FALSE=17, RESTA=18, 
		MULT=19, DIV=20, ASIGNAR=21, OPLOGICOS=22, COMILLAS=23, COMA=24, DOSPUNTOS=25, 
		FINALSENTENCIA=26, IDENTIF=27, PI=28, PD=29, NUMERO=30, CADENA=31, TIPO_CADENA=32, 
		WS=33, NEW_LINE=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PR_BEGIN", "PR_END", "PR_WHILE", "PR_FUNCTION", "PR_TIPO", "PR_INCLUDE", 
			"PR_DEVOLVER", "PR_VOID", "PR_IF", "PR_THEN", "PR_ELSE", "PR_ENDIF", 
			"COMENTARIOBLOQUE", "COMENTARIOLINEA", "SUMA", "TRUE", "FALSE", "RESTA", 
			"MULT", "DIV", "ASIGNAR", "OPLOGICOS", "COMILLAS", "COMA", "DOSPUNTOS", 
			"FINALSENTENCIA", "IDENTIF", "PI", "PD", "NUMERO", "CADENA", "TIPO_CADENA", 
			"WS", "NEW_LINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'begin'", "'end'", "'while'", "'function'", null, "'include'", 
			"'devolver'", "'void'", "'if'", "'then'", "'else'", "'endif'", null, 
			null, "'+'", "'true'", "'false'", "'-'", "'*'", "'/'", "':='", null, 
			"'\"'", "','", "':'", "';'", null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PR_BEGIN", "PR_END", "PR_WHILE", "PR_FUNCTION", "PR_TIPO", "PR_INCLUDE", 
			"PR_DEVOLVER", "PR_VOID", "PR_IF", "PR_THEN", "PR_ELSE", "PR_ENDIF", 
			"COMENTARIOBLOQUE", "COMENTARIOLINEA", "SUMA", "TRUE", "FALSE", "RESTA", 
			"MULT", "DIV", "ASIGNAR", "OPLOGICOS", "COMILLAS", "COMA", "DOSPUNTOS", 
			"FINALSENTENCIA", "IDENTIF", "PI", "PD", "NUMERO", "CADENA", "TIPO_CADENA", 
			"WS", "NEW_LINE"
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


	public FibonacciLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FibonacciLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u012b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6m\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u009e\n\16\f\16\16\16\u00a1\13\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00ac\n\16\f\16\16\16\u00af"+
		"\13\16\3\16\3\16\3\16\5\16\u00b4\n\16\3\16\3\16\3\17\3\17\3\17\3\17\7"+
		"\17\u00bc\n\17\f\17\16\17\u00bf\13\17\3\17\3\17\3\17\3\17\3\17\7\17\u00c6"+
		"\n\17\f\17\16\17\u00c9\13\17\3\17\3\17\5\17\u00cd\n\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u00f0\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\7\34\u00fc\n\34\f\34\16\34\u00ff\13\34\5\34\u0101\n\34\3\35\3\35"+
		"\3\36\3\36\3\37\6\37\u0108\n\37\r\37\16\37\u0109\3 \3 \3 \7 \u010f\n "+
		"\f \16 \u0112\13 \3 \3 \3!\3!\3\"\6\"\u0119\n\"\r\"\16\"\u011a\3\"\3\""+
		"\6\"\u011f\n\"\r\"\16\"\u0120\5\"\u0123\n\"\3\"\3\"\3#\6#\u0128\n#\r#"+
		"\16#\u0129\7\u009f\u00ad\u00bd\u00c7\u0110\2$\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$\3\2\t\4\2>>@@"+
		"\4\2C\\c|\6\2\62;C\\aac|\3\2\62;\4\2ffuu\3\2\n\13\4\2\f\f\17\17\2\u013f"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2"+
		"\2\5M\3\2\2\2\7Q\3\2\2\2\tW\3\2\2\2\13l\3\2\2\2\rn\3\2\2\2\17v\3\2\2\2"+
		"\21\177\3\2\2\2\23\u0084\3\2\2\2\25\u0087\3\2\2\2\27\u008c\3\2\2\2\31"+
		"\u0091\3\2\2\2\33\u00b3\3\2\2\2\35\u00cc\3\2\2\2\37\u00d0\3\2\2\2!\u00d2"+
		"\3\2\2\2#\u00d7\3\2\2\2%\u00dd\3\2\2\2\'\u00df\3\2\2\2)\u00e1\3\2\2\2"+
		"+\u00e3\3\2\2\2-\u00ef\3\2\2\2/\u00f1\3\2\2\2\61\u00f3\3\2\2\2\63\u00f5"+
		"\3\2\2\2\65\u00f7\3\2\2\2\67\u00f9\3\2\2\29\u0102\3\2\2\2;\u0104\3\2\2"+
		"\2=\u0107\3\2\2\2?\u010b\3\2\2\2A\u0115\3\2\2\2C\u0122\3\2\2\2E\u0127"+
		"\3\2\2\2GH\7d\2\2HI\7g\2\2IJ\7i\2\2JK\7k\2\2KL\7p\2\2L\4\3\2\2\2MN\7g"+
		"\2\2NO\7p\2\2OP\7f\2\2P\6\3\2\2\2QR\7y\2\2RS\7j\2\2ST\7k\2\2TU\7n\2\2"+
		"UV\7g\2\2V\b\3\2\2\2WX\7h\2\2XY\7w\2\2YZ\7p\2\2Z[\7e\2\2[\\\7v\2\2\\]"+
		"\7k\2\2]^\7q\2\2^_\7p\2\2_\n\3\2\2\2`a\7p\2\2ab\7w\2\2bc\7o\2\2cd\7g\2"+
		"\2de\7t\2\2em\7q\2\2fg\7e\2\2gh\7c\2\2hi\7f\2\2ij\7g\2\2jk\7p\2\2km\7"+
		"c\2\2l`\3\2\2\2lf\3\2\2\2m\f\3\2\2\2no\7k\2\2op\7p\2\2pq\7e\2\2qr\7n\2"+
		"\2rs\7w\2\2st\7f\2\2tu\7g\2\2u\16\3\2\2\2vw\7f\2\2wx\7g\2\2xy\7x\2\2y"+
		"z\7q\2\2z{\7n\2\2{|\7x\2\2|}\7g\2\2}~\7t\2\2~\20\3\2\2\2\177\u0080\7x"+
		"\2\2\u0080\u0081\7q\2\2\u0081\u0082\7k\2\2\u0082\u0083\7f\2\2\u0083\22"+
		"\3\2\2\2\u0084\u0085\7k\2\2\u0085\u0086\7h\2\2\u0086\24\3\2\2\2\u0087"+
		"\u0088\7v\2\2\u0088\u0089\7j\2\2\u0089\u008a\7g\2\2\u008a\u008b\7p\2\2"+
		"\u008b\26\3\2\2\2\u008c\u008d\7g\2\2\u008d\u008e\7n\2\2\u008e\u008f\7"+
		"u\2\2\u008f\u0090\7g\2\2\u0090\30\3\2\2\2\u0091\u0092\7g\2\2\u0092\u0093"+
		"\7p\2\2\u0093\u0094\7f\2\2\u0094\u0095\7k\2\2\u0095\u0096\7h\2\2\u0096"+
		"\32\3\2\2\2\u0097\u0098\7\61\2\2\u0098\u0099\7,\2\2\u0099\u009a\7,\2\2"+
		"\u009a\u009b\7,\2\2\u009b\u009f\3\2\2\2\u009c\u009e\13\2\2\2\u009d\u009c"+
		"\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7,\2\2\u00a3\u00a4\7,\2"+
		"\2\u00a4\u00a5\7,\2\2\u00a5\u00b4\7\61\2\2\u00a6\u00a7\7\61\2\2\u00a7"+
		"\u00a8\7,\2\2\u00a8\u00a9\7,\2\2\u00a9\u00ad\3\2\2\2\u00aa\u00ac\13\2"+
		"\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7,"+
		"\2\2\u00b1\u00b2\7,\2\2\u00b2\u00b4\7\61\2\2\u00b3\u0097\3\2\2\2\u00b3"+
		"\u00a6\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\b\16\2\2\u00b6\34\3\2\2"+
		"\2\u00b7\u00b8\7\61\2\2\u00b8\u00b9\7\61\2\2\u00b9\u00bd\3\2\2\2\u00ba"+
		"\u00bc\13\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00be\3"+
		"\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00cd\5E#\2\u00c1\u00c2\7\61\2\2\u00c2\u00c3\7,\2\2\u00c3\u00c7\3\2\2"+
		"\2\u00c4\u00c6\13\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00ca\u00cb\7,\2\2\u00cb\u00cd\7\61\2\2\u00cc\u00b7\3\2\2\2\u00cc"+
		"\u00c1\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\b\17\2\2\u00cf\36\3\2\2"+
		"\2\u00d0\u00d1\7-\2\2\u00d1 \3\2\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7"+
		"t\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6\7g\2\2\u00d6\"\3\2\2\2\u00d7\u00d8"+
		"\7h\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7u\2\2\u00db"+
		"\u00dc\7g\2\2\u00dc$\3\2\2\2\u00dd\u00de\7/\2\2\u00de&\3\2\2\2\u00df\u00e0"+
		"\7,\2\2\u00e0(\3\2\2\2\u00e1\u00e2\7\61\2\2\u00e2*\3\2\2\2\u00e3\u00e4"+
		"\7<\2\2\u00e4\u00e5\7?\2\2\u00e5,\3\2\2\2\u00e6\u00f0\t\2\2\2\u00e7\u00e8"+
		"\7@\2\2\u00e8\u00f0\7?\2\2\u00e9\u00ea\7>\2\2\u00ea\u00f0\7?\2\2\u00eb"+
		"\u00ec\7?\2\2\u00ec\u00f0\7?\2\2\u00ed\u00ee\7#\2\2\u00ee\u00f0\7?\2\2"+
		"\u00ef\u00e6\3\2\2\2\u00ef\u00e7\3\2\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00eb"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0.\3\2\2\2\u00f1\u00f2\7$\2\2\u00f2\60"+
		"\3\2\2\2\u00f3\u00f4\7.\2\2\u00f4\62\3\2\2\2\u00f5\u00f6\7<\2\2\u00f6"+
		"\64\3\2\2\2\u00f7\u00f8\7=\2\2\u00f8\66\3\2\2\2\u00f9\u0100\t\3\2\2\u00fa"+
		"\u00fc\t\4\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100"+
		"\u00fd\3\2\2\2\u0100\u0101\3\2\2\2\u01018\3\2\2\2\u0102\u0103\7*\2\2\u0103"+
		":\3\2\2\2\u0104\u0105\7+\2\2\u0105<\3\2\2\2\u0106\u0108\t\5\2\2\u0107"+
		"\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a>\3\2\2\2\u010b\u0110\7$\2\2\u010c\u010f\5E#\2\u010d\u010f\13"+
		"\2\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0113\u0114\7$\2\2\u0114@\3\2\2\2\u0115\u0116\t\6\2\2\u0116B\3\2"+
		"\2\2\u0117\u0119\7\"\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0123\3\2\2\2\u011c\u011f\5E"+
		"#\2\u011d\u011f\t\7\2\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2"+
		"\2\2\u0122\u0118\3\2\2\2\u0122\u011e\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0125\b\"\2\2\u0125D\3\2\2\2\u0126\u0128\t\b\2\2\u0127\u0126\3\2\2\2"+
		"\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012aF\3"+
		"\2\2\2\26\2l\u009f\u00ad\u00b3\u00bd\u00c7\u00cc\u00ef\u00fb\u00fd\u0100"+
		"\u0109\u010e\u0110\u011a\u011e\u0120\u0122\u0129\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}