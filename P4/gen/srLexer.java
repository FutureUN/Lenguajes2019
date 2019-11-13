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
		PERCENT=66, BRACK_L=67, BRACK_R=68, ID_TOKEN=69, WP=70;
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
			"ADD_ASSIGN", "PERCENT", "BRACK_L", "BRACK_R", "ID_TOKEN", "WP"
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
			"PERCENT", "BRACK_L", "BRACK_R", "ID_TOKEN", "WP"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2H\u01dc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\6%\u0167\n%\r%\16%\u0168\3%\3%\3%\7%\u016e"+
		"\n%\f%\16%\u0171\13%\5%\u0173\n%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3"+
		".\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3<\3=\3="+
		"\3=\3>\3>\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3B\3C\3C\3D\3D\3E\3E\3F\6F"+
		"\u01cf\nF\rF\16F\u01d0\3F\7F\u01d4\nF\fF\16F\u01d7\13F\3G\3G\3G\3G\2\2"+
		"H\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH"+
		"\3\2\6\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u01e0\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3"+
		"\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\3\u008f\3\2\2\2\5\u0096\3\2\2\2\7\u009f\3\2\2\2\t\u00a4\3\2\2\2\13"+
		"\u00ab\3\2\2\2\r\u00b2\3\2\2\2\17\u00b7\3\2\2\2\21\u00c1\3\2\2\2\23\u00c7"+
		"\3\2\2\2\25\u00cc\3\2\2\2\27\u00d3\3\2\2\2\31\u00db\3\2\2\2\33\u00de\3"+
		"\2\2\2\35\u00e2\3\2\2\2\37\u00ee\3\2\2\2!\u00f8\3\2\2\2#\u0101\3\2\2\2"+
		"%\u0103\3\2\2\2\'\u010c\3\2\2\2)\u0115\3\2\2\2+\u0119\3\2\2\2-\u0120\3"+
		"\2\2\2/\u0124\3\2\2\2\61\u0129\3\2\2\2\63\u012e\3\2\2\2\65\u0132\3\2\2"+
		"\2\67\u0137\3\2\2\29\u013c\3\2\2\2;\u0141\3\2\2\2=\u0144\3\2\2\2?\u0147"+
		"\3\2\2\2A\u014a\3\2\2\2C\u014d\3\2\2\2E\u0150\3\2\2\2G\u0157\3\2\2\2I"+
		"\u0172\3\2\2\2K\u0174\3\2\2\2M\u017a\3\2\2\2O\u0180\3\2\2\2Q\u0187\3\2"+
		"\2\2S\u018a\3\2\2\2U\u018e\3\2\2\2W\u0191\3\2\2\2Y\u0193\3\2\2\2[\u0195"+
		"\3\2\2\2]\u0197\3\2\2\2_\u0199\3\2\2\2a\u019b\3\2\2\2c\u019d\3\2\2\2e"+
		"\u01a1\3\2\2\2g\u01a3\3\2\2\2i\u01a5\3\2\2\2k\u01a7\3\2\2\2m\u01a9\3\2"+
		"\2\2o\u01ab\3\2\2\2q\u01ad\3\2\2\2s\u01af\3\2\2\2u\u01b1\3\2\2\2w\u01b3"+
		"\3\2\2\2y\u01b6\3\2\2\2{\u01b9\3\2\2\2}\u01bb\3\2\2\2\177\u01bd\3\2\2"+
		"\2\u0081\u01c0\3\2\2\2\u0083\u01c3\3\2\2\2\u0085\u01c7\3\2\2\2\u0087\u01c9"+
		"\3\2\2\2\u0089\u01cb\3\2\2\2\u008b\u01ce\3\2\2\2\u008d\u01d8\3\2\2\2\u008f"+
		"\u0090\7i\2\2\u0090\u0091\7n\2\2\u0091\u0092\7q\2\2\u0092\u0093\7d\2\2"+
		"\u0093\u0094\7c\2\2\u0094\u0095\7n\2\2\u0095\4\3\2\2\2\u0096\u0097\7t"+
		"\2\2\u0097\u0098\7g\2\2\u0098\u0099\7u\2\2\u0099\u009a\7q\2\2\u009a\u009b"+
		"\7w\2\2\u009b\u009c\7t\2\2\u009c\u009d\7e\2\2\u009d\u009e\7g\2\2\u009e"+
		"\6\3\2\2\2\u009f\u00a0\7d\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7f\2\2\u00a2"+
		"\u00a3\7{\2\2\u00a3\b\3\2\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7z\2\2\u00a6"+
		"\u00a7\7v\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7f\2\2"+
		"\u00aa\n\3\2\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7o\2\2\u00ad\u00ae\7r"+
		"\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7v\2\2\u00b1\f"+
		"\3\2\2\2\u00b2\u00b3\7r\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7q\2\2\u00b5"+
		"\u00b6\7e\2\2\u00b6\16\3\2\2\2\u00b7\u00b8\7r\2\2\u00b8\u00b9\7t\2\2\u00b9"+
		"\u00ba\7q\2\2\u00ba\u00bb\7e\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7f\2\2"+
		"\u00bd\u00be\7w\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7g\2\2\u00c0\20\3\2"+
		"\2\2\u00c1\u00c2\7e\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5"+
		"\7u\2\2\u00c5\u00c6\7v\2\2\u00c6\22\3\2\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9"+
		"\7{\2\2\u00c9\u00ca\7r\2\2\u00ca\u00cb\7g\2\2\u00cb\24\3\2\2\2\u00cc\u00cd"+
		"\7q\2\2\u00cd\u00ce\7r\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7{\2\2\u00d0"+
		"\u00d1\7r\2\2\u00d1\u00d2\7g\2\2\u00d2\26\3\2\2\2\u00d3\u00d4\7t\2\2\u00d4"+
		"\u00d5\7g\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7w\2\2\u00d7\u00d8\7t\2\2"+
		"\u00d8\u00d9\7p\2\2\u00d9\u00da\7u\2\2\u00da\30\3\2\2\2\u00db\u00dc\7"+
		"q\2\2\u00dc\u00dd\7r\2\2\u00dd\32\3\2\2\2\u00de\u00df\7x\2\2\u00df\u00e0"+
		"\7c\2\2\u00e0\u00e1\7t\2\2\u00e1\34\3\2\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4"+
		"\7r\2\2\u00e4\u00e5\7a\2\2\u00e5\u00e6\7h\2\2\u00e6\u00e7\7w\2\2\u00e7"+
		"\u00e8\7p\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7k\2\2"+
		"\u00eb\u00ec\7q\2\2\u00ec\u00ed\7p\2\2\u00ed\36\3\2\2\2\u00ee\u00ef\7"+
		"q\2\2\u00ef\u00f0\7r\2\2\u00f0\u00f1\7a\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3"+
		"\7g\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7w\2\2\u00f5\u00f6\7t\2\2\u00f6"+
		"\u00f7\7p\2\2\u00f7 \3\2\2\2\u00f8\u00f9\7d\2\2\u00f9\u00fa\7a\2\2\u00fa"+
		"\u00fb\7r\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe\7c\2\2"+
		"\u00fe\u00ff\7o\2\2\u00ff\u0100\7u\2\2\u0100\"\3\2\2\2\u0101\u0102\7)"+
		"\2\2\u0102$\3\2\2\2\u0103\u0104\7e\2\2\u0104\u0105\7q\2\2\u0105\u0106"+
		"\7p\2\2\u0106\u0107\7u\2\2\u0107\u0108\7v\2\2\u0108\u0109\7c\2\2\u0109"+
		"\u010a\7p\2\2\u010a\u010b\7v\2\2\u010b&\3\2\2\2\u010c\u010d\7v\2\2\u010d"+
		"\u010e\7{\2\2\u010e\u010f\7r\2\2\u010f\u0110\7g\2\2\u0110\u0111\7a\2\2"+
		"\u0111\u0112\7f\2\2\u0112\u0113\7g\2\2\u0113\u0114\7e\2\2\u0114(\3\2\2"+
		"\2\u0115\u0116\7k\2\2\u0116\u0117\7p\2\2\u0117\u0118\7v\2\2\u0118*\3\2"+
		"\2\2\u0119\u011a\7u\2\2\u011a\u011b\7v\2\2\u011b\u011c\7t\2\2\u011c\u011d"+
		"\7k\2\2\u011d\u011e\7p\2\2\u011e\u011f\7i\2\2\u011f,\3\2\2\2\u0120\u0121"+
		"\7e\2\2\u0121\u0122\7c\2\2\u0122\u0123\7r\2\2\u0123.\3\2\2\2\u0124\u0125"+
		"\7t\2\2\u0125\u0126\7g\2\2\u0126\u0127\7c\2\2\u0127\u0128\7n\2\2\u0128"+
		"\60\3\2\2\2\u0129\u012a\7e\2\2\u012a\u012b\7j\2\2\u012b\u012c\7c\2\2\u012c"+
		"\u012d\7t\2\2\u012d\62\3\2\2\2\u012e\u012f\7t\2\2\u012f\u0130\7g\2\2\u0130"+
		"\u0131\7e\2\2\u0131\64\3\2\2\2\u0132\u0133\7u\2\2\u0133\u0134\7m\2\2\u0134"+
		"\u0135\7k\2\2\u0135\u0136\7r\2\2\u0136\66\3\2\2\2\u0137\u0138\7g\2\2\u0138"+
		"\u0139\7z\2\2\u0139\u013a\7k\2\2\u013a\u013b\7v\2\2\u013b8\3\2\2\2\u013c"+
		"\u013d\7p\2\2\u013d\u013e\7g\2\2\u013e\u013f\7z\2\2\u013f\u0140\7v\2\2"+
		"\u0140:\3\2\2\2\u0141\u0142\7k\2\2\u0142\u0143\7h\2\2\u0143<\3\2\2\2\u0144"+
		"\u0145\7h\2\2\u0145\u0146\7k\2\2\u0146>\3\2\2\2\u0147\u0148\7h\2\2\u0148"+
		"\u0149\7c\2\2\u0149@\3\2\2\2\u014a\u014b\7v\2\2\u014b\u014c\7q\2\2\u014c"+
		"B\3\2\2\2\u014d\u014e\7c\2\2\u014e\u014f\7h\2\2\u014fD\3\2\2\2\u0150\u0151"+
		"\7e\2\2\u0151\u0152\7t\2\2\u0152\u0153\7g\2\2\u0153\u0154\7c\2\2\u0154"+
		"\u0155\7v\2\2\u0155\u0156\7g\2\2\u0156F\3\2\2\2\u0157\u0158\7g\2\2\u0158"+
		"\u0159\7p\2\2\u0159\u015a\7f\2\2\u015aH\3\2\2\2\u015b\u015c\7g\2\2\u015c"+
		"\u015d\7z\2\2\u015d\u015e\7r\2\2\u015e\u015f\7t\2\2\u015f\u0160\7g\2\2"+
		"\u0160\u0161\7u\2\2\u0161\u0162\7u\2\2\u0162\u0163\7k\2\2\u0163\u0164"+
		"\7q\2\2\u0164\u0173\7p\2\2\u0165\u0167\t\2\2\2\u0166\u0165\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016f\3\2"+
		"\2\2\u016a\u016b\5Y-\2\u016b\u016c\t\2\2\2\u016c\u016e\3\2\2\2\u016d\u016a"+
		"\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u015b\3\2\2\2\u0172\u0166\3\2"+
		"\2\2\u0173J\3\2\2\2\u0174\u0175\7y\2\2\u0175\u0176\7t\2\2\u0176\u0177"+
		"\7k\2\2\u0177\u0178\7v\2\2\u0178\u0179\7g\2\2\u0179L\3\2\2\2\u017a\u017b"+
		"\7h\2\2\u017b\u017c\7k\2\2\u017c\u017d\7p\2\2\u017d\u017e\7c\2\2\u017e"+
		"\u017f\7n\2\2\u017fN\3\2\2\2\u0180\u0181\7i\2\2\u0181\u0182\7g\2\2\u0182"+
		"\u0183\7v\2\2\u0183\u0184\7c\2\2\u0184\u0185\7t\2\2\u0185\u0186\7i\2\2"+
		"\u0186P\3\2\2\2\u0187\u0188\7<\2\2\u0188\u0189\7?\2\2\u0189R\3\2\2\2\u018a"+
		"\u018b\7<\2\2\u018b\u018c\7?\2\2\u018c\u018d\7<\2\2\u018dT\3\2\2\2\u018e"+
		"\u018f\7#\2\2\u018f\u0190\7?\2\2\u0190V\3\2\2\2\u0191\u0192\7?\2\2\u0192"+
		"X\3\2\2\2\u0193\u0194\7\60\2\2\u0194Z\3\2\2\2\u0195\u0196\7<\2\2\u0196"+
		"\\\3\2\2\2\u0197\u0198\7-\2\2\u0198^\3\2\2\2\u0199\u019a\7~\2\2\u019a"+
		"`\3\2\2\2\u019b\u019c\7\61\2\2\u019cb\3\2\2\2\u019d\u019e\7o\2\2\u019e"+
		"\u019f\7q\2\2\u019f\u01a0\7f\2\2\u01a0d\3\2\2\2\u01a1\u01a2\7`\2\2\u01a2"+
		"f\3\2\2\2\u01a3\u01a4\7,\2\2\u01a4h\3\2\2\2\u01a5\u01a6\7/\2\2\u01a6j"+
		"\3\2\2\2\u01a7\u01a8\7]\2\2\u01a8l\3\2\2\2\u01a9\u01aa\7_\2\2\u01aan\3"+
		"\2\2\2\u01ab\u01ac\7.\2\2\u01acp\3\2\2\2\u01ad\u01ae\7*\2\2\u01aer\3\2"+
		"\2\2\u01af\u01b0\7+\2\2\u01b0t\3\2\2\2\u01b1\u01b2\7=\2\2\u01b2v\3\2\2"+
		"\2\u01b3\u01b4\7/\2\2\u01b4\u01b5\7@\2\2\u01b5x\3\2\2\2\u01b6\u01b7\7"+
		"]\2\2\u01b7\u01b8\7_\2\2\u01b8z\3\2\2\2\u01b9\u01ba\7>\2\2\u01ba|\3\2"+
		"\2\2\u01bb\u01bc\7@\2\2\u01bc~\3\2\2\2\u01bd\u01be\7>\2\2\u01be\u01bf"+
		"\7?\2\2\u01bf\u0080\3\2\2\2\u01c0\u01c1\7@\2\2\u01c1\u01c2\7?\2\2\u01c2"+
		"\u0082\3\2\2\2\u01c3\u01c4\7-\2\2\u01c4\u01c5\7<\2\2\u01c5\u01c6\7?\2"+
		"\2\u01c6\u0084\3\2\2\2\u01c7\u01c8\7\'\2\2\u01c8\u0086\3\2\2\2\u01c9\u01ca"+
		"\7}\2\2\u01ca\u0088\3\2\2\2\u01cb\u01cc\7\177\2\2\u01cc\u008a\3\2\2\2"+
		"\u01cd\u01cf\t\3\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01ce"+
		"\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d5\3\2\2\2\u01d2\u01d4\t\4\2\2\u01d3"+
		"\u01d2\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6\u008c\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9\t\5\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01db\bG\2\2\u01db\u008e\3\2\2\2\b\2\u0168\u016f"+
		"\u0172\u01d0\u01d5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}