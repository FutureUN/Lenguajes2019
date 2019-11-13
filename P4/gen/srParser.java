// Generated from /home/sebastian/UN/lenguajes/Lenguajes2019/P4/grammar/sr.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class srParser extends Parser {
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
	public static final int
		RULE_init = 0, RULE_global = 1, RULE_resource = 2, RULE_body = 3, RULE_global_content = 4, 
		RULE_parameters = 5, RULE_param_list = 6, RULE_r_elements = 7, RULE_r_declaration = 8, 
		RULE_var_id = 9, RULE_assign_dec = 10, RULE_type_def = 11, RULE_if_array = 12, 
		RULE_b_params = 13, RULE_block = 14, RULE_type = 15, RULE_function_id = 16, 
		RULE_expression = 17, RULE_boolvar = 18, RULE_e = 19, RULE_statement = 20, 
		RULE_ob_parameters = 21, RULE_identifier = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "global", "resource", "body", "global_content", "parameters", 
			"param_list", "r_elements", "r_declaration", "var_id", "assign_dec", 
			"type_def", "if_array", "b_params", "block", "type", "function_id", "expression", 
			"boolvar", "e", "statement", "ob_parameters", "identifier"
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

	@Override
	public String getGrammarFileName() { return "sr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public srParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitContext extends ParserRuleContext {
		public GlobalContext global() {
			return getRuleContext(GlobalContext.class,0);
		}
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(46);
				global();
				}
			}

			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				resource();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
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

	public static class GlobalContext extends ParserRuleContext {
		public TerminalNode ID_TOKEN() { return getToken(srParser.ID_TOKEN, 0); }
		public List<Global_contentContext> global_content() {
			return getRuleContexts(Global_contentContext.class);
		}
		public Global_contentContext global_content(int i) {
			return getRuleContext(Global_contentContext.class,i);
		}
		public TerminalNode END() { return getToken(srParser.END, 0); }
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitGlobal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitGlobal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_global);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__0);
			setState(55);
			match(ID_TOKEN);
			setState(56);
			global_content();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << TYPE) | (1L << OPTYPE) | (1L << OP) | (1L << VAR))) != 0)) {
				{
				{
				setState(57);
				global_content();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(END);
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

	public static class ResourceContext extends ParserRuleContext {
		public TerminalNode ID_TOKEN() { return getToken(srParser.ID_TOKEN, 0); }
		public List<R_elementsContext> r_elements() {
			return getRuleContexts(R_elementsContext.class);
		}
		public R_elementsContext r_elements(int i) {
			return getRuleContext(R_elementsContext.class,i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode END() { return getToken(srParser.END, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__1);
			setState(66);
			match(ID_TOKEN);
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(67);
				parameters();
				}
				break;
			}
			setState(70);
			r_elements();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << CONST) | (1L << TYPE) | (1L << OPTYPE) | (1L << OP) | (1L << VAR) | (1L << EXTEND) | (1L << IMPORT) | (1L << PROC) | (1L << PROCEDURE) | (1L << SSKIP) | (1L << EXIT) | (1L << NEXT) | (1L << IF) | (1L << FA) | (1L << WRITE) | (1L << FINAL) | (1L << GETARG) | (1L << PARENT_L) | (1L << SINGOP) | (1L << BINID) | (1L << INT) | (1L << DOUBLE) | (1L << ID_TOKEN))) != 0)) {
				{
				{
				setState(71);
				r_elements();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END) {
				{
				setState(77);
				match(END);
				}
			}

			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(80);
				body();
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

	public static class BodyContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<R_elementsContext> r_elements() {
			return getRuleContexts(R_elementsContext.class);
		}
		public R_elementsContext r_elements(int i) {
			return getRuleContext(R_elementsContext.class,i);
		}
		public TerminalNode END() { return getToken(srParser.END, 0); }
		public TerminalNode ID_TOKEN() { return getToken(srParser.ID_TOKEN, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__2);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID_TOKEN) {
				{
				setState(84);
				match(ID_TOKEN);
				}
			}

			setState(87);
			parameters();
			setState(88);
			r_elements();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << CONST) | (1L << TYPE) | (1L << OPTYPE) | (1L << OP) | (1L << VAR) | (1L << EXTEND) | (1L << IMPORT) | (1L << PROC) | (1L << PROCEDURE) | (1L << SSKIP) | (1L << EXIT) | (1L << NEXT) | (1L << IF) | (1L << FA) | (1L << WRITE) | (1L << FINAL) | (1L << GETARG) | (1L << PARENT_L) | (1L << SINGOP) | (1L << BINID) | (1L << INT) | (1L << DOUBLE) | (1L << ID_TOKEN))) != 0)) {
				{
				{
				setState(89);
				r_elements();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			match(END);
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

	public static class Global_contentContext extends ParserRuleContext {
		public R_declarationContext r_declaration() {
			return getRuleContext(R_declarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(srParser.SEMICOLON, 0); }
		public Global_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterGlobal_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitGlobal_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitGlobal_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_contentContext global_content() throws RecognitionException {
		Global_contentContext _localctx = new Global_contentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_global_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			r_declaration();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(98);
				match(SEMICOLON);
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

	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode PARENT_L() { return getToken(srParser.PARENT_L, 0); }
		public TerminalNode PARENT_R() { return getToken(srParser.PARENT_R, 0); }
		public List<Param_listContext> param_list() {
			return getRuleContexts(Param_listContext.class);
		}
		public Param_listContext param_list(int i) {
			return getRuleContext(Param_listContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(srParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(srParser.SEMICOLON, i);
		}
		public List<TerminalNode> COMA() { return getTokens(srParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(srParser.COMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(PARENT_L);
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(102);
				param_list();
				}
				break;
			}
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << COMA) | (1L << PARENT_L) | (1L << SEMICOLON) | (1L << SINGOP) | (1L << BINID) | (1L << INT) | (1L << DOUBLE) | (1L << ID_TOKEN))) != 0)) {
				{
				{
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(105);
					match(SEMICOLON);
					}
				}

				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(108);
					match(COMA);
					}
				}

				setState(111);
				param_list();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(PARENT_R);
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

	public static class Param_listContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public If_arrayContext if_array() {
			return getRuleContext(If_arrayContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(srParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(srParser.COLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID_TOKEN() { return getTokens(srParser.ID_TOKEN); }
		public TerminalNode ID_TOKEN(int i) {
			return getToken(srParser.ID_TOKEN, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(srParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(srParser.SEMICOLON, i);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterParam_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitParam_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitParam_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param_list);
		int _la;
		try {
			int _alt;
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				identifier();
				setState(120);
				if_array();
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(121);
					match(COLON);
					setState(122);
					type();
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(T__3);
				setState(129);
				identifier();
				setState(130);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(ID_TOKEN);
				setState(133);
				match(COLON);
				setState(134);
				type();
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(135);
						match(SEMICOLON);
						setState(136);
						match(ID_TOKEN);
						setState(137);
						match(COLON);
						setState(138);
						type();
						}
						} 
					}
					setState(143);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
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

	public static class R_elementsContext extends ParserRuleContext {
		public TerminalNode EXTEND() { return getToken(srParser.EXTEND, 0); }
		public List<TerminalNode> ID_TOKEN() { return getTokens(srParser.ID_TOKEN); }
		public TerminalNode ID_TOKEN(int i) {
			return getToken(srParser.ID_TOKEN, i);
		}
		public List<TerminalNode> COMA() { return getTokens(srParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(srParser.COMA, i);
		}
		public TerminalNode IMPORT() { return getToken(srParser.IMPORT, 0); }
		public TerminalNode PROC() { return getToken(srParser.PROC, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(srParser.END, 0); }
		public TerminalNode PROCEDURE() { return getToken(srParser.PROCEDURE, 0); }
		public R_declarationContext r_declaration() {
			return getRuleContext(R_declarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(srParser.SEMICOLON, 0); }
		public Function_idContext function_id() {
			return getRuleContext(Function_idContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public R_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterR_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitR_elements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitR_elements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_elementsContext r_elements() throws RecognitionException {
		R_elementsContext _localctx = new R_elementsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_r_elements);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(EXTEND);
				setState(147);
				match(ID_TOKEN);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(148);
					match(COMA);
					setState(149);
					match(ID_TOKEN);
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(IMPORT);
				setState(156);
				match(ID_TOKEN);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(157);
					match(COMA);
					setState(158);
					match(ID_TOKEN);
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(PROC);
				setState(165);
				match(ID_TOKEN);
				setState(166);
				parameters();
				setState(167);
				block();
				setState(168);
				match(END);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				match(PROCEDURE);
				setState(171);
				match(ID_TOKEN);
				setState(172);
				parameters();
				setState(173);
				block();
				setState(174);
				match(END);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				r_declaration();
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(177);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(180);
				function_id();
				setState(181);
				parameters();
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(182);
					match(SEMICOLON);
					}
				}

				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(185);
					match(END);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(188);
				statement();
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(189);
					match(SEMICOLON);
					}
				}

				}
				break;
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

	public static class R_declarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(srParser.CONST, 0); }
		public List<TerminalNode> ID_TOKEN() { return getTokens(srParser.ID_TOKEN); }
		public TerminalNode ID_TOKEN(int i) {
			return getToken(srParser.ID_TOKEN, i);
		}
		public TerminalNode ASSIG() { return getToken(srParser.ASSIG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(srParser.TYPE, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode OPTYPE() { return getToken(srParser.OPTYPE, 0); }
		public TerminalNode PARENT_L() { return getToken(srParser.PARENT_L, 0); }
		public List<TerminalNode> COLON() { return getTokens(srParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(srParser.COLON, i);
		}
		public TerminalNode PARENT_R() { return getToken(srParser.PARENT_R, 0); }
		public TerminalNode OP() { return getToken(srParser.OP, 0); }
		public List<ParametersContext> parameters() {
			return getRuleContexts(ParametersContext.class);
		}
		public ParametersContext parameters(int i) {
			return getRuleContext(ParametersContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(srParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(srParser.COMA, i);
		}
		public TerminalNode VAR() { return getToken(srParser.VAR, 0); }
		public Var_idContext var_id() {
			return getRuleContext(Var_idContext.class,0);
		}
		public Type_defContext type_def() {
			return getRuleContext(Type_defContext.class,0);
		}
		public Assign_decContext assign_dec() {
			return getRuleContext(Assign_decContext.class,0);
		}
		public R_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterR_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitR_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitR_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_declarationContext r_declaration() throws RecognitionException {
		R_declarationContext _localctx = new R_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_r_declaration);
		int _la;
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(CONST);
				setState(195);
				match(ID_TOKEN);
				setState(196);
				match(ASSIG);
				setState(197);
				expression(0);
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(TYPE);
				setState(199);
				match(ID_TOKEN);
				setState(200);
				match(ASSIG);
				setState(201);
				type();
				}
				break;
			case OPTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				match(OPTYPE);
				setState(203);
				match(ID_TOKEN);
				setState(204);
				match(ASSIG);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENT_L) {
					{
					setState(205);
					match(PARENT_L);
					}
				}

				setState(208);
				match(ID_TOKEN);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(209);
					match(COLON);
					setState(210);
					type();
					}
				}

				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENT_R) {
					{
					setState(213);
					match(PARENT_R);
					}
				}

				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(216);
					match(T__4);
					setState(217);
					match(ID_TOKEN);
					setState(218);
					match(COLON);
					setState(219);
					type();
					}
				}

				}
				break;
			case OP:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				match(OP);
				setState(223);
				match(ID_TOKEN);
				setState(225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(224);
					parameters();
					}
					break;
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(227);
					match(COMA);
					setState(228);
					match(ID_TOKEN);
					setState(230);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(229);
						parameters();
						}
						break;
					}
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(237);
					match(COLON);
					setState(238);
					type();
					}
				}

				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				match(VAR);
				setState(242);
				var_id();
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(243);
					type_def();
					}
				}

				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIG) {
					{
					setState(246);
					match(ASSIG);
					setState(247);
					assign_dec();
					}
				}

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

	public static class Var_idContext extends ParserRuleContext {
		public List<TerminalNode> ID_TOKEN() { return getTokens(srParser.ID_TOKEN); }
		public TerminalNode ID_TOKEN(int i) {
			return getToken(srParser.ID_TOKEN, i);
		}
		public List<If_arrayContext> if_array() {
			return getRuleContexts(If_arrayContext.class);
		}
		public If_arrayContext if_array(int i) {
			return getRuleContext(If_arrayContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(srParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(srParser.COMA, i);
		}
		public Var_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterVar_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitVar_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitVar_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_idContext var_id() throws RecognitionException {
		Var_idContext _localctx = new Var_idContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(ID_TOKEN);
			setState(253);
			if_array();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(254);
				match(COMA);
				setState(255);
				match(ID_TOKEN);
				setState(256);
				if_array();
				}
				}
				setState(261);
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

	public static class Assign_decContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> COMA() { return getTokens(srParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(srParser.COMA, i);
		}
		public List<Assign_decContext> assign_dec() {
			return getRuleContexts(Assign_decContext.class);
		}
		public Assign_decContext assign_dec(int i) {
			return getRuleContext(Assign_decContext.class,i);
		}
		public TerminalNode ID_TOKEN() { return getToken(srParser.ID_TOKEN, 0); }
		public If_arrayContext if_array() {
			return getRuleContext(If_arrayContext.class,0);
		}
		public Assign_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterAssign_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitAssign_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitAssign_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_decContext assign_dec() throws RecognitionException {
		Assign_decContext _localctx = new Assign_decContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assign_dec);
		try {
			int _alt;
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				expression(0);
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(263);
						match(COMA);
						setState(264);
						assign_dec();
						}
						} 
					}
					setState(269);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(ID_TOKEN);
				setState(271);
				if_array();
				}
				break;
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

	public static class Type_defContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(srParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterType_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitType_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitType_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_defContext type_def() throws RecognitionException {
		Type_defContext _localctx = new Type_defContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(274);
			match(COLON);
			setState(275);
			type();
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

	public static class If_arrayContext extends ParserRuleContext {
		public List<TerminalNode> BRACE_L() { return getTokens(srParser.BRACE_L); }
		public TerminalNode BRACE_L(int i) {
			return getToken(srParser.BRACE_L, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> BRACE_R() { return getTokens(srParser.BRACE_R); }
		public TerminalNode BRACE_R(int i) {
			return getToken(srParser.BRACE_R, i);
		}
		public List<TerminalNode> COLON() { return getTokens(srParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(srParser.COLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(srParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(srParser.COMA, i);
		}
		public If_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterIf_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitIf_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitIf_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_arrayContext if_array() throws RecognitionException {
		If_arrayContext _localctx = new If_arrayContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_array);
		int _la;
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRACE_L) {
					{
					{
					setState(277);
					match(BRACE_L);
					setState(278);
					identifier();
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COLON) {
						{
						setState(279);
						match(COLON);
						setState(280);
						type();
						}
					}

					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(283);
						match(COMA);
						setState(284);
						identifier();
						setState(287);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COLON) {
							{
							setState(285);
							match(COLON);
							setState(286);
							type();
							}
						}

						}
						}
						setState(293);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(294);
					match(BRACE_R);
					}
					}
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRACE_L) {
					{
					{
					setState(301);
					match(BRACE_L);
					setState(302);
					identifier();
					setState(305);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COLON) {
						{
						setState(303);
						match(COLON);
						setState(304);
						identifier();
						}
					}

					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(307);
						match(COMA);
						setState(308);
						identifier();
						setState(311);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COLON) {
							{
							setState(309);
							match(COLON);
							setState(310);
							identifier();
							}
						}

						}
						}
						setState(317);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(318);
					match(BRACE_R);
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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

	public static class B_paramsContext extends ParserRuleContext {
		public B_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterB_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitB_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitB_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final B_paramsContext b_params() throws RecognitionException {
		B_paramsContext _localctx = new B_paramsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_b_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(T__5);
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

	public static class BlockContext extends ParserRuleContext {
		public R_elementsContext r_elements() {
			return getRuleContext(R_elementsContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			r_elements();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << SSKIP) | (1L << EXIT) | (1L << NEXT) | (1L << IF) | (1L << FA) | (1L << PARENT_L) | (1L << SINGOP) | (1L << BINID) | (1L << INT) | (1L << DOUBLE) | (1L << ID_TOKEN))) != 0)) {
				{
				{
				setState(330);
				statement();
				}
				}
				setState(335);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode T_INT() { return getToken(srParser.T_INT, 0); }
		public TerminalNode T_STRING() { return getToken(srParser.T_STRING, 0); }
		public TerminalNode T_CAP() { return getToken(srParser.T_CAP, 0); }
		public List<TerminalNode> ID_TOKEN() { return getTokens(srParser.ID_TOKEN); }
		public TerminalNode ID_TOKEN(int i) {
			return getToken(srParser.ID_TOKEN, i);
		}
		public TerminalNode T_REAL() { return getToken(srParser.T_REAL, 0); }
		public TerminalNode T_CHAR() { return getToken(srParser.T_CHAR, 0); }
		public TerminalNode T_REC() { return getToken(srParser.T_REC, 0); }
		public TerminalNode PARENT_L() { return getToken(srParser.PARENT_L, 0); }
		public TerminalNode PARENT_R() { return getToken(srParser.PARENT_R, 0); }
		public List<TerminalNode> COMA() { return getTokens(srParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(srParser.COMA, i);
		}
		public Type_defContext type_def() {
			return getRuleContext(Type_defContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type);
		int _la;
		try {
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(T_INT);
				}
				break;
			case T_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(T_STRING);
				}
				break;
			case T_CAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				match(T_CAP);
				setState(339);
				match(ID_TOKEN);
				}
				break;
			case T_REAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(340);
				match(T_REAL);
				}
				break;
			case ID_TOKEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(341);
				match(ID_TOKEN);
				}
				break;
			case T_CHAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(342);
				match(T_CHAR);
				}
				break;
			case T_REC:
				enterOuterAlt(_localctx, 7);
				{
				setState(343);
				match(T_REC);
				setState(344);
				match(PARENT_L);
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID_TOKEN) {
					{
					setState(345);
					match(ID_TOKEN);
					}
				}

				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(348);
					match(COMA);
					setState(349);
					match(ID_TOKEN);
					}
					}
					setState(354);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(355);
					type_def();
					}
				}

				setState(358);
				match(PARENT_R);
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

	public static class Function_idContext extends ParserRuleContext {
		public TerminalNode GETARG() { return getToken(srParser.GETARG, 0); }
		public TerminalNode FINAL() { return getToken(srParser.FINAL, 0); }
		public TerminalNode WRITE() { return getToken(srParser.WRITE, 0); }
		public TerminalNode ID_TOKEN() { return getToken(srParser.ID_TOKEN, 0); }
		public Function_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterFunction_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitFunction_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitFunction_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_idContext function_id() throws RecognitionException {
		Function_idContext _localctx = new Function_idContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << FINAL) | (1L << GETARG) | (1L << ID_TOKEN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExpressionContext extends ParserRuleContext {
		public BoolvarContext boolvar() {
			return getRuleContext(BoolvarContext.class,0);
		}
		public TerminalNode SINGOP() { return getToken(srParser.SINGOP, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BINOP() { return getToken(srParser.BINOP, 0); }
		public TerminalNode ROP() { return getToken(srParser.ROP, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(364);
				boolvar();
				}
				break;
			case 2:
				{
				setState(365);
				match(SINGOP);
				setState(366);
				boolvar();
				}
				break;
			case 3:
				{
				setState(367);
				e(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(376);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(370);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(371);
						match(BINOP);
						setState(372);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(373);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(374);
						match(ROP);
						setState(375);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	public static class BoolvarContext extends ParserRuleContext {
		public TerminalNode ID_TOKEN() { return getToken(srParser.ID_TOKEN, 0); }
		public TerminalNode BINID() { return getToken(srParser.BINID, 0); }
		public BoolvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterBoolvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitBoolvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitBoolvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolvarContext boolvar() throws RecognitionException {
		BoolvarContext _localctx = new BoolvarContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_boolvar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_la = _input.LA(1);
			if ( !(_la==BINID || _la==ID_TOKEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class EContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(srParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(srParser.INT, 0); }
		public TerminalNode PARENT_L() { return getToken(srParser.PARENT_L, 0); }
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode PARENT_R() { return getToken(srParser.PARENT_R, 0); }
		public TerminalNode ID_TOKEN() { return getToken(srParser.ID_TOKEN, 0); }
		public TerminalNode MULOP() { return getToken(srParser.MULOP, 0); }
		public TerminalNode SUMOP() { return getToken(srParser.SUMOP, 0); }
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e() throws RecognitionException {
		return e(0);
	}

	private EContext e(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EContext _localctx = new EContext(_ctx, _parentState);
		EContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_e, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
				{
				setState(384);
				match(DOUBLE);
				}
				break;
			case INT:
				{
				setState(385);
				match(INT);
				}
				break;
			case PARENT_L:
				{
				setState(386);
				match(PARENT_L);
				setState(387);
				e(0);
				setState(388);
				match(PARENT_R);
				}
				break;
			case ID_TOKEN:
				{
				setState(390);
				match(ID_TOKEN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(399);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						_localctx = new EContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(393);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(394);
						match(MULOP);
						setState(395);
						e(7);
						}
						break;
					case 2:
						{
						_localctx = new EContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(396);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(397);
						match(SUMOP);
						setState(398);
						e(6);
						}
						break;
					}
					} 
				}
				setState(403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SSKIP() { return getToken(srParser.SSKIP, 0); }
		public TerminalNode EXIT() { return getToken(srParser.EXIT, 0); }
		public TerminalNode NEXT() { return getToken(srParser.NEXT, 0); }
		public TerminalNode IF() { return getToken(srParser.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EXECUTE() { return getToken(srParser.EXECUTE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FI() { return getToken(srParser.FI, 0); }
		public TerminalNode FA() { return getToken(srParser.FA, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> ASSIG() { return getTokens(srParser.ASSIG); }
		public TerminalNode ASSIG(int i) {
			return getToken(srParser.ASSIG, i);
		}
		public TerminalNode AF() { return getToken(srParser.AF, 0); }
		public List<TerminalNode> COMA() { return getTokens(srParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(srParser.COMA, i);
		}
		public List<If_arrayContext> if_array() {
			return getRuleContexts(If_arrayContext.class);
		}
		public If_arrayContext if_array(int i) {
			return getRuleContext(If_arrayContext.class,i);
		}
		public TerminalNode SWAP() { return getToken(srParser.SWAP, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(srParser.ADD_ASSIGN, 0); }
		public TerminalNode CREATE() { return getToken(srParser.CREATE, 0); }
		public List<Ob_parametersContext> ob_parameters() {
			return getRuleContexts(Ob_parametersContext.class);
		}
		public Ob_parametersContext ob_parameters(int i) {
			return getRuleContext(Ob_parametersContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(srParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(srParser.DOT, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(srParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(srParser.SEMICOLON, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				match(SSKIP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				match(EXIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(406);
				match(NEXT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(407);
				match(IF);
				setState(408);
				expression(0);
				setState(409);
				match(EXECUTE);
				setState(410);
				block();
				setState(411);
				match(FI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(413);
				match(FA);
				setState(414);
				identifier();
				setState(415);
				match(ASSIG);
				setState(416);
				expression(0);
				setState(417);
				match(T__6);
				setState(418);
				identifier();
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(419);
					match(COMA);
					setState(420);
					identifier();
					setState(421);
					match(ASSIG);
					setState(422);
					expression(0);
					setState(423);
					match(T__6);
					setState(424);
					identifier();
					}
					}
					setState(430);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(431);
				match(EXECUTE);
				setState(432);
				block();
				setState(433);
				match(AF);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(435);
				identifier();
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(436);
					match(COMA);
					setState(437);
					identifier();
					}
					}
					setState(442);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(443);
				match(ASSIG);
				setState(444);
				expression(0);
				{
				setState(445);
				match(COMA);
				setState(446);
				expression(0);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(448);
				identifier();
				setState(449);
				if_array();
				setState(450);
				match(SWAP);
				setState(451);
				identifier();
				setState(452);
				if_array();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(454);
				identifier();
				setState(455);
				if_array();
				setState(456);
				match(ADD_ASSIGN);
				setState(457);
				identifier();
				setState(458);
				if_array();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(460);
				identifier();
				setState(461);
				if_array();
				setState(462);
				match(ASSIG);
				setState(463);
				identifier();
				setState(464);
				if_array();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(466);
				identifier();
				setState(467);
				if_array();
				setState(468);
				match(ASSIG);
				setState(469);
				match(CREATE);
				setState(470);
				identifier();
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(471);
					match(DOT);
					setState(472);
					identifier();
					}
					}
					setState(477);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(478);
				ob_parameters();
				setState(492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(479);
						match(SEMICOLON);
						setState(480);
						identifier();
						setState(485);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==DOT) {
							{
							{
							setState(481);
							match(DOT);
							setState(482);
							identifier();
							}
							}
							setState(487);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(488);
						ob_parameters();
						}
						} 
					}
					setState(494);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				}
				break;
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

	public static class Ob_parametersContext extends ParserRuleContext {
		public TerminalNode PARENT_L() { return getToken(srParser.PARENT_L, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode PARENT_R() { return getToken(srParser.PARENT_R, 0); }
		public List<TerminalNode> COMA() { return getTokens(srParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(srParser.COMA, i);
		}
		public Ob_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ob_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterOb_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitOb_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitOb_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ob_parametersContext ob_parameters() throws RecognitionException {
		Ob_parametersContext _localctx = new Ob_parametersContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ob_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(PARENT_L);
			setState(498);
			identifier();
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(499);
				match(COMA);
				setState(500);
				identifier();
				}
				}
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(506);
			match(PARENT_R);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID_TOKEN() { return getToken(srParser.ID_TOKEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_identifier);
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				match(ID_TOKEN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(510);
				match(T__3);
				setState(511);
				match(ID_TOKEN);
				setState(512);
				match(T__3);
				}
				break;
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
		case 17:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 19:
			return e_sempred((EContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean e_sempred(EContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u0206\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\5\2\62"+
		"\n\2\3\2\6\2\65\n\2\r\2\16\2\66\3\3\3\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13"+
		"\3\3\3\3\3\3\4\3\4\3\4\5\4G\n\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3\4\5"+
		"\4Q\n\4\3\4\5\4T\n\4\3\5\3\5\5\5X\n\5\3\5\3\5\3\5\7\5]\n\5\f\5\16\5`\13"+
		"\5\3\5\3\5\3\6\3\6\5\6f\n\6\3\7\3\7\5\7j\n\7\3\7\5\7m\n\7\3\7\5\7p\n\7"+
		"\3\7\7\7s\n\7\f\7\16\7v\13\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b~\n\b\f\b\16\b"+
		"\u0081\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u008e\n\b"+
		"\f\b\16\b\u0091\13\b\5\b\u0093\n\b\3\t\3\t\3\t\3\t\7\t\u0099\n\t\f\t\16"+
		"\t\u009c\13\t\3\t\3\t\3\t\3\t\7\t\u00a2\n\t\f\t\16\t\u00a5\13\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b5\n\t\3\t\3"+
		"\t\3\t\5\t\u00ba\n\t\3\t\5\t\u00bd\n\t\3\t\3\t\5\t\u00c1\n\t\5\t\u00c3"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d1\n\n\3\n"+
		"\3\n\3\n\5\n\u00d6\n\n\3\n\5\n\u00d9\n\n\3\n\3\n\3\n\3\n\5\n\u00df\n\n"+
		"\3\n\3\n\3\n\5\n\u00e4\n\n\3\n\3\n\3\n\5\n\u00e9\n\n\7\n\u00eb\n\n\f\n"+
		"\16\n\u00ee\13\n\3\n\3\n\5\n\u00f2\n\n\3\n\3\n\3\n\5\n\u00f7\n\n\3\n\3"+
		"\n\5\n\u00fb\n\n\5\n\u00fd\n\n\3\13\3\13\3\13\3\13\3\13\7\13\u0104\n\13"+
		"\f\13\16\13\u0107\13\13\3\f\3\f\3\f\7\f\u010c\n\f\f\f\16\f\u010f\13\f"+
		"\3\f\3\f\5\f\u0113\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u011c\n\16"+
		"\3\16\3\16\3\16\3\16\5\16\u0122\n\16\7\16\u0124\n\16\f\16\16\16\u0127"+
		"\13\16\3\16\3\16\7\16\u012b\n\16\f\16\16\16\u012e\13\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0134\n\16\3\16\3\16\3\16\3\16\5\16\u013a\n\16\7\16\u013c\n"+
		"\16\f\16\16\16\u013f\13\16\3\16\3\16\7\16\u0143\n\16\f\16\16\16\u0146"+
		"\13\16\5\16\u0148\n\16\3\17\3\17\3\20\3\20\7\20\u014e\n\20\f\20\16\20"+
		"\u0151\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u015d"+
		"\n\21\3\21\3\21\7\21\u0161\n\21\f\21\16\21\u0164\13\21\3\21\5\21\u0167"+
		"\n\21\3\21\5\21\u016a\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u0173"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u017b\n\23\f\23\16\23\u017e\13"+
		"\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u018a\n\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0192\n\25\f\25\16\25\u0195\13\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u01ad\n\26\f\26\16\26\u01b0"+
		"\13\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u01b9\n\26\f\26\16\26\u01bc"+
		"\13\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\7\26\u01dc\n\26\f\26\16\26\u01df\13\26\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u01e6\n\26\f\26\16\26\u01e9\13\26\3\26\3\26\7\26\u01ed"+
		"\n\26\f\26\16\26\u01f0\13\26\5\26\u01f2\n\26\3\27\3\27\3\27\3\27\7\27"+
		"\u01f8\n\27\f\27\16\27\u01fb\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u0204\n\30\3\30\2\4$(\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\2\4\4\2\"$@@\4\2==@@\2\u024a\2\61\3\2\2\2\48\3\2\2\2\6C\3\2"+
		"\2\2\bU\3\2\2\2\nc\3\2\2\2\fg\3\2\2\2\16\u0092\3\2\2\2\20\u00c2\3\2\2"+
		"\2\22\u00fc\3\2\2\2\24\u00fe\3\2\2\2\26\u0112\3\2\2\2\30\u0114\3\2\2\2"+
		"\32\u0147\3\2\2\2\34\u0149\3\2\2\2\36\u014b\3\2\2\2 \u0169\3\2\2\2\"\u016b"+
		"\3\2\2\2$\u0172\3\2\2\2&\u017f\3\2\2\2(\u0189\3\2\2\2*\u01f1\3\2\2\2,"+
		"\u01f3\3\2\2\2.\u0203\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\61\62\3\2\2"+
		"\2\62\64\3\2\2\2\63\65\5\6\4\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2"+
		"\2\66\67\3\2\2\2\67\3\3\2\2\289\7\3\2\29:\7@\2\2:>\5\n\6\2;=\5\n\6\2<"+
		";\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\n\2\2"+
		"B\5\3\2\2\2CD\7\4\2\2DF\7@\2\2EG\5\f\7\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2"+
		"HL\5\20\t\2IK\5\20\t\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MP\3\2\2"+
		"\2NL\3\2\2\2OQ\7\n\2\2PO\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RT\5\b\5\2SR\3\2\2"+
		"\2ST\3\2\2\2T\7\3\2\2\2UW\7\5\2\2VX\7@\2\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2"+
		"\2YZ\5\f\7\2Z^\5\20\t\2[]\5\20\t\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3"+
		"\2\2\2_a\3\2\2\2`^\3\2\2\2ab\7\n\2\2b\t\3\2\2\2ce\5\22\n\2df\7\61\2\2"+
		"ed\3\2\2\2ef\3\2\2\2f\13\3\2\2\2gi\7/\2\2hj\5\16\b\2ih\3\2\2\2ij\3\2\2"+
		"\2jt\3\2\2\2km\7\61\2\2lk\3\2\2\2lm\3\2\2\2mo\3\2\2\2np\7.\2\2on\3\2\2"+
		"\2op\3\2\2\2pq\3\2\2\2qs\5\16\b\2rl\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2"+
		"\2\2uw\3\2\2\2vt\3\2\2\2wx\7\60\2\2x\r\3\2\2\2yz\5.\30\2z\177\5\32\16"+
		"\2{|\7*\2\2|~\5 \21\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0093\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7\6\2\2\u0083"+
		"\u0084\5.\30\2\u0084\u0085\7\6\2\2\u0085\u0093\3\2\2\2\u0086\u0087\7@"+
		"\2\2\u0087\u0088\7*\2\2\u0088\u008f\5 \21\2\u0089\u008a\7\61\2\2\u008a"+
		"\u008b\7@\2\2\u008b\u008c\7*\2\2\u008c\u008e\5 \21\2\u008d\u0089\3\2\2"+
		"\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0093"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0092y\3\2\2\2\u0092\u0082\3\2\2\2\u0092"+
		"\u0086\3\2\2\2\u0093\17\3\2\2\2\u0094\u0095\7\20\2\2\u0095\u009a\7@\2"+
		"\2\u0096\u0097\7.\2\2\u0097\u0099\7@\2\2\u0098\u0096\3\2\2\2\u0099\u009c"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u00c3\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u009e\7\21\2\2\u009e\u00a3\7@\2\2\u009f\u00a0\7."+
		"\2\2\u00a0\u00a2\7@\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00c3\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a6\u00a7\7\22\2\2\u00a7\u00a8\7@\2\2\u00a8\u00a9\5\f\7\2\u00a9"+
		"\u00aa\5\36\20\2\u00aa\u00ab\7\n\2\2\u00ab\u00c3\3\2\2\2\u00ac\u00ad\7"+
		"\23\2\2\u00ad\u00ae\7@\2\2\u00ae\u00af\5\f\7\2\u00af\u00b0\5\36\20\2\u00b0"+
		"\u00b1\7\n\2\2\u00b1\u00c3\3\2\2\2\u00b2\u00b4\5\22\n\2\u00b3\u00b5\7"+
		"\61\2\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00c3\3\2\2\2\u00b6"+
		"\u00b7\5\"\22\2\u00b7\u00b9\5\f\7\2\u00b8\u00ba\7\61\2\2\u00b9\u00b8\3"+
		"\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00bd\7\n\2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c3\3\2\2\2\u00be\u00c0\5*"+
		"\26\2\u00bf\u00c1\7\61\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u0094\3\2\2\2\u00c2\u009d\3\2\2\2\u00c2\u00a6\3\2"+
		"\2\2\u00c2\u00ac\3\2\2\2\u00c2\u00b2\3\2\2\2\u00c2\u00b6\3\2\2\2\u00c2"+
		"\u00be\3\2\2\2\u00c3\21\3\2\2\2\u00c4\u00c5\7\13\2\2\u00c5\u00c6\7@\2"+
		"\2\u00c6\u00c7\7%\2\2\u00c7\u00fd\5$\23\2\u00c8\u00c9\7\f\2\2\u00c9\u00ca"+
		"\7@\2\2\u00ca\u00cb\7%\2\2\u00cb\u00fd\5 \21\2\u00cc\u00cd\7\r\2\2\u00cd"+
		"\u00ce\7@\2\2\u00ce\u00d0\7%\2\2\u00cf\u00d1\7/\2\2\u00d0\u00cf\3\2\2"+
		"\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d5\7@\2\2\u00d3\u00d4"+
		"\7*\2\2\u00d4\u00d6\5 \21\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d8\3\2\2\2\u00d7\u00d9\7\60\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3"+
		"\2\2\2\u00d9\u00de\3\2\2\2\u00da\u00db\7\7\2\2\u00db\u00dc\7@\2\2\u00dc"+
		"\u00dd\7*\2\2\u00dd\u00df\5 \21\2\u00de\u00da\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00fd\3\2\2\2\u00e0\u00e1\7\16\2\2\u00e1\u00e3\7@\2\2\u00e2"+
		"\u00e4\5\f\7\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00ec\3\2"+
		"\2\2\u00e5\u00e6\7.\2\2\u00e6\u00e8\7@\2\2\u00e7\u00e9\5\f\7\2\u00e8\u00e7"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e5\3\2\2\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f1\3\2"+
		"\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7*\2\2\u00f0\u00f2\5 \21\2\u00f1"+
		"\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00fd\3\2\2\2\u00f3\u00f4\7\17"+
		"\2\2\u00f4\u00f6\5\24\13\2\u00f5\u00f7\5\30\r\2\u00f6\u00f5\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f9\7%\2\2\u00f9\u00fb\5\26"+
		"\f\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc"+
		"\u00c4\3\2\2\2\u00fc\u00c8\3\2\2\2\u00fc\u00cc\3\2\2\2\u00fc\u00e0\3\2"+
		"\2\2\u00fc\u00f3\3\2\2\2\u00fd\23\3\2\2\2\u00fe\u00ff\7@\2\2\u00ff\u0105"+
		"\5\32\16\2\u0100\u0101\7.\2\2\u0101\u0102\7@\2\2\u0102\u0104\5\32\16\2"+
		"\u0103\u0100\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\25\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010d\5$\23\2\u0109"+
		"\u010a\7.\2\2\u010a\u010c\5\26\f\2\u010b\u0109\3\2\2\2\u010c\u010f\3\2"+
		"\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0113\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0111\7@\2\2\u0111\u0113\5\32\16\2\u0112\u0108\3"+
		"\2\2\2\u0112\u0110\3\2\2\2\u0113\27\3\2\2\2\u0114\u0115\7*\2\2\u0115\u0116"+
		"\5 \21\2\u0116\31\3\2\2\2\u0117\u0118\7,\2\2\u0118\u011b\5.\30\2\u0119"+
		"\u011a\7*\2\2\u011a\u011c\5 \21\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u0125\3\2\2\2\u011d\u011e\7.\2\2\u011e\u0121\5.\30\2\u011f"+
		"\u0120\7*\2\2\u0120\u0122\5 \21\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\u0124\3\2\2\2\u0123\u011d\3\2\2\2\u0124\u0127\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2"+
		"\2\2\u0128\u0129\7-\2\2\u0129\u012b\3\2\2\2\u012a\u0117\3\2\2\2\u012b"+
		"\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0148\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7,\2\2\u0130\u0133\5.\30\2\u0131"+
		"\u0132\7*\2\2\u0132\u0134\5.\30\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u013d\3\2\2\2\u0135\u0136\7.\2\2\u0136\u0139\5.\30\2\u0137"+
		"\u0138\7*\2\2\u0138\u013a\5.\30\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u013c\3\2\2\2\u013b\u0135\3\2\2\2\u013c\u013f\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u0140\u0141\7-\2\2\u0141\u0143\3\2\2\2\u0142\u012f\3\2\2\2\u0143"+
		"\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0148\3\2"+
		"\2\2\u0146\u0144\3\2\2\2\u0147\u012c\3\2\2\2\u0147\u0144\3\2\2\2\u0148"+
		"\33\3\2\2\2\u0149\u014a\7\b\2\2\u014a\35\3\2\2\2\u014b\u014f\5\20\t\2"+
		"\u014c\u014e\5*\26\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d"+
		"\3\2\2\2\u014f\u0150\3\2\2\2\u0150\37\3\2\2\2\u0151\u014f\3\2\2\2\u0152"+
		"\u016a\7\24\2\2\u0153\u016a\7\25\2\2\u0154\u0155\7\26\2\2\u0155\u016a"+
		"\7@\2\2\u0156\u016a\7\27\2\2\u0157\u016a\7@\2\2\u0158\u016a\7\30\2\2\u0159"+
		"\u015a\7\31\2\2\u015a\u015c\7/\2\2\u015b\u015d\7@\2\2\u015c\u015b\3\2"+
		"\2\2\u015c\u015d\3\2\2\2\u015d\u0162\3\2\2\2\u015e\u015f\7.\2\2\u015f"+
		"\u0161\7@\2\2\u0160\u015e\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2"+
		"\2\2\u0162\u0163\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0165"+
		"\u0167\5\30\r\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3"+
		"\2\2\2\u0168\u016a\7\60\2\2\u0169\u0152\3\2\2\2\u0169\u0153\3\2\2\2\u0169"+
		"\u0154\3\2\2\2\u0169\u0156\3\2\2\2\u0169\u0157\3\2\2\2\u0169\u0158\3\2"+
		"\2\2\u0169\u0159\3\2\2\2\u016a!\3\2\2\2\u016b\u016c\t\2\2\2\u016c#\3\2"+
		"\2\2\u016d\u016e\b\23\1\2\u016e\u0173\5&\24\2\u016f\u0170\7<\2\2\u0170"+
		"\u0173\5&\24\2\u0171\u0173\5(\25\2\u0172\u016d\3\2\2\2\u0172\u016f\3\2"+
		"\2\2\u0172\u0171\3\2\2\2\u0173\u017c\3\2\2\2\u0174\u0175\f\7\2\2\u0175"+
		"\u0176\7;\2\2\u0176\u017b\5$\23\b\u0177\u0178\f\6\2\2\u0178\u0179\78\2"+
		"\2\u0179\u017b\5$\23\7\u017a\u0174\3\2\2\2\u017a\u0177\3\2\2\2\u017b\u017e"+
		"\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d%\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017f\u0180\t\3\2\2\u0180\'\3\2\2\2\u0181\u0182\b\25\1"+
		"\2\u0182\u018a\7?\2\2\u0183\u018a\7>\2\2\u0184\u0185\7/\2\2\u0185\u0186"+
		"\5(\25\2\u0186\u0187\7\60\2\2\u0187\u018a\3\2\2\2\u0188\u018a\7@\2\2\u0189"+
		"\u0181\3\2\2\2\u0189\u0183\3\2\2\2\u0189\u0184\3\2\2\2\u0189\u0188\3\2"+
		"\2\2\u018a\u0193\3\2\2\2\u018b\u018c\f\b\2\2\u018c\u018d\79\2\2\u018d"+
		"\u0192\5(\25\t\u018e\u018f\f\7\2\2\u018f\u0190\7:\2\2\u0190\u0192\5(\25"+
		"\b\u0191\u018b\3\2\2\2\u0191\u018e\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191"+
		"\3\2\2\2\u0193\u0194\3\2\2\2\u0194)\3\2\2\2\u0195\u0193\3\2\2\2\u0196"+
		"\u01f2\7\32\2\2\u0197\u01f2\7\33\2\2\u0198\u01f2\7\34\2\2\u0199\u019a"+
		"\7\35\2\2\u019a\u019b\5$\23\2\u019b\u019c\7\62\2\2\u019c\u019d\5\36\20"+
		"\2\u019d\u019e\7\37\2\2\u019e\u01f2\3\2\2\2\u019f\u01a0\7\36\2\2\u01a0"+
		"\u01a1\5.\30\2\u01a1\u01a2\7%\2\2\u01a2\u01a3\5$\23\2\u01a3\u01a4\7\t"+
		"\2\2\u01a4\u01ae\5.\30\2\u01a5\u01a6\7.\2\2\u01a6\u01a7\5.\30\2\u01a7"+
		"\u01a8\7%\2\2\u01a8\u01a9\5$\23\2\u01a9\u01aa\7\t\2\2\u01aa\u01ab\5.\30"+
		"\2\u01ab\u01ad\3\2\2\2\u01ac\u01a5\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac"+
		"\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1"+
		"\u01b2\7\62\2\2\u01b2\u01b3\5\36\20\2\u01b3\u01b4\7 \2\2\u01b4\u01f2\3"+
		"\2\2\2\u01b5\u01ba\5.\30\2\u01b6\u01b7\7.\2\2\u01b7\u01b9\5.\30\2\u01b8"+
		"\u01b6\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2"+
		"\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01be\7%\2\2\u01be"+
		"\u01bf\5$\23\2\u01bf\u01c0\7.\2\2\u01c0\u01c1\5$\23\2\u01c1\u01f2\3\2"+
		"\2\2\u01c2\u01c3\5.\30\2\u01c3\u01c4\5\32\16\2\u01c4\u01c5\7&\2\2\u01c5"+
		"\u01c6\5.\30\2\u01c6\u01c7\5\32\16\2\u01c7\u01f2\3\2\2\2\u01c8\u01c9\5"+
		".\30\2\u01c9\u01ca\5\32\16\2\u01ca\u01cb\7\64\2\2\u01cb\u01cc\5.\30\2"+
		"\u01cc\u01cd\5\32\16\2\u01cd\u01f2\3\2\2\2\u01ce\u01cf\5.\30\2\u01cf\u01d0"+
		"\5\32\16\2\u01d0\u01d1\7%\2\2\u01d1\u01d2\5.\30\2\u01d2\u01d3\5\32\16"+
		"\2\u01d3\u01f2\3\2\2\2\u01d4\u01d5\5.\30\2\u01d5\u01d6\5\32\16\2\u01d6"+
		"\u01d7\7%\2\2\u01d7\u01d8\7!\2\2\u01d8\u01dd\5.\30\2\u01d9\u01da\7)\2"+
		"\2\u01da\u01dc\5.\30\2\u01db\u01d9\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db"+
		"\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0"+
		"\u01ee\5,\27\2\u01e1\u01e2\7\61\2\2\u01e2\u01e7\5.\30\2\u01e3\u01e4\7"+
		")\2\2\u01e4\u01e6\5.\30\2\u01e5\u01e3\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7"+
		"\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01e7\3\2"+
		"\2\2\u01ea\u01eb\5,\27\2\u01eb\u01ed\3\2\2\2\u01ec\u01e1\3\2\2\2\u01ed"+
		"\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f2\3\2"+
		"\2\2\u01f0\u01ee\3\2\2\2\u01f1\u0196\3\2\2\2\u01f1\u0197\3\2\2\2\u01f1"+
		"\u0198\3\2\2\2\u01f1\u0199\3\2\2\2\u01f1\u019f\3\2\2\2\u01f1\u01b5\3\2"+
		"\2\2\u01f1\u01c2\3\2\2\2\u01f1\u01c8\3\2\2\2\u01f1\u01ce\3\2\2\2\u01f1"+
		"\u01d4\3\2\2\2\u01f2+\3\2\2\2\u01f3\u01f4\7/\2\2\u01f4\u01f9\5.\30\2\u01f5"+
		"\u01f6\7.\2\2\u01f6\u01f8\5.\30\2\u01f7\u01f5\3\2\2\2\u01f8\u01fb\3\2"+
		"\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fc\u01fd\7\60\2\2\u01fd-\3\2\2\2\u01fe\u0204\7@\2\2"+
		"\u01ff\u0204\5$\23\2\u0200\u0201\7\6\2\2\u0201\u0202\7@\2\2\u0202\u0204"+
		"\7\6\2\2\u0203\u01fe\3\2\2\2\u0203\u01ff\3\2\2\2\u0203\u0200\3\2\2\2\u0204"+
		"/\3\2\2\2D\61\66>FLPSW^eilot\177\u008f\u0092\u009a\u00a3\u00b4\u00b9\u00bc"+
		"\u00c0\u00c2\u00d0\u00d5\u00d8\u00de\u00e3\u00e8\u00ec\u00f1\u00f6\u00fa"+
		"\u00fc\u0105\u010d\u0112\u011b\u0121\u0125\u012c\u0133\u0139\u013d\u0144"+
		"\u0147\u014f\u015c\u0162\u0166\u0169\u0172\u017a\u017c\u0189\u0191\u0193"+
		"\u01ae\u01ba\u01dd\u01e7\u01ee\u01f1\u01f9\u0203";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}