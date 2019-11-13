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
		T__31=32, T__32=33, T__33=34, END=35, EXPRESSION=36, WRITE=37, FINAL=38, 
		GETARG=39, ASSIG=40, SWAP=41, DIFF=42, EQUAL=43, DOT=44, COLON=45, ADD=46, 
		OR=47, DIV=48, MOD=49, POW=50, MULT=51, SUBS=52, BRACE_L=53, BRACE_R=54, 
		COMA=55, PARENT_L=56, PARENT_R=57, SEMICOLON=58, EXECUTE=59, SEPARA=60, 
		LESS_THAN=61, GREAT_THAN=62, LESS_EQUAL=63, GREAT_EQUAL=64, ADD_ASSIGN=65, 
		PERCENT=66, BRACK_L=67, BRACK_R=68, ID_TOKEN=69, LINE_COMMENT=70, WP=71;
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
			"T__33", "END", "EXPRESSION", "WRITE", "FINAL", "GETARG", "ASSIG", "SWAP", 
			"DIFF", "EQUAL", "DOT", "COLON", "ADD", "OR", "DIV", "MOD", "POW", "MULT", 
			"SUBS", "BRACE_L", "BRACE_R", "COMA", "PARENT_L", "PARENT_R", "SEMICOLON", 
			"EXECUTE", "SEPARA", "LESS_THAN", "GREAT_THAN", "LESS_EQUAL", "GREAT_EQUAL", 
			"ADD_ASSIGN", "PERCENT", "BRACK_L", "BRACK_R", "ID_TOKEN", "LINE_COMMENT", 
			"WP"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'global'", "'resource'", "'body'", "'extend'", "'import'", "'proc'", 
			"'procedure'", "'const'", "'type'", "'optype'", "'returns'", "'op'", 
			"'var'", "'op_function'", "'op_return'", "'b_params'", "'''", "'constant'", 
			"'type_dec'", "'int'", "'string'", "'cap'", "'real'", "'char'", "'rec'", 
			"'skip'", "'exit'", "'next'", "'if'", "'fi'", "'fa'", "'to'", "'af'", 
			"'create'", "'end'", null, "'write'", "'final'", "'getarg'", "':='", 
			"':=:'", "'!='", "'='", "'.'", "':'", "'+'", "'|'", "'/'", "'mod'", "'^'", 
			"'*'", "'-'", "'['", "']'", "','", "'('", "')'", "';'", "'->'", "'[]'", 
			"'<'", "'>'", "'<='", "'>='", "'+:='", "'%'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "END", 
			"EXPRESSION", "WRITE", "FINAL", "GETARG", "ASSIG", "SWAP", "DIFF", "EQUAL", 
			"DOT", "COLON", "ADD", "OR", "DIV", "MOD", "POW", "MULT", "SUBS", "BRACE_L", 
			"BRACE_R", "COMA", "PARENT_L", "PARENT_R", "SEMICOLON", "EXECUTE", "SEPARA", 
			"LESS_THAN", "GREAT_THAN", "LESS_EQUAL", "GREAT_EQUAL", "ADD_ASSIGN", 
			"PERCENT", "BRACK_L", "BRACK_R", "ID_TOKEN", "LINE_COMMENT", "WP"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2I\u01e7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\6%\u0169\n%\r%\16%\u016a\3%\3%\3%\7%\u0170"+
		"\n%\f%\16%\u0173\13%\5%\u0175\n%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3"+
		".\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3<\3=\3="+
		"\3=\3>\3>\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3B\3C\3C\3D\3D\3E\3E\3F\6F"+
		"\u01d1\nF\rF\16F\u01d2\3F\7F\u01d6\nF\fF\16F\u01d9\13F\3G\3G\7G\u01dd"+
		"\nG\fG\16G\u01e0\13G\3G\3G\3H\3H\3H\3H\2\2I\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\3\2\7\3\2\62;\4\2C"+
		"\\c|\6\2\62;C\\aac|\3\2\f\f\5\2\13\f\17\17\"\"\2\u01ec\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2"+
		"\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\3\u0091\3\2\2\2\5\u0098\3\2\2\2\7\u00a1\3\2\2\2\t\u00a6\3\2\2\2\13"+
		"\u00ad\3\2\2\2\r\u00b4\3\2\2\2\17\u00b9\3\2\2\2\21\u00c3\3\2\2\2\23\u00c9"+
		"\3\2\2\2\25\u00ce\3\2\2\2\27\u00d5\3\2\2\2\31\u00dd\3\2\2\2\33\u00e0\3"+
		"\2\2\2\35\u00e4\3\2\2\2\37\u00f0\3\2\2\2!\u00fa\3\2\2\2#\u0103\3\2\2\2"+
		"%\u0105\3\2\2\2\'\u010e\3\2\2\2)\u0117\3\2\2\2+\u011b\3\2\2\2-\u0122\3"+
		"\2\2\2/\u0126\3\2\2\2\61\u012b\3\2\2\2\63\u0130\3\2\2\2\65\u0134\3\2\2"+
		"\2\67\u0139\3\2\2\29\u013e\3\2\2\2;\u0143\3\2\2\2=\u0146\3\2\2\2?\u0149"+
		"\3\2\2\2A\u014c\3\2\2\2C\u014f\3\2\2\2E\u0152\3\2\2\2G\u0159\3\2\2\2I"+
		"\u0174\3\2\2\2K\u0176\3\2\2\2M\u017c\3\2\2\2O\u0182\3\2\2\2Q\u0189\3\2"+
		"\2\2S\u018c\3\2\2\2U\u0190\3\2\2\2W\u0193\3\2\2\2Y\u0195\3\2\2\2[\u0197"+
		"\3\2\2\2]\u0199\3\2\2\2_\u019b\3\2\2\2a\u019d\3\2\2\2c\u019f\3\2\2\2e"+
		"\u01a3\3\2\2\2g\u01a5\3\2\2\2i\u01a7\3\2\2\2k\u01a9\3\2\2\2m\u01ab\3\2"+
		"\2\2o\u01ad\3\2\2\2q\u01af\3\2\2\2s\u01b1\3\2\2\2u\u01b3\3\2\2\2w\u01b5"+
		"\3\2\2\2y\u01b8\3\2\2\2{\u01bb\3\2\2\2}\u01bd\3\2\2\2\177\u01bf\3\2\2"+
		"\2\u0081\u01c2\3\2\2\2\u0083\u01c5\3\2\2\2\u0085\u01c9\3\2\2\2\u0087\u01cb"+
		"\3\2\2\2\u0089\u01cd\3\2\2\2\u008b\u01d0\3\2\2\2\u008d\u01da\3\2\2\2\u008f"+
		"\u01e3\3\2\2\2\u0091\u0092\7i\2\2\u0092\u0093\7n\2\2\u0093\u0094\7q\2"+
		"\2\u0094\u0095\7d\2\2\u0095\u0096\7c\2\2\u0096\u0097\7n\2\2\u0097\4\3"+
		"\2\2\2\u0098\u0099\7t\2\2\u0099\u009a\7g\2\2\u009a\u009b\7u\2\2\u009b"+
		"\u009c\7q\2\2\u009c\u009d\7w\2\2\u009d\u009e\7t\2\2\u009e\u009f\7e\2\2"+
		"\u009f\u00a0\7g\2\2\u00a0\6\3\2\2\2\u00a1\u00a2\7d\2\2\u00a2\u00a3\7q"+
		"\2\2\u00a3\u00a4\7f\2\2\u00a4\u00a5\7{\2\2\u00a5\b\3\2\2\2\u00a6\u00a7"+
		"\7g\2\2\u00a7\u00a8\7z\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7g\2\2\u00aa"+
		"\u00ab\7p\2\2\u00ab\u00ac\7f\2\2\u00ac\n\3\2\2\2\u00ad\u00ae\7k\2\2\u00ae"+
		"\u00af\7o\2\2\u00af\u00b0\7r\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7t\2\2"+
		"\u00b2\u00b3\7v\2\2\u00b3\f\3\2\2\2\u00b4\u00b5\7r\2\2\u00b5\u00b6\7t"+
		"\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7e\2\2\u00b8\16\3\2\2\2\u00b9\u00ba"+
		"\7r\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7e\2\2\u00bd"+
		"\u00be\7g\2\2\u00be\u00bf\7f\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1\7t\2\2"+
		"\u00c1\u00c2\7g\2\2\u00c2\20\3\2\2\2\u00c3\u00c4\7e\2\2\u00c4\u00c5\7"+
		"q\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7v\2\2\u00c8\22"+
		"\3\2\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7{\2\2\u00cb\u00cc\7r\2\2\u00cc"+
		"\u00cd\7g\2\2\u00cd\24\3\2\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7r\2\2\u00d0"+
		"\u00d1\7v\2\2\u00d1\u00d2\7{\2\2\u00d2\u00d3\7r\2\2\u00d3\u00d4\7g\2\2"+
		"\u00d4\26\3\2\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7"+
		"v\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7p\2\2\u00db\u00dc"+
		"\7u\2\2\u00dc\30\3\2\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7r\2\2\u00df\32"+
		"\3\2\2\2\u00e0\u00e1\7x\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7t\2\2\u00e3"+
		"\34\3\2\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7\7a\2\2\u00e7"+
		"\u00e8\7h\2\2\u00e8\u00e9\7w\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7e\2\2"+
		"\u00eb\u00ec\7v\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef"+
		"\7p\2\2\u00ef\36\3\2\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7r\2\2\u00f2\u00f3"+
		"\7a\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7v\2\2\u00f6"+
		"\u00f7\7w\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7p\2\2\u00f9 \3\2\2\2\u00fa"+
		"\u00fb\7d\2\2\u00fb\u00fc\7a\2\2\u00fc\u00fd\7r\2\2\u00fd\u00fe\7c\2\2"+
		"\u00fe\u00ff\7t\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7o\2\2\u0101\u0102"+
		"\7u\2\2\u0102\"\3\2\2\2\u0103\u0104\7)\2\2\u0104$\3\2\2\2\u0105\u0106"+
		"\7e\2\2\u0106\u0107\7q\2\2\u0107\u0108\7p\2\2\u0108\u0109\7u\2\2\u0109"+
		"\u010a\7v\2\2\u010a\u010b\7c\2\2\u010b\u010c\7p\2\2\u010c\u010d\7v\2\2"+
		"\u010d&\3\2\2\2\u010e\u010f\7v\2\2\u010f\u0110\7{\2\2\u0110\u0111\7r\2"+
		"\2\u0111\u0112\7g\2\2\u0112\u0113\7a\2\2\u0113\u0114\7f\2\2\u0114\u0115"+
		"\7g\2\2\u0115\u0116\7e\2\2\u0116(\3\2\2\2\u0117\u0118\7k\2\2\u0118\u0119"+
		"\7p\2\2\u0119\u011a\7v\2\2\u011a*\3\2\2\2\u011b\u011c\7u\2\2\u011c\u011d"+
		"\7v\2\2\u011d\u011e\7t\2\2\u011e\u011f\7k\2\2\u011f\u0120\7p\2\2\u0120"+
		"\u0121\7i\2\2\u0121,\3\2\2\2\u0122\u0123\7e\2\2\u0123\u0124\7c\2\2\u0124"+
		"\u0125\7r\2\2\u0125.\3\2\2\2\u0126\u0127\7t\2\2\u0127\u0128\7g\2\2\u0128"+
		"\u0129\7c\2\2\u0129\u012a\7n\2\2\u012a\60\3\2\2\2\u012b\u012c\7e\2\2\u012c"+
		"\u012d\7j\2\2\u012d\u012e\7c\2\2\u012e\u012f\7t\2\2\u012f\62\3\2\2\2\u0130"+
		"\u0131\7t\2\2\u0131\u0132\7g\2\2\u0132\u0133\7e\2\2\u0133\64\3\2\2\2\u0134"+
		"\u0135\7u\2\2\u0135\u0136\7m\2\2\u0136\u0137\7k\2\2\u0137\u0138\7r\2\2"+
		"\u0138\66\3\2\2\2\u0139\u013a\7g\2\2\u013a\u013b\7z\2\2\u013b\u013c\7"+
		"k\2\2\u013c\u013d\7v\2\2\u013d8\3\2\2\2\u013e\u013f\7p\2\2\u013f\u0140"+
		"\7g\2\2\u0140\u0141\7z\2\2\u0141\u0142\7v\2\2\u0142:\3\2\2\2\u0143\u0144"+
		"\7k\2\2\u0144\u0145\7h\2\2\u0145<\3\2\2\2\u0146\u0147\7h\2\2\u0147\u0148"+
		"\7k\2\2\u0148>\3\2\2\2\u0149\u014a\7h\2\2\u014a\u014b\7c\2\2\u014b@\3"+
		"\2\2\2\u014c\u014d\7v\2\2\u014d\u014e\7q\2\2\u014eB\3\2\2\2\u014f\u0150"+
		"\7c\2\2\u0150\u0151\7h\2\2\u0151D\3\2\2\2\u0152\u0153\7e\2\2\u0153\u0154"+
		"\7t\2\2\u0154\u0155\7g\2\2\u0155\u0156\7c\2\2\u0156\u0157\7v\2\2\u0157"+
		"\u0158\7g\2\2\u0158F\3\2\2\2\u0159\u015a\7g\2\2\u015a\u015b\7p\2\2\u015b"+
		"\u015c\7f\2\2\u015cH\3\2\2\2\u015d\u015e\7g\2\2\u015e\u015f\7z\2\2\u015f"+
		"\u0160\7r\2\2\u0160\u0161\7t\2\2\u0161\u0162\7g\2\2\u0162\u0163\7u\2\2"+
		"\u0163\u0164\7u\2\2\u0164\u0165\7k\2\2\u0165\u0166\7q\2\2\u0166\u0175"+
		"\7p\2\2\u0167\u0169\t\2\2\2\u0168\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0171\3\2\2\2\u016c\u016d\5Y"+
		"-\2\u016d\u016e\t\2\2\2\u016e\u0170\3\2\2\2\u016f\u016c\3\2\2\2\u0170"+
		"\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0175\3\2"+
		"\2\2\u0173\u0171\3\2\2\2\u0174\u015d\3\2\2\2\u0174\u0168\3\2\2\2\u0175"+
		"J\3\2\2\2\u0176\u0177\7y\2\2\u0177\u0178\7t\2\2\u0178\u0179\7k\2\2\u0179"+
		"\u017a\7v\2\2\u017a\u017b\7g\2\2\u017bL\3\2\2\2\u017c\u017d\7h\2\2\u017d"+
		"\u017e\7k\2\2\u017e\u017f\7p\2\2\u017f\u0180\7c\2\2\u0180\u0181\7n\2\2"+
		"\u0181N\3\2\2\2\u0182\u0183\7i\2\2\u0183\u0184\7g\2\2\u0184\u0185\7v\2"+
		"\2\u0185\u0186\7c\2\2\u0186\u0187\7t\2\2\u0187\u0188\7i\2\2\u0188P\3\2"+
		"\2\2\u0189\u018a\7<\2\2\u018a\u018b\7?\2\2\u018bR\3\2\2\2\u018c\u018d"+
		"\7<\2\2\u018d\u018e\7?\2\2\u018e\u018f\7<\2\2\u018fT\3\2\2\2\u0190\u0191"+
		"\7#\2\2\u0191\u0192\7?\2\2\u0192V\3\2\2\2\u0193\u0194\7?\2\2\u0194X\3"+
		"\2\2\2\u0195\u0196\7\60\2\2\u0196Z\3\2\2\2\u0197\u0198\7<\2\2\u0198\\"+
		"\3\2\2\2\u0199\u019a\7-\2\2\u019a^\3\2\2\2\u019b\u019c\7~\2\2\u019c`\3"+
		"\2\2\2\u019d\u019e\7\61\2\2\u019eb\3\2\2\2\u019f\u01a0\7o\2\2\u01a0\u01a1"+
		"\7q\2\2\u01a1\u01a2\7f\2\2\u01a2d\3\2\2\2\u01a3\u01a4\7`\2\2\u01a4f\3"+
		"\2\2\2\u01a5\u01a6\7,\2\2\u01a6h\3\2\2\2\u01a7\u01a8\7/\2\2\u01a8j\3\2"+
		"\2\2\u01a9\u01aa\7]\2\2\u01aal\3\2\2\2\u01ab\u01ac\7_\2\2\u01acn\3\2\2"+
		"\2\u01ad\u01ae\7.\2\2\u01aep\3\2\2\2\u01af\u01b0\7*\2\2\u01b0r\3\2\2\2"+
		"\u01b1\u01b2\7+\2\2\u01b2t\3\2\2\2\u01b3\u01b4\7=\2\2\u01b4v\3\2\2\2\u01b5"+
		"\u01b6\7/\2\2\u01b6\u01b7\7@\2\2\u01b7x\3\2\2\2\u01b8\u01b9\7]\2\2\u01b9"+
		"\u01ba\7_\2\2\u01baz\3\2\2\2\u01bb\u01bc\7>\2\2\u01bc|\3\2\2\2\u01bd\u01be"+
		"\7@\2\2\u01be~\3\2\2\2\u01bf\u01c0\7>\2\2\u01c0\u01c1\7?\2\2\u01c1\u0080"+
		"\3\2\2\2\u01c2\u01c3\7@\2\2\u01c3\u01c4\7?\2\2\u01c4\u0082\3\2\2\2\u01c5"+
		"\u01c6\7-\2\2\u01c6\u01c7\7<\2\2\u01c7\u01c8\7?\2\2\u01c8\u0084\3\2\2"+
		"\2\u01c9\u01ca\7\'\2\2\u01ca\u0086\3\2\2\2\u01cb\u01cc\7}\2\2\u01cc\u0088"+
		"\3\2\2\2\u01cd\u01ce\7\177\2\2\u01ce\u008a\3\2\2\2\u01cf\u01d1\t\3\2\2"+
		"\u01d0\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3"+
		"\3\2\2\2\u01d3\u01d7\3\2\2\2\u01d4\u01d6\t\4\2\2\u01d5\u01d4\3\2\2\2\u01d6"+
		"\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u008c\3\2"+
		"\2\2\u01d9\u01d7\3\2\2\2\u01da\u01de\7%\2\2\u01db\u01dd\n\5\2\2\u01dc"+
		"\u01db\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2"+
		"\2\2\u01df\u01e1\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\bG\2\2\u01e2"+
		"\u008e\3\2\2\2\u01e3\u01e4\t\6\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\bH"+
		"\2\2\u01e6\u0090\3\2\2\2\t\2\u016a\u0171\u0174\u01d2\u01d7\u01de\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}