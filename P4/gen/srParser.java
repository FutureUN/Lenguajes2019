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
		T__31=32, T__32=33, T__33=34, T__34=35, END=36, EXPRESSION=37, ID_TOKEN=38, 
		GLOBAL=39, BODY=40, SEMI=41, LPAREN=42, RPAREN=43, LBRACK=44, COMMA=45, 
		RBRACK=46, R_ELEMENTS=47, B_PARAMS=48, CONSTANT=49, TYPE_DEC=50, TK_LPAREN=51, 
		WP=52;
	public static final int
		RULE_init = 0, RULE_global = 1, RULE_resource = 2, RULE_body = 3, RULE_global_content = 4, 
		RULE_parameters = 5, RULE_param_list = 6, RULE_r_elements = 7, RULE_r_declaration = 8, 
		RULE_assign_dec = 9, RULE_op_function = 10, RULE_op_return = 11, RULE_type_def = 12, 
		RULE_if_array = 13, RULE_b_params = 14, RULE_block = 15, RULE_identifier = 16, 
		RULE_constant = 17, RULE_type_dec = 18, RULE_expression = 19, RULE_type = 20, 
		RULE_function_id = 21, RULE_statement = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "global", "resource", "body", "global_content", "parameters", 
			"param_list", "r_elements", "r_declaration", "assign_dec", "op_function", 
			"op_return", "type_def", "if_array", "b_params", "block", "identifier", 
			"constant", "type_dec", "expression", "type", "function_id", "statement"
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
		public ResourceContext resource() {
			return getRuleContext(ResourceContext.class,0);
		}
		public GlobalContext global() {
			return getRuleContext(GlobalContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
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
			if (_la==GLOBAL) {
				{
				setState(46);
				global();
				}
			}

			setState(49);
			resource();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BODY) {
				{
				setState(50);
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

	public static class GlobalContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(srParser.GLOBAL, 0); }
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
			setState(53);
			match(GLOBAL);
			setState(54);
			match(ID_TOKEN);
			setState(55);
			global_content();
			setState(56);
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
			setState(58);
			match(T__0);
			setState(59);
			match(ID_TOKEN);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(60);
				parameters();
				}
			}

			setState(63);
			r_elements();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END) {
				{
				setState(64);
				match(END);
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
		public TerminalNode BODY() { return getToken(srParser.BODY, 0); }
		public B_paramsContext b_params() {
			return getRuleContext(B_paramsContext.class,0);
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
			setState(67);
			match(BODY);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID_TOKEN) {
				{
				setState(68);
				match(ID_TOKEN);
				}
			}

			setState(71);
			b_params();
			setState(72);
			r_elements();
			setState(73);
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
		public List<TerminalNode> SEMI() { return getTokens(srParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(srParser.SEMI, i);
		}
		public List<Type_decContext> type_dec() {
			return getRuleContexts(Type_decContext.class);
		}
		public Type_decContext type_dec(int i) {
			return getRuleContext(Type_decContext.class,i);
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
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(78); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(75);
						constant();
						setState(76);
						match(SEMI);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(80); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(82);
				global_content();
				}
				break;
			case TYPE_DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(87); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(84);
						type_dec();
						setState(85);
						match(SEMI);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(89); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(91);
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
		public TerminalNode LPAREN() { return getToken(srParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(srParser.RPAREN, 0); }
		public List<Param_listContext> param_list() {
			return getRuleContexts(Param_listContext.class);
		}
		public Param_listContext param_list(int i) {
			return getRuleContext(Param_listContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(srParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(srParser.COMMA, i);
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
			setState(95);
			match(LPAREN);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID_TOKEN) {
				{
				setState(96);
				param_list();
				}
			}

			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(99);
				match(COMMA);
				setState(100);
				param_list();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(RPAREN);
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
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(srParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(srParser.SEMI, i);
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
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(ID_TOKEN);
				setState(109);
				if_array();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(ID_TOKEN);
				setState(111);
				match(T__1);
				setState(112);
				type();
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(113);
					match(SEMI);
					setState(114);
					match(ID_TOKEN);
					setState(115);
					match(T__1);
					setState(116);
					type();
					}
					}
					setState(121);
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

	public static class R_elementsContext extends ParserRuleContext {
		public List<TerminalNode> ID_TOKEN() { return getTokens(srParser.ID_TOKEN); }
		public TerminalNode ID_TOKEN(int i) {
			return getToken(srParser.ID_TOKEN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(srParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(srParser.COMMA, i);
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
		public TerminalNode LPAREN() { return getToken(srParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(srParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(srParser.SEMI, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
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
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__2);
				setState(125);
				match(ID_TOKEN);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(126);
					match(COMMA);
					setState(127);
					match(ID_TOKEN);
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__22) | (1L << T__23))) != 0)) {
					{
					setState(133);
					r_elements();
					}
				}

				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(T__3);
				setState(137);
				match(ID_TOKEN);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(138);
					match(COMMA);
					setState(139);
					match(ID_TOKEN);
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__22) | (1L << T__23))) != 0)) {
					{
					setState(145);
					r_elements();
					}
				}

				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(T__4);
				setState(149);
				match(ID_TOKEN);
				setState(150);
				parameters();
				setState(151);
				block();
				setState(152);
				match(END);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__22) | (1L << T__23))) != 0)) {
					{
					setState(153);
					r_elements();
					}
				}

				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				match(T__5);
				setState(157);
				match(ID_TOKEN);
				setState(158);
				parameters();
				setState(159);
				block();
				setState(160);
				match(END);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__22) | (1L << T__23))) != 0)) {
					{
					setState(161);
					r_elements();
					}
				}

				}
				break;
			case T__6:
			case T__8:
			case T__10:
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				r_declaration();
				setState(165);
				r_elements();
				}
				break;
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				function_id();
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(168);
					match(LPAREN);
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EXPRESSION || _la==ID_TOKEN) {
						{
						setState(169);
						identifier();
						}
					}

					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(172);
						match(COMMA);
						setState(173);
						identifier();
						}
						}
						setState(178);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(179);
					match(RPAREN);
					}
				}

				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(182);
					match(SEMI);
					}
				}

				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__22) | (1L << T__23))) != 0)) {
					{
					setState(185);
					r_elements();
					}
				}

				setState(188);
				match(END);
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

	public static class R_declarationContext extends ParserRuleContext {
		public List<TerminalNode> ID_TOKEN() { return getTokens(srParser.ID_TOKEN); }
		public TerminalNode ID_TOKEN(int i) {
			return getToken(srParser.ID_TOKEN, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(srParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(srParser.RPAREN, 0); }
		public List<ParametersContext> parameters() {
			return getRuleContexts(ParametersContext.class);
		}
		public ParametersContext parameters(int i) {
			return getRuleContext(ParametersContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(srParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(srParser.COMMA, i);
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
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(T__6);
				setState(193);
				match(ID_TOKEN);
				setState(194);
				match(T__7);
				setState(195);
				expression();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(T__8);
				setState(197);
				match(ID_TOKEN);
				setState(198);
				match(T__9);
				setState(199);
				type();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(T__10);
				setState(201);
				match(ID_TOKEN);
				setState(202);
				match(T__9);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(203);
					match(LPAREN);
					}
				}

				setState(206);
				match(ID_TOKEN);
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(207);
					match(T__1);
					setState(208);
					type();
					}
				}

				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RPAREN) {
					{
					setState(211);
					match(RPAREN);
					}
				}

				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(214);
					match(T__11);
					setState(215);
					match(ID_TOKEN);
					setState(216);
					match(T__1);
					setState(217);
					type();
					}
				}

				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				match(T__12);
				setState(221);
				match(ID_TOKEN);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(222);
					parameters();
					}
				}

				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(225);
					match(COMMA);
					setState(226);
					match(ID_TOKEN);
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LPAREN) {
						{
						setState(227);
						parameters();
						}
					}

					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(235);
					match(T__1);
					setState(236);
					type();
					}
				}

				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(239);
				match(T__13);
				setState(240);
				match(ID_TOKEN);
				setState(241);
				if_array();
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(242);
					match(COMMA);
					setState(243);
					match(ID_TOKEN);
					setState(244);
					if_array();
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(250);
					type_def();
					}
				}

				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(253);
					match(T__7);
					setState(254);
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
		public List<TerminalNode> COMMA() { return getTokens(srParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(srParser.COMMA, i);
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
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				expression();
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(260);
						match(COMMA);
						setState(261);
						assign_dec();
						}
						} 
					}
					setState(266);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(ID_TOKEN);
				setState(268);
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
			setState(271);
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
			setState(273);
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

	public static class Type_defContext extends ParserRuleContext {
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
			setState(275);
			match(T__1);
			setState(276);
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
		public List<TerminalNode> LBRACK() { return getTokens(srParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(srParser.LBRACK, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(srParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(srParser.RBRACK, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(srParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(srParser.COMMA, i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(278);
				match(LBRACK);
				setState(279);
				identifier();
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(280);
					match(T__1);
					setState(281);
					type();
					}
				}

				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(284);
					match(COMMA);
					setState(285);
					identifier();
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(286);
						match(T__1);
						setState(287);
						type();
						}
					}

					}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(295);
				match(RBRACK);
				}
				}
				setState(301);
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

	public static class B_paramsContext extends ParserRuleContext {
		public TerminalNode B_PARAMS() { return getToken(srParser.B_PARAMS, 0); }
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
			setState(302);
			match(B_PARAMS);
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
		public List<R_declarationContext> r_declaration() {
			return getRuleContexts(R_declarationContext.class);
		}
		public R_declarationContext r_declaration(int i) {
			return getRuleContext(R_declarationContext.class,i);
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
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__13))) != 0)) {
				{
				{
				setState(304);
				r_declaration();
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__30) | (1L << EXPRESSION) | (1L << ID_TOKEN))) != 0)) {
				{
				{
				setState(310);
				statement();
				}
				}
				setState(315);
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
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(ID_TOKEN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode CONSTANT() { return getToken(srParser.CONSTANT, 0); }
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
			setState(320);
			match(CONSTANT);
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
		public TerminalNode TYPE_DEC() { return getToken(srParser.TYPE_DEC, 0); }
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
			setState(322);
			match(TYPE_DEC);
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
			setState(324);
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
		public TerminalNode LPAREN() { return getToken(srParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(srParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(srParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(srParser.COMMA, i);
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
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				match(T__18);
				setState(329);
				match(ID_TOKEN);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				match(T__19);
				}
				break;
			case ID_TOKEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(331);
				match(ID_TOKEN);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 6);
				{
				setState(332);
				match(T__20);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 7);
				{
				setState(333);
				match(T__21);
				setState(334);
				match(LPAREN);
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID_TOKEN) {
					{
					setState(335);
					match(ID_TOKEN);
					}
				}

				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(338);
					match(COMMA);
					setState(339);
					match(ID_TOKEN);
					}
					}
					setState(344);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(345);
					type_def();
					}
				}

				setState(348);
				match(RPAREN);
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
			setState(351);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__23) ) {
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(srParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(srParser.COMMA, i);
		}
		public List<If_arrayContext> if_array() {
			return getRuleContexts(If_arrayContext.class);
		}
		public If_arrayContext if_array(int i) {
			return getRuleContext(If_arrayContext.class,i);
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
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				match(T__24);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				match(T__25);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				match(T__26);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
				match(T__27);
				setState(357);
				expression();
				setState(358);
				match(T__28);
				setState(359);
				block();
				setState(360);
				match(T__29);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(362);
				match(T__30);
				setState(363);
				identifier();
				setState(364);
				match(T__7);
				setState(365);
				expression();
				setState(366);
				match(T__31);
				setState(367);
				identifier();
				setState(368);
				match(T__28);
				setState(369);
				block();
				setState(370);
				match(T__32);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(372);
				identifier();
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(373);
					match(COMMA);
					setState(374);
					identifier();
					}
					}
					setState(379);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(380);
				match(T__7);
				setState(381);
				expression();
				{
				setState(382);
				match(COMMA);
				setState(383);
				expression();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(385);
				identifier();
				setState(386);
				if_array();
				setState(387);
				match(T__33);
				setState(388);
				identifier();
				setState(389);
				if_array();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(391);
				identifier();
				setState(392);
				if_array();
				setState(393);
				match(T__34);
				setState(394);
				identifier();
				setState(395);
				if_array();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(397);
				identifier();
				setState(398);
				if_array();
				setState(399);
				match(T__7);
				setState(400);
				identifier();
				setState(401);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u0198\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\5\2\62"+
		"\n\2\3\2\3\2\5\2\66\n\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4@\n\4\3\4\3"+
		"\4\5\4D\n\4\3\5\3\5\5\5H\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\6\6Q\n\6\r\6"+
		"\16\6R\3\6\3\6\3\6\3\6\3\6\6\6Z\n\6\r\6\16\6[\3\6\3\6\5\6`\n\6\3\7\3\7"+
		"\5\7d\n\7\3\7\3\7\7\7h\n\7\f\7\16\7k\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\7\bx\n\b\f\b\16\b{\13\b\5\b}\n\b\3\t\3\t\3\t\3\t\7\t"+
		"\u0083\n\t\f\t\16\t\u0086\13\t\3\t\5\t\u0089\n\t\3\t\3\t\3\t\3\t\7\t\u008f"+
		"\n\t\f\t\16\t\u0092\13\t\3\t\5\t\u0095\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u009d\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a5\n\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00ad\n\t\3\t\3\t\7\t\u00b1\n\t\f\t\16\t\u00b4\13\t\3\t\5\t\u00b7"+
		"\n\t\3\t\5\t\u00ba\n\t\3\t\5\t\u00bd\n\t\3\t\3\t\5\t\u00c1\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00cf\n\n\3\n\3\n\3\n\5\n"+
		"\u00d4\n\n\3\n\5\n\u00d7\n\n\3\n\3\n\3\n\3\n\5\n\u00dd\n\n\3\n\3\n\3\n"+
		"\5\n\u00e2\n\n\3\n\3\n\3\n\5\n\u00e7\n\n\7\n\u00e9\n\n\f\n\16\n\u00ec"+
		"\13\n\3\n\3\n\5\n\u00f0\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00f8\n\n\f\n"+
		"\16\n\u00fb\13\n\3\n\5\n\u00fe\n\n\3\n\3\n\5\n\u0102\n\n\5\n\u0104\n\n"+
		"\3\13\3\13\3\13\7\13\u0109\n\13\f\13\16\13\u010c\13\13\3\13\3\13\5\13"+
		"\u0110\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u011d"+
		"\n\17\3\17\3\17\3\17\3\17\5\17\u0123\n\17\7\17\u0125\n\17\f\17\16\17\u0128"+
		"\13\17\3\17\3\17\7\17\u012c\n\17\f\17\16\17\u012f\13\17\3\20\3\20\3\21"+
		"\7\21\u0134\n\21\f\21\16\21\u0137\13\21\3\21\7\21\u013a\n\21\f\21\16\21"+
		"\u013d\13\21\3\22\3\22\5\22\u0141\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0153\n\26\3\26"+
		"\3\26\7\26\u0157\n\26\f\26\16\26\u015a\13\26\3\26\5\26\u015d\n\26\3\26"+
		"\5\26\u0160\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30"+
		"\u017a\n\30\f\30\16\30\u017d\13\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u0196\n\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\2\4\3\2\'(\3\2\31\32\2\u01c6\2\61\3\2\2\2\4\67\3\2\2\2"+
		"\6<\3\2\2\2\bE\3\2\2\2\n_\3\2\2\2\fa\3\2\2\2\16|\3\2\2\2\20\u00c0\3\2"+
		"\2\2\22\u0103\3\2\2\2\24\u010f\3\2\2\2\26\u0111\3\2\2\2\30\u0113\3\2\2"+
		"\2\32\u0115\3\2\2\2\34\u012d\3\2\2\2\36\u0130\3\2\2\2 \u0135\3\2\2\2\""+
		"\u0140\3\2\2\2$\u0142\3\2\2\2&\u0144\3\2\2\2(\u0146\3\2\2\2*\u015f\3\2"+
		"\2\2,\u0161\3\2\2\2.\u0195\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\61\62\3"+
		"\2\2\2\62\63\3\2\2\2\63\65\5\6\4\2\64\66\5\b\5\2\65\64\3\2\2\2\65\66\3"+
		"\2\2\2\66\3\3\2\2\2\678\7)\2\289\7(\2\29:\5\n\6\2:;\7&\2\2;\5\3\2\2\2"+
		"<=\7\3\2\2=?\7(\2\2>@\5\f\7\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AC\5\20\t\2"+
		"BD\7&\2\2CB\3\2\2\2CD\3\2\2\2D\7\3\2\2\2EG\7*\2\2FH\7(\2\2GF\3\2\2\2G"+
		"H\3\2\2\2HI\3\2\2\2IJ\5\36\20\2JK\5\20\t\2KL\7&\2\2L\t\3\2\2\2MN\5$\23"+
		"\2NO\7+\2\2OQ\3\2\2\2PM\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2"+
		"\2TU\5\n\6\2U`\3\2\2\2VW\5&\24\2WX\7+\2\2XZ\3\2\2\2YV\3\2\2\2Z[\3\2\2"+
		"\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\5\n\6\2^`\3\2\2\2_P\3\2\2\2_Y\3\2"+
		"\2\2`\13\3\2\2\2ac\7,\2\2bd\5\16\b\2cb\3\2\2\2cd\3\2\2\2di\3\2\2\2ef\7"+
		"/\2\2fh\5\16\b\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3"+
		"\2\2\2lm\7-\2\2m\r\3\2\2\2no\7(\2\2o}\5\34\17\2pq\7(\2\2qr\7\4\2\2ry\5"+
		"*\26\2st\7+\2\2tu\7(\2\2uv\7\4\2\2vx\5*\26\2ws\3\2\2\2x{\3\2\2\2yw\3\2"+
		"\2\2yz\3\2\2\2z}\3\2\2\2{y\3\2\2\2|n\3\2\2\2|p\3\2\2\2}\17\3\2\2\2~\177"+
		"\7\5\2\2\177\u0084\7(\2\2\u0080\u0081\7/\2\2\u0081\u0083\7(\2\2\u0082"+
		"\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089\5\20\t\2\u0088"+
		"\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u00c1\3\2\2\2\u008a\u008b\7\6"+
		"\2\2\u008b\u0090\7(\2\2\u008c\u008d\7/\2\2\u008d\u008f\7(\2\2\u008e\u008c"+
		"\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0095\5\20\t\2\u0094\u0093\3"+
		"\2\2\2\u0094\u0095\3\2\2\2\u0095\u00c1\3\2\2\2\u0096\u0097\7\7\2\2\u0097"+
		"\u0098\7(\2\2\u0098\u0099\5\f\7\2\u0099\u009a\5 \21\2\u009a\u009c\7&\2"+
		"\2\u009b\u009d\5\20\t\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u00c1\3\2\2\2\u009e\u009f\7\b\2\2\u009f\u00a0\7(\2\2\u00a0\u00a1\5\f"+
		"\7\2\u00a1\u00a2\5 \21\2\u00a2\u00a4\7&\2\2\u00a3\u00a5\5\20\t\2\u00a4"+
		"\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00c1\3\2\2\2\u00a6\u00a7\5\22"+
		"\n\2\u00a7\u00a8\5\20\t\2\u00a8\u00c1\3\2\2\2\u00a9\u00b6\5,\27\2\u00aa"+
		"\u00ac\7,\2\2\u00ab\u00ad\5\"\22\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00b2\3\2\2\2\u00ae\u00af\7/\2\2\u00af\u00b1\5\"\22\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7\7-\2\2\u00b6"+
		"\u00aa\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00ba\7+"+
		"\2\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb"+
		"\u00bd\5\20\t\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3"+
		"\2\2\2\u00be\u00bf\7&\2\2\u00bf\u00c1\3\2\2\2\u00c0~\3\2\2\2\u00c0\u008a"+
		"\3\2\2\2\u00c0\u0096\3\2\2\2\u00c0\u009e\3\2\2\2\u00c0\u00a6\3\2\2\2\u00c0"+
		"\u00a9\3\2\2\2\u00c1\21\3\2\2\2\u00c2\u00c3\7\t\2\2\u00c3\u00c4\7(\2\2"+
		"\u00c4\u00c5\7\n\2\2\u00c5\u0104\5(\25\2\u00c6\u00c7\7\13\2\2\u00c7\u00c8"+
		"\7(\2\2\u00c8\u00c9\7\f\2\2\u00c9\u0104\5*\26\2\u00ca\u00cb\7\r\2\2\u00cb"+
		"\u00cc\7(\2\2\u00cc\u00ce\7\f\2\2\u00cd\u00cf\7,\2\2\u00ce\u00cd\3\2\2"+
		"\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\7(\2\2\u00d1\u00d2"+
		"\7\4\2\2\u00d2\u00d4\5*\26\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d6\3\2\2\2\u00d5\u00d7\7-\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00dc\3\2\2\2\u00d8\u00d9\7\16\2\2\u00d9\u00da\7(\2\2\u00da"+
		"\u00db\7\4\2\2\u00db\u00dd\5*\26\2\u00dc\u00d8\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u0104\3\2\2\2\u00de\u00df\7\17\2\2\u00df\u00e1\7(\2\2\u00e0"+
		"\u00e2\5\f\7\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00ea\3\2"+
		"\2\2\u00e3\u00e4\7/\2\2\u00e4\u00e6\7(\2\2\u00e5\u00e7\5\f\7\2\u00e6\u00e5"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ef\3\2"+
		"\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7\4\2\2\u00ee\u00f0\5*\26\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u0104\3\2\2\2\u00f1\u00f2\7\20"+
		"\2\2\u00f2\u00f3\7(\2\2\u00f3\u00f9\5\34\17\2\u00f4\u00f5\7/\2\2\u00f5"+
		"\u00f6\7(\2\2\u00f6\u00f8\5\34\17\2\u00f7\u00f4\3\2\2\2\u00f8\u00fb\3"+
		"\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fc\u00fe\5\32\16\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3"+
		"\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u0100\7\n\2\2\u0100\u0102\5\24\13\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u00c2\3\2"+
		"\2\2\u0103\u00c6\3\2\2\2\u0103\u00ca\3\2\2\2\u0103\u00de\3\2\2\2\u0103"+
		"\u00f1\3\2\2\2\u0104\23\3\2\2\2\u0105\u010a\5(\25\2\u0106\u0107\7/\2\2"+
		"\u0107\u0109\5\24\13\2\u0108\u0106\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0110\3\2\2\2\u010c\u010a\3\2\2\2\u010d"+
		"\u010e\7(\2\2\u010e\u0110\5\34\17\2\u010f\u0105\3\2\2\2\u010f\u010d\3"+
		"\2\2\2\u0110\25\3\2\2\2\u0111\u0112\7\21\2\2\u0112\27\3\2\2\2\u0113\u0114"+
		"\7\22\2\2\u0114\31\3\2\2\2\u0115\u0116\7\4\2\2\u0116\u0117\5*\26\2\u0117"+
		"\33\3\2\2\2\u0118\u0119\7.\2\2\u0119\u011c\5\"\22\2\u011a\u011b\7\4\2"+
		"\2\u011b\u011d\5*\26\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0126"+
		"\3\2\2\2\u011e\u011f\7/\2\2\u011f\u0122\5\"\22\2\u0120\u0121\7\4\2\2\u0121"+
		"\u0123\5*\26\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2"+
		"\2\2\u0124\u011e\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7\60"+
		"\2\2\u012a\u012c\3\2\2\2\u012b\u0118\3\2\2\2\u012c\u012f\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\35\3\2\2\2\u012f\u012d\3\2\2"+
		"\2\u0130\u0131\7\62\2\2\u0131\37\3\2\2\2\u0132\u0134\5\22\n\2\u0133\u0132"+
		"\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u013b\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013a\5.\30\2\u0139\u0138\3\2"+
		"\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"!\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0141\7(\2\2\u013f\u0141\5(\25\2\u0140"+
		"\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141#\3\2\2\2\u0142\u0143\7\63\2\2"+
		"\u0143%\3\2\2\2\u0144\u0145\7\64\2\2\u0145\'\3\2\2\2\u0146\u0147\t\2\2"+
		"\2\u0147)\3\2\2\2\u0148\u0160\7\23\2\2\u0149\u0160\7\24\2\2\u014a\u014b"+
		"\7\25\2\2\u014b\u0160\7(\2\2\u014c\u0160\7\26\2\2\u014d\u0160\7(\2\2\u014e"+
		"\u0160\7\27\2\2\u014f\u0150\7\30\2\2\u0150\u0152\7,\2\2\u0151\u0153\7"+
		"(\2\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0158\3\2\2\2\u0154"+
		"\u0155\7/\2\2\u0155\u0157\7(\2\2\u0156\u0154\3\2\2\2\u0157\u015a\3\2\2"+
		"\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158"+
		"\3\2\2\2\u015b\u015d\5\32\16\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2"+
		"\u015d\u015e\3\2\2\2\u015e\u0160\7-\2\2\u015f\u0148\3\2\2\2\u015f\u0149"+
		"\3\2\2\2\u015f\u014a\3\2\2\2\u015f\u014c\3\2\2\2\u015f\u014d\3\2\2\2\u015f"+
		"\u014e\3\2\2\2\u015f\u014f\3\2\2\2\u0160+\3\2\2\2\u0161\u0162\t\3\2\2"+
		"\u0162-\3\2\2\2\u0163\u0196\7\33\2\2\u0164\u0196\7\34\2\2\u0165\u0196"+
		"\7\35\2\2\u0166\u0167\7\36\2\2\u0167\u0168\5(\25\2\u0168\u0169\7\37\2"+
		"\2\u0169\u016a\5 \21\2\u016a\u016b\7 \2\2\u016b\u0196\3\2\2\2\u016c\u016d"+
		"\7!\2\2\u016d\u016e\5\"\22\2\u016e\u016f\7\n\2\2\u016f\u0170\5(\25\2\u0170"+
		"\u0171\7\"\2\2\u0171\u0172\5\"\22\2\u0172\u0173\7\37\2\2\u0173\u0174\5"+
		" \21\2\u0174\u0175\7#\2\2\u0175\u0196\3\2\2\2\u0176\u017b\5\"\22\2\u0177"+
		"\u0178\7/\2\2\u0178\u017a\5\"\22\2\u0179\u0177\3\2\2\2\u017a\u017d\3\2"+
		"\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017e\u017f\7\n\2\2\u017f\u0180\5(\25\2\u0180\u0181\7/"+
		"\2\2\u0181\u0182\5(\25\2\u0182\u0196\3\2\2\2\u0183\u0184\5\"\22\2\u0184"+
		"\u0185\5\34\17\2\u0185\u0186\7$\2\2\u0186\u0187\5\"\22\2\u0187\u0188\5"+
		"\34\17\2\u0188\u0196\3\2\2\2\u0189\u018a\5\"\22\2\u018a\u018b\5\34\17"+
		"\2\u018b\u018c\7%\2\2\u018c\u018d\5\"\22\2\u018d\u018e\5\34\17\2\u018e"+
		"\u0196\3\2\2\2\u018f\u0190\5\"\22\2\u0190\u0191\5\34\17\2\u0191\u0192"+
		"\7\n\2\2\u0192\u0193\5\"\22\2\u0193\u0194\5\34\17\2\u0194\u0196\3\2\2"+
		"\2\u0195\u0163\3\2\2\2\u0195\u0164\3\2\2\2\u0195\u0165\3\2\2\2\u0195\u0166"+
		"\3\2\2\2\u0195\u016c\3\2\2\2\u0195\u0176\3\2\2\2\u0195\u0183\3\2\2\2\u0195"+
		"\u0189\3\2\2\2\u0195\u018f\3\2\2\2\u0196/\3\2\2\2\65\61\65?CGR[_ciy|\u0084"+
		"\u0088\u0090\u0094\u009c\u00a4\u00ac\u00b2\u00b6\u00b9\u00bc\u00c0\u00ce"+
		"\u00d3\u00d6\u00dc\u00e1\u00e6\u00ea\u00ef\u00f9\u00fd\u0101\u0103\u010a"+
		"\u010f\u011c\u0122\u0126\u012d\u0135\u013b\u0140\u0152\u0158\u015c\u015f"+
		"\u017b\u0195";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}