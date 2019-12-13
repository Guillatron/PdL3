package ANTLR;// Generated from C:/Programacion/Universidad/Procesadores del lenguaje/Codigo/src\FibonacciLexer.g4 by ANTLR 4.7.2
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u013d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6w\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00a8"+
		"\n\16\f\16\16\16\u00ab\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\7\16\u00b6\n\16\f\16\16\16\u00b9\13\16\3\16\3\16\3\16\5\16\u00be\n"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00c6\n\17\f\17\16\17\u00c9\13"+
		"\17\3\17\3\17\3\17\3\17\3\17\7\17\u00d0\n\17\f\17\16\17\u00d3\13\17\3"+
		"\17\3\17\5\17\u00d7\n\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00fa\n\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\7\37\u010e\n\37\f\37\16\37\u0111\13\37\5\37\u0113\n\37"+
		"\3 \3 \3!\3!\3\"\6\"\u011a\n\"\r\"\16\"\u011b\3#\3#\3#\7#\u0121\n#\f#"+
		"\16#\u0124\13#\3#\3#\3$\3$\3%\6%\u012b\n%\r%\16%\u012c\3%\3%\6%\u0131"+
		"\n%\r%\16%\u0132\5%\u0135\n%\3%\3%\3&\6&\u013a\n&\r&\16&\u013b\7\u00a9"+
		"\u00b7\u00c7\u00d1\u0122\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\t\4\2>>@@\4\2C\\c"+
		"|\6\2\62;C\\aac|\3\2\62;\4\2ffuu\3\2\n\13\4\2\f\f\17\17\2\u0152\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5S\3\2\2\2\7W\3\2\2\2\t]\3\2\2\2\13v\3"+
		"\2\2\2\rx\3\2\2\2\17\u0080\3\2\2\2\21\u0089\3\2\2\2\23\u008e\3\2\2\2\25"+
		"\u0091\3\2\2\2\27\u0096\3\2\2\2\31\u009b\3\2\2\2\33\u00bd\3\2\2\2\35\u00d6"+
		"\3\2\2\2\37\u00da\3\2\2\2!\u00dc\3\2\2\2#\u00e1\3\2\2\2%\u00e7\3\2\2\2"+
		"\'\u00e9\3\2\2\2)\u00eb\3\2\2\2+\u00ed\3\2\2\2-\u00f9\3\2\2\2/\u00fb\3"+
		"\2\2\2\61\u00fd\3\2\2\2\63\u00ff\3\2\2\2\65\u0101\3\2\2\2\67\u0103\3\2"+
		"\2\29\u0107\3\2\2\2;\u0109\3\2\2\2=\u010b\3\2\2\2?\u0114\3\2\2\2A\u0116"+
		"\3\2\2\2C\u0119\3\2\2\2E\u011d\3\2\2\2G\u0127\3\2\2\2I\u0134\3\2\2\2K"+
		"\u0139\3\2\2\2MN\7d\2\2NO\7g\2\2OP\7i\2\2PQ\7k\2\2QR\7p\2\2R\4\3\2\2\2"+
		"ST\7g\2\2TU\7p\2\2UV\7f\2\2V\6\3\2\2\2WX\7y\2\2XY\7j\2\2YZ\7k\2\2Z[\7"+
		"n\2\2[\\\7g\2\2\\\b\3\2\2\2]^\7h\2\2^_\7w\2\2_`\7p\2\2`a\7e\2\2ab\7v\2"+
		"\2bc\7k\2\2cd\7q\2\2de\7p\2\2e\n\3\2\2\2fg\7p\2\2gh\7w\2\2hi\7o\2\2ij"+
		"\7g\2\2jk\7t\2\2kw\7q\2\2lm\7e\2\2mn\7c\2\2no\7f\2\2op\7g\2\2pq\7p\2\2"+
		"qw\7c\2\2rs\7x\2\2st\7q\2\2tu\7k\2\2uw\7f\2\2vf\3\2\2\2vl\3\2\2\2vr\3"+
		"\2\2\2w\f\3\2\2\2xy\7k\2\2yz\7p\2\2z{\7e\2\2{|\7n\2\2|}\7w\2\2}~\7f\2"+
		"\2~\177\7g\2\2\177\16\3\2\2\2\u0080\u0081\7f\2\2\u0081\u0082\7g\2\2\u0082"+
		"\u0083\7x\2\2\u0083\u0084\7q\2\2\u0084\u0085\7n\2\2\u0085\u0086\7x\2\2"+
		"\u0086\u0087\7g\2\2\u0087\u0088\7t\2\2\u0088\20\3\2\2\2\u0089\u008a\7"+
		"x\2\2\u008a\u008b\7q\2\2\u008b\u008c\7k\2\2\u008c\u008d\7f\2\2\u008d\22"+
		"\3\2\2\2\u008e\u008f\7k\2\2\u008f\u0090\7h\2\2\u0090\24\3\2\2\2\u0091"+
		"\u0092\7v\2\2\u0092\u0093\7j\2\2\u0093\u0094\7g\2\2\u0094\u0095\7p\2\2"+
		"\u0095\26\3\2\2\2\u0096\u0097\7g\2\2\u0097\u0098\7n\2\2\u0098\u0099\7"+
		"u\2\2\u0099\u009a\7g\2\2\u009a\30\3\2\2\2\u009b\u009c\7g\2\2\u009c\u009d"+
		"\7p\2\2\u009d\u009e\7f\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7h\2\2\u00a0"+
		"\32\3\2\2\2\u00a1\u00a2\7\61\2\2\u00a2\u00a3\7,\2\2\u00a3\u00a4\7,\2\2"+
		"\u00a4\u00a5\7,\2\2\u00a5\u00a9\3\2\2\2\u00a6\u00a8\13\2\2\2\u00a7\u00a6"+
		"\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7,\2\2\u00ad\u00ae\7,\2"+
		"\2\u00ae\u00af\7,\2\2\u00af\u00be\7\61\2\2\u00b0\u00b1\7\61\2\2\u00b1"+
		"\u00b2\7,\2\2\u00b2\u00b3\7,\2\2\u00b3\u00b7\3\2\2\2\u00b4\u00b6\13\2"+
		"\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7,"+
		"\2\2\u00bb\u00bc\7,\2\2\u00bc\u00be\7\61\2\2\u00bd\u00a1\3\2\2\2\u00bd"+
		"\u00b0\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\b\16\2\2\u00c0\34\3\2\2"+
		"\2\u00c1\u00c2\7\61\2\2\u00c2\u00c3\7\61\2\2\u00c3\u00c7\3\2\2\2\u00c4"+
		"\u00c6\13\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c8\3"+
		"\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\u00d7\5K&\2\u00cb\u00cc\7\61\2\2\u00cc\u00cd\7,\2\2\u00cd\u00d1\3\2\2"+
		"\2\u00ce\u00d0\13\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d4\u00d5\7,\2\2\u00d5\u00d7\7\61\2\2\u00d6\u00c1\3\2\2\2\u00d6"+
		"\u00cb\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\b\17\2\2\u00d9\36\3\2\2"+
		"\2\u00da\u00db\7-\2\2\u00db \3\2\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7"+
		"t\2\2\u00de\u00df\7w\2\2\u00df\u00e0\7g\2\2\u00e0\"\3\2\2\2\u00e1\u00e2"+
		"\7h\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7u\2\2\u00e5"+
		"\u00e6\7g\2\2\u00e6$\3\2\2\2\u00e7\u00e8\7/\2\2\u00e8&\3\2\2\2\u00e9\u00ea"+
		"\7,\2\2\u00ea(\3\2\2\2\u00eb\u00ec\7\61\2\2\u00ec*\3\2\2\2\u00ed\u00ee"+
		"\7<\2\2\u00ee\u00ef\7?\2\2\u00ef,\3\2\2\2\u00f0\u00fa\t\2\2\2\u00f1\u00f2"+
		"\7@\2\2\u00f2\u00fa\7?\2\2\u00f3\u00f4\7>\2\2\u00f4\u00fa\7?\2\2\u00f5"+
		"\u00f6\7?\2\2\u00f6\u00fa\7?\2\2\u00f7\u00f8\7#\2\2\u00f8\u00fa\7?\2\2"+
		"\u00f9\u00f0\3\2\2\2\u00f9\u00f1\3\2\2\2\u00f9\u00f3\3\2\2\2\u00f9\u00f5"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa.\3\2\2\2\u00fb\u00fc\7$\2\2\u00fc\60"+
		"\3\2\2\2\u00fd\u00fe\7.\2\2\u00fe\62\3\2\2\2\u00ff\u0100\7]\2\2\u0100"+
		"\64\3\2\2\2\u0101\u0102\7_\2\2\u0102\66\3\2\2\2\u0103\u0104\5\63\32\2"+
		"\u0104\u0105\5C\"\2\u0105\u0106\5\65\33\2\u01068\3\2\2\2\u0107\u0108\7"+
		"<\2\2\u0108:\3\2\2\2\u0109\u010a\7=\2\2\u010a<\3\2\2\2\u010b\u0112\t\3"+
		"\2\2\u010c\u010e\t\4\2\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0112\u010f\3\2\2\2\u0112\u0113\3\2\2\2\u0113>\3\2\2\2\u0114\u0115"+
		"\7*\2\2\u0115@\3\2\2\2\u0116\u0117\7+\2\2\u0117B\3\2\2\2\u0118\u011a\t"+
		"\5\2\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011cD\3\2\2\2\u011d\u0122\7$\2\2\u011e\u0121\5K&\2\u011f"+
		"\u0121\13\2\2\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\u0124\3"+
		"\2\2\2\u0122\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0125\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0125\u0126\7$\2\2\u0126F\3\2\2\2\u0127\u0128\t\6\2\2\u0128"+
		"H\3\2\2\2\u0129\u012b\7\"\2\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2\2"+
		"\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0135\3\2\2\2\u012e\u0131"+
		"\5K&\2\u012f\u0131\t\7\2\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2"+
		"\2\2\u0134\u012a\3\2\2\2\u0134\u0130\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\b%\2\2\u0137J\3\2\2\2\u0138\u013a\t\b\2\2\u0139\u0138\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013cL\3\2\2\2"+
		"\26\2v\u00a9\u00b7\u00bd\u00c7\u00d1\u00d6\u00f9\u010d\u010f\u0112\u011b"+
		"\u0120\u0122\u012c\u0130\u0132\u0134\u013b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}