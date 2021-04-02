package com.mandask.frontend;// Generated from C:/Workspace/University/Zaskroniec/zaskroniec-lang\Zaskroniec.g4 by ANTLR 4.9.1
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
	 * Visit a parse tree produced by {@link ZaskroniecParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(ZaskroniecParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaskroniecParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ZaskroniecParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaskroniecParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ZaskroniecParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZaskroniecParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(ZaskroniecParser.Return_statementContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link ZaskroniecParser#args_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs_declaration(ZaskroniecParser.Args_declarationContext ctx);
}