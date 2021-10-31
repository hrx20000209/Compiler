// Generated from calc.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link calcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface calcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link calcParser#calculator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculator(calcParser.CalculatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(calcParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(calcParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(calcParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(calcParser.FactorContext ctx);
}