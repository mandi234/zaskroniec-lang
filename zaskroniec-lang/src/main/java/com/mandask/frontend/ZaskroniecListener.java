// Generated from C:/Workspace/University/Zaskroniec/zaskroniec-lang\Zaskroniec.g4 by ANTLR 4.9.1
package com.mandask.frontend;
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
	 * Enter a parse tree produced by {@link ZaskroniecParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(ZaskroniecParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaskroniecParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(ZaskroniecParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaskroniecParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(ZaskroniecParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaskroniecParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(ZaskroniecParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaskroniecParser#boolean_exp}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_exp(ZaskroniecParser.Boolean_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaskroniecParser#boolean_exp}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_exp(ZaskroniecParser.Boolean_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaskroniecParser#geq_exp}.
	 * @param ctx the parse tree
	 */
	void enterGeq_exp(ZaskroniecParser.Geq_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaskroniecParser#geq_exp}.
	 * @param ctx the parse tree
	 */
	void exitGeq_exp(ZaskroniecParser.Geq_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaskroniecParser#leq_exp}.
	 * @param ctx the parse tree
	 */
	void enterLeq_exp(ZaskroniecParser.Leq_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaskroniecParser#leq_exp}.
	 * @param ctx the parse tree
	 */
	void exitLeq_exp(ZaskroniecParser.Leq_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaskroniecParser#greater_exp}.
	 * @param ctx the parse tree
	 */
	void enterGreater_exp(ZaskroniecParser.Greater_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaskroniecParser#greater_exp}.
	 * @param ctx the parse tree
	 */
	void exitGreater_exp(ZaskroniecParser.Greater_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaskroniecParser#less_exp}.
	 * @param ctx the parse tree
	 */
	void enterLess_exp(ZaskroniecParser.Less_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaskroniecParser#less_exp}.
	 * @param ctx the parse tree
	 */
	void exitLess_exp(ZaskroniecParser.Less_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaskroniecParser#equals_exp}.
	 * @param ctx the parse tree
	 */
	void enterEquals_exp(ZaskroniecParser.Equals_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaskroniecParser#equals_exp}.
	 * @param ctx the parse tree
	 */
	void exitEquals_exp(ZaskroniecParser.Equals_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaskroniecParser#value_exp}.
	 * @param ctx the parse tree
	 */
	void enterValue_exp(ZaskroniecParser.Value_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaskroniecParser#value_exp}.
	 * @param ctx the parse tree
	 */
	void exitValue_exp(ZaskroniecParser.Value_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaskroniecParser#scan_int_stmt}.
	 * @param ctx the parse tree
	 */
	void enterScan_int_stmt(ZaskroniecParser.Scan_int_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaskroniecParser#scan_int_stmt}.
	 * @param ctx the parse tree
	 */
	void exitScan_int_stmt(ZaskroniecParser.Scan_int_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaskroniecParser#scan_real_stmt}.
	 * @param ctx the parse tree
	 */
	void enterScan_real_stmt(ZaskroniecParser.Scan_real_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaskroniecParser#scan_real_stmt}.
	 * @param ctx the parse tree
	 */
	void exitScan_real_stmt(ZaskroniecParser.Scan_real_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaskroniecParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(ZaskroniecParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaskroniecParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(ZaskroniecParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaskroniecParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(ZaskroniecParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaskroniecParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(ZaskroniecParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZaskroniecParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ZaskroniecParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZaskroniecParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ZaskroniecParser.NumberContext ctx);
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
}