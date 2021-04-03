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
}