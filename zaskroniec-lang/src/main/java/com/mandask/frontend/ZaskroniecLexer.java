package com.mandask.frontend;

// Generated from C:/Workspace/University/Zaskroniec/zaskroniec-lang\Zaskroniec.g4 by ANTLR 4.9.1

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ZaskroniecLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, NAME=9, 
		NUMBER=10, WHITESPACE=11, ADD=12, SUBTRACT=13, MULTIPLY=14, DIVIDE=15, 
		MODULO=16, NEWLINE=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "NAME", 
			"NUMBER", "WHITESPACE", "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE", "MODULO", 
			"NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'function'", "'{'", "'}'", "';'", "'return'", "'('", "')'", "','", 
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "NAME", "NUMBER", 
			"WHITESPACE", "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE", "MODULO", "NEWLINE"
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


	public ZaskroniecLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Zaskroniec.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23b\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\6\nD\n\n\r\n\16\nE"+
		"\3\13\6\13I\n\13\r\13\16\13J\3\f\7\fN\n\f\f\f\16\fQ\13\f\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\2\2\23"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\4\2\13\13\"\"\4"+
		"\2\f\f\17\17\2d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5.\3\2\2\2\7\60\3\2\2\2\t\62\3\2\2\2\13\64"+
		"\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21?\3\2\2\2\23A\3\2\2\2\25H\3\2\2\2\27"+
		"O\3\2\2\2\31T\3\2\2\2\33V\3\2\2\2\35X\3\2\2\2\37Z\3\2\2\2!\\\3\2\2\2#"+
		"^\3\2\2\2%&\7h\2\2&\'\7w\2\2\'(\7p\2\2()\7e\2\2)*\7v\2\2*+\7k\2\2+,\7"+
		"q\2\2,-\7p\2\2-\4\3\2\2\2./\7}\2\2/\6\3\2\2\2\60\61\7\177\2\2\61\b\3\2"+
		"\2\2\62\63\7=\2\2\63\n\3\2\2\2\64\65\7t\2\2\65\66\7g\2\2\66\67\7v\2\2"+
		"\678\7w\2\289\7t\2\29:\7p\2\2:\f\3\2\2\2;<\7*\2\2<\16\3\2\2\2=>\7+\2\2"+
		">\20\3\2\2\2?@\7.\2\2@\22\3\2\2\2AC\t\2\2\2BD\t\3\2\2CB\3\2\2\2DE\3\2"+
		"\2\2EC\3\2\2\2EF\3\2\2\2F\24\3\2\2\2GI\t\4\2\2HG\3\2\2\2IJ\3\2\2\2JH\3"+
		"\2\2\2JK\3\2\2\2K\26\3\2\2\2LN\t\5\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2O"+
		"P\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\b\f\2\2S\30\3\2\2\2TU\7-\2\2U\32\3\2\2"+
		"\2VW\7/\2\2W\34\3\2\2\2XY\7,\2\2Y\36\3\2\2\2Z[\7\61\2\2[ \3\2\2\2\\]\7"+
		"\'\2\2]\"\3\2\2\2^_\t\6\2\2_`\3\2\2\2`a\b\22\2\2a$\3\2\2\2\6\2EJO\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}