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
		T__9=10, SCAN=11, PRINT=12, REAL_DECLARATION=13, INT_DECLARATION=14, ID=15, 
		REAL=16, INT=17, ASSIGN=18, ADD=19, SUBSTRACT=20, MULTIPLY=21, DIVIDE=22, 
		MODULO=23, WHITESPACE=24;
	public static final int
		RULE_file = 0, RULE_stmt = 1, RULE_if_stmt = 2, RULE_boolean_exp = 3, 
		RULE_geq_exp = 4, RULE_leq_exp = 5, RULE_greater_exp = 6, RULE_less_exp = 7, 
		RULE_equals_exp = 8, RULE_value_exp = 9, RULE_scan_int_stmt = 10, RULE_scan_real_stmt = 11, 
		RULE_print_stmt = 12, RULE_assign_stmt = 13, RULE_number = 14, RULE_expression = 15, 
		RULE_paraphrase = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "stmt", "if_stmt", "boolean_exp", "geq_exp", "leq_exp", "greater_exp", 
			"less_exp", "equals_exp", "value_exp", "scan_int_stmt", "scan_real_stmt", 
			"print_stmt", "assign_stmt", "number", "expression", "paraphrase"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'jesssli'", "'('", "')'", "'ssskonczjesssli'", "'>='", 
			"'<='", "'>'", "'<'", "'=='", "'ssskanuj'", "'wypisssz'", "'dabl'", "'int'", 
			null, null, null, "'='", "'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "SCAN", 
			"PRINT", "REAL_DECLARATION", "INT_DECLARATION", "ID", "REAL", "INT", 
			"ASSIGN", "ADD", "SUBSTRACT", "MULTIPLY", "DIVIDE", "MODULO", "WHITESPACE"
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << SCAN) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				{
				setState(34);
				stmt();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				print_stmt();
				setState(43);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				scan_int_stmt();
				setState(46);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				scan_real_stmt();
				setState(49);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				assign_stmt();
				setState(52);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				if_stmt();
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
			setState(57);
			match(T__1);
			setState(58);
			match(T__2);
			setState(59);
			boolean_exp();
			setState(60);
			match(T__3);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << SCAN) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				{
				setState(61);
				stmt();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
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
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				equals_exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				less_exp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				greater_exp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				leq_exp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
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
		enterRule(_localctx, 8, RULE_geq_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			value_exp();
			setState(77);
			match(T__5);
			setState(78);
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
		enterRule(_localctx, 10, RULE_leq_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			value_exp();
			setState(81);
			match(T__6);
			setState(82);
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
		enterRule(_localctx, 12, RULE_greater_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			value_exp();
			setState(85);
			match(T__7);
			setState(86);
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
		enterRule(_localctx, 14, RULE_less_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			value_exp();
			setState(89);
			match(T__8);
			setState(90);
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
		enterRule(_localctx, 16, RULE_equals_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			value_exp();
			setState(93);
			match(T__9);
			setState(94);
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
		enterRule(_localctx, 18, RULE_value_exp);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(ID);
				}
				break;
			case REAL:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
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
		enterRule(_localctx, 20, RULE_scan_int_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(SCAN);
			setState(101);
			match(INT_DECLARATION);
			setState(102);
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
		enterRule(_localctx, 22, RULE_scan_real_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(SCAN);
			setState(105);
			match(REAL_DECLARATION);
			setState(106);
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
		enterRule(_localctx, 24, RULE_print_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(PRINT);
			setState(109);
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
		enterRule(_localctx, 26, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ID);
			setState(112);
			match(ASSIGN);
			setState(113);
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
		enterRule(_localctx, 28, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(118);
				paraphrase();
				}
				break;
			case REAL:
			case INT:
				{
				setState(119);
				number();
				}
				break;
			case ID:
				{
				setState(120);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(138);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(123);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(124);
						match(ADD);
						setState(125);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(126);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(127);
						match(SUBSTRACT);
						setState(128);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(129);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(130);
						match(MULTIPLY);
						setState(131);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(132);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(133);
						match(DIVIDE);
						setState(134);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(135);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(136);
						match(MODULO);
						setState(137);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 32, RULE_paraphrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__2);
			setState(144);
			expression(0);
			setState(145);
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
		case 15:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\3\4\7\4A\n\4\f\4\16\4D\13"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5M\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\5\13e\n\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\5\21|\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u008d\n\21\f\21\16"+
		"\21\u0090\13\21\3\22\3\22\3\22\3\22\3\22\2\3 \23\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"\2\3\3\2\22\23\2\u0096\2\'\3\2\2\2\49\3\2\2\2\6;"+
		"\3\2\2\2\bL\3\2\2\2\nN\3\2\2\2\fR\3\2\2\2\16V\3\2\2\2\20Z\3\2\2\2\22^"+
		"\3\2\2\2\24d\3\2\2\2\26f\3\2\2\2\30j\3\2\2\2\32n\3\2\2\2\34q\3\2\2\2\36"+
		"u\3\2\2\2 {\3\2\2\2\"\u0091\3\2\2\2$&\5\4\3\2%$\3\2\2\2&)\3\2\2\2\'%\3"+
		"\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\7\2\2\3+\3\3\2\2\2,-\5\32\16"+
		"\2-.\7\3\2\2.:\3\2\2\2/\60\5\26\f\2\60\61\7\3\2\2\61:\3\2\2\2\62\63\5"+
		"\30\r\2\63\64\7\3\2\2\64:\3\2\2\2\65\66\5\34\17\2\66\67\7\3\2\2\67:\3"+
		"\2\2\28:\5\6\4\29,\3\2\2\29/\3\2\2\29\62\3\2\2\29\65\3\2\2\298\3\2\2\2"+
		":\5\3\2\2\2;<\7\4\2\2<=\7\5\2\2=>\5\b\5\2>B\7\6\2\2?A\5\4\3\2@?\3\2\2"+
		"\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\7\2\2F\7\3\2"+
		"\2\2GM\5\22\n\2HM\5\20\t\2IM\5\16\b\2JM\5\f\7\2KM\5\n\6\2LG\3\2\2\2LH"+
		"\3\2\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\t\3\2\2\2NO\5\24\13\2OP\7\b\2"+
		"\2PQ\5\24\13\2Q\13\3\2\2\2RS\5\24\13\2ST\7\t\2\2TU\5\24\13\2U\r\3\2\2"+
		"\2VW\5\24\13\2WX\7\n\2\2XY\5\24\13\2Y\17\3\2\2\2Z[\5\24\13\2[\\\7\13\2"+
		"\2\\]\5\24\13\2]\21\3\2\2\2^_\5\24\13\2_`\7\f\2\2`a\5\24\13\2a\23\3\2"+
		"\2\2be\7\21\2\2ce\5\36\20\2db\3\2\2\2dc\3\2\2\2e\25\3\2\2\2fg\7\r\2\2"+
		"gh\7\20\2\2hi\7\21\2\2i\27\3\2\2\2jk\7\r\2\2kl\7\17\2\2lm\7\21\2\2m\31"+
		"\3\2\2\2no\7\16\2\2op\7\21\2\2p\33\3\2\2\2qr\7\21\2\2rs\7\24\2\2st\5 "+
		"\21\2t\35\3\2\2\2uv\t\2\2\2v\37\3\2\2\2wx\b\21\1\2x|\5\"\22\2y|\5\36\20"+
		"\2z|\7\21\2\2{w\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\u008e\3\2\2\2}~\f\t\2\2~"+
		"\177\7\25\2\2\177\u008d\5 \21\n\u0080\u0081\f\b\2\2\u0081\u0082\7\26\2"+
		"\2\u0082\u008d\5 \21\t\u0083\u0084\f\7\2\2\u0084\u0085\7\27\2\2\u0085"+
		"\u008d\5 \21\b\u0086\u0087\f\6\2\2\u0087\u0088\7\30\2\2\u0088\u008d\5"+
		" \21\7\u0089\u008a\f\5\2\2\u008a\u008b\7\31\2\2\u008b\u008d\5 \21\6\u008c"+
		"}\3\2\2\2\u008c\u0080\3\2\2\2\u008c\u0083\3\2\2\2\u008c\u0086\3\2\2\2"+
		"\u008c\u0089\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f!\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\5\2\2\u0092"+
		"\u0093\5 \21\2\u0093\u0094\7\6\2\2\u0094#\3\2\2\2\n\'9BLd{\u008c\u008e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}