// Generated from C:/Programacion/Universidad/Procesadores del lenguaje/Codigo/src\FibonacciLexer.g4 by ANTLR 4.7.2
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
		MULT=19, DIV=20, ASIGNAR=21, OPLOGICOS=22, COMILLAS=23, COMA=24, CI=25, 
		CD=26, NUM_ELEM_ARRAY=27, DOSPUNTOS=28, FINALSENTENCIA=29, IDENTIF=30, 
		PI=31, PD=32, NUMERO=33, CADENA=34, TIPO_CADENA=35, WS=36, NEW_LINE=37;
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
			"MULT", "DIV", "ASIGNAR", "OPLOGICOS", "COMILLAS", "COMA", "CI", "CD", 
			"NUM_ELEM_ARRAY", "DOSPUNTOS", "FINALSENTENCIA", "IDENTIF", "PI", "PD", 
			"NUMERO", "CADENA", "TIPO_CADENA", "WS", "NEW_LINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0139\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6s\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00a4\n\16\f\16\16\16"+
		"\u00a7\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00b2\n"+
		"\16\f\16\16\16\u00b5\13\16\3\16\3\16\3\16\5\16\u00ba\n\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\7\17\u00c2\n\17\f\17\16\17\u00c5\13\17\3\17\3\17\3"+
		"\17\3\17\3\17\7\17\u00cc\n\17\f\17\16\17\u00cf\13\17\3\17\3\17\5\17\u00d3"+
		"\n\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00f6\n\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\7\37"+
		"\u010a\n\37\f\37\16\37\u010d\13\37\5\37\u010f\n\37\3 \3 \3!\3!\3\"\6\""+
		"\u0116\n\"\r\"\16\"\u0117\3#\3#\3#\7#\u011d\n#\f#\16#\u0120\13#\3#\3#"+
		"\3$\3$\3%\6%\u0127\n%\r%\16%\u0128\3%\3%\6%\u012d\n%\r%\16%\u012e\5%\u0131"+
		"\n%\3%\3%\3&\6&\u0136\n&\r&\16&\u0137\7\u00a5\u00b3\u00c3\u00cd\u011e"+
		"\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'\3\2\t\4\2>>@@\4\2C\\c|\6\2\62;C\\aac|\3\2\62;\4"+
		"\2ffuu\3\2\n\13\4\2\f\f\17\17\2\u014d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2"+
		"\2\5S\3\2\2\2\7W\3\2\2\2\t]\3\2\2\2\13r\3\2\2\2\rt\3\2\2\2\17|\3\2\2\2"+
		"\21\u0085\3\2\2\2\23\u008a\3\2\2\2\25\u008d\3\2\2\2\27\u0092\3\2\2\2\31"+
		"\u0097\3\2\2\2\33\u00b9\3\2\2\2\35\u00d2\3\2\2\2\37\u00d6\3\2\2\2!\u00d8"+
		"\3\2\2\2#\u00dd\3\2\2\2%\u00e3\3\2\2\2\'\u00e5\3\2\2\2)\u00e7\3\2\2\2"+
		"+\u00e9\3\2\2\2-\u00f5\3\2\2\2/\u00f7\3\2\2\2\61\u00f9\3\2\2\2\63\u00fb"+
		"\3\2\2\2\65\u00fd\3\2\2\2\67\u00ff\3\2\2\29\u0103\3\2\2\2;\u0105\3\2\2"+
		"\2=\u0107\3\2\2\2?\u0110\3\2\2\2A\u0112\3\2\2\2C\u0115\3\2\2\2E\u0119"+
		"\3\2\2\2G\u0123\3\2\2\2I\u0130\3\2\2\2K\u0135\3\2\2\2MN\7d\2\2NO\7g\2"+
		"\2OP\7i\2\2PQ\7k\2\2QR\7p\2\2R\4\3\2\2\2ST\7g\2\2TU\7p\2\2UV\7f\2\2V\6"+
		"\3\2\2\2WX\7y\2\2XY\7j\2\2YZ\7k\2\2Z[\7n\2\2[\\\7g\2\2\\\b\3\2\2\2]^\7"+
		"h\2\2^_\7w\2\2_`\7p\2\2`a\7e\2\2ab\7v\2\2bc\7k\2\2cd\7q\2\2de\7p\2\2e"+
		"\n\3\2\2\2fg\7p\2\2gh\7w\2\2hi\7o\2\2ij\7g\2\2jk\7t\2\2ks\7q\2\2lm\7e"+
		"\2\2mn\7c\2\2no\7f\2\2op\7g\2\2pq\7p\2\2qs\7c\2\2rf\3\2\2\2rl\3\2\2\2"+
		"s\f\3\2\2\2tu\7k\2\2uv\7p\2\2vw\7e\2\2wx\7n\2\2xy\7w\2\2yz\7f\2\2z{\7"+
		"g\2\2{\16\3\2\2\2|}\7f\2\2}~\7g\2\2~\177\7x\2\2\177\u0080\7q\2\2\u0080"+
		"\u0081\7n\2\2\u0081\u0082\7x\2\2\u0082\u0083\7g\2\2\u0083\u0084\7t\2\2"+
		"\u0084\20\3\2\2\2\u0085\u0086\7x\2\2\u0086\u0087\7q\2\2\u0087\u0088\7"+
		"k\2\2\u0088\u0089\7f\2\2\u0089\22\3\2\2\2\u008a\u008b\7k\2\2\u008b\u008c"+
		"\7h\2\2\u008c\24\3\2\2\2\u008d\u008e\7v\2\2\u008e\u008f\7j\2\2\u008f\u0090"+
		"\7g\2\2\u0090\u0091\7p\2\2\u0091\26\3\2\2\2\u0092\u0093\7g\2\2\u0093\u0094"+
		"\7n\2\2\u0094\u0095\7u\2\2\u0095\u0096\7g\2\2\u0096\30\3\2\2\2\u0097\u0098"+
		"\7g\2\2\u0098\u0099\7p\2\2\u0099\u009a\7f\2\2\u009a\u009b\7k\2\2\u009b"+
		"\u009c\7h\2\2\u009c\32\3\2\2\2\u009d\u009e\7\61\2\2\u009e\u009f\7,\2\2"+
		"\u009f\u00a0\7,\2\2\u00a0\u00a1\7,\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a4"+
		"\13\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a6\3\2\2\2"+
		"\u00a5\u00a3\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9"+
		"\7,\2\2\u00a9\u00aa\7,\2\2\u00aa\u00ab\7,\2\2\u00ab\u00ba\7\61\2\2\u00ac"+
		"\u00ad\7\61\2\2\u00ad\u00ae\7,\2\2\u00ae\u00af\7,\2\2\u00af\u00b3\3\2"+
		"\2\2\u00b0\u00b2\13\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b6\u00b7\7,\2\2\u00b7\u00b8\7,\2\2\u00b8\u00ba\7\61\2\2\u00b9"+
		"\u009d\3\2\2\2\u00b9\u00ac\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\b\16"+
		"\2\2\u00bc\34\3\2\2\2\u00bd\u00be\7\61\2\2\u00be\u00bf\7\61\2\2\u00bf"+
		"\u00c3\3\2\2\2\u00c0\u00c2\13\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3"+
		"\2\2\2\u00c3\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c6\u00d3\5K&\2\u00c7\u00c8\7\61\2\2\u00c8\u00c9\7,\2"+
		"\2\u00c9\u00cd\3\2\2\2\u00ca\u00cc\13\2\2\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d0\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7,\2\2\u00d1\u00d3\7\61\2\2\u00d2"+
		"\u00bd\3\2\2\2\u00d2\u00c7\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\b\17"+
		"\2\2\u00d5\36\3\2\2\2\u00d6\u00d7\7-\2\2\u00d7 \3\2\2\2\u00d8\u00d9\7"+
		"v\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7w\2\2\u00db\u00dc\7g\2\2\u00dc\""+
		"\3\2\2\2\u00dd\u00de\7h\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7n\2\2\u00e0"+
		"\u00e1\7u\2\2\u00e1\u00e2\7g\2\2\u00e2$\3\2\2\2\u00e3\u00e4\7/\2\2\u00e4"+
		"&\3\2\2\2\u00e5\u00e6\7,\2\2\u00e6(\3\2\2\2\u00e7\u00e8\7\61\2\2\u00e8"+
		"*\3\2\2\2\u00e9\u00ea\7<\2\2\u00ea\u00eb\7?\2\2\u00eb,\3\2\2\2\u00ec\u00f6"+
		"\t\2\2\2\u00ed\u00ee\7@\2\2\u00ee\u00f6\7?\2\2\u00ef\u00f0\7>\2\2\u00f0"+
		"\u00f6\7?\2\2\u00f1\u00f2\7?\2\2\u00f2\u00f6\7?\2\2\u00f3\u00f4\7#\2\2"+
		"\u00f4\u00f6\7?\2\2\u00f5\u00ec\3\2\2\2\u00f5\u00ed\3\2\2\2\u00f5\u00ef"+
		"\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6.\3\2\2\2\u00f7"+
		"\u00f8\7$\2\2\u00f8\60\3\2\2\2\u00f9\u00fa\7.\2\2\u00fa\62\3\2\2\2\u00fb"+
		"\u00fc\7]\2\2\u00fc\64\3\2\2\2\u00fd\u00fe\7_\2\2\u00fe\66\3\2\2\2\u00ff"+
		"\u0100\5\63\32\2\u0100\u0101\5C\"\2\u0101\u0102\5\65\33\2\u01028\3\2\2"+
		"\2\u0103\u0104\7<\2\2\u0104:\3\2\2\2\u0105\u0106\7=\2\2\u0106<\3\2\2\2"+
		"\u0107\u010e\t\3\2\2\u0108\u010a\t\4\2\2\u0109\u0108\3\2\2\2\u010a\u010d"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010f\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u010b\3\2\2\2\u010e\u010f\3\2\2\2\u010f>\3\2\2\2"+
		"\u0110\u0111\7*\2\2\u0111@\3\2\2\2\u0112\u0113\7+\2\2\u0113B\3\2\2\2\u0114"+
		"\u0116\t\5\2\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118D\3\2\2\2\u0119\u011e\7$\2\2\u011a\u011d"+
		"\5K&\2\u011b\u011d\13\2\2\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d"+
		"\u0120\3\2\2\2\u011e\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0121\3\2"+
		"\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7$\2\2\u0122F\3\2\2\2\u0123\u0124"+
		"\t\6\2\2\u0124H\3\2\2\2\u0125\u0127\7\"\2\2\u0126\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0131\3\2"+
		"\2\2\u012a\u012d\5K&\2\u012b\u012d\t\7\2\2\u012c\u012a\3\2\2\2\u012c\u012b"+
		"\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0131\3\2\2\2\u0130\u0126\3\2\2\2\u0130\u012c\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u0132\u0133\b%\2\2\u0133J\3\2\2\2\u0134\u0136\t\b\2\2\u0135\u0134"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"L\3\2\2\2\26\2r\u00a5\u00b3\u00b9\u00c3\u00cd\u00d2\u00f5\u0109\u010b"+
		"\u010e\u0117\u011c\u011e\u0128\u012c\u012e\u0130\u0137\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}