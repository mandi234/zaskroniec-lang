// Generated from C:/Workspace/University/Zaskroniec/zaskroniec-lang\Zaskroniec.g4 by ANTLR 4.9.1
package com.mandask.frontend;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
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
		T__0=1, T__1=2, T__2=3, SCAN=4, PRINT=5, REAL_DECLARATION=6, INT_DECLARATION=7, 
		ID=8, WHITESPACE=9, REAL=10, INT=11, ASSIGN=12, ADD=13, SUBSTRACT=14, 
		MULTIPLY=15, DIVIDE=16, MODULO=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "SCAN", "PRINT", "REAL_DECLARATION", "INT_DECLARATION", 
			"ID", "WHITESPACE", "REAL", "INT", "ASSIGN", "ADD", "SUBSTRACT", "MULTIPLY", 
			"DIVIDE", "MODULO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'ssskanuj'", "'wypisssz'", "'dabl'", "'int'", 
			null, null, null, null, "'='", "'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "SCAN", "PRINT", "REAL_DECLARATION", "INT_DECLARATION", 
			"ID", "WHITESPACE", "REAL", "INT", "ASSIGN", "ADD", "SUBSTRACT", "MULTIPLY", 
			"DIVIDE", "MODULO"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23v\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\6\tI\n\t\r\t\16\tJ\3\n\7\nN\n\n\f\n\16\nQ\13\n\3\n\3\n\3\13\5\13V\n\13"+
		"\3\13\6\13Y\n\13\r\13\16\13Z\3\13\3\13\6\13_\n\13\r\13\16\13`\3\f\5\f"+
		"d\n\f\3\f\6\fg\n\f\r\f\16\fh\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\5\2"+
		"\13\f\17\17\"\"\4\2--//\2|\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2\t+\3\2"+
		"\2\2\13\64\3\2\2\2\r=\3\2\2\2\17B\3\2\2\2\21F\3\2\2\2\23O\3\2\2\2\25U"+
		"\3\2\2\2\27c\3\2\2\2\31j\3\2\2\2\33l\3\2\2\2\35n\3\2\2\2\37p\3\2\2\2!"+
		"r\3\2\2\2#t\3\2\2\2%&\7=\2\2&\4\3\2\2\2\'(\7*\2\2(\6\3\2\2\2)*\7+\2\2"+
		"*\b\3\2\2\2+,\7u\2\2,-\7u\2\2-.\7u\2\2./\7m\2\2/\60\7c\2\2\60\61\7p\2"+
		"\2\61\62\7w\2\2\62\63\7l\2\2\63\n\3\2\2\2\64\65\7y\2\2\65\66\7{\2\2\66"+
		"\67\7r\2\2\678\7k\2\289\7u\2\29:\7u\2\2:;\7u\2\2;<\7|\2\2<\f\3\2\2\2="+
		">\7f\2\2>?\7c\2\2?@\7d\2\2@A\7n\2\2A\16\3\2\2\2BC\7k\2\2CD\7p\2\2DE\7"+
		"v\2\2E\20\3\2\2\2FH\t\2\2\2GI\t\3\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK"+
		"\3\2\2\2K\22\3\2\2\2LN\t\4\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2"+
		"PR\3\2\2\2QO\3\2\2\2RS\b\n\2\2S\24\3\2\2\2TV\t\5\2\2UT\3\2\2\2UV\3\2\2"+
		"\2VX\3\2\2\2WY\4\62;\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2"+
		"\2\2\\^\7\60\2\2]_\4\62;\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\26"+
		"\3\2\2\2bd\t\5\2\2cb\3\2\2\2cd\3\2\2\2df\3\2\2\2eg\4\62;\2fe\3\2\2\2g"+
		"h\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\30\3\2\2\2jk\7?\2\2k\32\3\2\2\2lm\7-\2"+
		"\2m\34\3\2\2\2no\7/\2\2o\36\3\2\2\2pq\7,\2\2q \3\2\2\2rs\7\61\2\2s\"\3"+
		"\2\2\2tu\7\'\2\2u$\3\2\2\2\n\2JOUZ`ch\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}