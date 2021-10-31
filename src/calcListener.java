// Generated from calc.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calcParser}.
 */
public interface calcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calcParser#calculator}.
	 * @param ctx the parse tree
	 */
	void enterCalculator(calcParser.CalculatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#calculator}.
	 * @param ctx the parse tree
	 */
	void exitCalculator(calcParser.CalculatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(calcParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(calcParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(calcParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(calcParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(calcParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(calcParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(calcParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(calcParser.FactorContext ctx);
}