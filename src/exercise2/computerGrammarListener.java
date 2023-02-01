// Generated from java-escape by ANTLR 4.11.1
package exercise2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link computerGrammar}.
 */
public interface computerGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link computerGrammar#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(computerGrammar.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link computerGrammar#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(computerGrammar.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link computerGrammar#computer}.
	 * @param ctx the parse tree
	 */
	void enterComputer(computerGrammar.ComputerContext ctx);
	/**
	 * Exit a parse tree produced by {@link computerGrammar#computer}.
	 * @param ctx the parse tree
	 */
	void exitComputer(computerGrammar.ComputerContext ctx);
	/**
	 * Enter a parse tree produced by {@link computerGrammar#parts}.
	 * @param ctx the parse tree
	 */
	void enterParts(computerGrammar.PartsContext ctx);
	/**
	 * Exit a parse tree produced by {@link computerGrammar#parts}.
	 * @param ctx the parse tree
	 */
	void exitParts(computerGrammar.PartsContext ctx);
	/**
	 * Enter a parse tree produced by {@link computerGrammar#price}.
	 * @param ctx the parse tree
	 */
	void enterPrice(computerGrammar.PriceContext ctx);
	/**
	 * Exit a parse tree produced by {@link computerGrammar#price}.
	 * @param ctx the parse tree
	 */
	void exitPrice(computerGrammar.PriceContext ctx);
}