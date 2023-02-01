// Generated from java-escape by ANTLR 4.11.1
package exercise2;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link computerGrammar}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface computerGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link computerGrammar#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(computerGrammar.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link computerGrammar#computer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputer(computerGrammar.ComputerContext ctx);
	/**
	 * Visit a parse tree produced by {@link computerGrammar#parts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParts(computerGrammar.PartsContext ctx);
	/**
	 * Visit a parse tree produced by {@link computerGrammar#price}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrice(computerGrammar.PriceContext ctx);
}