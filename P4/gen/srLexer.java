// Generated from /home/jimmy/UNAL/UNAL/2019-2/lenguajes/Lenguajes2019/P4/grammar/sr.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class srLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, END=36, EXPRESSION=37, ID_TOKEN=38, 
		GLOBAL=39, BODY=40, SEMI=41, LPAREN=42, RPAREN=43, LBRACK=44, COMMA=45, 
		RBRACK=46, R_ELEMENTS=47, B_PARAMS=48, CONSTANT=49, TYPE_DEC=50, TK_LPAREN=51, 
		WP=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "END", "EXPRESSION", "ID_TOKEN", "GLOBAL", "BODY", 
			"SEMI", "LPAREN", "RPAREN", "LBRACK", "COMMA", "RBRACK", "R_ELEMENTS", 
			"B_PARAMS", "CONSTANT", "TYPE_DEC", "TK_LPAREN", "WP"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'resource'", "':'", "'extend'", "'import'", "'proc'", "'procedure'", 
			"'const'", "':='", "'type'", "'='", "'optype'", "'returns'", "'op'", 
			"'var'", "'op_function'", "'op_return'", "'int'", "'string'", "'cap'", 
			"'real'", "'char'", "'rec'", "'getarg'", "'final'", "'skip'", "'exit'", 
			"'next'", "'if'", "'->'", "'fi'", "'fa'", "'to'", "'af'", "':=:'", "'+:='", 
			"'end'", null, null, "'global'", "'body'", "';'", "'('", "')'", "'['", 
			"','", "']'", "'r_elements'", "'b_params'", "'constant'", "'type_dec'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"END", "EXPRESSION", "ID_TOKEN", "GLOBAL", "BODY", "SEMI", "LPAREN", 
			"RPAREN", "LBRACK", "COMMA", "RBRACK", "R_ELEMENTS", "B_PARAMS", "CONSTANT", 
			"TYPE_DEC", "TK_LPAREN", "WP"
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


	public srLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "sr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u0194\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\6&\u0132\n&\r&\16&\u0133\3&\3&\7"+
		"&\u0138\n&\f&\16&\u013b\13&\5&\u013d\n&\3\'\6\'\u0140\n\'\r\'\16\'\u0141"+
		"\3\'\7\'\u0145\n\'\f\'\16\'\u0148\13\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\7\64\u018a\n\64\f\64\16\64\u018d\13\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66\3\2\b\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\3"+
		"\2%%\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u0199\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5t\3\2\2\2\7v\3\2\2\2\t}\3\2\2\2\13"+
		"\u0084\3\2\2\2\r\u0089\3\2\2\2\17\u0093\3\2\2\2\21\u0099\3\2\2\2\23\u009c"+
		"\3\2\2\2\25\u00a1\3\2\2\2\27\u00a3\3\2\2\2\31\u00aa\3\2\2\2\33\u00b2\3"+
		"\2\2\2\35\u00b5\3\2\2\2\37\u00b9\3\2\2\2!\u00c5\3\2\2\2#\u00cf\3\2\2\2"+
		"%\u00d3\3\2\2\2\'\u00da\3\2\2\2)\u00de\3\2\2\2+\u00e3\3\2\2\2-\u00e8\3"+
		"\2\2\2/\u00ec\3\2\2\2\61\u00f3\3\2\2\2\63\u00f9\3\2\2\2\65\u00fe\3\2\2"+
		"\2\67\u0103\3\2\2\29\u0108\3\2\2\2;\u010b\3\2\2\2=\u010e\3\2\2\2?\u0111"+
		"\3\2\2\2A\u0114\3\2\2\2C\u0117\3\2\2\2E\u011a\3\2\2\2G\u011e\3\2\2\2I"+
		"\u0122\3\2\2\2K\u013c\3\2\2\2M\u013f\3\2\2\2O\u0149\3\2\2\2Q\u0150\3\2"+
		"\2\2S\u0155\3\2\2\2U\u0157\3\2\2\2W\u0159\3\2\2\2Y\u015b\3\2\2\2[\u015d"+
		"\3\2\2\2]\u015f\3\2\2\2_\u0161\3\2\2\2a\u016c\3\2\2\2c\u0175\3\2\2\2e"+
		"\u017e\3\2\2\2g\u0187\3\2\2\2i\u0190\3\2\2\2kl\7t\2\2lm\7g\2\2mn\7u\2"+
		"\2no\7q\2\2op\7w\2\2pq\7t\2\2qr\7e\2\2rs\7g\2\2s\4\3\2\2\2tu\7<\2\2u\6"+
		"\3\2\2\2vw\7g\2\2wx\7z\2\2xy\7v\2\2yz\7g\2\2z{\7p\2\2{|\7f\2\2|\b\3\2"+
		"\2\2}~\7k\2\2~\177\7o\2\2\177\u0080\7r\2\2\u0080\u0081\7q\2\2\u0081\u0082"+
		"\7t\2\2\u0082\u0083\7v\2\2\u0083\n\3\2\2\2\u0084\u0085\7r\2\2\u0085\u0086"+
		"\7t\2\2\u0086\u0087\7q\2\2\u0087\u0088\7e\2\2\u0088\f\3\2\2\2\u0089\u008a"+
		"\7r\2\2\u008a\u008b\7t\2\2\u008b\u008c\7q\2\2\u008c\u008d\7e\2\2\u008d"+
		"\u008e\7g\2\2\u008e\u008f\7f\2\2\u008f\u0090\7w\2\2\u0090\u0091\7t\2\2"+
		"\u0091\u0092\7g\2\2\u0092\16\3\2\2\2\u0093\u0094\7e\2\2\u0094\u0095\7"+
		"q\2\2\u0095\u0096\7p\2\2\u0096\u0097\7u\2\2\u0097\u0098\7v\2\2\u0098\20"+
		"\3\2\2\2\u0099\u009a\7<\2\2\u009a\u009b\7?\2\2\u009b\22\3\2\2\2\u009c"+
		"\u009d\7v\2\2\u009d\u009e\7{\2\2\u009e\u009f\7r\2\2\u009f\u00a0\7g\2\2"+
		"\u00a0\24\3\2\2\2\u00a1\u00a2\7?\2\2\u00a2\26\3\2\2\2\u00a3\u00a4\7q\2"+
		"\2\u00a4\u00a5\7r\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7{\2\2\u00a7\u00a8"+
		"\7r\2\2\u00a8\u00a9\7g\2\2\u00a9\30\3\2\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac"+
		"\7g\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af\7t\2\2\u00af"+
		"\u00b0\7p\2\2\u00b0\u00b1\7u\2\2\u00b1\32\3\2\2\2\u00b2\u00b3\7q\2\2\u00b3"+
		"\u00b4\7r\2\2\u00b4\34\3\2\2\2\u00b5\u00b6\7x\2\2\u00b6\u00b7\7c\2\2\u00b7"+
		"\u00b8\7t\2\2\u00b8\36\3\2\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7r\2\2\u00bb"+
		"\u00bc\7a\2\2\u00bc\u00bd\7h\2\2\u00bd\u00be\7w\2\2\u00be\u00bf\7p\2\2"+
		"\u00bf\u00c0\7e\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3"+
		"\7q\2\2\u00c3\u00c4\7p\2\2\u00c4 \3\2\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7"+
		"\7r\2\2\u00c7\u00c8\7a\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7g\2\2\u00ca"+
		"\u00cb\7v\2\2\u00cb\u00cc\7w\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7p\2\2"+
		"\u00ce\"\3\2\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7v"+
		"\2\2\u00d2$\3\2\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6"+
		"\7t\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7i\2\2\u00d9"+
		"&\3\2\2\2\u00da\u00db\7e\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7r\2\2\u00dd"+
		"(\3\2\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7c\2\2\u00e1"+
		"\u00e2\7n\2\2\u00e2*\3\2\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e5\7j\2\2\u00e5"+
		"\u00e6\7c\2\2\u00e6\u00e7\7t\2\2\u00e7,\3\2\2\2\u00e8\u00e9\7t\2\2\u00e9"+
		"\u00ea\7g\2\2\u00ea\u00eb\7e\2\2\u00eb.\3\2\2\2\u00ec\u00ed\7i\2\2\u00ed"+
		"\u00ee\7g\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7t\2\2"+
		"\u00f1\u00f2\7i\2\2\u00f2\60\3\2\2\2\u00f3\u00f4\7h\2\2\u00f4\u00f5\7"+
		"k\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7n\2\2\u00f8\62"+
		"\3\2\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb\7m\2\2\u00fb\u00fc\7k\2\2\u00fc"+
		"\u00fd\7r\2\2\u00fd\64\3\2\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7z\2\2\u0100"+
		"\u0101\7k\2\2\u0101\u0102\7v\2\2\u0102\66\3\2\2\2\u0103\u0104\7p\2\2\u0104"+
		"\u0105\7g\2\2\u0105\u0106\7z\2\2\u0106\u0107\7v\2\2\u01078\3\2\2\2\u0108"+
		"\u0109\7k\2\2\u0109\u010a\7h\2\2\u010a:\3\2\2\2\u010b\u010c\7/\2\2\u010c"+
		"\u010d\7@\2\2\u010d<\3\2\2\2\u010e\u010f\7h\2\2\u010f\u0110\7k\2\2\u0110"+
		">\3\2\2\2\u0111\u0112\7h\2\2\u0112\u0113\7c\2\2\u0113@\3\2\2\2\u0114\u0115"+
		"\7v\2\2\u0115\u0116\7q\2\2\u0116B\3\2\2\2\u0117\u0118\7c\2\2\u0118\u0119"+
		"\7h\2\2\u0119D\3\2\2\2\u011a\u011b\7<\2\2\u011b\u011c\7?\2\2\u011c\u011d"+
		"\7<\2\2\u011dF\3\2\2\2\u011e\u011f\7-\2\2\u011f\u0120\7<\2\2\u0120\u0121"+
		"\7?\2\2\u0121H\3\2\2\2\u0122\u0123\7g\2\2\u0123\u0124\7p\2\2\u0124\u0125"+
		"\7f\2\2\u0125J\3\2\2\2\u0126\u0127\7g\2\2\u0127\u0128\7z\2\2\u0128\u0129"+
		"\7r\2\2\u0129\u012a\7t\2\2\u012a\u012b\7g\2\2\u012b\u012c\7u\2\2\u012c"+
		"\u012d\7u\2\2\u012d\u012e\7k\2\2\u012e\u012f\7q\2\2\u012f\u013d\7p\2\2"+
		"\u0130\u0132\t\2\2\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0139\3\2\2\2\u0135\u0136\7\60\2\2"+
		"\u0136\u0138\t\2\2\2\u0137\u0135\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013c"+
		"\u0126\3\2\2\2\u013c\u0131\3\2\2\2\u013dL\3\2\2\2\u013e\u0140\t\3\2\2"+
		"\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142"+
		"\3\2\2\2\u0142\u0146\3\2\2\2\u0143\u0145\t\4\2\2\u0144\u0143\3\2\2\2\u0145"+
		"\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147N\3\2\2\2"+
		"\u0148\u0146\3\2\2\2\u0149\u014a\7i\2\2\u014a\u014b\7n\2\2\u014b\u014c"+
		"\7q\2\2\u014c\u014d\7d\2\2\u014d\u014e\7c\2\2\u014e\u014f\7n\2\2\u014f"+
		"P\3\2\2\2\u0150\u0151\7d\2\2\u0151\u0152\7q\2\2\u0152\u0153\7f\2\2\u0153"+
		"\u0154\7{\2\2\u0154R\3\2\2\2\u0155\u0156\7=\2\2\u0156T\3\2\2\2\u0157\u0158"+
		"\7*\2\2\u0158V\3\2\2\2\u0159\u015a\7+\2\2\u015aX\3\2\2\2\u015b\u015c\7"+
		"]\2\2\u015cZ\3\2\2\2\u015d\u015e\7.\2\2\u015e\\\3\2\2\2\u015f\u0160\7"+
		"_\2\2\u0160^\3\2\2\2\u0161\u0162\7t\2\2\u0162\u0163\7a\2\2\u0163\u0164"+
		"\7g\2\2\u0164\u0165\7n\2\2\u0165\u0166\7g\2\2\u0166\u0167\7o\2\2\u0167"+
		"\u0168\7g\2\2\u0168\u0169\7p\2\2\u0169\u016a\7v\2\2\u016a\u016b\7u\2\2"+
		"\u016b`\3\2\2\2\u016c\u016d\7d\2\2\u016d\u016e\7a\2\2\u016e\u016f\7r\2"+
		"\2\u016f\u0170\7c\2\2\u0170\u0171\7t\2\2\u0171\u0172\7c\2\2\u0172\u0173"+
		"\7o\2\2\u0173\u0174\7u\2\2\u0174b\3\2\2\2\u0175\u0176\7e\2\2\u0176\u0177"+
		"\7q\2\2\u0177\u0178\7p\2\2\u0178\u0179\7u\2\2\u0179\u017a\7v\2\2\u017a"+
		"\u017b\7c\2\2\u017b\u017c\7p\2\2\u017c\u017d\7v\2\2\u017dd\3\2\2\2\u017e"+
		"\u017f\7v\2\2\u017f\u0180\7{\2\2\u0180\u0181\7r\2\2\u0181\u0182\7g\2\2"+
		"\u0182\u0183\7a\2\2\u0183\u0184\7f\2\2\u0184\u0185\7g\2\2\u0185\u0186"+
		"\7e\2\2\u0186f\3\2\2\2\u0187\u018b\t\5\2\2\u0188\u018a\t\6\2\2\u0189\u0188"+
		"\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\b\64\2\2\u018fh\3\2\2\2"+
		"\u0190\u0191\t\7\2\2\u0191\u0192\3\2\2\2\u0192\u0193\b\65\2\2\u0193j\3"+
		"\2\2\2\t\2\u0133\u0139\u013c\u0141\u0146\u018b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}