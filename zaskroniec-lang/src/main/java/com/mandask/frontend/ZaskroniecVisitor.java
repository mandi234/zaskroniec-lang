// Generated from C:/Workspace/University/Zaskroniec/zaskroniec-lang\Zaskroniec.g4 by ANTLR 4.9.1
package com.mandask.frontend;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ZaskroniecParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ZaskroniecVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ZaskroniecParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(ZaskroniecParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaskroniecParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(ZaskroniecParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaskroniecParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(ZaskroniecParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaskroniecParser#boolean_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_exp(ZaskroniecParser.Boolean_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaskroniecParser#geq_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeq_exp(ZaskroniecParser.Geq_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaskroniecParser#leq_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeq_exp(ZaskroniecParser.Leq_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaskroniecParser#greater_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater_exp(ZaskroniecParser.Greater_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaskroniecParser#less_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess_exp(ZaskroniecParser.Less_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaskroniecParser#equals_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals_exp(ZaskroniecParser.Equals_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaskroniecParser#value_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_exp(ZaskroniecParser.Value_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaskroniecParser#scan_int_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScan_int_stmt(ZaskroniecParser.Scan_int_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaskroniecParser#scan_real_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScan_real_stmt(ZaskroniecParser.Scan_real_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaskroniecParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(ZaskroniecParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaskroniecParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(ZaskroniecParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaskroniecParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ZaskroniecParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaskroniecParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ZaskroniecParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaskroniecParser#paraphrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParaphrase(ZaskroniecParser.ParaphraseContext ctx);
}