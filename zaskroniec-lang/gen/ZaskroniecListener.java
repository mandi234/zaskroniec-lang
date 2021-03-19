// Generated from C:/Users/Kamil/Desktop/Studia Magisterskie/JFK/Project2/zaskroniec-lang\Zaskroniec.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ZaskroniecParser}.
 */
public interface ZaskroniecListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ZaskroniecParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(ZaskroniecParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaskroniecParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(ZaskroniecParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaskroniecParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(ZaskroniecParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaskroniecParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(ZaskroniecParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaskroniecParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ZaskroniecParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaskroniecParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ZaskroniecParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaskroniecParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ZaskroniecParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaskroniecParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ZaskroniecParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaskroniecParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(ZaskroniecParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaskroniecParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(ZaskroniecParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaskroniecParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ZaskroniecParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaskroniecParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ZaskroniecParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaskroniecParser#paraphrase}.
	 * @param ctx the parse tree
	 */
	void enterParaphrase(ZaskroniecParser.ParaphraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaskroniecParser#paraphrase}.
	 * @param ctx the parse tree
	 */
	void exitParaphrase(ZaskroniecParser.ParaphraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaskroniecParser#args_declaration}.
	 * @param ctx the parse tree
	 */
	void enterArgs_declaration(ZaskroniecParser.Args_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaskroniecParser#args_declaration}.
	 * @param ctx the parse tree
	 */
	void exitArgs_declaration(ZaskroniecParser.Args_declarationContext ctx);
}