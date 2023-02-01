// Generated from java-escape by ANTLR 4.11.1
package exercise2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class computerGrammar extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PART=1, PRODUCER=2, PRICE=3, CURRENCY=4, WS=5;
	public static final int
		RULE_start = 0, RULE_computer = 1, RULE_parts = 2, RULE_price = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "computer", "parts", "price"
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
			null, "PART", "PRODUCER", "PRICE", "CURRENCY", "WS"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public computerGrammar(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ComputerContext computer() {
			return getRuleContext(ComputerContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof computerGrammarListener ) ((computerGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof computerGrammarListener ) ((computerGrammarListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof computerGrammarVisitor ) return ((computerGrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			computer();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComputerContext extends ParserRuleContext {
		public PriceContext price() {
			return getRuleContext(PriceContext.class,0);
		}
		public List<PartsContext> parts() {
			return getRuleContexts(PartsContext.class);
		}
		public PartsContext parts(int i) {
			return getRuleContext(PartsContext.class,i);
		}
		public ComputerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof computerGrammarListener ) ((computerGrammarListener)listener).enterComputer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof computerGrammarListener ) ((computerGrammarListener)listener).exitComputer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof computerGrammarVisitor ) return ((computerGrammarVisitor<? extends T>)visitor).visitComputer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComputerContext computer() throws RecognitionException {
		ComputerContext _localctx = new ComputerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_computer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				parts();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PART );
			setState(15);
			price();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PartsContext extends ParserRuleContext {
		public TerminalNode PART() { return getToken(computerGrammar.PART, 0); }
		public TerminalNode PRODUCER() { return getToken(computerGrammar.PRODUCER, 0); }
		public PriceContext price() {
			return getRuleContext(PriceContext.class,0);
		}
		public PartsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof computerGrammarListener ) ((computerGrammarListener)listener).enterParts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof computerGrammarListener ) ((computerGrammarListener)listener).exitParts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof computerGrammarVisitor ) return ((computerGrammarVisitor<? extends T>)visitor).visitParts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartsContext parts() throws RecognitionException {
		PartsContext _localctx = new PartsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(PART);
			setState(18);
			match(PRODUCER);
			setState(19);
			price();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PriceContext extends ParserRuleContext {
		public TerminalNode PRICE() { return getToken(computerGrammar.PRICE, 0); }
		public TerminalNode CURRENCY() { return getToken(computerGrammar.CURRENCY, 0); }
		public PriceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_price; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof computerGrammarListener ) ((computerGrammarListener)listener).enterPrice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof computerGrammarListener ) ((computerGrammarListener)listener).exitPrice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof computerGrammarVisitor ) return ((computerGrammarVisitor<? extends T>)visitor).visitPrice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PriceContext price() throws RecognitionException {
		PriceContext _localctx = new PriceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_price);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(PRICE);
			setState(22);
			match(CURRENCY);
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
		"\u0004\u0001\u0005\u0019\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0004\u0001\f\b\u0001\u000b\u0001\f\u0001\r\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006"+
		"\u0000\u0000\u0015\u0000\b\u0001\u0000\u0000\u0000\u0002\u000b\u0001\u0000"+
		"\u0000\u0000\u0004\u0011\u0001\u0000\u0000\u0000\u0006\u0015\u0001\u0000"+
		"\u0000\u0000\b\t\u0003\u0002\u0001\u0000\t\u0001\u0001\u0000\u0000\u0000"+
		"\n\f\u0003\u0004\u0002\u0000\u000b\n\u0001\u0000\u0000\u0000\f\r\u0001"+
		"\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000"+
		"\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\u0010\u0003\u0006"+
		"\u0003\u0000\u0010\u0003\u0001\u0000\u0000\u0000\u0011\u0012\u0005\u0001"+
		"\u0000\u0000\u0012\u0013\u0005\u0002\u0000\u0000\u0013\u0014\u0003\u0006"+
		"\u0003\u0000\u0014\u0005\u0001\u0000\u0000\u0000\u0015\u0016\u0005\u0003"+
		"\u0000\u0000\u0016\u0017\u0005\u0004\u0000\u0000\u0017\u0007\u0001\u0000"+
		"\u0000\u0000\u0001\r";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}