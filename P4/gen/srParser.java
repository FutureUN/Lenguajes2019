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
		T__31=32, T__32=33, T__33=34, END=35, EXPRESSION=36, WRITE=37, FINAL=38, 
		GETARG=39, ASSIG=40, SWAP=41, DIFF=42, EQUAL=43, DOT=44, COLON=45, ADD=46, 
		OR=47, DIV=48, MOD=49, POW=50, MULT=51, SUBS=52, BRACE_L=53, BRACE_R=54, 
		COMA=55, PARENT_L=56, PARENT_R=57, SEMICOLON=58, EXECUTE=59, SEPARA=60, 
		LESS_THAN=61, GREAT_THAN=62, LESS_EQUAL=63, GREAT_EQUAL=64, ADD_ASSIGN=65, 
		PERCENT=66, BRACK_L=67, BRACK_R=68, ID_TOKEN=69, WP=70;
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
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode END() { return getToken(srParser.END, 0); }
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

			setState(70);
			body();
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
		public R_elementsContext r_elements() {
			return getRuleContext(R_elementsContext.class,0);
		}
		public TerminalNode END() { return getToken(srParser.END, 0); }
		public TerminalNode ID_TOKEN() { return getToken(srParser.ID_TOKEN, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
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
			setState(72);
			match(T__2);
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(73);
				match(ID_TOKEN);
				}
				break;
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENT_L) {
				{
				setState(76);
				parameters();
				}
			}

			setState(79);
			r_elements();
			setState(80);
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
		public Global_contentContext global_content() {
			return getRuleContext(Global_contentContext.class,0);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(srParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(srParser.SEMICOLON, i);
		}
		public List<R_declarationContext> r_declaration() {
			return getRuleContexts(R_declarationContext.class);
		}
		public R_declarationContext r_declaration(int i) {
			return getRuleContext(R_declarationContext.class,i);
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
		try {
			int _alt;
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(85); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(82);
						constant();
						setState(83);
						match(SEMICOLON);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(87); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(89);
				global_content();
				}
				break;
			case T__7:
			case T__8:
			case T__9:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(94); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(91);
						r_declaration();
						setState(92);
						match(SEMICOLON);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(96); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(98);
				global_content();
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
			setState(102);
			match(PARENT_L);
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(103);
				param_list();
				}
				break;
			}
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & ((1L << (COMA - 55)) | (1L << (SEMICOLON - 55)) | (1L << (ID_TOKEN - 55)))) != 0)) {
				{
				{
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(106);
					match(SEMICOLON);
					}
				}

				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(109);
					match(COMA);
					}
				}

				setState(112);
				param_list();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
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
		public List<TerminalNode> ID_TOKEN() { return getTokens(srParser.ID_TOKEN); }
		public TerminalNode ID_TOKEN(int i) {
			return getToken(srParser.ID_TOKEN, i);
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
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(ID_TOKEN);
				setState(121);
				if_array();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(122);
					match(COLON);
					setState(123);
					type();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(ID_TOKEN);
				setState(130);
				match(COLON);
				setState(131);
				type();
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(132);
						match(SEMICOLON);
						setState(133);
						match(ID_TOKEN);
						setState(134);
						match(COLON);
						setState(135);
						type();
						}
						} 
					}
					setState(140);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(T__3);
				setState(144);
				match(ID_TOKEN);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(145);
					match(COMA);
					setState(146);
					match(ID_TOKEN);
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(152);
					r_elements();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(T__4);
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
				setState(165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(164);
					r_elements();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(T__5);
				setState(168);
				match(ID_TOKEN);
				setState(169);
				parameters();
				setState(170);
				block();
				setState(171);
				match(END);
				setState(173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(172);
					r_elements();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				match(T__6);
				setState(176);
				match(ID_TOKEN);
				setState(177);
				parameters();
				setState(178);
				block();
				setState(179);
				match(END);
				setState(181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(180);
					r_elements();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				r_declaration();
				setState(185);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(184);
					r_elements();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(187);
				function_id();
				setState(188);
				parameters();
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(189);
					match(SEMICOLON);
					}
				}

				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(192);
					match(END);
					}
					break;
				}
				setState(196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(195);
					r_elements();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(198);
				statement();
				setState(200);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(199);
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
		public TerminalNode EQUAL() { return getToken(srParser.EQUAL, 0); }
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
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(T__7);
				setState(205);
				match(ID_TOKEN);
				setState(206);
				match(ASSIG);
				setState(207);
				expression();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(T__8);
				setState(209);
				match(ID_TOKEN);
				setState(210);
				match(EQUAL);
				setState(211);
				type();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(T__9);
				setState(213);
				match(ID_TOKEN);
				setState(214);
				match(EQUAL);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENT_L) {
					{
					setState(215);
					match(PARENT_L);
					}
				}

				setState(218);
				match(ID_TOKEN);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(219);
					match(COLON);
					setState(220);
					type();
					}
				}

				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENT_R) {
					{
					setState(223);
					match(PARENT_R);
					}
				}

				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(226);
					match(T__10);
					setState(227);
					match(ID_TOKEN);
					setState(228);
					match(COLON);
					setState(229);
					type();
					}
				}

				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				match(T__11);
				setState(233);
				match(ID_TOKEN);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENT_L) {
					{
					setState(234);
					parameters();
					}
				}

				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(237);
					match(COMA);
					setState(238);
					match(ID_TOKEN);
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PARENT_L) {
						{
						setState(239);
						parameters();
						}
					}

					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(247);
					match(COLON);
					setState(248);
					type();
					}
				}

				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				match(T__12);
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
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(262);
					type_def();
					}
				}

				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIG) {
					{
					setState(265);
					match(ASSIG);
					setState(266);
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
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				expression();
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(272);
						match(COMA);
						setState(273);
						assign_dec();
						}
						} 
					}
					setState(278);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(ID_TOKEN);
				setState(280);
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
			setState(283);
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
			setState(285);
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
			setState(287);
			match(COLON);
			setState(288);
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
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRACE_L) {
					{
					{
					setState(290);
					match(BRACE_L);
					setState(291);
					identifier();
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COLON) {
						{
						setState(292);
						match(COLON);
						setState(293);
						type();
						}
					}

					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(296);
						match(COMA);
						setState(297);
						identifier();
						setState(300);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COLON) {
							{
							setState(298);
							match(COLON);
							setState(299);
							type();
							}
						}

						}
						}
						setState(306);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(307);
					match(BRACE_R);
					}
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRACE_L) {
					{
					{
					setState(314);
					match(BRACE_L);
					setState(315);
					identifier();
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COLON) {
						{
						setState(316);
						match(COLON);
						setState(317);
						identifier();
						}
					}

					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(320);
						match(COMA);
						setState(321);
						identifier();
						setState(324);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COLON) {
							{
							setState(322);
							match(COLON);
							setState(323);
							identifier();
							}
						}

						}
						}
						setState(330);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(331);
					match(BRACE_R);
					}
					}
					setState(337);
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
			setState(340);
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
			setState(342);
			r_elements();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__16 - 17)) | (1L << (T__25 - 17)) | (1L << (T__26 - 17)) | (1L << (T__27 - 17)) | (1L << (T__28 - 17)) | (1L << (T__30 - 17)) | (1L << (EXPRESSION - 17)) | (1L << (ID_TOKEN - 17)))) != 0)) {
				{
				{
				setState(343);
				statement();
				}
				}
				setState(348);
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
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(ID_TOKEN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				match(T__16);
				setState(352);
				match(ID_TOKEN);
				setState(353);
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
			setState(356);
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
			setState(358);
			match(T__18);
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
			setState(360);
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
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				match(T__20);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				match(T__21);
				setState(365);
				match(ID_TOKEN);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 4);
				{
				setState(366);
				match(T__22);
				}
				break;
			case ID_TOKEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(367);
				match(ID_TOKEN);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 6);
				{
				setState(368);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 7);
				{
				setState(369);
				match(T__24);
				setState(370);
				match(PARENT_L);
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID_TOKEN) {
					{
					setState(371);
					match(ID_TOKEN);
					}
				}

				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(374);
					match(COMA);
					setState(375);
					match(ID_TOKEN);
					}
					}
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(381);
					type_def();
					}
				}

				setState(384);
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
			setState(387);
			_la = _input.LA(1);
			if ( !(((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (WRITE - 37)) | (1L << (FINAL - 37)) | (1L << (GETARG - 37)) | (1L << (ID_TOKEN - 37)))) != 0)) ) {
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
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				match(T__25);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				match(T__26);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				match(T__27);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(392);
				match(T__28);
				setState(393);
				expression();
				setState(394);
				match(EXECUTE);
				setState(395);
				block();
				setState(396);
				match(T__29);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(398);
				match(T__30);
				setState(399);
				identifier();
				setState(400);
				match(ASSIG);
				setState(401);
				expression();
				setState(402);
				match(T__31);
				setState(403);
				identifier();
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(404);
					match(COMA);
					setState(405);
					identifier();
					setState(406);
					match(ASSIG);
					setState(407);
					expression();
					setState(408);
					match(T__31);
					setState(409);
					identifier();
					}
					}
					setState(415);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(416);
				match(EXECUTE);
				setState(417);
				block();
				setState(418);
				match(T__32);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(420);
				identifier();
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(421);
					match(COMA);
					setState(422);
					identifier();
					}
					}
					setState(427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(428);
				match(ASSIG);
				setState(429);
				expression();
				{
				setState(430);
				match(COMA);
				setState(431);
				expression();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(433);
				identifier();
				setState(434);
				if_array();
				setState(435);
				match(SWAP);
				setState(436);
				identifier();
				setState(437);
				if_array();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(439);
				identifier();
				setState(440);
				if_array();
				setState(441);
				match(ADD_ASSIGN);
				setState(442);
				identifier();
				setState(443);
				if_array();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(445);
				identifier();
				setState(446);
				if_array();
				setState(447);
				match(ASSIG);
				setState(448);
				identifier();
				setState(449);
				if_array();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(451);
				identifier();
				setState(452);
				if_array();
				setState(453);
				match(ASSIG);
				setState(454);
				match(T__33);
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
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMICOLON) {
					{
					{
					setState(464);
					match(SEMICOLON);
					setState(465);
					identifier();
					setState(470);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DOT) {
						{
						{
						setState(466);
						match(DOT);
						setState(467);
						identifier();
						}
						}
						setState(472);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(473);
					ob_parameters();
					}
					}
					setState(479);
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
			setState(482);
			match(PARENT_L);
			setState(483);
			identifier();
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(484);
				match(COMA);
				setState(485);
				identifier();
				}
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(491);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u01f0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\5\2\64\n\2\3\2\6\2\67\n\2\r\2\16\28\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\5\4C\n\4\3\4\3\4\5\4G\n\4\3\4\3\4\3\5\3\5\5\5M\n\5\3\5\5\5P\n\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\6\6X\n\6\r\6\16\6Y\3\6\3\6\3\6\3\6\3\6\6\6a\n\6\r"+
		"\6\16\6b\3\6\3\6\5\6g\n\6\3\7\3\7\5\7k\n\7\3\7\5\7n\n\7\3\7\5\7q\n\7\3"+
		"\7\7\7t\n\7\f\7\16\7w\13\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\177\n\b\f\b\16"+
		"\b\u0082\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u008b\n\b\f\b\16\b\u008e"+
		"\13\b\5\b\u0090\n\b\3\t\3\t\3\t\3\t\7\t\u0096\n\t\f\t\16\t\u0099\13\t"+
		"\3\t\5\t\u009c\n\t\3\t\3\t\3\t\3\t\7\t\u00a2\n\t\f\t\16\t\u00a5\13\t\3"+
		"\t\5\t\u00a8\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b0\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u00b8\n\t\3\t\3\t\5\t\u00bc\n\t\3\t\3\t\3\t\5\t\u00c1\n\t"+
		"\3\t\5\t\u00c4\n\t\3\t\5\t\u00c7\n\t\3\t\3\t\5\t\u00cb\n\t\5\t\u00cd\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00db\n\n\3\n\3"+
		"\n\3\n\5\n\u00e0\n\n\3\n\5\n\u00e3\n\n\3\n\3\n\3\n\3\n\5\n\u00e9\n\n\3"+
		"\n\3\n\3\n\5\n\u00ee\n\n\3\n\3\n\3\n\5\n\u00f3\n\n\7\n\u00f5\n\n\f\n\16"+
		"\n\u00f8\13\n\3\n\3\n\5\n\u00fc\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0104"+
		"\n\n\f\n\16\n\u0107\13\n\3\n\5\n\u010a\n\n\3\n\3\n\5\n\u010e\n\n\5\n\u0110"+
		"\n\n\3\13\3\13\3\13\7\13\u0115\n\13\f\13\16\13\u0118\13\13\3\13\3\13\5"+
		"\13\u011c\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17"+
		"\u0129\n\17\3\17\3\17\3\17\3\17\5\17\u012f\n\17\7\17\u0131\n\17\f\17\16"+
		"\17\u0134\13\17\3\17\3\17\7\17\u0138\n\17\f\17\16\17\u013b\13\17\3\17"+
		"\3\17\3\17\3\17\5\17\u0141\n\17\3\17\3\17\3\17\3\17\5\17\u0147\n\17\7"+
		"\17\u0149\n\17\f\17\16\17\u014c\13\17\3\17\3\17\7\17\u0150\n\17\f\17\16"+
		"\17\u0153\13\17\5\17\u0155\n\17\3\20\3\20\3\21\3\21\7\21\u015b\n\21\f"+
		"\21\16\21\u015e\13\21\3\22\3\22\3\22\3\22\3\22\5\22\u0165\n\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\5\26\u0177\n\26\3\26\3\26\7\26\u017b\n\26\f\26\16\26\u017e\13\26\3"+
		"\26\5\26\u0181\n\26\3\26\5\26\u0184\n\26\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u019e\n\30\f\30\16\30\u01a1\13\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\7\30\u01aa\n\30\f\30\16\30\u01ad\13\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\7\30\u01cd\n\30\f\30\16\30\u01d0\13\30\3\30\3\30\3\30\3\30\3\30"+
		"\7\30\u01d7\n\30\f\30\16\30\u01da\13\30\3\30\3\30\7\30\u01de\n\30\f\30"+
		"\16\30\u01e1\13\30\5\30\u01e3\n\30\3\31\3\31\3\31\3\31\7\31\u01e9\n\31"+
		"\f\31\16\31\u01ec\13\31\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\2\4\4\2&&GG\4\2\')GG\2\u022d\2\63\3\2\2\2"+
		"\4:\3\2\2\2\6?\3\2\2\2\bJ\3\2\2\2\nf\3\2\2\2\fh\3\2\2\2\16\u008f\3\2\2"+
		"\2\20\u00cc\3\2\2\2\22\u010f\3\2\2\2\24\u011b\3\2\2\2\26\u011d\3\2\2\2"+
		"\30\u011f\3\2\2\2\32\u0121\3\2\2\2\34\u0154\3\2\2\2\36\u0156\3\2\2\2 "+
		"\u0158\3\2\2\2\"\u0164\3\2\2\2$\u0166\3\2\2\2&\u0168\3\2\2\2(\u016a\3"+
		"\2\2\2*\u0183\3\2\2\2,\u0185\3\2\2\2.\u01e2\3\2\2\2\60\u01e4\3\2\2\2\62"+
		"\64\5\4\3\2\63\62\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\67\5\6\4\2\66"+
		"\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29\3\3\2\2\2:;\7\3\2\2;<\7"+
		"G\2\2<=\5\n\6\2=>\7%\2\2>\5\3\2\2\2?@\7\4\2\2@B\7G\2\2AC\5\f\7\2BA\3\2"+
		"\2\2BC\3\2\2\2CD\3\2\2\2DF\5\20\t\2EG\7%\2\2FE\3\2\2\2FG\3\2\2\2GH\3\2"+
		"\2\2HI\5\b\5\2I\7\3\2\2\2JL\7\5\2\2KM\7G\2\2LK\3\2\2\2LM\3\2\2\2MO\3\2"+
		"\2\2NP\5\f\7\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\5\20\t\2RS\7%\2\2S\t\3"+
		"\2\2\2TU\5$\23\2UV\7<\2\2VX\3\2\2\2WT\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3"+
		"\2\2\2Z[\3\2\2\2[\\\5\n\6\2\\g\3\2\2\2]^\5\22\n\2^_\7<\2\2_a\3\2\2\2`"+
		"]\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\5\n\6\2eg\3\2\2\2"+
		"fW\3\2\2\2f`\3\2\2\2g\13\3\2\2\2hj\7:\2\2ik\5\16\b\2ji\3\2\2\2jk\3\2\2"+
		"\2ku\3\2\2\2ln\7<\2\2ml\3\2\2\2mn\3\2\2\2np\3\2\2\2oq\79\2\2po\3\2\2\2"+
		"pq\3\2\2\2qr\3\2\2\2rt\5\16\b\2sm\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2"+
		"\2vx\3\2\2\2wu\3\2\2\2xy\7;\2\2y\r\3\2\2\2z{\7G\2\2{\u0080\5\34\17\2|"+
		"}\7/\2\2}\177\5*\26\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0090\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7G"+
		"\2\2\u0084\u0085\7/\2\2\u0085\u008c\5*\26\2\u0086\u0087\7<\2\2\u0087\u0088"+
		"\7G\2\2\u0088\u0089\7/\2\2\u0089\u008b\5*\26\2\u008a\u0086\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0090\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008fz\3\2\2\2\u008f\u0083\3\2\2\2\u0090\17\3"+
		"\2\2\2\u0091\u0092\7\6\2\2\u0092\u0097\7G\2\2\u0093\u0094\79\2\2\u0094"+
		"\u0096\7G\2\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009c\5\20\t\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00cd\3"+
		"\2\2\2\u009d\u009e\7\7\2\2\u009e\u00a3\7G\2\2\u009f\u00a0\79\2\2\u00a0"+
		"\u00a2\7G\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a8\5\20\t\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00cd\3"+
		"\2\2\2\u00a9\u00aa\7\b\2\2\u00aa\u00ab\7G\2\2\u00ab\u00ac\5\f\7\2\u00ac"+
		"\u00ad\5 \21\2\u00ad\u00af\7%\2\2\u00ae\u00b0\5\20\t\2\u00af\u00ae\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00cd\3\2\2\2\u00b1\u00b2\7\t\2\2\u00b2"+
		"\u00b3\7G\2\2\u00b3\u00b4\5\f\7\2\u00b4\u00b5\5 \21\2\u00b5\u00b7\7%\2"+
		"\2\u00b6\u00b8\5\20\t\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00cd\3\2\2\2\u00b9\u00bb\5\22\n\2\u00ba\u00bc\5\20\t\2\u00bb\u00ba\3"+
		"\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00cd\3\2\2\2\u00bd\u00be\5,\27\2\u00be"+
		"\u00c0\5\f\7\2\u00bf\u00c1\7<\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c4\7%\2\2\u00c3\u00c2\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c7\5\20\t\2\u00c6\u00c5\3"+
		"\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00cd\3\2\2\2\u00c8\u00ca\5.\30\2\u00c9"+
		"\u00cb\5\20\t\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3"+
		"\2\2\2\u00cc\u0091\3\2\2\2\u00cc\u009d\3\2\2\2\u00cc\u00a9\3\2\2\2\u00cc"+
		"\u00b1\3\2\2\2\u00cc\u00b9\3\2\2\2\u00cc\u00bd\3\2\2\2\u00cc\u00c8\3\2"+
		"\2\2\u00cd\21\3\2\2\2\u00ce\u00cf\7\n\2\2\u00cf\u00d0\7G\2\2\u00d0\u00d1"+
		"\7*\2\2\u00d1\u0110\5(\25\2\u00d2\u00d3\7\13\2\2\u00d3\u00d4\7G\2\2\u00d4"+
		"\u00d5\7-\2\2\u00d5\u0110\5*\26\2\u00d6\u00d7\7\f\2\2\u00d7\u00d8\7G\2"+
		"\2\u00d8\u00da\7-\2\2\u00d9\u00db\7:\2\2\u00da\u00d9\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00df\7G\2\2\u00dd\u00de\7/\2\2\u00de"+
		"\u00e0\5*\26\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2"+
		"\2\2\u00e1\u00e3\7;\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e8\3\2\2\2\u00e4\u00e5\7\r\2\2\u00e5\u00e6\7G\2\2\u00e6\u00e7\7/\2"+
		"\2\u00e7\u00e9\5*\26\2\u00e8\u00e4\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u0110"+
		"\3\2\2\2\u00ea\u00eb\7\16\2\2\u00eb\u00ed\7G\2\2\u00ec\u00ee\5\f\7\2\u00ed"+
		"\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f6\3\2\2\2\u00ef\u00f0\79"+
		"\2\2\u00f0\u00f2\7G\2\2\u00f1\u00f3\5\f\7\2\u00f2\u00f1\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f5\u00f8\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fb\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f9\u00fa\7/\2\2\u00fa\u00fc\5*\26\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0110\3\2\2\2\u00fd\u00fe\7\17\2\2\u00fe"+
		"\u00ff\7G\2\2\u00ff\u0105\5\34\17\2\u0100\u0101\79\2\2\u0101\u0102\7G"+
		"\2\2\u0102\u0104\5\34\17\2\u0103\u0100\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0108\u010a\5\32\16\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010d\3\2\2\2\u010b\u010c\7*\2\2\u010c\u010e\5\24\13\2\u010d\u010b\3"+
		"\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u00ce\3\2\2\2\u010f"+
		"\u00d2\3\2\2\2\u010f\u00d6\3\2\2\2\u010f\u00ea\3\2\2\2\u010f\u00fd\3\2"+
		"\2\2\u0110\23\3\2\2\2\u0111\u0116\5(\25\2\u0112\u0113\79\2\2\u0113\u0115"+
		"\5\24\13\2\u0114\u0112\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2"+
		"\u0116\u0117\3\2\2\2\u0117\u011c\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a"+
		"\7G\2\2\u011a\u011c\5\34\17\2\u011b\u0111\3\2\2\2\u011b\u0119\3\2\2\2"+
		"\u011c\25\3\2\2\2\u011d\u011e\7\20\2\2\u011e\27\3\2\2\2\u011f\u0120\7"+
		"\21\2\2\u0120\31\3\2\2\2\u0121\u0122\7/\2\2\u0122\u0123\5*\26\2\u0123"+
		"\33\3\2\2\2\u0124\u0125\7\67\2\2\u0125\u0128\5\"\22\2\u0126\u0127\7/\2"+
		"\2\u0127\u0129\5*\26\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0132"+
		"\3\2\2\2\u012a\u012b\79\2\2\u012b\u012e\5\"\22\2\u012c\u012d\7/\2\2\u012d"+
		"\u012f\5*\26\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2"+
		"\2\2\u0130\u012a\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\78"+
		"\2\2\u0136\u0138\3\2\2\2\u0137\u0124\3\2\2\2\u0138\u013b\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0155\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013c\u013d\7\67\2\2\u013d\u0140\5\"\22\2\u013e\u013f\7/\2\2\u013f"+
		"\u0141\5\"\22\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u014a\3"+
		"\2\2\2\u0142\u0143\79\2\2\u0143\u0146\5\"\22\2\u0144\u0145\7/\2\2\u0145"+
		"\u0147\5\"\22\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3"+
		"\2\2\2\u0148\u0142\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\78"+
		"\2\2\u014e\u0150\3\2\2\2\u014f\u013c\3\2\2\2\u0150\u0153\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2"+
		"\2\2\u0154\u0139\3\2\2\2\u0154\u0151\3\2\2\2\u0155\35\3\2\2\2\u0156\u0157"+
		"\7\22\2\2\u0157\37\3\2\2\2\u0158\u015c\5\20\t\2\u0159\u015b\5.\30\2\u015a"+
		"\u0159\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2"+
		"\2\2\u015d!\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0165\7G\2\2\u0160\u0165"+
		"\5(\25\2\u0161\u0162\7\23\2\2\u0162\u0163\7G\2\2\u0163\u0165\7\23\2\2"+
		"\u0164\u015f\3\2\2\2\u0164\u0160\3\2\2\2\u0164\u0161\3\2\2\2\u0165#\3"+
		"\2\2\2\u0166\u0167\7\24\2\2\u0167%\3\2\2\2\u0168\u0169\7\25\2\2\u0169"+
		"\'\3\2\2\2\u016a\u016b\t\2\2\2\u016b)\3\2\2\2\u016c\u0184\7\26\2\2\u016d"+
		"\u0184\7\27\2\2\u016e\u016f\7\30\2\2\u016f\u0184\7G\2\2\u0170\u0184\7"+
		"\31\2\2\u0171\u0184\7G\2\2\u0172\u0184\7\32\2\2\u0173\u0174\7\33\2\2\u0174"+
		"\u0176\7:\2\2\u0175\u0177\7G\2\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2"+
		"\2\u0177\u017c\3\2\2\2\u0178\u0179\79\2\2\u0179\u017b\7G\2\2\u017a\u0178"+
		"\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0181\5\32\16\2\u0180\u017f\3"+
		"\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\7;\2\2\u0183"+
		"\u016c\3\2\2\2\u0183\u016d\3\2\2\2\u0183\u016e\3\2\2\2\u0183\u0170\3\2"+
		"\2\2\u0183\u0171\3\2\2\2\u0183\u0172\3\2\2\2\u0183\u0173\3\2\2\2\u0184"+
		"+\3\2\2\2\u0185\u0186\t\3\2\2\u0186-\3\2\2\2\u0187\u01e3\7\34\2\2\u0188"+
		"\u01e3\7\35\2\2\u0189\u01e3\7\36\2\2\u018a\u018b\7\37\2\2\u018b\u018c"+
		"\5(\25\2\u018c\u018d\7=\2\2\u018d\u018e\5 \21\2\u018e\u018f\7 \2\2\u018f"+
		"\u01e3\3\2\2\2\u0190\u0191\7!\2\2\u0191\u0192\5\"\22\2\u0192\u0193\7*"+
		"\2\2\u0193\u0194\5(\25\2\u0194\u0195\7\"\2\2\u0195\u019f\5\"\22\2\u0196"+
		"\u0197\79\2\2\u0197\u0198\5\"\22\2\u0198\u0199\7*\2\2\u0199\u019a\5(\25"+
		"\2\u019a\u019b\7\"\2\2\u019b\u019c\5\"\22\2\u019c\u019e\3\2\2\2\u019d"+
		"\u0196\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2"+
		"\2\2\u01a0\u01a2\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\7=\2\2\u01a3"+
		"\u01a4\5 \21\2\u01a4\u01a5\7#\2\2\u01a5\u01e3\3\2\2\2\u01a6\u01ab\5\""+
		"\22\2\u01a7\u01a8\79\2\2\u01a8\u01aa\5\"\22\2\u01a9\u01a7\3\2\2\2\u01aa"+
		"\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2"+
		"\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\7*\2\2\u01af\u01b0\5(\25\2\u01b0"+
		"\u01b1\79\2\2\u01b1\u01b2\5(\25\2\u01b2\u01e3\3\2\2\2\u01b3\u01b4\5\""+
		"\22\2\u01b4\u01b5\5\34\17\2\u01b5\u01b6\7+\2\2\u01b6\u01b7\5\"\22\2\u01b7"+
		"\u01b8\5\34\17\2\u01b8\u01e3\3\2\2\2\u01b9\u01ba\5\"\22\2\u01ba\u01bb"+
		"\5\34\17\2\u01bb\u01bc\7C\2\2\u01bc\u01bd\5\"\22\2\u01bd\u01be\5\34\17"+
		"\2\u01be\u01e3\3\2\2\2\u01bf\u01c0\5\"\22\2\u01c0\u01c1\5\34\17\2\u01c1"+
		"\u01c2\7*\2\2\u01c2\u01c3\5\"\22\2\u01c3\u01c4\5\34\17\2\u01c4\u01e3\3"+
		"\2\2\2\u01c5\u01c6\5\"\22\2\u01c6\u01c7\5\34\17\2\u01c7\u01c8\7*\2\2\u01c8"+
		"\u01c9\7$\2\2\u01c9\u01ce\5\"\22\2\u01ca\u01cb\7.\2\2\u01cb\u01cd\5\""+
		"\22\2\u01cc\u01ca\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01df\5\60"+
		"\31\2\u01d2\u01d3\7<\2\2\u01d3\u01d8\5\"\22\2\u01d4\u01d5\7.\2\2\u01d5"+
		"\u01d7\5\"\22\2\u01d6\u01d4\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3"+
		"\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01db\3\2\2\2\u01da\u01d8\3\2\2\2\u01db"+
		"\u01dc\5\60\31\2\u01dc\u01de\3\2\2\2\u01dd\u01d2\3\2\2\2\u01de\u01e1\3"+
		"\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1"+
		"\u01df\3\2\2\2\u01e2\u0187\3\2\2\2\u01e2\u0188\3\2\2\2\u01e2\u0189\3\2"+
		"\2\2\u01e2\u018a\3\2\2\2\u01e2\u0190\3\2\2\2\u01e2\u01a6\3\2\2\2\u01e2"+
		"\u01b3\3\2\2\2\u01e2\u01b9\3\2\2\2\u01e2\u01bf\3\2\2\2\u01e2\u01c5\3\2"+
		"\2\2\u01e3/\3\2\2\2\u01e4\u01e5\7:\2\2\u01e5\u01ea\5\"\22\2\u01e6\u01e7"+
		"\79\2\2\u01e7\u01e9\5\"\22\2\u01e8\u01e6\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea"+
		"\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01ea\3\2"+
		"\2\2\u01ed\u01ee\7;\2\2\u01ee\61\3\2\2\2B\638BFLOYbfjmpu\u0080\u008c\u008f"+
		"\u0097\u009b\u00a3\u00a7\u00af\u00b7\u00bb\u00c0\u00c3\u00c6\u00ca\u00cc"+
		"\u00da\u00df\u00e2\u00e8\u00ed\u00f2\u00f6\u00fb\u0105\u0109\u010d\u010f"+
		"\u0116\u011b\u0128\u012e\u0132\u0139\u0140\u0146\u014a\u0151\u0154\u015c"+
		"\u0164\u0176\u017c\u0180\u0183\u019f\u01ab\u01ce\u01d8\u01df\u01e2\u01ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}