// Generated from /home/sebastian/UN/lenguajes/Lenguajes2019/P4/grammar/sr.g4 by ANTLR 4.7.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, END=8, CONST=9, 
		TYPE=10, OPTYPE=11, OP=12, VAR=13, EXTEND=14, IMPORT=15, PROC=16, PROCEDURE=17, 
		T_INT=18, T_STRING=19, T_CAP=20, T_REAL=21, T_CHAR=22, T_REC=23, SSKIP=24, 
		EXIT=25, NEXT=26, IF=27, FA=28, FI=29, AF=30, CREATE=31, WRITE=32, FINAL=33, 
		GETARG=34, ASSIG=35, SWAP=36, DIFF=37, EQUAL=38, DOT=39, COLON=40, OR=41, 
		BRACE_L=42, BRACE_R=43, COMA=44, PARENT_L=45, PARENT_R=46, SEMICOLON=47, 
		EXECUTE=48, SEPARA=49, ADD_ASSIGN=50, PERCENT=51, BRACK_L=52, BRACK_R=53, 
		ROP=54, MULOP=55, SUMOP=56, BINOP=57, SINGOP=58, BINID=59, INT=60, DOUBLE=61, 
		ID_TOKEN=62, LINE_COMMENT=63, WP=64;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "END", "CONST", 
			"TYPE", "OPTYPE", "OP", "VAR", "EXTEND", "IMPORT", "PROC", "PROCEDURE", 
			"T_INT", "T_STRING", "T_CAP", "T_REAL", "T_CHAR", "T_REC", "SSKIP", "EXIT", 
			"NEXT", "IF", "FA", "FI", "AF", "CREATE", "WRITE", "FINAL", "GETARG", 
			"ASSIG", "SWAP", "DIFF", "EQUAL", "DOT", "COLON", "OR", "BRACE_L", "BRACE_R", 
			"COMA", "PARENT_L", "PARENT_R", "SEMICOLON", "EXECUTE", "SEPARA", "ADD_ASSIGN", 
			"PERCENT", "BRACK_L", "BRACK_R", "ROP", "MULOP", "SUMOP", "BINOP", "SINGOP", 
			"BINID", "INT", "DOUBLE", "ID_TOKEN", "LINE_COMMENT", "WP"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'global'", "'resource'", "'body'", "'''", "'returns'", "'b_params'", 
			"'to'", "'end'", "'const'", "'type'", "'optype'", "'op'", "'var'", "'extend'", 
			"'import'", "'proc'", "'procedure'", "'int'", "'string'", "'cap'", "'real'", 
			"'char'", "'rec'", "'skip'", "'exit'", "'next'", "'if'", "'fa'", "'fi'", 
			"'af'", "'create'", "'write'", "'final'", "'getarg'", "':='", "':=:'", 
			"'!='", "'='", "'.'", "':'", "'|'", "'['", "']'", "','", "'('", "')'", 
			"';'", "'->'", "'[]'", "'+:='", "'%'", "'{'", "'}'", null, null, null, 
			null, "'~'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "END", "CONST", "TYPE", 
			"OPTYPE", "OP", "VAR", "EXTEND", "IMPORT", "PROC", "PROCEDURE", "T_INT", 
			"T_STRING", "T_CAP", "T_REAL", "T_CHAR", "T_REC", "SSKIP", "EXIT", "NEXT", 
			"IF", "FA", "FI", "AF", "CREATE", "WRITE", "FINAL", "GETARG", "ASSIG", 
			"SWAP", "DIFF", "EQUAL", "DOT", "COLON", "OR", "BRACE_L", "BRACE_R", 
			"COMA", "PARENT_L", "PARENT_R", "SEMICOLON", "EXECUTE", "SEPARA", "ADD_ASSIGN", 
			"PERCENT", "BRACK_L", "BRACK_R", "ROP", "MULOP", "SUMOP", "BINOP", "SINGOP", 
			"BINID", "INT", "DOUBLE", "ID_TOKEN", "LINE_COMMENT", "WP"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u01a9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 "+
		"\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$"+
		"\3$\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3"+
		".\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\5\67\u0171\n\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\5"+
		"<\u0184\n<\3=\6=\u0187\n=\r=\16=\u0188\3>\6>\u018c\n>\r>\16>\u018d\3>"+
		"\3>\6>\u0192\n>\r>\16>\u0193\3?\3?\7?\u0198\n?\f?\16?\u019b\13?\3@\3@"+
		"\7@\u019f\n@\f@\16@\u01a2\13@\3@\3@\3A\3A\3A\3A\2\2B\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\3\2\13\5\2\'\',,\61\61\4\2--//\4\2((~~\3\2\62;\3\2\60\60\4\2"+
		"C\\c|\6\2\62;C\\aac|\3\2\f\f\5\2\13\f\17\17\"\"\2\u01b2\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3"+
		"\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\3\u0083\3\2\2\2\5\u008a\3\2\2\2\7"+
		"\u0093\3\2\2\2\t\u0098\3\2\2\2\13\u009a\3\2\2\2\r\u00a2\3\2\2\2\17\u00ab"+
		"\3\2\2\2\21\u00ae\3\2\2\2\23\u00b2\3\2\2\2\25\u00b8\3\2\2\2\27\u00bd\3"+
		"\2\2\2\31\u00c4\3\2\2\2\33\u00c7\3\2\2\2\35\u00cb\3\2\2\2\37\u00d2\3\2"+
		"\2\2!\u00d9\3\2\2\2#\u00de\3\2\2\2%\u00e8\3\2\2\2\'\u00ec\3\2\2\2)\u00f3"+
		"\3\2\2\2+\u00f7\3\2\2\2-\u00fc\3\2\2\2/\u0101\3\2\2\2\61\u0105\3\2\2\2"+
		"\63\u010a\3\2\2\2\65\u010f\3\2\2\2\67\u0114\3\2\2\29\u0117\3\2\2\2;\u011a"+
		"\3\2\2\2=\u011d\3\2\2\2?\u0120\3\2\2\2A\u0127\3\2\2\2C\u012d\3\2\2\2E"+
		"\u0133\3\2\2\2G\u013a\3\2\2\2I\u013d\3\2\2\2K\u0141\3\2\2\2M\u0144\3\2"+
		"\2\2O\u0146\3\2\2\2Q\u0148\3\2\2\2S\u014a\3\2\2\2U\u014c\3\2\2\2W\u014e"+
		"\3\2\2\2Y\u0150\3\2\2\2[\u0152\3\2\2\2]\u0154\3\2\2\2_\u0156\3\2\2\2a"+
		"\u0158\3\2\2\2c\u015b\3\2\2\2e\u015e\3\2\2\2g\u0162\3\2\2\2i\u0164\3\2"+
		"\2\2k\u0166\3\2\2\2m\u0170\3\2\2\2o\u0172\3\2\2\2q\u0174\3\2\2\2s\u0176"+
		"\3\2\2\2u\u0178\3\2\2\2w\u0183\3\2\2\2y\u0186\3\2\2\2{\u018b\3\2\2\2}"+
		"\u0195\3\2\2\2\177\u019c\3\2\2\2\u0081\u01a5\3\2\2\2\u0083\u0084\7i\2"+
		"\2\u0084\u0085\7n\2\2\u0085\u0086\7q\2\2\u0086\u0087\7d\2\2\u0087\u0088"+
		"\7c\2\2\u0088\u0089\7n\2\2\u0089\4\3\2\2\2\u008a\u008b\7t\2\2\u008b\u008c"+
		"\7g\2\2\u008c\u008d\7u\2\2\u008d\u008e\7q\2\2\u008e\u008f\7w\2\2\u008f"+
		"\u0090\7t\2\2\u0090\u0091\7e\2\2\u0091\u0092\7g\2\2\u0092\6\3\2\2\2\u0093"+
		"\u0094\7d\2\2\u0094\u0095\7q\2\2\u0095\u0096\7f\2\2\u0096\u0097\7{\2\2"+
		"\u0097\b\3\2\2\2\u0098\u0099\7)\2\2\u0099\n\3\2\2\2\u009a\u009b\7t\2\2"+
		"\u009b\u009c\7g\2\2\u009c\u009d\7v\2\2\u009d\u009e\7w\2\2\u009e\u009f"+
		"\7t\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7u\2\2\u00a1\f\3\2\2\2\u00a2\u00a3"+
		"\7d\2\2\u00a3\u00a4\7a\2\2\u00a4\u00a5\7r\2\2\u00a5\u00a6\7c\2\2\u00a6"+
		"\u00a7\7t\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7o\2\2\u00a9\u00aa\7u\2\2"+
		"\u00aa\16\3\2\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7q\2\2\u00ad\20\3\2\2"+
		"\2\u00ae\u00af\7g\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7f\2\2\u00b1\22\3"+
		"\2\2\2\u00b2\u00b3\7e\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7p\2\2\u00b5"+
		"\u00b6\7u\2\2\u00b6\u00b7\7v\2\2\u00b7\24\3\2\2\2\u00b8\u00b9\7v\2\2\u00b9"+
		"\u00ba\7{\2\2\u00ba\u00bb\7r\2\2\u00bb\u00bc\7g\2\2\u00bc\26\3\2\2\2\u00bd"+
		"\u00be\7q\2\2\u00be\u00bf\7r\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7{\2\2"+
		"\u00c1\u00c2\7r\2\2\u00c2\u00c3\7g\2\2\u00c3\30\3\2\2\2\u00c4\u00c5\7"+
		"q\2\2\u00c5\u00c6\7r\2\2\u00c6\32\3\2\2\2\u00c7\u00c8\7x\2\2\u00c8\u00c9"+
		"\7c\2\2\u00c9\u00ca\7t\2\2\u00ca\34\3\2\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd"+
		"\7z\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7p\2\2\u00d0"+
		"\u00d1\7f\2\2\u00d1\36\3\2\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7o\2\2\u00d4"+
		"\u00d5\7r\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7v\2\2"+
		"\u00d8 \3\2\2\2\u00d9\u00da\7r\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7q\2"+
		"\2\u00dc\u00dd\7e\2\2\u00dd\"\3\2\2\2\u00de\u00df\7r\2\2\u00df\u00e0\7"+
		"t\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4"+
		"\7f\2\2\u00e4\u00e5\7w\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7g\2\2\u00e7"+
		"$\3\2\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7v\2\2\u00eb"+
		"&\3\2\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7t\2\2\u00ef"+
		"\u00f0\7k\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7i\2\2\u00f2(\3\2\2\2\u00f3"+
		"\u00f4\7e\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7r\2\2\u00f6*\3\2\2\2\u00f7"+
		"\u00f8\7t\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7n\2\2"+
		"\u00fb,\3\2\2\2\u00fc\u00fd\7e\2\2\u00fd\u00fe\7j\2\2\u00fe\u00ff\7c\2"+
		"\2\u00ff\u0100\7t\2\2\u0100.\3\2\2\2\u0101\u0102\7t\2\2\u0102\u0103\7"+
		"g\2\2\u0103\u0104\7e\2\2\u0104\60\3\2\2\2\u0105\u0106\7u\2\2\u0106\u0107"+
		"\7m\2\2\u0107\u0108\7k\2\2\u0108\u0109\7r\2\2\u0109\62\3\2\2\2\u010a\u010b"+
		"\7g\2\2\u010b\u010c\7z\2\2\u010c\u010d\7k\2\2\u010d\u010e\7v\2\2\u010e"+
		"\64\3\2\2\2\u010f\u0110\7p\2\2\u0110\u0111\7g\2\2\u0111\u0112\7z\2\2\u0112"+
		"\u0113\7v\2\2\u0113\66\3\2\2\2\u0114\u0115\7k\2\2\u0115\u0116\7h\2\2\u0116"+
		"8\3\2\2\2\u0117\u0118\7h\2\2\u0118\u0119\7c\2\2\u0119:\3\2\2\2\u011a\u011b"+
		"\7h\2\2\u011b\u011c\7k\2\2\u011c<\3\2\2\2\u011d\u011e\7c\2\2\u011e\u011f"+
		"\7h\2\2\u011f>\3\2\2\2\u0120\u0121\7e\2\2\u0121\u0122\7t\2\2\u0122\u0123"+
		"\7g\2\2\u0123\u0124\7c\2\2\u0124\u0125\7v\2\2\u0125\u0126\7g\2\2\u0126"+
		"@\3\2\2\2\u0127\u0128\7y\2\2\u0128\u0129\7t\2\2\u0129\u012a\7k\2\2\u012a"+
		"\u012b\7v\2\2\u012b\u012c\7g\2\2\u012cB\3\2\2\2\u012d\u012e\7h\2\2\u012e"+
		"\u012f\7k\2\2\u012f\u0130\7p\2\2\u0130\u0131\7c\2\2\u0131\u0132\7n\2\2"+
		"\u0132D\3\2\2\2\u0133\u0134\7i\2\2\u0134\u0135\7g\2\2\u0135\u0136\7v\2"+
		"\2\u0136\u0137\7c\2\2\u0137\u0138\7t\2\2\u0138\u0139\7i\2\2\u0139F\3\2"+
		"\2\2\u013a\u013b\7<\2\2\u013b\u013c\7?\2\2\u013cH\3\2\2\2\u013d\u013e"+
		"\7<\2\2\u013e\u013f\7?\2\2\u013f\u0140\7<\2\2\u0140J\3\2\2\2\u0141\u0142"+
		"\7#\2\2\u0142\u0143\7?\2\2\u0143L\3\2\2\2\u0144\u0145\7?\2\2\u0145N\3"+
		"\2\2\2\u0146\u0147\7\60\2\2\u0147P\3\2\2\2\u0148\u0149\7<\2\2\u0149R\3"+
		"\2\2\2\u014a\u014b\7~\2\2\u014bT\3\2\2\2\u014c\u014d\7]\2\2\u014dV\3\2"+
		"\2\2\u014e\u014f\7_\2\2\u014fX\3\2\2\2\u0150\u0151\7.\2\2\u0151Z\3\2\2"+
		"\2\u0152\u0153\7*\2\2\u0153\\\3\2\2\2\u0154\u0155\7+\2\2\u0155^\3\2\2"+
		"\2\u0156\u0157\7=\2\2\u0157`\3\2\2\2\u0158\u0159\7/\2\2\u0159\u015a\7"+
		"@\2\2\u015ab\3\2\2\2\u015b\u015c\7]\2\2\u015c\u015d\7_\2\2\u015dd\3\2"+
		"\2\2\u015e\u015f\7-\2\2\u015f\u0160\7<\2\2\u0160\u0161\7?\2\2\u0161f\3"+
		"\2\2\2\u0162\u0163\7\'\2\2\u0163h\3\2\2\2\u0164\u0165\7}\2\2\u0165j\3"+
		"\2\2\2\u0166\u0167\7\177\2\2\u0167l\3\2\2\2\u0168\u0171\7>\2\2\u0169\u016a"+
		"\7>\2\2\u016a\u0171\7?\2\2\u016b\u016c\7@\2\2\u016c\u0171\7?\2\2\u016d"+
		"\u0171\4?@\2\u016e\u016f\7#\2\2\u016f\u0171\7?\2\2\u0170\u0168\3\2\2\2"+
		"\u0170\u0169\3\2\2\2\u0170\u016b\3\2\2\2\u0170\u016d\3\2\2\2\u0170\u016e"+
		"\3\2\2\2\u0171n\3\2\2\2\u0172\u0173\t\2\2\2\u0173p\3\2\2\2\u0174\u0175"+
		"\t\3\2\2\u0175r\3\2\2\2\u0176\u0177\t\4\2\2\u0177t\3\2\2\2\u0178\u0179"+
		"\7\u0080\2\2\u0179v\3\2\2\2\u017a\u017b\7v\2\2\u017b\u017c\7t\2\2\u017c"+
		"\u017d\7w\2\2\u017d\u0184\7g\2\2\u017e\u017f\7h\2\2\u017f\u0180\7c\2\2"+
		"\u0180\u0181\7n\2\2\u0181\u0182\7u\2\2\u0182\u0184\7g\2\2\u0183\u017a"+
		"\3\2\2\2\u0183\u017e\3\2\2\2\u0184x\3\2\2\2\u0185\u0187\t\5\2\2\u0186"+
		"\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2"+
		"\2\2\u0189z\3\2\2\2\u018a\u018c\t\5\2\2\u018b\u018a\3\2\2\2\u018c\u018d"+
		"\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0191\t\6\2\2\u0190\u0192\t\5\2\2\u0191\u0190\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194|\3\2\2\2\u0195\u0199"+
		"\t\7\2\2\u0196\u0198\t\b\2\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a~\3\2\2\2\u019b\u0199\3\2\2\2"+
		"\u019c\u01a0\7%\2\2\u019d\u019f\n\t\2\2\u019e\u019d\3\2\2\2\u019f\u01a2"+
		"\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a3\u01a4\b@\2\2\u01a4\u0080\3\2\2\2\u01a5\u01a6\t\n"+
		"\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\bA\2\2\u01a8\u0082\3\2\2\2\n\2\u0170"+
		"\u0183\u0188\u018d\u0193\u0199\u01a0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}