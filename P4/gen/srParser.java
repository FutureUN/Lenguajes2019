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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, END=49, EXPRESSION=50, ID_TOKEN=51, TK_LPAREN=52, 
		WP=53;
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
			null, "'global'", "'resource'", "'body'", "';'", "'('", "','", "')'", 
			"':'", "'extend'", "'import'", "'proc'", "'procedure'", "'const'", "':='", 
			"'type'", "'='", "'optype'", "'returns'", "'op'", "'var'", "'op_function'", 
			"'op_return'", "'['", "']'", "'b_params'", "'''", "'constant'", "'type_dec'", 
			"'int'", "'string'", "'cap'", "'real'", "'char'", "'rec'", "'getarg'", 
			"'final'", "'write'", "'skip'", "'exit'", "'next'", "'if'", "'->'", "'fi'", 
			"'fa'", "'to'", "'af'", "':=:'", "'+:='", "'end'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "END", "EXPRESSION", "ID_TOKEN", "TK_LPAREN", "WP"
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
			setState(54);
			match(T__0);
			setState(55);
			match(ID_TOKEN);
			setState(56);
			global_content();
			setState(57);
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
			setState(59);
			match(T__1);
			setState(60);
			match(ID_TOKEN);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(61);
				parameters();
				}
			}

			setState(64);
			r_elements();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END) {
				{
				setState(65);
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
			setState(68);
			match(T__2);
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(69);
				match(ID_TOKEN);
				}
				break;
			}
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(72);
				parameters();
				}
			}

			setState(75);
			r_elements();
			setState(76);
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
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(81); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(78);
						constant();
						setState(79);
						match(T__3);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(83); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(85);
				global_content();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(90); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(87);
						type_dec();
						setState(88);
						match(T__3);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(92); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(94);
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
		public List<Param_listContext> param_list() {
			return getRuleContexts(Param_listContext.class);
		}
		public Param_listContext param_list(int i) {
			return getRuleContext(Param_listContext.class,i);
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
			setState(98);
			match(T__4);
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(99);
				param_list();
				}
				break;
			}
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << ID_TOKEN))) != 0)) {
				{
				{
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(102);
					match(T__3);
					}
				}

				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(105);
					match(T__5);
					}
				}

				setState(108);
				param_list();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(T__6);
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
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(ID_TOKEN);
				setState(117);
				if_array();
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(118);
					match(T__7);
					setState(119);
					type();
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(ID_TOKEN);
				setState(126);
				match(T__7);
				setState(127);
				type();
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(128);
						match(T__3);
						setState(129);
						match(ID_TOKEN);
						setState(130);
						match(T__7);
						setState(131);
						type();
						}
						} 
					}
					setState(136);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
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
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(T__8);
				setState(140);
				match(ID_TOKEN);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(141);
					match(T__5);
					setState(142);
					match(ID_TOKEN);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(148);
					r_elements();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(T__9);
				setState(152);
				match(ID_TOKEN);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(153);
					match(T__5);
					setState(154);
					match(ID_TOKEN);
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(160);
					r_elements();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				match(T__10);
				setState(164);
				match(ID_TOKEN);
				setState(165);
				parameters();
				setState(166);
				block();
				setState(167);
				match(END);
				setState(169);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(168);
					r_elements();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				match(T__11);
				setState(172);
				match(ID_TOKEN);
				setState(173);
				parameters();
				setState(174);
				block();
				setState(175);
				match(END);
				setState(177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(176);
					r_elements();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
				r_declaration();
				setState(181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(180);
					r_elements();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				function_id();
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(184);
					match(T__4);
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << EXPRESSION) | (1L << ID_TOKEN))) != 0)) {
						{
						setState(185);
						identifier();
						}
					}

					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(188);
						match(T__5);
						setState(189);
						identifier();
						}
						}
						setState(194);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(195);
					match(T__6);
					}
				}

				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(198);
					match(T__3);
					}
				}

				setState(202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(201);
					match(END);
					}
					break;
				}
				setState(205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(204);
					r_elements();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(207);
					body();
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
		public List<ParametersContext> parameters() {
			return getRuleContexts(ParametersContext.class);
		}
		public ParametersContext parameters(int i) {
			return getRuleContext(ParametersContext.class,i);
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
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(T__12);
				setState(213);
				match(ID_TOKEN);
				setState(214);
				match(T__13);
				setState(215);
				expression();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(T__14);
				setState(217);
				match(ID_TOKEN);
				setState(218);
				match(T__15);
				setState(219);
				type();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(T__16);
				setState(221);
				match(ID_TOKEN);
				setState(222);
				match(T__15);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(223);
					match(T__4);
					}
				}

				setState(226);
				match(ID_TOKEN);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(227);
					match(T__7);
					setState(228);
					type();
					}
				}

				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(231);
					match(T__6);
					}
				}

				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(234);
					match(T__17);
					setState(235);
					match(ID_TOKEN);
					setState(236);
					match(T__7);
					setState(237);
					type();
					}
				}

				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				match(T__18);
				setState(241);
				match(ID_TOKEN);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(242);
					parameters();
					}
				}

				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(245);
					match(T__5);
					setState(246);
					match(ID_TOKEN);
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__4) {
						{
						setState(247);
						parameters();
						}
					}

					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(255);
					match(T__7);
					setState(256);
					type();
					}
				}

				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 5);
				{
				setState(259);
				match(T__19);
				setState(260);
				match(ID_TOKEN);
				setState(261);
				if_array();
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(262);
					match(T__5);
					setState(263);
					match(ID_TOKEN);
					setState(264);
					if_array();
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(270);
					type_def();
					}
				}

				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(273);
					match(T__13);
					setState(274);
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
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				expression();
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(280);
						match(T__5);
						setState(281);
						assign_dec();
						}
						} 
					}
					setState(286);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(ID_TOKEN);
				setState(288);
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
			setState(291);
			match(T__20);
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
			setState(293);
			match(T__21);
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
			setState(295);
			match(T__7);
			setState(296);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
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
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__22) {
					{
					{
					setState(298);
					match(T__22);
					setState(299);
					identifier();
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__7) {
						{
						setState(300);
						match(T__7);
						setState(301);
						type();
						}
					}

					setState(312);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(304);
						match(T__5);
						setState(305);
						identifier();
						setState(308);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__7) {
							{
							setState(306);
							match(T__7);
							setState(307);
							type();
							}
						}

						}
						}
						setState(314);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(315);
					match(T__23);
					}
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__22) {
					{
					{
					setState(322);
					match(T__22);
					setState(323);
					identifier();
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__7) {
						{
						setState(324);
						match(T__7);
						setState(325);
						identifier();
						}
					}

					setState(336);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(328);
						match(T__5);
						setState(329);
						identifier();
						setState(332);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__7) {
							{
							setState(330);
							match(T__7);
							setState(331);
							identifier();
							}
						}

						}
						}
						setState(338);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(339);
					match(T__23);
					}
					}
					setState(345);
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
			setState(348);
			match(T__24);
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
			setState(350);
			r_elements();
			setState(352); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(351);
				statement();
				}
				}
				setState(354); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__43) | (1L << EXPRESSION) | (1L << ID_TOKEN))) != 0) );
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
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(ID_TOKEN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				match(T__25);
				setState(359);
				match(ID_TOKEN);
				setState(360);
				match(T__25);
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
			setState(363);
			match(T__26);
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
			setState(365);
			match(T__27);
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
			setState(367);
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
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				match(T__30);
				setState(372);
				match(ID_TOKEN);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 4);
				{
				setState(373);
				match(T__31);
				}
				break;
			case ID_TOKEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(374);
				match(ID_TOKEN);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 6);
				{
				setState(375);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 7);
				{
				setState(376);
				match(T__33);
				setState(377);
				match(T__4);
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID_TOKEN) {
					{
					setState(378);
					match(ID_TOKEN);
					}
				}

				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(381);
					match(T__5);
					setState(382);
					match(ID_TOKEN);
					}
					}
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(388);
					type_def();
					}
				}

				setState(391);
				match(T__6);
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
			setState(394);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << ID_TOKEN))) != 0)) ) {
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
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				match(T__37);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				match(T__38);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(398);
				match(T__39);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(399);
				match(T__40);
				setState(400);
				expression();
				setState(401);
				match(T__41);
				setState(402);
				block();
				setState(403);
				match(T__42);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(405);
				match(T__43);
				setState(406);
				identifier();
				setState(407);
				match(T__13);
				setState(408);
				expression();
				setState(409);
				match(T__44);
				setState(410);
				identifier();
				setState(411);
				match(T__41);
				setState(412);
				block();
				setState(413);
				match(T__45);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(415);
				identifier();
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(416);
					match(T__5);
					setState(417);
					identifier();
					}
					}
					setState(422);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(423);
				match(T__13);
				setState(424);
				expression();
				{
				setState(425);
				match(T__5);
				setState(426);
				expression();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(428);
				identifier();
				setState(429);
				if_array();
				setState(430);
				match(T__46);
				setState(431);
				identifier();
				setState(432);
				if_array();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(434);
				identifier();
				setState(435);
				if_array();
				setState(436);
				match(T__47);
				setState(437);
				identifier();
				setState(438);
				if_array();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(440);
				identifier();
				setState(441);
				if_array();
				setState(442);
				match(T__13);
				setState(443);
				identifier();
				setState(444);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u01c3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\5\2\62"+
		"\n\2\3\2\6\2\65\n\2\r\2\16\2\66\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4A\n"+
		"\4\3\4\3\4\5\4E\n\4\3\5\3\5\5\5I\n\5\3\5\5\5L\n\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\6\6T\n\6\r\6\16\6U\3\6\3\6\3\6\3\6\3\6\6\6]\n\6\r\6\16\6^\3\6\3\6"+
		"\5\6c\n\6\3\7\3\7\5\7g\n\7\3\7\5\7j\n\7\3\7\5\7m\n\7\3\7\7\7p\n\7\f\7"+
		"\16\7s\13\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b{\n\b\f\b\16\b~\13\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\7\b\u0087\n\b\f\b\16\b\u008a\13\b\5\b\u008c\n\b\3\t"+
		"\3\t\3\t\3\t\7\t\u0092\n\t\f\t\16\t\u0095\13\t\3\t\5\t\u0098\n\t\3\t\3"+
		"\t\3\t\3\t\7\t\u009e\n\t\f\t\16\t\u00a1\13\t\3\t\5\t\u00a4\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u00ac\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b4\n\t\3"+
		"\t\3\t\5\t\u00b8\n\t\3\t\3\t\3\t\5\t\u00bd\n\t\3\t\3\t\7\t\u00c1\n\t\f"+
		"\t\16\t\u00c4\13\t\3\t\5\t\u00c7\n\t\3\t\5\t\u00ca\n\t\3\t\5\t\u00cd\n"+
		"\t\3\t\5\t\u00d0\n\t\3\t\5\t\u00d3\n\t\5\t\u00d5\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e3\n\n\3\n\3\n\3\n\5\n\u00e8\n\n"+
		"\3\n\5\n\u00eb\n\n\3\n\3\n\3\n\3\n\5\n\u00f1\n\n\3\n\3\n\3\n\5\n\u00f6"+
		"\n\n\3\n\3\n\3\n\5\n\u00fb\n\n\7\n\u00fd\n\n\f\n\16\n\u0100\13\n\3\n\3"+
		"\n\5\n\u0104\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u010c\n\n\f\n\16\n\u010f"+
		"\13\n\3\n\5\n\u0112\n\n\3\n\3\n\5\n\u0116\n\n\5\n\u0118\n\n\3\13\3\13"+
		"\3\13\7\13\u011d\n\13\f\13\16\13\u0120\13\13\3\13\3\13\5\13\u0124\n\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u0131\n\17\3"+
		"\17\3\17\3\17\3\17\5\17\u0137\n\17\7\17\u0139\n\17\f\17\16\17\u013c\13"+
		"\17\3\17\3\17\7\17\u0140\n\17\f\17\16\17\u0143\13\17\3\17\3\17\3\17\3"+
		"\17\5\17\u0149\n\17\3\17\3\17\3\17\3\17\5\17\u014f\n\17\7\17\u0151\n\17"+
		"\f\17\16\17\u0154\13\17\3\17\3\17\7\17\u0158\n\17\f\17\16\17\u015b\13"+
		"\17\5\17\u015d\n\17\3\20\3\20\3\21\3\21\6\21\u0163\n\21\r\21\16\21\u0164"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u016c\n\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u017e\n\26\3\26"+
		"\3\26\7\26\u0182\n\26\f\26\16\26\u0185\13\26\3\26\5\26\u0188\n\26\3\26"+
		"\5\26\u018b\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30"+
		"\u01a5\n\30\f\30\16\30\u01a8\13\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u01c1\n\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\2\4\3\2\64\65\4\2%\'\65\65\2\u01fe\2\61\3\2\2\2\48\3\2"+
		"\2\2\6=\3\2\2\2\bF\3\2\2\2\nb\3\2\2\2\fd\3\2\2\2\16\u008b\3\2\2\2\20\u00d4"+
		"\3\2\2\2\22\u0117\3\2\2\2\24\u0123\3\2\2\2\26\u0125\3\2\2\2\30\u0127\3"+
		"\2\2\2\32\u0129\3\2\2\2\34\u015c\3\2\2\2\36\u015e\3\2\2\2 \u0160\3\2\2"+
		"\2\"\u016b\3\2\2\2$\u016d\3\2\2\2&\u016f\3\2\2\2(\u0171\3\2\2\2*\u018a"+
		"\3\2\2\2,\u018c\3\2\2\2.\u01c0\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\61"+
		"\62\3\2\2\2\62\64\3\2\2\2\63\65\5\6\4\2\64\63\3\2\2\2\65\66\3\2\2\2\66"+
		"\64\3\2\2\2\66\67\3\2\2\2\67\3\3\2\2\289\7\3\2\29:\7\65\2\2:;\5\n\6\2"+
		";<\7\63\2\2<\5\3\2\2\2=>\7\4\2\2>@\7\65\2\2?A\5\f\7\2@?\3\2\2\2@A\3\2"+
		"\2\2AB\3\2\2\2BD\5\20\t\2CE\7\63\2\2DC\3\2\2\2DE\3\2\2\2E\7\3\2\2\2FH"+
		"\7\5\2\2GI\7\65\2\2HG\3\2\2\2HI\3\2\2\2IK\3\2\2\2JL\5\f\7\2KJ\3\2\2\2"+
		"KL\3\2\2\2LM\3\2\2\2MN\5\20\t\2NO\7\63\2\2O\t\3\2\2\2PQ\5$\23\2QR\7\6"+
		"\2\2RT\3\2\2\2SP\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\5\n"+
		"\6\2Xc\3\2\2\2YZ\5&\24\2Z[\7\6\2\2[]\3\2\2\2\\Y\3\2\2\2]^\3\2\2\2^\\\3"+
		"\2\2\2^_\3\2\2\2_`\3\2\2\2`a\5\n\6\2ac\3\2\2\2bS\3\2\2\2b\\\3\2\2\2c\13"+
		"\3\2\2\2df\7\7\2\2eg\5\16\b\2fe\3\2\2\2fg\3\2\2\2gq\3\2\2\2hj\7\6\2\2"+
		"ih\3\2\2\2ij\3\2\2\2jl\3\2\2\2km\7\b\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2"+
		"np\5\16\b\2oi\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2"+
		"\2tu\7\t\2\2u\r\3\2\2\2vw\7\65\2\2w|\5\34\17\2xy\7\n\2\2y{\5*\26\2zx\3"+
		"\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u008c\3\2\2\2~|\3\2\2\2\177\u0080"+
		"\7\65\2\2\u0080\u0081\7\n\2\2\u0081\u0088\5*\26\2\u0082\u0083\7\6\2\2"+
		"\u0083\u0084\7\65\2\2\u0084\u0085\7\n\2\2\u0085\u0087\5*\26\2\u0086\u0082"+
		"\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008bv\3\2\2\2\u008b\177\3\2\2\2\u008c"+
		"\17\3\2\2\2\u008d\u008e\7\13\2\2\u008e\u0093\7\65\2\2\u008f\u0090\7\b"+
		"\2\2\u0090\u0092\7\65\2\2\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0096\u0098\5\20\t\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u00d5\3\2\2\2\u0099\u009a\7\f\2\2\u009a\u009f\7\65\2\2\u009b\u009c\7"+
		"\b\2\2\u009c\u009e\7\65\2\2\u009d\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a2\u00a4\5\20\t\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00d5\3\2\2\2\u00a5\u00a6\7\r\2\2\u00a6\u00a7\7\65\2\2\u00a7\u00a8\5"+
		"\f\7\2\u00a8\u00a9\5 \21\2\u00a9\u00ab\7\63\2\2\u00aa\u00ac\5\20\t\2\u00ab"+
		"\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00d5\3\2\2\2\u00ad\u00ae\7\16"+
		"\2\2\u00ae\u00af\7\65\2\2\u00af\u00b0\5\f\7\2\u00b0\u00b1\5 \21\2\u00b1"+
		"\u00b3\7\63\2\2\u00b2\u00b4\5\20\t\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3"+
		"\2\2\2\u00b4\u00d5\3\2\2\2\u00b5\u00b7\5\22\n\2\u00b6\u00b8\5\20\t\2\u00b7"+
		"\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00d5\3\2\2\2\u00b9\u00c6\5,"+
		"\27\2\u00ba\u00bc\7\7\2\2\u00bb\u00bd\5\"\22\2\u00bc\u00bb\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00c2\3\2\2\2\u00be\u00bf\7\b\2\2\u00bf\u00c1\5\""+
		"\22\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\7\t"+
		"\2\2\u00c6\u00ba\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00ca\7\6\2\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2"+
		"\2\2\u00cb\u00cd\7\63\2\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cf\3\2\2\2\u00ce\u00d0\5\20\t\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3"+
		"\2\2\2\u00d0\u00d5\3\2\2\2\u00d1\u00d3\5\b\5\2\u00d2\u00d1\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u008d\3\2\2\2\u00d4\u0099\3\2"+
		"\2\2\u00d4\u00a5\3\2\2\2\u00d4\u00ad\3\2\2\2\u00d4\u00b5\3\2\2\2\u00d4"+
		"\u00b9\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\21\3\2\2\2\u00d6\u00d7\7\17\2"+
		"\2\u00d7\u00d8\7\65\2\2\u00d8\u00d9\7\20\2\2\u00d9\u0118\5(\25\2\u00da"+
		"\u00db\7\21\2\2\u00db\u00dc\7\65\2\2\u00dc\u00dd\7\22\2\2\u00dd\u0118"+
		"\5*\26\2\u00de\u00df\7\23\2\2\u00df\u00e0\7\65\2\2\u00e0\u00e2\7\22\2"+
		"\2\u00e1\u00e3\7\7\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e7\7\65\2\2\u00e5\u00e6\7\n\2\2\u00e6\u00e8\5*\26\2"+
		"\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00eb"+
		"\7\t\2\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00f0\3\2\2\2\u00ec"+
		"\u00ed\7\24\2\2\u00ed\u00ee\7\65\2\2\u00ee\u00ef\7\n\2\2\u00ef\u00f1\5"+
		"*\26\2\u00f0\u00ec\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u0118\3\2\2\2\u00f2"+
		"\u00f3\7\25\2\2\u00f3\u00f5\7\65\2\2\u00f4\u00f6\5\f\7\2\u00f5\u00f4\3"+
		"\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fe\3\2\2\2\u00f7\u00f8\7\b\2\2\u00f8"+
		"\u00fa\7\65\2\2\u00f9\u00fb\5\f\7\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3"+
		"\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f7\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0103\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0101\u0102\7\n\2\2\u0102\u0104\5*\26\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0118\3\2\2\2\u0105\u0106\7\26\2\2\u0106\u0107\7"+
		"\65\2\2\u0107\u010d\5\34\17\2\u0108\u0109\7\b\2\2\u0109\u010a\7\65\2\2"+
		"\u010a\u010c\5\34\17\2\u010b\u0108\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0112\5\32\16\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0115\3"+
		"\2\2\2\u0113\u0114\7\20\2\2\u0114\u0116\5\24\13\2\u0115\u0113\3\2\2\2"+
		"\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u00d6\3\2\2\2\u0117\u00da"+
		"\3\2\2\2\u0117\u00de\3\2\2\2\u0117\u00f2\3\2\2\2\u0117\u0105\3\2\2\2\u0118"+
		"\23\3\2\2\2\u0119\u011e\5(\25\2\u011a\u011b\7\b\2\2\u011b\u011d\5\24\13"+
		"\2\u011c\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f\u0124\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7\65\2\2"+
		"\u0122\u0124\5\34\17\2\u0123\u0119\3\2\2\2\u0123\u0121\3\2\2\2\u0124\25"+
		"\3\2\2\2\u0125\u0126\7\27\2\2\u0126\27\3\2\2\2\u0127\u0128\7\30\2\2\u0128"+
		"\31\3\2\2\2\u0129\u012a\7\n\2\2\u012a\u012b\5*\26\2\u012b\33\3\2\2\2\u012c"+
		"\u012d\7\31\2\2\u012d\u0130\5\"\22\2\u012e\u012f\7\n\2\2\u012f\u0131\5"+
		"*\26\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u013a\3\2\2\2\u0132"+
		"\u0133\7\b\2\2\u0133\u0136\5\"\22\2\u0134\u0135\7\n\2\2\u0135\u0137\5"+
		"*\26\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138"+
		"\u0132\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\7\32\2\2\u013e"+
		"\u0140\3\2\2\2\u013f\u012c\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u015d\3\2\2\2\u0143\u0141\3\2\2\2\u0144"+
		"\u0145\7\31\2\2\u0145\u0148\5\"\22\2\u0146\u0147\7\n\2\2\u0147\u0149\5"+
		"\"\22\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0152\3\2\2\2\u014a"+
		"\u014b\7\b\2\2\u014b\u014e\5\"\22\2\u014c\u014d\7\n\2\2\u014d\u014f\5"+
		"\"\22\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150"+
		"\u014a\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2"+
		"\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\7\32\2\2\u0156"+
		"\u0158\3\2\2\2\u0157\u0144\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u0159\u015a\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015c"+
		"\u0141\3\2\2\2\u015c\u0159\3\2\2\2\u015d\35\3\2\2\2\u015e\u015f\7\33\2"+
		"\2\u015f\37\3\2\2\2\u0160\u0162\5\20\t\2\u0161\u0163\5.\30\2\u0162\u0161"+
		"\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"!\3\2\2\2\u0166\u016c\7\65\2\2\u0167\u016c\5(\25\2\u0168\u0169\7\34\2"+
		"\2\u0169\u016a\7\65\2\2\u016a\u016c\7\34\2\2\u016b\u0166\3\2\2\2\u016b"+
		"\u0167\3\2\2\2\u016b\u0168\3\2\2\2\u016c#\3\2\2\2\u016d\u016e\7\35\2\2"+
		"\u016e%\3\2\2\2\u016f\u0170\7\36\2\2\u0170\'\3\2\2\2\u0171\u0172\t\2\2"+
		"\2\u0172)\3\2\2\2\u0173\u018b\7\37\2\2\u0174\u018b\7 \2\2\u0175\u0176"+
		"\7!\2\2\u0176\u018b\7\65\2\2\u0177\u018b\7\"\2\2\u0178\u018b\7\65\2\2"+
		"\u0179\u018b\7#\2\2\u017a\u017b\7$\2\2\u017b\u017d\7\7\2\2\u017c\u017e"+
		"\7\65\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0183\3\2\2\2"+
		"\u017f\u0180\7\b\2\2\u0180\u0182\7\65\2\2\u0181\u017f\3\2\2\2\u0182\u0185"+
		"\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0187\3\2\2\2\u0185"+
		"\u0183\3\2\2\2\u0186\u0188\5\32\16\2\u0187\u0186\3\2\2\2\u0187\u0188\3"+
		"\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\7\t\2\2\u018a\u0173\3\2\2\2\u018a"+
		"\u0174\3\2\2\2\u018a\u0175\3\2\2\2\u018a\u0177\3\2\2\2\u018a\u0178\3\2"+
		"\2\2\u018a\u0179\3\2\2\2\u018a\u017a\3\2\2\2\u018b+\3\2\2\2\u018c\u018d"+
		"\t\3\2\2\u018d-\3\2\2\2\u018e\u01c1\7(\2\2\u018f\u01c1\7)\2\2\u0190\u01c1"+
		"\7*\2\2\u0191\u0192\7+\2\2\u0192\u0193\5(\25\2\u0193\u0194\7,\2\2\u0194"+
		"\u0195\5 \21\2\u0195\u0196\7-\2\2\u0196\u01c1\3\2\2\2\u0197\u0198\7.\2"+
		"\2\u0198\u0199\5\"\22\2\u0199\u019a\7\20\2\2\u019a\u019b\5(\25\2\u019b"+
		"\u019c\7/\2\2\u019c\u019d\5\"\22\2\u019d\u019e\7,\2\2\u019e\u019f\5 \21"+
		"\2\u019f\u01a0\7\60\2\2\u01a0\u01c1\3\2\2\2\u01a1\u01a6\5\"\22\2\u01a2"+
		"\u01a3\7\b\2\2\u01a3\u01a5\5\"\22\2\u01a4\u01a2\3\2\2\2\u01a5\u01a8\3"+
		"\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8"+
		"\u01a6\3\2\2\2\u01a9\u01aa\7\20\2\2\u01aa\u01ab\5(\25\2\u01ab\u01ac\7"+
		"\b\2\2\u01ac\u01ad\5(\25\2\u01ad\u01c1\3\2\2\2\u01ae\u01af\5\"\22\2\u01af"+
		"\u01b0\5\34\17\2\u01b0\u01b1\7\61\2\2\u01b1\u01b2\5\"\22\2\u01b2\u01b3"+
		"\5\34\17\2\u01b3\u01c1\3\2\2\2\u01b4\u01b5\5\"\22\2\u01b5\u01b6\5\34\17"+
		"\2\u01b6\u01b7\7\62\2\2\u01b7\u01b8\5\"\22\2\u01b8\u01b9\5\34\17\2\u01b9"+
		"\u01c1\3\2\2\2\u01ba\u01bb\5\"\22\2\u01bb\u01bc\5\34\17\2\u01bc\u01bd"+
		"\7\20\2\2\u01bd\u01be\5\"\22\2\u01be\u01bf\5\34\17\2\u01bf\u01c1\3\2\2"+
		"\2\u01c0\u018e\3\2\2\2\u01c0\u018f\3\2\2\2\u01c0\u0190\3\2\2\2\u01c0\u0191"+
		"\3\2\2\2\u01c0\u0197\3\2\2\2\u01c0\u01a1\3\2\2\2\u01c0\u01ae\3\2\2\2\u01c0"+
		"\u01b4\3\2\2\2\u01c0\u01ba\3\2\2\2\u01c1/\3\2\2\2@\61\66@DHKU^bfilq|\u0088"+
		"\u008b\u0093\u0097\u009f\u00a3\u00ab\u00b3\u00b7\u00bc\u00c2\u00c6\u00c9"+
		"\u00cc\u00cf\u00d2\u00d4\u00e2\u00e7\u00ea\u00f0\u00f5\u00fa\u00fe\u0103"+
		"\u010d\u0111\u0115\u0117\u011e\u0123\u0130\u0136\u013a\u0141\u0148\u014e"+
		"\u0152\u0159\u015c\u0164\u016b\u017d\u0183\u0187\u018a\u01a6\u01c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}