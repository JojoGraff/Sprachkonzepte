// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Exercise1b extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Time=1, WS=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Time", "HOURS", "MINUTES", "TIMELOWER", "TIMEUPPER", "DAYTIME", "COLON", 
			"SPACE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Time", "WS"
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


	public Exercise1b(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Exercise1b.g4"; }

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
		"\u0004\u0000\u0002Z\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\u001f\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001%\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u00036\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004D\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005N\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0004\bU\b\b\u000b\b\f\bV\u0001\b\u0001\b\u0000\u0000\t"+
		"\u0001\u0001\u0003\u0000\u0005\u0000\u0007\u0000\t\u0000\u000b\u0000\r"+
		"\u0000\u000f\u0000\u0011\u0002\u0001\u0000\u0005\u0001\u000019\u0001\u0000"+
		"02\u0001\u000005\u0001\u000009\u0003\u0000\t\n\r\r  Y\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0001\u001e\u0001"+
		"\u0000\u0000\u0000\u0003$\u0001\u0000\u0000\u0000\u0005&\u0001\u0000\u0000"+
		"\u0000\u00075\u0001\u0000\u0000\u0000\tC\u0001\u0000\u0000\u0000\u000b"+
		"M\u0001\u0000\u0000\u0000\rO\u0001\u0000\u0000\u0000\u000fQ\u0001\u0000"+
		"\u0000\u0000\u0011T\u0001\u0000\u0000\u0000\u0013\u0014\u0003\u0003\u0001"+
		"\u0000\u0014\u0015\u0003\r\u0006\u0000\u0015\u0016\u0003\u0005\u0002\u0000"+
		"\u0016\u0017\u0003\u000f\u0007\u0000\u0017\u0018\u0003\u000b\u0005\u0000"+
		"\u0018\u001f\u0001\u0000\u0000\u0000\u0019\u001a\u0003\u0003\u0001\u0000"+
		"\u001a\u001b\u0003\r\u0006\u0000\u001b\u001c\u0003\u0007\u0003\u0000\u001c"+
		"\u001f\u0001\u0000\u0000\u0000\u001d\u001f\u0003\t\u0004\u0000\u001e\u0013"+
		"\u0001\u0000\u0000\u0000\u001e\u0019\u0001\u0000\u0000\u0000\u001e\u001d"+
		"\u0001\u0000\u0000\u0000\u001f\u0002\u0001\u0000\u0000\u0000 !\u00050"+
		"\u0000\u0000!%\u0007\u0000\u0000\u0000\"#\u00051\u0000\u0000#%\u0007\u0001"+
		"\u0000\u0000$ \u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%\u0004"+
		"\u0001\u0000\u0000\u0000&\'\u0007\u0002\u0000\u0000\'(\u0007\u0003\u0000"+
		"\u0000(\u0006\u0001\u0000\u0000\u0000)*\u0005n\u0000\u0000*+\u0005o\u0000"+
		"\u0000+,\u0005o\u0000\u0000,6\u0005n\u0000\u0000-.\u0005m\u0000\u0000"+
		"./\u0005i\u0000\u0000/0\u0005d\u0000\u000001\u0005n\u0000\u000012\u0005"+
		"i\u0000\u000023\u0005g\u0000\u000034\u0005h\u0000\u000046\u0005t\u0000"+
		"\u00005)\u0001\u0000\u0000\u00005-\u0001\u0000\u0000\u00006\b\u0001\u0000"+
		"\u0000\u000078\u0005N\u0000\u000089\u0005o\u0000\u00009:\u0005o\u0000"+
		"\u0000:D\u0005n\u0000\u0000;<\u0005M\u0000\u0000<=\u0005i\u0000\u0000"+
		"=>\u0005d\u0000\u0000>?\u0005n\u0000\u0000?@\u0005i\u0000\u0000@A\u0005"+
		"g\u0000\u0000AB\u0005h\u0000\u0000BD\u0005t\u0000\u0000C7\u0001\u0000"+
		"\u0000\u0000C;\u0001\u0000\u0000\u0000D\n\u0001\u0000\u0000\u0000EF\u0005"+
		"a\u0000\u0000FG\u0005.\u0000\u0000GH\u0005m\u0000\u0000HN\u0005.\u0000"+
		"\u0000IJ\u0005p\u0000\u0000JK\u0005.\u0000\u0000KL\u0005m\u0000\u0000"+
		"LN\u0005.\u0000\u0000ME\u0001\u0000\u0000\u0000MI\u0001\u0000\u0000\u0000"+
		"N\f\u0001\u0000\u0000\u0000OP\u0005:\u0000\u0000P\u000e\u0001\u0000\u0000"+
		"\u0000QR\u0005 \u0000\u0000R\u0010\u0001\u0000\u0000\u0000SU\u0007\u0004"+
		"\u0000\u0000TS\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"XY\u0006\b\u0000\u0000Y\u0012\u0001\u0000\u0000\u0000\u0007\u0000\u001e"+
		"$5CMV\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}