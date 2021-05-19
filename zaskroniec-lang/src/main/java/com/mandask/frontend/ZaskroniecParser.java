// Generated from C:/Workspace/University/Zaskroniec/zaskroniec-lang\Zaskroniec.g4 by ANTLR 4.9.1
package com.mandask.frontend;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ZaskroniecParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, SCAN=16, FUNCTION=17, 
		ENDFUNCTION=18, PRINT=19, REAL_DECLARATION=20, INT_DECLARATION=21, ID=22, 
		REAL=23, INT=24, ASSIGN=25, ADD=26, SUBSTRACT=27, MULTIPLY=28, DIVIDE=29, 
		MODULO=30, WHITESPACE=31;
	public static final int
		RULE_file = 0, RULE_stmt = 1, RULE_function = 2, RULE_fparam = 3, RULE_fblock = 4, 
		RULE_return_stmt = 5, RULE_if_stmt = 6, RULE_boolean_exp = 7, RULE_while_stmt = 8, 
		RULE_geq_exp = 9, RULE_leq_exp = 10, RULE_greater_exp = 11, RULE_less_exp = 12, 
		RULE_equals_exp = 13, RULE_value_exp = 14, RULE_scan_int_stmt = 15, RULE_scan_real_stmt = 16, 
		RULE_print_stmt = 17, RULE_assign_stmt = 18, RULE_number = 19, RULE_expression = 20, 
		RULE_paraphrase = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "stmt", "function", "fparam", "fblock", "return_stmt", "if_stmt", 
			"boolean_exp", "while_stmt", "geq_exp", "leq_exp", "greater_exp", "less_exp", 
			"equals_exp", "value_exp", "scan_int_stmt", "scan_real_stmt", "print_stmt", 
			"assign_stmt", "number", "expression", "paraphrase"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'zzzwroc'", "'jesssli'", "'('", "')'", "'ssskonczjesssli'", 
			"'podczasss'", "'ssskonczpodczasss'", "'>='", "'<='", "'>'", "'<'", "'=='", 
			"'ssskanuj'", "'funkcssja'", "'ssskonczfunkcssja'", "'wypisssz'", "'dabl'", 
			"'int'", null, null, null, "'='", "'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "SCAN", "FUNCTION", "ENDFUNCTION", "PRINT", "REAL_DECLARATION", 
			"INT_DECLARATION", "ID", "REAL", "INT", "ASSIGN", "ADD", "SUBSTRACT", 
			"MULTIPLY", "DIVIDE", "MODULO", "WHITESPACE"
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
	public String getGrammarFileName() { return "Zaskroniec.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ZaskroniecParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ZaskroniecParser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaskroniecVisitor ) return ((ZaskroniecVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << SCAN) | (1L << FUNCTION) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				{
				setState(44);
				stmt();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(EOF);
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

	public static class StmtContext extends ParserRuleContext {
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public Scan_int_stmtContext scan_int_stmt() {
			return getRuleContext(Scan_int_stmtContext.class,0);
		}
		public Scan_real_stmtContext scan_real_stmt() {
			return getRuleContext(Scan_real_stmtContext.class,0);
		}
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaskroniecVisitor ) return ((ZaskroniecVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				print_stmt();
				setState(53);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				scan_int_stmt();
				setState(56);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				scan_real_stmt();
				setState(59);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				assign_stmt();
				setState(62);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				if_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				while_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
				function();
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(ZaskroniecParser.FUNCTION, 0); }
		public FparamContext fparam() {
			return getRuleContext(FparamContext.class,0);
		}
		public FblockContext fblock() {
			return getRuleContext(FblockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaskroniecVisitor ) return ((ZaskroniecVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(FUNCTION);
			setState(70);
			fparam();
			setState(71);
			fblock();
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

	public static class FparamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ZaskroniecParser.ID, 0); }
		public FparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).enterFparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).exitFparam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaskroniecVisitor ) return ((ZaskroniecVisitor<? extends T>)visitor).visitFparam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FparamContext fparam() throws RecognitionException {
		FparamContext _localctx = new FparamContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(ID);
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

	public static class FblockContext extends ParserRuleContext {
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public FblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).enterFblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).exitFblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaskroniecVisitor ) return ((ZaskroniecVisitor<? extends T>)visitor).visitFblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FblockContext fblock() throws RecognitionException {
		FblockContext _localctx = new FblockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__1);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << SCAN) | (1L << FUNCTION) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				{
				setState(76);
				stmt();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			return_stmt();
			setState(83);
			match(T__2);
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

	public static class Return_stmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaskroniecVisitor ) return ((ZaskroniecVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__3);
			setState(86);
			expression(0);
			setState(87);
			match(T__0);
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

	public static class If_stmtContext extends ParserRuleContext {
		public Boolean_expContext boolean_exp() {
			return getRuleContext(Boolean_expContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaskroniecVisitor ) return ((ZaskroniecVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__4);
			setState(90);
			match(T__5);
			setState(91);
			boolean_exp();
			setState(92);
			match(T__6);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << SCAN) | (1L << FUNCTION) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				{
				setState(93);
				stmt();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(T__7);
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

	public static class Boolean_expContext extends ParserRuleContext {
		public Equals_expContext equals_exp() {
			return getRuleContext(Equals_expContext.class,0);
		}
		public Less_expContext less_exp() {
			return getRuleContext(Less_expContext.class,0);
		}
		public Greater_expContext greater_exp() {
			return getRuleContext(Greater_expContext.class,0);
		}
		public Leq_expContext leq_exp() {
			return getRuleContext(Leq_expContext.class,0);
		}
		public Geq_expContext geq_exp() {
			return getRuleContext(Geq_expContext.class,0);
		}
		public Boolean_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).enterBoolean_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).exitBoolean_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaskroniecVisitor ) return ((ZaskroniecVisitor<? extends T>)visitor).visitBoolean_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_expContext boolean_exp() throws RecognitionException {
		Boolean_expContext _localctx = new Boolean_expContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_boolean_exp);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				equals_exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				less_exp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				greater_exp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				leq_exp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				geq_exp();
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

	public static class While_stmtContext extends ParserRuleContext {
		public Boolean_expContext boolean_exp() {
			return getRuleContext(Boolean_expContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaskroniecVisitor ) return ((ZaskroniecVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__8);
			setState(109);
			match(T__5);
			setState(110);
			boolean_exp();
			setState(111);
			match(T__6);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << SCAN) | (1L << FUNCTION) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				{
				setState(112);
				stmt();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(T__9);
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

	public static class Geq_expContext extends ParserRuleContext {
		public List<Value_expContext> value_exp() {
			return getRuleContexts(Value_expContext.class);
		}
		public Value_expContext value_exp(int i) {
			return getRuleContext(Value_expContext.class,i);
		}
		public Geq_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geq_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).enterGeq_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).exitGeq_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaskroniecVisitor ) return ((ZaskroniecVisitor<? extends T>)visitor).visitGeq_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Geq_expContext geq_exp() throws RecognitionException {
		Geq_expContext _localctx = new Geq_expContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_geq_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			value_exp();
			setState(121);
			match(T__10);
			setState(122);
			value_exp();
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

	public static class Leq_expContext extends ParserRuleContext {
		public List<Value_expContext> value_exp() {
			return getRuleContexts(Value_expContext.class);
		}
		public Value_expContext value_exp(int i) {
			return getRuleContext(Value_expContext.class,i);
		}
		public Leq_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leq_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).enterLeq_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).exitLeq_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaskroniecVisitor ) return ((ZaskroniecVisitor<? extends T>)visitor).visitLeq_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Leq_expContext leq_exp() throws RecognitionException {
		Leq_expContext _localctx = new Leq_expContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_leq_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			value_exp();
			setState(125);
			match(T__11);
			setState(126);
			value_exp();
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

	public static class Greater_expContext extends ParserRuleContext {
		public List<Value_expContext> value_exp() {
			return getRuleContexts(Value_expContext.class);
		}
		public Value_expContext value_exp(int i) {
			return getRuleContext(Value_expContext.class,i);
		}
		public Greater_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).enterGreater_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).exitGreater_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaskroniecVisitor ) return ((ZaskroniecVisitor<? extends T>)visitor).visitGreater_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Greater_expContext greater_exp() throws RecognitionException {
		Greater_expContext _localctx = new Greater_expContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_greater_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			value_exp();
			setState(129);
			match(T__12);
			setState(130);
			value_exp();
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

	public static class Less_expContext extends ParserRuleContext {
		public List<Value_expContext> value_exp() {
			return getRuleContexts(Value_expContext.class);
		}
		public Value_expContext value_exp(int i) {
			return getRuleContext(Value_expContext.class,i);
		}
		public Less_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_less_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).enterLess_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).exitLess_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaskroniecVisitor ) return ((ZaskroniecVisitor<? extends T>)visitor).visitLess_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Less_expContext less_exp() throws RecognitionException {
		Less_expContext _localctx = new Less_expContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_less_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			value_exp();
			setState(133);
			match(T__13);
			setState(134);
			value_exp();
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

	public static class Equals_expContext extends ParserRuleContext {
		public List<Value_expContext> value_exp() {
			return getRuleContexts(Value_expContext.class);
		}
		public Value_expContext value_exp(int i) {
			return getRuleContext(Value_expContext.class,i);
		}
		public Equals_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equals_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).enterEquals_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).exitEquals_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaskroniecVisitor ) return ((ZaskroniecVisitor<? extends T>)visitor).visitEquals_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equals_expContext equals_exp() throws RecognitionException {
		Equals_expContext _localctx = new Equals_expContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_equals_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			value_exp();
			setState(137);
			match(T__14);
			setState(138);
			value_exp();
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

	public static class Value_expContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ZaskroniecParser.ID, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Value_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).enterValue_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).exitValue_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaskroniecVisitor ) return ((ZaskroniecVisitor<? extends T>)visitor).visitValue_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_expContext value_exp() throws RecognitionException {
		Value_expContext _localctx = new Value_expContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_value_exp);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(ID);
				}
				break;
			case REAL:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				number();
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

	public static class Scan_int_stmtContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(ZaskroniecParser.SCAN, 0); }
		public TerminalNode INT_DECLARATION() { return getToken(ZaskroniecParser.INT_DECLARATION, 0); }
		public TerminalNode ID() { return getToken(ZaskroniecParser.ID, 0); }
		public Scan_int_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan_int_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).enterScan_int_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).exitScan_int_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaskroniecVisitor ) return ((ZaskroniecVisitor<? extends T>)visitor).visitScan_int_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scan_int_stmtContext scan_int_stmt() throws RecognitionException {
		Scan_int_stmtContext _localctx = new Scan_int_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_scan_int_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(SCAN);
			setState(145);
			match(INT_DECLARATION);
			setState(146);
			match(ID);
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

	public static class Scan_real_stmtContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(ZaskroniecParser.SCAN, 0); }
		public TerminalNode REAL_DECLARATION() { return getToken(ZaskroniecParser.REAL_DECLARATION, 0); }
		public TerminalNode ID() { return getToken(ZaskroniecParser.ID, 0); }
		public Scan_real_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan_real_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).enterScan_real_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).exitScan_real_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaskroniecVisitor ) return ((ZaskroniecVisitor<? extends T>)visitor).visitScan_real_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scan_real_stmtContext scan_real_stmt() throws RecognitionException {
		Scan_real_stmtContext _localctx = new Scan_real_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_scan_real_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(SCAN);
			setState(149);
			match(REAL_DECLARATION);
			setState(150);
			match(ID);
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

	public static class Print_stmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ZaskroniecParser.PRINT, 0); }
		public TerminalNode ID() { return getToken(ZaskroniecParser.ID, 0); }
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).enterPrint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).exitPrint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaskroniecVisitor ) return ((ZaskroniecVisitor<? extends T>)visitor).visitPrint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_print_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(PRINT);
			setState(153);
			match(ID);
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

	public static class Assign_stmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ZaskroniecParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ZaskroniecParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).exitAssign_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaskroniecVisitor ) return ((ZaskroniecVisitor<? extends T>)visitor).visitAssign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(ID);
			setState(156);
			match(ASSIGN);
			setState(157);
			expression(0);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(ZaskroniecParser.REAL, 0); }
		public TerminalNode INT() { return getToken(ZaskroniecParser.INT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaskroniecVisitor ) return ((ZaskroniecVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !(_la==REAL || _la==INT) ) {
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
		public ParaphraseContext paraphrase() {
			return getRuleContext(ParaphraseContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode ID() { return getToken(ZaskroniecParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ZaskroniecParser.ADD, 0); }
		public TerminalNode SUBSTRACT() { return getToken(ZaskroniecParser.SUBSTRACT, 0); }
		public TerminalNode MULTIPLY() { return getToken(ZaskroniecParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(ZaskroniecParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(ZaskroniecParser.MODULO, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaskroniecVisitor ) return ((ZaskroniecVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(162);
				paraphrase();
				}
				break;
			case REAL:
			case INT:
				{
				setState(163);
				number();
				}
				break;
			case ID:
				{
				setState(164);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(182);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(167);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(168);
						match(ADD);
						setState(169);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(170);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(171);
						match(SUBSTRACT);
						setState(172);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(173);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(174);
						match(MULTIPLY);
						setState(175);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(176);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(177);
						match(DIVIDE);
						setState(178);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(179);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(180);
						match(MODULO);
						setState(181);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class ParaphraseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParaphraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paraphrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).enterParaphrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaskroniecListener ) ((ZaskroniecListener)listener).exitParaphrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaskroniecVisitor ) return ((ZaskroniecVisitor<? extends T>)visitor).visitParaphrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaphraseContext paraphrase() throws RecognitionException {
		ParaphraseContext _localctx = new ParaphraseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_paraphrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__5);
			setState(188);
			expression(0);
			setState(189);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00c2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3F\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\7\6P\n\6\f\6\16"+
		"\6S\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\ba\n\b\f\b"+
		"\16\bd\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tm\n\t\3\n\3\n\3\n\3\n\3\n\7"+
		"\nt\n\n\f\n\16\nw\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\5\20\u0091"+
		"\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u00a8\n\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00b9"+
		"\n\26\f\26\16\26\u00bc\13\26\3\27\3\27\3\27\3\27\3\27\2\3*\30\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\3\3\2\31\32\2\u00c1\2\61\3\2"+
		"\2\2\4E\3\2\2\2\6G\3\2\2\2\bK\3\2\2\2\nM\3\2\2\2\fW\3\2\2\2\16[\3\2\2"+
		"\2\20l\3\2\2\2\22n\3\2\2\2\24z\3\2\2\2\26~\3\2\2\2\30\u0082\3\2\2\2\32"+
		"\u0086\3\2\2\2\34\u008a\3\2\2\2\36\u0090\3\2\2\2 \u0092\3\2\2\2\"\u0096"+
		"\3\2\2\2$\u009a\3\2\2\2&\u009d\3\2\2\2(\u00a1\3\2\2\2*\u00a7\3\2\2\2,"+
		"\u00bd\3\2\2\2.\60\5\4\3\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3"+
		"\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7\2\2\3\65\3\3\2\2\2\66\67\5"+
		"$\23\2\678\7\3\2\28F\3\2\2\29:\5 \21\2:;\7\3\2\2;F\3\2\2\2<=\5\"\22\2"+
		"=>\7\3\2\2>F\3\2\2\2?@\5&\24\2@A\7\3\2\2AF\3\2\2\2BF\5\16\b\2CF\5\22\n"+
		"\2DF\5\6\4\2E\66\3\2\2\2E9\3\2\2\2E<\3\2\2\2E?\3\2\2\2EB\3\2\2\2EC\3\2"+
		"\2\2ED\3\2\2\2F\5\3\2\2\2GH\7\23\2\2HI\5\b\5\2IJ\5\n\6\2J\7\3\2\2\2KL"+
		"\7\30\2\2L\t\3\2\2\2MQ\7\4\2\2NP\5\4\3\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2"+
		"QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\5\f\7\2UV\7\5\2\2V\13\3\2\2\2WX\7\6\2"+
		"\2XY\5*\26\2YZ\7\3\2\2Z\r\3\2\2\2[\\\7\7\2\2\\]\7\b\2\2]^\5\20\t\2^b\7"+
		"\t\2\2_a\5\4\3\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3"+
		"\2\2\2ef\7\n\2\2f\17\3\2\2\2gm\5\34\17\2hm\5\32\16\2im\5\30\r\2jm\5\26"+
		"\f\2km\5\24\13\2lg\3\2\2\2lh\3\2\2\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2m\21"+
		"\3\2\2\2no\7\13\2\2op\7\b\2\2pq\5\20\t\2qu\7\t\2\2rt\5\4\3\2sr\3\2\2\2"+
		"tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7\f\2\2y\23\3\2\2"+
		"\2z{\5\36\20\2{|\7\r\2\2|}\5\36\20\2}\25\3\2\2\2~\177\5\36\20\2\177\u0080"+
		"\7\16\2\2\u0080\u0081\5\36\20\2\u0081\27\3\2\2\2\u0082\u0083\5\36\20\2"+
		"\u0083\u0084\7\17\2\2\u0084\u0085\5\36\20\2\u0085\31\3\2\2\2\u0086\u0087"+
		"\5\36\20\2\u0087\u0088\7\20\2\2\u0088\u0089\5\36\20\2\u0089\33\3\2\2\2"+
		"\u008a\u008b\5\36\20\2\u008b\u008c\7\21\2\2\u008c\u008d\5\36\20\2\u008d"+
		"\35\3\2\2\2\u008e\u0091\7\30\2\2\u008f\u0091\5(\25\2\u0090\u008e\3\2\2"+
		"\2\u0090\u008f\3\2\2\2\u0091\37\3\2\2\2\u0092\u0093\7\22\2\2\u0093\u0094"+
		"\7\27\2\2\u0094\u0095\7\30\2\2\u0095!\3\2\2\2\u0096\u0097\7\22\2\2\u0097"+
		"\u0098\7\26\2\2\u0098\u0099\7\30\2\2\u0099#\3\2\2\2\u009a\u009b\7\25\2"+
		"\2\u009b\u009c\7\30\2\2\u009c%\3\2\2\2\u009d\u009e\7\30\2\2\u009e\u009f"+
		"\7\33\2\2\u009f\u00a0\5*\26\2\u00a0\'\3\2\2\2\u00a1\u00a2\t\2\2\2\u00a2"+
		")\3\2\2\2\u00a3\u00a4\b\26\1\2\u00a4\u00a8\5,\27\2\u00a5\u00a8\5(\25\2"+
		"\u00a6\u00a8\7\30\2\2\u00a7\u00a3\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6"+
		"\3\2\2\2\u00a8\u00ba\3\2\2\2\u00a9\u00aa\f\t\2\2\u00aa\u00ab\7\34\2\2"+
		"\u00ab\u00b9\5*\26\n\u00ac\u00ad\f\b\2\2\u00ad\u00ae\7\35\2\2\u00ae\u00b9"+
		"\5*\26\t\u00af\u00b0\f\7\2\2\u00b0\u00b1\7\36\2\2\u00b1\u00b9\5*\26\b"+
		"\u00b2\u00b3\f\6\2\2\u00b3\u00b4\7\37\2\2\u00b4\u00b9\5*\26\7\u00b5\u00b6"+
		"\f\5\2\2\u00b6\u00b7\7 \2\2\u00b7\u00b9\5*\26\6\u00b8\u00a9\3\2\2\2\u00b8"+
		"\u00ac\3\2\2\2\u00b8\u00af\3\2\2\2\u00b8\u00b2\3\2\2\2\u00b8\u00b5\3\2"+
		"\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"+\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7\b\2\2\u00be\u00bf\5*\26\2"+
		"\u00bf\u00c0\7\t\2\2\u00c0-\3\2\2\2\f\61EQblu\u0090\u00a7\u00b8\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}