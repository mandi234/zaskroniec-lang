package com.mandask;

import com.mandask.frontend.ZaskroniecBaseListener;
import com.mandask.frontend.ZaskroniecListener;
import com.mandask.frontend.ZaskroniecParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;


enum VarType{ INT, REAL, UNKNOWN}

class Value{
    public String name;
    public VarType type;
    public Value( String name, VarType type) {
        this.name = name;
        this.type = type;
    }
}

public class LLVMActions extends ZaskroniecBaseListener {
    @Override
    public void enterFile(ZaskroniecParser.FileContext ctx) {

    }

    @Override
    public void exitFile(ZaskroniecParser.FileContext ctx) {

    }

    @Override
    public void enterMethod(ZaskroniecParser.MethodContext ctx) {

    }

    @Override
    public void exitMethod(ZaskroniecParser.MethodContext ctx) {

    }

    @Override
    public void enterBlock(ZaskroniecParser.BlockContext ctx) {

    }

    @Override
    public void exitBlock(ZaskroniecParser.BlockContext ctx) {

    }

    @Override
    public void enterStatement(ZaskroniecParser.StatementContext ctx) {

    }

    @Override
    public void exitStatement(ZaskroniecParser.StatementContext ctx) {

    }

    @Override
    public void enterReturn_statement(ZaskroniecParser.Return_statementContext ctx) {

    }

    @Override
    public void exitReturn_statement(ZaskroniecParser.Return_statementContext ctx) {

    }

    @Override
    public void enterExpression(ZaskroniecParser.ExpressionContext ctx) {

    }

    @Override
    public void exitExpression(ZaskroniecParser.ExpressionContext ctx) {

    }

    @Override
    public void enterParaphrase(ZaskroniecParser.ParaphraseContext ctx) {

    }

    @Override
    public void exitParaphrase(ZaskroniecParser.ParaphraseContext ctx) {

    }

    @Override
    public void enterArgs_declaration(ZaskroniecParser.Args_declarationContext ctx) {

    }

    @Override
    public void exitArgs_declaration(ZaskroniecParser.Args_declarationContext ctx) {

    }
}
