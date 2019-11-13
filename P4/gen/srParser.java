// Generated from /home/jimmy/UNAL/UNAL/2019-2/lenguajes/Lenguajes2019/P4/grammar/sr.g4 by ANTLR 4.7.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, END=34, EXPRESSION=35, WRITE=36, FINAL=37, GETARG=38, 
		ASSIG=39, SWAP=40, DIFF=41, EQUAL=42, DOT=43, COLON=44, ADD=45, OR=46, 
		DIV=47, MOD=48, POW=49, MULT=50, SUBS=51, BRACE_L=52, BRACE_R=53, COMA=54, 
		PARENT_L=55, PARENT_R=56, SEMICOLON=57, EXECUTE=58, SEPARA=59, LESS_THAN=60, 
		GREAT_THAN=61, LESS_EQUAL=62, GREAT_EQUAL=63, ADD_ASSIGN=64, PERCENT=65, 
		BRACK_L=66, BRACK_R=67, ID_TOKEN=68, LINE_COMMENT=69, WP=70;
	public static final int
		RULE_init = 0, RULE_global = 1, RULE_resource = 2, RULE_body = 3, RULE_global_content = 4, 
		RULE_parameters = 5, RULE_param_list = 6, RULE_r_elements = 7, RULE_r_declaration = 8, 
		RULE_assign_dec = 9, RULE_op_function = 10, RULE_op_return = 11, RULE_type_def = 12, 
		RULE_if_array = 13, RULE_b_params = 14, RULE_block = 15, RULE_identifier = 16, 
		RULE_constant = 17, RULE_type_dec = 18, RULE_expression = 19, RULE_type = 20, 
		RULE_function_id = 21, RULE_statement = 22, RULE_ob_parameters = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "global", "resource", "body", "global_content", "parameters", 
			"param_list", "r_elements", "r_declaration", "assign_dec", "op_function", 
			"op_return", "type_def", "if_array", "b_params", "block", "identifier", 
			"constant", "type_dec", "expression", "type", "function_id", "statement", 
			"ob_parameters"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'global'", "'resource'", "'body'", "'extend'", "'import'", "'proc'", 
			"'procedure'", "'const'", "'type'", "'optype'", "'returns'", "'op'", 
			"'var'", "'op_function'", "'op_return'", "'b_params'", "'''", "'type_dec'", 
			"'int'", "'string'", "'cap'", "'real'", "'char'", "'rec'", "'skip'", 
			"'exit'", "'next'", "'if'", "'fi'", "'fa'", "'to'", "'af'", "'create'", 
			"'end'", null, "'write'", "'final'", "'getarg'", "':='", "':=:'", "'!='", 
			"'='", "'.'", "':'", "'+'", "'|'", "'/'", "'mod'", "'^'", "'*'", "'-'", 
			"'['", "']'", "','", "'('", "')'", "';'", "'->'", "'[]'", "'<'", "'>'", 
			"'<='", "'>='", "'+:='", "'%'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "END", "EXPRESSION", 
			"WRITE", "FINAL", "GETARG", "ASSIG", "SWAP", "DIFF", "EQUAL", "DOT", 
			"COLON", "ADD", "OR", "DIV", "MOD", "POW", "MULT", "SUBS", "BRACE_L", 
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
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(48);
				global();
				}
			}

			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				resource();
				}
				}
				setState(54); 
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
		public Global_contentContext global_content() {
			return getRuleContext(Global_contentContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);
			setState(57);
			match(ID_TOKEN);
			setState(58);
			global_content();
			setState(59);
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
		public R_elementsContext r_elements() {
			return getRuleContext(R_elementsContext.class,0);
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
			setState(61);
			match(T__1);
			setState(62);
			match(ID_TOKEN);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENT_L) {
				{
				setState(63);
				parameters();
				}
			}

			setState(66);
			r_elements();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END) {
				{
				setState(67);
				match(END);
				}
			}

			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(70);
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
		public R_elementsContext r_elements() {
			return getRuleContext(R_elementsContext.class,0);
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
			setState(73);
			match(T__2);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID_TOKEN) {
				{
				setState(74);
				match(ID_TOKEN);
				}
			}

			setState(77);
			parameters();
			setState(78);
			r_elements();
			setState(79);
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
		public Global_contentContext global_content() {
			return getRuleContext(Global_contentContext.class,0);
		}
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
			setState(81);
			r_declaration();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(82);
				match(SEMICOLON);
				}
			}

			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12))) != 0)) {
				{
				setState(85);
				global_content();
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
			setState(88);
			match(PARENT_L);
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(89);
				param_list();
				}
				break;
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__16 - 17)) | (1L << (EXPRESSION - 17)) | (1L << (COMA - 17)) | (1L << (SEMICOLON - 17)) | (1L << (ID_TOKEN - 17)))) != 0)) {
				{
				{
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(92);
					match(SEMICOLON);
					}
				}

				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(95);
					match(COMA);
					}
				}

				setState(98);
				param_list();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
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
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				identifier();
				setState(107);
				if_array();
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(108);
					match(COLON);
					setState(109);
					type();
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(ID_TOKEN);
				setState(116);
				match(COLON);
				setState(117);
				type();
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(118);
						match(SEMICOLON);
						setState(119);
						match(ID_TOKEN);
						setState(120);
						match(COLON);
						setState(121);
						type();
						}
						} 
					}
					setState(126);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public List<TerminalNode> ID_TOKEN() { return getTokens(srParser.ID_TOKEN); }
		public TerminalNode ID_TOKEN(int i) {
			return getToken(srParser.ID_TOKEN, i);
		}
		public List<TerminalNode> COMA() { return getTokens(srParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(srParser.COMA, i);
		}
		public R_elementsContext r_elements() {
			return getRuleContext(R_elementsContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(srParser.END, 0); }
		public R_declarationContext r_declaration() {
			return getRuleContext(R_declarationContext.class,0);
		}
		public Function_idContext function_id() {
			return getRuleContext(Function_idContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(srParser.SEMICOLON, 0); }
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
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(T__3);
				setState(130);
				match(ID_TOKEN);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(131);
					match(COMA);
					setState(132);
					match(ID_TOKEN);
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(138);
					r_elements();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(T__4);
				setState(142);
				match(ID_TOKEN);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(143);
					match(COMA);
					setState(144);
					match(ID_TOKEN);
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(150);
					r_elements();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(T__5);
				setState(154);
				match(ID_TOKEN);
				setState(155);
				parameters();
				setState(156);
				block();
				setState(157);
				match(END);
				setState(159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(158);
					r_elements();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(T__6);
				setState(162);
				match(ID_TOKEN);
				setState(163);
				parameters();
				setState(164);
				block();
				setState(165);
				match(END);
				setState(167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(166);
					r_elements();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				r_declaration();
				setState(171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(170);
					r_elements();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				function_id();
				setState(174);
				parameters();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(175);
					match(SEMICOLON);
					}
				}

				setState(179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(178);
					match(END);
					}
					break;
				}
				setState(182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(181);
					r_elements();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
				statement();
				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(185);
					r_elements();
					}
					break;
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
		public List<TerminalNode> ID_TOKEN() { return getTokens(srParser.ID_TOKEN); }
		public TerminalNode ID_TOKEN(int i) {
			return getToken(srParser.ID_TOKEN, i);
		}
		public TerminalNode ASSIG() { return getToken(srParser.ASSIG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode PARENT_L() { return getToken(srParser.PARENT_L, 0); }
		public List<TerminalNode> COLON() { return getTokens(srParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(srParser.COLON, i);
		}
		public TerminalNode PARENT_R() { return getToken(srParser.PARENT_R, 0); }
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
		public List<If_arrayContext> if_array() {
			return getRuleContexts(If_arrayContext.class);
		}
		public If_arrayContext if_array(int i) {
			return getRuleContext(If_arrayContext.class,i);
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
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(T__7);
				setState(191);
				match(ID_TOKEN);
				setState(192);
				match(ASSIG);
				setState(193);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(T__8);
				setState(195);
				match(ID_TOKEN);
				setState(196);
				match(ASSIG);
				setState(197);
				type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(T__9);
				setState(199);
				match(ID_TOKEN);
				setState(200);
				match(ASSIG);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENT_L) {
					{
					setState(201);
					match(PARENT_L);
					}
				}

				setState(204);
				match(ID_TOKEN);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(205);
					match(COLON);
					setState(206);
					type();
					}
				}

				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENT_R) {
					{
					setState(209);
					match(PARENT_R);
					}
				}

				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(212);
					match(T__10);
					setState(213);
					match(ID_TOKEN);
					setState(214);
					match(COLON);
					setState(215);
					type();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				match(T__11);
				setState(219);
				match(ID_TOKEN);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENT_L) {
					{
					setState(220);
					parameters();
					}
				}

				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(223);
					match(COMA);
					setState(224);
					match(ID_TOKEN);
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PARENT_L) {
						{
						setState(225);
						parameters();
						}
					}

					}
					}
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(233);
					match(COLON);
					setState(234);
					type();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				match(T__12);
				setState(238);
				match(ID_TOKEN);
				setState(239);
				if_array();
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(240);
					match(COMA);
					setState(241);
					match(ID_TOKEN);
					setState(242);
					if_array();
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(248);
					type_def();
					}
				}

				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIG) {
					{
					setState(251);
					match(ASSIG);
					setState(252);
					assign_dec();
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
				match(T__7);
				setState(256);
				match(ID_TOKEN);
				setState(257);
				match(ASSIG);
				setState(258);
				expression();
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
		enterRule(_localctx, 18, RULE_assign_dec);
		try {
			int _alt;
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				expression();
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(262);
						match(COMA);
						setState(263);
						assign_dec();
						}
						} 
					}
					setState(268);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(ID_TOKEN);
				setState(270);
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

	public static class Op_functionContext extends ParserRuleContext {
		public Op_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterOp_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitOp_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitOp_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_functionContext op_function() throws RecognitionException {
		Op_functionContext _localctx = new Op_functionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_op_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__13);
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

	public static class Op_returnContext extends ParserRuleContext {
		public Op_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterOp_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitOp_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitOp_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_returnContext op_return() throws RecognitionException {
		Op_returnContext _localctx = new Op_returnContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_op_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(T__14);
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
		enterRule(_localctx, 24, RULE_type_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(277);
			match(COLON);
			setState(278);
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
		enterRule(_localctx, 26, RULE_if_array);
		int _la;
		try {
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRACE_L) {
					{
					{
					setState(280);
					match(BRACE_L);
					setState(281);
					identifier();
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COLON) {
						{
						setState(282);
						match(COLON);
						setState(283);
						type();
						}
					}

					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(286);
						match(COMA);
						setState(287);
						identifier();
						setState(290);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COLON) {
							{
							setState(288);
							match(COLON);
							setState(289);
							type();
							}
						}

						}
						}
						setState(296);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(297);
					match(BRACE_R);
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRACE_L) {
					{
					{
					setState(304);
					match(BRACE_L);
					setState(305);
					identifier();
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COLON) {
						{
						setState(306);
						match(COLON);
						setState(307);
						identifier();
						}
					}

					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(310);
						match(COMA);
						setState(311);
						identifier();
						setState(314);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COLON) {
							{
							setState(312);
							match(COLON);
							setState(313);
							identifier();
							}
						}

						}
						}
						setState(320);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(321);
					match(BRACE_R);
					}
					}
					setState(327);
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
		enterRule(_localctx, 28, RULE_b_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__15);
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
		enterRule(_localctx, 30, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			r_elements();
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__16 - 17)) | (1L << (T__24 - 17)) | (1L << (T__25 - 17)) | (1L << (T__26 - 17)) | (1L << (T__27 - 17)) | (1L << (T__29 - 17)) | (1L << (EXPRESSION - 17)) | (1L << (ID_TOKEN - 17)))) != 0)) {
				{
				{
				setState(333);
				statement();
				}
				}
				setState(338);
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
		enterRule(_localctx, 32, RULE_identifier);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(ID_TOKEN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(341);
				match(T__16);
				setState(342);
				match(ID_TOKEN);
				setState(343);
				match(T__16);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode ID_TOKEN() { return getToken(srParser.ID_TOKEN, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(ID_TOKEN);
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

	public static class Type_decContext extends ParserRuleContext {
		public Type_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).enterType_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof srListener ) ((srListener)listener).exitType_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof srVisitor ) return ((srVisitor<? extends T>)visitor).visitType_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_decContext type_dec() throws RecognitionException {
		Type_decContext _localctx = new Type_decContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(T__17);
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
		public TerminalNode EXPRESSION() { return getToken(srParser.EXPRESSION, 0); }
		public TerminalNode ID_TOKEN() { return getToken(srParser.ID_TOKEN, 0); }
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
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_la = _input.LA(1);
			if ( !(_la==EXPRESSION || _la==ID_TOKEN) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public List<TerminalNode> ID_TOKEN() { return getTokens(srParser.ID_TOKEN); }
		public TerminalNode ID_TOKEN(int i) {
			return getToken(srParser.ID_TOKEN, i);
		}
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
		enterRule(_localctx, 40, RULE_type);
		int _la;
		try {
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				match(T__20);
				setState(355);
				match(ID_TOKEN);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
				match(T__21);
				}
				break;
			case ID_TOKEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(357);
				match(ID_TOKEN);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 6);
				{
				setState(358);
				match(T__22);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 7);
				{
				setState(359);
				match(T__23);
				setState(360);
				match(PARENT_L);
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID_TOKEN) {
					{
					setState(361);
					match(ID_TOKEN);
					}
				}

				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(364);
					match(COMA);
					setState(365);
					match(ID_TOKEN);
					}
					}
					setState(370);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(371);
					type_def();
					}
				}

				setState(374);
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
		enterRule(_localctx, 42, RULE_function_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_la = _input.LA(1);
			if ( !(((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (WRITE - 36)) | (1L << (FINAL - 36)) | (1L << (GETARG - 36)) | (1L << (ID_TOKEN - 36)))) != 0)) ) {
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

	public static class StatementContext extends ParserRuleContext {
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
		enterRule(_localctx, 44, RULE_statement);
		int _la;
		try {
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(T__24);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				match(T__25);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				match(T__26);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(382);
				match(T__27);
				setState(383);
				expression();
				setState(384);
				match(EXECUTE);
				setState(385);
				block();
				setState(386);
				match(T__28);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(388);
				match(T__29);
				setState(389);
				identifier();
				setState(390);
				match(ASSIG);
				setState(391);
				expression();
				setState(392);
				match(T__30);
				setState(393);
				identifier();
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(394);
					match(COMA);
					setState(395);
					identifier();
					setState(396);
					match(ASSIG);
					setState(397);
					expression();
					setState(398);
					match(T__30);
					setState(399);
					identifier();
					}
					}
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(406);
				match(EXECUTE);
				setState(407);
				block();
				setState(408);
				match(T__31);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(410);
				identifier();
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(411);
					match(COMA);
					setState(412);
					identifier();
					}
					}
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(418);
				match(ASSIG);
				setState(419);
				expression();
				{
				setState(420);
				match(COMA);
				setState(421);
				expression();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(423);
				identifier();
				setState(424);
				if_array();
				setState(425);
				match(SWAP);
				setState(426);
				identifier();
				setState(427);
				if_array();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(429);
				identifier();
				setState(430);
				if_array();
				setState(431);
				match(ADD_ASSIGN);
				setState(432);
				identifier();
				setState(433);
				if_array();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(435);
				identifier();
				setState(436);
				if_array();
				setState(437);
				match(ASSIG);
				setState(438);
				identifier();
				setState(439);
				if_array();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(441);
				identifier();
				setState(442);
				if_array();
				setState(443);
				match(ASSIG);
				setState(444);
				match(T__32);
				setState(445);
				identifier();
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(446);
					match(DOT);
					setState(447);
					identifier();
					}
					}
					setState(452);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(453);
				ob_parameters();
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMICOLON) {
					{
					{
					setState(454);
					match(SEMICOLON);
					setState(455);
					identifier();
					setState(460);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DOT) {
						{
						{
						setState(456);
						match(DOT);
						setState(457);
						identifier();
						}
						}
						setState(462);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(463);
					ob_parameters();
					}
					}
					setState(469);
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
		enterRule(_localctx, 46, RULE_ob_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(PARENT_L);
			setState(473);
			identifier();
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(474);
				match(COMA);
				setState(475);
				identifier();
				}
				}
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(481);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u01e6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\5\2\64\n\2\3\2\6\2\67\n\2\r\2\16\28\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\5\4C\n\4\3\4\3\4\5\4G\n\4\3\4\5\4J\n\4\3\5\3\5\5\5N\n\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\5\6V\n\6\3\6\5\6Y\n\6\3\7\3\7\5\7]\n\7\3\7\5\7`\n\7\3\7\5"+
		"\7c\n\7\3\7\7\7f\n\7\f\7\16\7i\13\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bq\n\b\f"+
		"\b\16\bt\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b}\n\b\f\b\16\b\u0080\13\b"+
		"\5\b\u0082\n\b\3\t\3\t\3\t\3\t\7\t\u0088\n\t\f\t\16\t\u008b\13\t\3\t\5"+
		"\t\u008e\n\t\3\t\3\t\3\t\3\t\7\t\u0094\n\t\f\t\16\t\u0097\13\t\3\t\5\t"+
		"\u009a\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a2\n\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00aa\n\t\3\t\3\t\5\t\u00ae\n\t\3\t\3\t\3\t\5\t\u00b3\n\t\3\t\5"+
		"\t\u00b6\n\t\3\t\5\t\u00b9\n\t\3\t\3\t\5\t\u00bd\n\t\5\t\u00bf\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00cd\n\n\3\n\3\n\3\n"+
		"\5\n\u00d2\n\n\3\n\5\n\u00d5\n\n\3\n\3\n\3\n\3\n\5\n\u00db\n\n\3\n\3\n"+
		"\3\n\5\n\u00e0\n\n\3\n\3\n\3\n\5\n\u00e5\n\n\7\n\u00e7\n\n\f\n\16\n\u00ea"+
		"\13\n\3\n\3\n\5\n\u00ee\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00f6\n\n\f\n"+
		"\16\n\u00f9\13\n\3\n\5\n\u00fc\n\n\3\n\3\n\5\n\u0100\n\n\3\n\3\n\3\n\3"+
		"\n\5\n\u0106\n\n\3\13\3\13\3\13\7\13\u010b\n\13\f\13\16\13\u010e\13\13"+
		"\3\13\3\13\5\13\u0112\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\5\17\u011f\n\17\3\17\3\17\3\17\3\17\5\17\u0125\n\17\7\17\u0127"+
		"\n\17\f\17\16\17\u012a\13\17\3\17\3\17\7\17\u012e\n\17\f\17\16\17\u0131"+
		"\13\17\3\17\3\17\3\17\3\17\5\17\u0137\n\17\3\17\3\17\3\17\3\17\5\17\u013d"+
		"\n\17\7\17\u013f\n\17\f\17\16\17\u0142\13\17\3\17\3\17\7\17\u0146\n\17"+
		"\f\17\16\17\u0149\13\17\5\17\u014b\n\17\3\20\3\20\3\21\3\21\7\21\u0151"+
		"\n\21\f\21\16\21\u0154\13\21\3\22\3\22\3\22\3\22\3\22\5\22\u015b\n\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u016d\n\26\3\26\3\26\7\26\u0171\n\26\f\26\16\26\u0174"+
		"\13\26\3\26\5\26\u0177\n\26\3\26\5\26\u017a\n\26\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\7\30\u0194\n\30\f\30\16\30\u0197\13\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u01a0\n\30\f\30\16\30\u01a3\13"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\7\30\u01c3\n\30\f\30\16\30\u01c6\13\30\3\30\3\30\3\30\3"+
		"\30\3\30\7\30\u01cd\n\30\f\30\16\30\u01d0\13\30\3\30\3\30\7\30\u01d4\n"+
		"\30\f\30\16\30\u01d7\13\30\5\30\u01d9\n\30\3\31\3\31\3\31\3\31\7\31\u01df"+
		"\n\31\f\31\16\31\u01e2\13\31\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\2\4\4\2%%FF\4\2&(FF\2\u0223\2\63\3\2\2"+
		"\2\4:\3\2\2\2\6?\3\2\2\2\bK\3\2\2\2\nS\3\2\2\2\fZ\3\2\2\2\16\u0081\3\2"+
		"\2\2\20\u00be\3\2\2\2\22\u0105\3\2\2\2\24\u0111\3\2\2\2\26\u0113\3\2\2"+
		"\2\30\u0115\3\2\2\2\32\u0117\3\2\2\2\34\u014a\3\2\2\2\36\u014c\3\2\2\2"+
		" \u014e\3\2\2\2\"\u015a\3\2\2\2$\u015c\3\2\2\2&\u015e\3\2\2\2(\u0160\3"+
		"\2\2\2*\u0179\3\2\2\2,\u017b\3\2\2\2.\u01d8\3\2\2\2\60\u01da\3\2\2\2\62"+
		"\64\5\4\3\2\63\62\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\67\5\6\4\2\66"+
		"\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29\3\3\2\2\2:;\7\3\2\2;<\7"+
		"F\2\2<=\5\n\6\2=>\7$\2\2>\5\3\2\2\2?@\7\4\2\2@B\7F\2\2AC\5\f\7\2BA\3\2"+
		"\2\2BC\3\2\2\2CD\3\2\2\2DF\5\20\t\2EG\7$\2\2FE\3\2\2\2FG\3\2\2\2GI\3\2"+
		"\2\2HJ\5\b\5\2IH\3\2\2\2IJ\3\2\2\2J\7\3\2\2\2KM\7\5\2\2LN\7F\2\2ML\3\2"+
		"\2\2MN\3\2\2\2NO\3\2\2\2OP\5\f\7\2PQ\5\20\t\2QR\7$\2\2R\t\3\2\2\2SU\5"+
		"\22\n\2TV\7;\2\2UT\3\2\2\2UV\3\2\2\2VX\3\2\2\2WY\5\n\6\2XW\3\2\2\2XY\3"+
		"\2\2\2Y\13\3\2\2\2Z\\\79\2\2[]\5\16\b\2\\[\3\2\2\2\\]\3\2\2\2]g\3\2\2"+
		"\2^`\7;\2\2_^\3\2\2\2_`\3\2\2\2`b\3\2\2\2ac\78\2\2ba\3\2\2\2bc\3\2\2\2"+
		"cd\3\2\2\2df\5\16\b\2e_\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2"+
		"\2ig\3\2\2\2jk\7:\2\2k\r\3\2\2\2lm\5\"\22\2mr\5\34\17\2no\7.\2\2oq\5*"+
		"\26\2pn\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\u0082\3\2\2\2tr\3\2\2\2"+
		"uv\7F\2\2vw\7.\2\2w~\5*\26\2xy\7;\2\2yz\7F\2\2z{\7.\2\2{}\5*\26\2|x\3"+
		"\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0082\3\2\2\2\u0080~"+
		"\3\2\2\2\u0081l\3\2\2\2\u0081u\3\2\2\2\u0082\17\3\2\2\2\u0083\u0084\7"+
		"\6\2\2\u0084\u0089\7F\2\2\u0085\u0086\78\2\2\u0086\u0088\7F\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\5\20\t\2\u008d"+
		"\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u00bf\3\2\2\2\u008f\u0090\7\7"+
		"\2\2\u0090\u0095\7F\2\2\u0091\u0092\78\2\2\u0092\u0094\7F\2\2\u0093\u0091"+
		"\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\5\20\t\2\u0099\u0098\3"+
		"\2\2\2\u0099\u009a\3\2\2\2\u009a\u00bf\3\2\2\2\u009b\u009c\7\b\2\2\u009c"+
		"\u009d\7F\2\2\u009d\u009e\5\f\7\2\u009e\u009f\5 \21\2\u009f\u00a1\7$\2"+
		"\2\u00a0\u00a2\5\20\t\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00bf\3\2\2\2\u00a3\u00a4\7\t\2\2\u00a4\u00a5\7F\2\2\u00a5\u00a6\5\f"+
		"\7\2\u00a6\u00a7\5 \21\2\u00a7\u00a9\7$\2\2\u00a8\u00aa\5\20\t\2\u00a9"+
		"\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00bf\3\2\2\2\u00ab\u00ad\5\22"+
		"\n\2\u00ac\u00ae\5\20\t\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00bf\3\2\2\2\u00af\u00b0\5,\27\2\u00b0\u00b2\5\f\7\2\u00b1\u00b3\7;"+
		"\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00b6\7$\2\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2"+
		"\2\2\u00b7\u00b9\5\20\t\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bf\3\2\2\2\u00ba\u00bc\5.\30\2\u00bb\u00bd\5\20\t\2\u00bc\u00bb\3"+
		"\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u0083\3\2\2\2\u00be"+
		"\u008f\3\2\2\2\u00be\u009b\3\2\2\2\u00be\u00a3\3\2\2\2\u00be\u00ab\3\2"+
		"\2\2\u00be\u00af\3\2\2\2\u00be\u00ba\3\2\2\2\u00bf\21\3\2\2\2\u00c0\u00c1"+
		"\7\n\2\2\u00c1\u00c2\7F\2\2\u00c2\u00c3\7)\2\2\u00c3\u0106\5(\25\2\u00c4"+
		"\u00c5\7\13\2\2\u00c5\u00c6\7F\2\2\u00c6\u00c7\7)\2\2\u00c7\u0106\5*\26"+
		"\2\u00c8\u00c9\7\f\2\2\u00c9\u00ca\7F\2\2\u00ca\u00cc\7)\2\2\u00cb\u00cd"+
		"\79\2\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00d1\7F\2\2\u00cf\u00d0\7.\2\2\u00d0\u00d2\5*\26\2\u00d1\u00cf\3\2\2"+
		"\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d5\7:\2\2\u00d4\u00d3"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00da\3\2\2\2\u00d6\u00d7\7\r\2\2\u00d7"+
		"\u00d8\7F\2\2\u00d8\u00d9\7.\2\2\u00d9\u00db\5*\26\2\u00da\u00d6\3\2\2"+
		"\2\u00da\u00db\3\2\2\2\u00db\u0106\3\2\2\2\u00dc\u00dd\7\16\2\2\u00dd"+
		"\u00df\7F\2\2\u00de\u00e0\5\f\7\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e8\3\2\2\2\u00e1\u00e2\78\2\2\u00e2\u00e4\7F\2\2\u00e3\u00e5"+
		"\5\f\7\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00e1\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00ed\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7.\2\2\u00ec"+
		"\u00ee\5*\26\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u0106\3\2"+
		"\2\2\u00ef\u00f0\7\17\2\2\u00f0\u00f1\7F\2\2\u00f1\u00f7\5\34\17\2\u00f2"+
		"\u00f3\78\2\2\u00f3\u00f4\7F\2\2\u00f4\u00f6\5\34\17\2\u00f5\u00f2\3\2"+
		"\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fc\5\32\16\2\u00fb\u00fa\3"+
		"\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fe\7)\2\2\u00fe"+
		"\u0100\5\24\13\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0106\3"+
		"\2\2\2\u0101\u0102\7\n\2\2\u0102\u0103\7F\2\2\u0103\u0104\7)\2\2\u0104"+
		"\u0106\5(\25\2\u0105\u00c0\3\2\2\2\u0105\u00c4\3\2\2\2\u0105\u00c8\3\2"+
		"\2\2\u0105\u00dc\3\2\2\2\u0105\u00ef\3\2\2\2\u0105\u0101\3\2\2\2\u0106"+
		"\23\3\2\2\2\u0107\u010c\5(\25\2\u0108\u0109\78\2\2\u0109\u010b\5\24\13"+
		"\2\u010a\u0108\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d\u0112\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7F\2\2\u0110"+
		"\u0112\5\34\17\2\u0111\u0107\3\2\2\2\u0111\u010f\3\2\2\2\u0112\25\3\2"+
		"\2\2\u0113\u0114\7\20\2\2\u0114\27\3\2\2\2\u0115\u0116\7\21\2\2\u0116"+
		"\31\3\2\2\2\u0117\u0118\7.\2\2\u0118\u0119\5*\26\2\u0119\33\3\2\2\2\u011a"+
		"\u011b\7\66\2\2\u011b\u011e\5\"\22\2\u011c\u011d\7.\2\2\u011d\u011f\5"+
		"*\26\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0128\3\2\2\2\u0120"+
		"\u0121\78\2\2\u0121\u0124\5\"\22\2\u0122\u0123\7.\2\2\u0123\u0125\5*\26"+
		"\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0120"+
		"\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\7\67\2\2\u012c\u012e\3"+
		"\2\2\2\u012d\u011a\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u014b\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\7\66"+
		"\2\2\u0133\u0136\5\"\22\2\u0134\u0135\7.\2\2\u0135\u0137\5\"\22\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0140\3\2\2\2\u0138\u0139\78"+
		"\2\2\u0139\u013c\5\"\22\2\u013a\u013b\7.\2\2\u013b\u013d\5\"\22\2\u013c"+
		"\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u0138\3\2"+
		"\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7\67\2\2\u0144\u0146\3"+
		"\2\2\2\u0145\u0132\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u012f\3\2"+
		"\2\2\u014a\u0147\3\2\2\2\u014b\35\3\2\2\2\u014c\u014d\7\22\2\2\u014d\37"+
		"\3\2\2\2\u014e\u0152\5\20\t\2\u014f\u0151\5.\30\2\u0150\u014f\3\2\2\2"+
		"\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153!\3"+
		"\2\2\2\u0154\u0152\3\2\2\2\u0155\u015b\7F\2\2\u0156\u015b\5(\25\2\u0157"+
		"\u0158\7\23\2\2\u0158\u0159\7F\2\2\u0159\u015b\7\23\2\2\u015a\u0155\3"+
		"\2\2\2\u015a\u0156\3\2\2\2\u015a\u0157\3\2\2\2\u015b#\3\2\2\2\u015c\u015d"+
		"\7F\2\2\u015d%\3\2\2\2\u015e\u015f\7\24\2\2\u015f\'\3\2\2\2\u0160\u0161"+
		"\t\2\2\2\u0161)\3\2\2\2\u0162\u017a\7\25\2\2\u0163\u017a\7\26\2\2\u0164"+
		"\u0165\7\27\2\2\u0165\u017a\7F\2\2\u0166\u017a\7\30\2\2\u0167\u017a\7"+
		"F\2\2\u0168\u017a\7\31\2\2\u0169\u016a\7\32\2\2\u016a\u016c\79\2\2\u016b"+
		"\u016d\7F\2\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0172\3\2"+
		"\2\2\u016e\u016f\78\2\2\u016f\u0171\7F\2\2\u0170\u016e\3\2\2\2\u0171\u0174"+
		"\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0176\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0175\u0177\5\32\16\2\u0176\u0175\3\2\2\2\u0176\u0177\3"+
		"\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\7:\2\2\u0179\u0162\3\2\2\2\u0179"+
		"\u0163\3\2\2\2\u0179\u0164\3\2\2\2\u0179\u0166\3\2\2\2\u0179\u0167\3\2"+
		"\2\2\u0179\u0168\3\2\2\2\u0179\u0169\3\2\2\2\u017a+\3\2\2\2\u017b\u017c"+
		"\t\3\2\2\u017c-\3\2\2\2\u017d\u01d9\7\33\2\2\u017e\u01d9\7\34\2\2\u017f"+
		"\u01d9\7\35\2\2\u0180\u0181\7\36\2\2\u0181\u0182\5(\25\2\u0182\u0183\7"+
		"<\2\2\u0183\u0184\5 \21\2\u0184\u0185\7\37\2\2\u0185\u01d9\3\2\2\2\u0186"+
		"\u0187\7 \2\2\u0187\u0188\5\"\22\2\u0188\u0189\7)\2\2\u0189\u018a\5(\25"+
		"\2\u018a\u018b\7!\2\2\u018b\u0195\5\"\22\2\u018c\u018d\78\2\2\u018d\u018e"+
		"\5\"\22\2\u018e\u018f\7)\2\2\u018f\u0190\5(\25\2\u0190\u0191\7!\2\2\u0191"+
		"\u0192\5\"\22\2\u0192\u0194\3\2\2\2\u0193\u018c\3\2\2\2\u0194\u0197\3"+
		"\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198\3\2\2\2\u0197"+
		"\u0195\3\2\2\2\u0198\u0199\7<\2\2\u0199\u019a\5 \21\2\u019a\u019b\7\""+
		"\2\2\u019b\u01d9\3\2\2\2\u019c\u01a1\5\"\22\2\u019d\u019e\78\2\2\u019e"+
		"\u01a0\5\"\22\2\u019f\u019d\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3"+
		"\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4"+
		"\u01a5\7)\2\2\u01a5\u01a6\5(\25\2\u01a6\u01a7\78\2\2\u01a7\u01a8\5(\25"+
		"\2\u01a8\u01d9\3\2\2\2\u01a9\u01aa\5\"\22\2\u01aa\u01ab\5\34\17\2\u01ab"+
		"\u01ac\7*\2\2\u01ac\u01ad\5\"\22\2\u01ad\u01ae\5\34\17\2\u01ae\u01d9\3"+
		"\2\2\2\u01af\u01b0\5\"\22\2\u01b0\u01b1\5\34\17\2\u01b1\u01b2\7B\2\2\u01b2"+
		"\u01b3\5\"\22\2\u01b3\u01b4\5\34\17\2\u01b4\u01d9\3\2\2\2\u01b5\u01b6"+
		"\5\"\22\2\u01b6\u01b7\5\34\17\2\u01b7\u01b8\7)\2\2\u01b8\u01b9\5\"\22"+
		"\2\u01b9\u01ba\5\34\17\2\u01ba\u01d9\3\2\2\2\u01bb\u01bc\5\"\22\2\u01bc"+
		"\u01bd\5\34\17\2\u01bd\u01be\7)\2\2\u01be\u01bf\7#\2\2\u01bf\u01c4\5\""+
		"\22\2\u01c0\u01c1\7-\2\2\u01c1\u01c3\5\"\22\2\u01c2\u01c0\3\2\2\2\u01c3"+
		"\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2"+
		"\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01d5\5\60\31\2\u01c8\u01c9\7;\2\2\u01c9"+
		"\u01ce\5\"\22\2\u01ca\u01cb\7-\2\2\u01cb\u01cd\5\"\22\2\u01cc\u01ca\3"+
		"\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d2\5\60\31\2\u01d2\u01d4\3"+
		"\2\2\2\u01d3\u01c8\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u017d\3\2"+
		"\2\2\u01d8\u017e\3\2\2\2\u01d8\u017f\3\2\2\2\u01d8\u0180\3\2\2\2\u01d8"+
		"\u0186\3\2\2\2\u01d8\u019c\3\2\2\2\u01d8\u01a9\3\2\2\2\u01d8\u01af\3\2"+
		"\2\2\u01d8\u01b5\3\2\2\2\u01d8\u01bb\3\2\2\2\u01d9/\3\2\2\2\u01da\u01db"+
		"\79\2\2\u01db\u01e0\5\"\22\2\u01dc\u01dd\78\2\2\u01dd\u01df\5\"\22\2\u01de"+
		"\u01dc\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2"+
		"\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e4\7:\2\2\u01e4"+
		"\61\3\2\2\2A\638BFIMUX\\_bgr~\u0081\u0089\u008d\u0095\u0099\u00a1\u00a9"+
		"\u00ad\u00b2\u00b5\u00b8\u00bc\u00be\u00cc\u00d1\u00d4\u00da\u00df\u00e4"+
		"\u00e8\u00ed\u00f7\u00fb\u00ff\u0105\u010c\u0111\u011e\u0124\u0128\u012f"+
		"\u0136\u013c\u0140\u0147\u014a\u0152\u015a\u016c\u0172\u0176\u0179\u0195"+
		"\u01a1\u01c4\u01ce\u01d5\u01d8\u01e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}