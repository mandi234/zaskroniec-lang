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
		T__9=10, T__10=11, T__11=12, SCAN=13, PRINT=14, REAL_DECLARATION=15, INT_DECLARATION=16, 
		ID=17, REAL=18, INT=19, ASSIGN=20, ADD=21, SUBSTRACT=22, MULTIPLY=23, 
		DIVIDE=24, MODULO=25, WHITESPACE=26;
	public static final int
		RULE_file = 0, RULE_stmt = 1, RULE_if_stmt = 2, RULE_boolean_exp = 3, 
		RULE_while_stmt = 4, RULE_geq_exp = 5, RULE_leq_exp = 6, RULE_greater_exp = 7, 
		RULE_less_exp = 8, RULE_equals_exp = 9, RULE_value_exp = 10, RULE_scan_int_stmt = 11, 
		RULE_scan_real_stmt = 12, RULE_print_stmt = 13, RULE_assign_stmt = 14, 
		RULE_number = 15, RULE_expression = 16, RULE_paraphrase = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "stmt", "if_stmt", "boolean_exp", "while_stmt", "geq_exp", "leq_exp", 
			"greater_exp", "less_exp", "equals_exp", "value_exp", "scan_int_stmt", 
			"scan_real_stmt", "print_stmt", "assign_stmt", "number", "expression", 
			"paraphrase"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'jesssli'", "'('", "')'", "'ssskonczjesssli'", "'podczasss'", 
			"'ssskonczpodczasss'", "'>='", "'<='", "'>'", "'<'", "'=='", "'ssskanuj'", 
			"'wypisssz'", "'dabl'", "'int'", null, null, null, "'='", "'+'", "'-'", 
			"'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "SCAN", "PRINT", "REAL_DECLARATION", "INT_DECLARATION", "ID", "REAL", 
			"INT", "ASSIGN", "ADD", "SUBSTRACT", "MULTIPLY", "DIVIDE", "MODULO", 
			"WHITESPACE"
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
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << SCAN) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				{
				setState(36);
				stmt();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
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
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				print_stmt();
				setState(45);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				scan_int_stmt();
				setState(48);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				scan_real_stmt();
				setState(51);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				assign_stmt();
				setState(54);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				if_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				while_stmt();
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
		enterRule(_localctx, 4, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__1);
			setState(61);
			match(T__2);
			setState(62);
			boolean_exp();
			setState(63);
			match(T__3);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << SCAN) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				{
				setState(64);
				stmt();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(T__4);
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
		enterRule(_localctx, 6, RULE_boolean_exp);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				equals_exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				less_exp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				greater_exp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				leq_exp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
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
		enterRule(_localctx, 8, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__5);
			setState(80);
			match(T__2);
			setState(81);
			boolean_exp();
			setState(82);
			match(T__3);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << SCAN) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				{
				setState(83);
				stmt();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
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
		enterRule(_localctx, 10, RULE_geq_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			value_exp();
			setState(92);
			match(T__7);
			setState(93);
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
		enterRule(_localctx, 12, RULE_leq_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			value_exp();
			setState(96);
			match(T__8);
			setState(97);
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
		enterRule(_localctx, 14, RULE_greater_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			value_exp();
			setState(100);
			match(T__9);
			setState(101);
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
		enterRule(_localctx, 16, RULE_less_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			value_exp();
			setState(104);
			match(T__10);
			setState(105);
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
		enterRule(_localctx, 18, RULE_equals_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			value_exp();
			setState(108);
			match(T__11);
			setState(109);
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
		enterRule(_localctx, 20, RULE_value_exp);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(ID);
				}
				break;
			case REAL:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
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
		enterRule(_localctx, 22, RULE_scan_int_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(SCAN);
			setState(116);
			match(INT_DECLARATION);
			setState(117);
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
		enterRule(_localctx, 24, RULE_scan_real_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(SCAN);
			setState(120);
			match(REAL_DECLARATION);
			setState(121);
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
		enterRule(_localctx, 26, RULE_print_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(PRINT);
			setState(124);
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
		enterRule(_localctx, 28, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(ID);
			setState(127);
			match(ASSIGN);
			setState(128);
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
		enterRule(_localctx, 30, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(133);
				paraphrase();
				}
				break;
			case REAL:
			case INT:
				{
				setState(134);
				number();
				}
				break;
			case ID:
				{
				setState(135);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(138);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(139);
						match(ADD);
						setState(140);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(141);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(142);
						match(SUBSTRACT);
						setState(143);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(144);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(145);
						match(MULTIPLY);
						setState(146);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(147);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(148);
						match(DIVIDE);
						setState(149);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(150);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(151);
						match(MODULO);
						setState(152);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 34, RULE_paraphrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__2);
			setState(159);
			expression(0);
			setState(160);
			match(T__3);
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
		case 16:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u00a5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\4\3\4\3\4\3\4\3\4\7\4D\n\4"+
		"\f\4\16\4G\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5P\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\7\6W\n\6\f\6\16\6Z\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\5\ft\n\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\5\22\u008b\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u009c\n\22\f\22"+
		"\16\22\u009f\13\22\3\23\3\23\3\23\3\23\3\23\2\3\"\24\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$\2\3\3\2\24\25\2\u00a6\2)\3\2\2\2\4<\3\2\2\2"+
		"\6>\3\2\2\2\bO\3\2\2\2\nQ\3\2\2\2\f]\3\2\2\2\16a\3\2\2\2\20e\3\2\2\2\22"+
		"i\3\2\2\2\24m\3\2\2\2\26s\3\2\2\2\30u\3\2\2\2\32y\3\2\2\2\34}\3\2\2\2"+
		"\36\u0080\3\2\2\2 \u0084\3\2\2\2\"\u008a\3\2\2\2$\u00a0\3\2\2\2&(\5\4"+
		"\3\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\7"+
		"\2\2\3-\3\3\2\2\2./\5\34\17\2/\60\7\3\2\2\60=\3\2\2\2\61\62\5\30\r\2\62"+
		"\63\7\3\2\2\63=\3\2\2\2\64\65\5\32\16\2\65\66\7\3\2\2\66=\3\2\2\2\678"+
		"\5\36\20\289\7\3\2\29=\3\2\2\2:=\5\6\4\2;=\5\n\6\2<.\3\2\2\2<\61\3\2\2"+
		"\2<\64\3\2\2\2<\67\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\5\3\2\2\2>?\7\4\2\2?@"+
		"\7\5\2\2@A\5\b\5\2AE\7\6\2\2BD\5\4\3\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2E"+
		"F\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\7\2\2I\7\3\2\2\2JP\5\24\13\2KP\5\22"+
		"\n\2LP\5\20\t\2MP\5\16\b\2NP\5\f\7\2OJ\3\2\2\2OK\3\2\2\2OL\3\2\2\2OM\3"+
		"\2\2\2ON\3\2\2\2P\t\3\2\2\2QR\7\b\2\2RS\7\5\2\2ST\5\b\5\2TX\7\6\2\2UW"+
		"\5\4\3\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2["+
		"\\\7\t\2\2\\\13\3\2\2\2]^\5\26\f\2^_\7\n\2\2_`\5\26\f\2`\r\3\2\2\2ab\5"+
		"\26\f\2bc\7\13\2\2cd\5\26\f\2d\17\3\2\2\2ef\5\26\f\2fg\7\f\2\2gh\5\26"+
		"\f\2h\21\3\2\2\2ij\5\26\f\2jk\7\r\2\2kl\5\26\f\2l\23\3\2\2\2mn\5\26\f"+
		"\2no\7\16\2\2op\5\26\f\2p\25\3\2\2\2qt\7\23\2\2rt\5 \21\2sq\3\2\2\2sr"+
		"\3\2\2\2t\27\3\2\2\2uv\7\17\2\2vw\7\22\2\2wx\7\23\2\2x\31\3\2\2\2yz\7"+
		"\17\2\2z{\7\21\2\2{|\7\23\2\2|\33\3\2\2\2}~\7\20\2\2~\177\7\23\2\2\177"+
		"\35\3\2\2\2\u0080\u0081\7\23\2\2\u0081\u0082\7\26\2\2\u0082\u0083\5\""+
		"\22\2\u0083\37\3\2\2\2\u0084\u0085\t\2\2\2\u0085!\3\2\2\2\u0086\u0087"+
		"\b\22\1\2\u0087\u008b\5$\23\2\u0088\u008b\5 \21\2\u0089\u008b\7\23\2\2"+
		"\u008a\u0086\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u009d"+
		"\3\2\2\2\u008c\u008d\f\t\2\2\u008d\u008e\7\27\2\2\u008e\u009c\5\"\22\n"+
		"\u008f\u0090\f\b\2\2\u0090\u0091\7\30\2\2\u0091\u009c\5\"\22\t\u0092\u0093"+
		"\f\7\2\2\u0093\u0094\7\31\2\2\u0094\u009c\5\"\22\b\u0095\u0096\f\6\2\2"+
		"\u0096\u0097\7\32\2\2\u0097\u009c\5\"\22\7\u0098\u0099\f\5\2\2\u0099\u009a"+
		"\7\33\2\2\u009a\u009c\5\"\22\6\u009b\u008c\3\2\2\2\u009b\u008f\3\2\2\2"+
		"\u009b\u0092\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0098\3\2\2\2\u009c\u009f"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e#\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a1\7\5\2\2\u00a1\u00a2\5\"\22\2\u00a2\u00a3\7"+
		"\6\2\2\u00a3%\3\2\2\2\13)<EOXs\u008a\u009b\u009d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}