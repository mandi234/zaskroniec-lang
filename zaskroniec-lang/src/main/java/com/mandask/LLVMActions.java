package com.mandask;

import com.mandask.frontend.ZaskroniecBaseListener;
import com.mandask.frontend.ZaskroniecListener;
import com.mandask.frontend.ZaskroniecParser;
import org.antlr.v4.runtime.tree.ParseTree;


import java.util.*;


enum VarType {INT, REAL, UNKNOWN}

class Value {
    public String name;
    public VarType type;

    public Value(String name, VarType type) {
        this.name = name;
        this.type = type;
    }
}

public class LLVMActions extends ZaskroniecBaseListener {

    HashMap<String, VarType> localVariables = new HashMap<String, VarType>();
    HashMap<String, VarType> globalVariables = new HashMap<>();
    HashMap<String, VarType> variables = new HashMap<>();
    Stack<Value> stack = new Stack<Value>();
    Set<String> functions = new HashSet<>();
    String function = "";
    Boolean global;


    @Override
    public void enterFile(ZaskroniecParser.FileContext ctx) {
        global = true;
    }

    @Override
    public void exitFile(ZaskroniecParser.FileContext ctx) {
        LLVMGenerator.closeMain();
        System.out.println(LLVMGenerator.generate());
    }

    @Override
    public void enterStmt(ZaskroniecParser.StmtContext ctx) {

    }

    @Override
    public void exitStmt(ZaskroniecParser.StmtContext ctx) {

    }

    @Override
    public void enterFunction(ZaskroniecParser.FunctionContext ctx) {

    }

    @Override
    public void exitFunction(ZaskroniecParser.FunctionContext ctx) {

    }

    @Override
    public void enterFparam(ZaskroniecParser.FparamContext ctx) {

    }

    @Override
    public void exitFparam(ZaskroniecParser.FparamContext ctx) {
        String ID = ctx.ID().getText();
        functions.add(ID);
        function = ID;
        LLVMGenerator.functionStart(ID);
    }

    @Override
    public void enterFblock(ZaskroniecParser.FblockContext ctx) {
        global = false;
    }

    @Override
    public void exitFblock(ZaskroniecParser.FblockContext ctx) {
        localVariables.clear();

        LLVMGenerator.functionEnd();
    }

    @Override
    public void enterReturn_stmt(ZaskroniecParser.Return_stmtContext ctx) {

    }

    @Override
    public void exitReturn_stmt(ZaskroniecParser.Return_stmtContext ctx) {

    }

    @Override
    public void enterIf_stmt(ZaskroniecParser.If_stmtContext ctx) {
    }

    @Override
    public void exitIf_stmt(ZaskroniecParser.If_stmtContext ctx) {
        LLVMGenerator.ifEnd();
    }

    @Override
    public void enterBoolean_exp(ZaskroniecParser.Boolean_expContext ctx) {

    }

    @Override
    public void exitBoolean_exp(ZaskroniecParser.Boolean_expContext ctx) {
        Map<String, String> operatorMap = new HashMap<String, String>() {{
            put(">", "sgt");
            put("<", "slt");
            put("==", "eq");
            put(">=", "sge");
            put("<=", "sle");
        }};

        String leftExp = ctx.getChild(0).getChild(0).getText();
        String operator = ctx.getChild(0).getChild(1).getText();
        String rightExp = ctx.getChild(0).getChild(2).getText();


        if (variables.containsKey(leftExp)) {
            LLVMGenerator.icmp(leftExp, rightExp, operatorMap.get(operator));
        } else {
            ctx.getStart().getLine();
            System.err.println("Line " + ctx.getStart().getLine() + ", unknown variable: " + leftExp);
        }
    }

    @Override
    public void enterWhile_stmt(ZaskroniecParser.While_stmtContext ctx) {
        LLVMGenerator.whileStart();
    }

    @Override
    public void exitWhile_stmt(ZaskroniecParser.While_stmtContext ctx) {
        LLVMGenerator.whileEnd();
    }

    @Override
    public void enterGeq_exp(ZaskroniecParser.Geq_expContext ctx) {

    }

    @Override
    public void exitGeq_exp(ZaskroniecParser.Geq_expContext ctx) {

    }

    @Override
    public void enterLeq_exp(ZaskroniecParser.Leq_expContext ctx) {

    }

    @Override
    public void exitLeq_exp(ZaskroniecParser.Leq_expContext ctx) {

    }

    @Override
    public void enterGreater_exp(ZaskroniecParser.Greater_expContext ctx) {

    }

    @Override
    public void exitGreater_exp(ZaskroniecParser.Greater_expContext ctx) {

    }

    @Override
    public void enterLess_exp(ZaskroniecParser.Less_expContext ctx) {

    }

    @Override
    public void exitLess_exp(ZaskroniecParser.Less_expContext ctx) {

    }

    @Override
    public void enterEquals_exp(ZaskroniecParser.Equals_expContext ctx) {

    }

    @Override
    public void exitEquals_exp(ZaskroniecParser.Equals_expContext ctx) {
    }

    @Override
    public void enterValue_exp(ZaskroniecParser.Value_expContext ctx) {

    }

    @Override
    public void exitValue_exp(ZaskroniecParser.Value_expContext ctx) {
    }

    @Override
    public void enterScan_int_stmt(ZaskroniecParser.Scan_int_stmtContext ctx) {

    }

    @Override
    public void exitScan_int_stmt(ZaskroniecParser.Scan_int_stmtContext ctx) {
        String ID = ctx.ID().getText();
        if (!variables.containsKey(ID))
            LLVMGenerator.declare_i32(ID, global);
        variables.put(ID, VarType.INT);
        LLVMGenerator.scanf_i32(ID);
    }

    @Override
    public void enterScan_real_stmt(ZaskroniecParser.Scan_real_stmtContext ctx) {

    }

    @Override
    public void exitScan_real_stmt(ZaskroniecParser.Scan_real_stmtContext ctx) {
        String ID = ctx.ID().getText();
        if (!variables.containsKey(ID))
            LLVMGenerator.declare_double(ID, global);
        variables.put(ID, VarType.REAL);
        LLVMGenerator.scanf_double(ID);
    }

    @Override
    public void enterPrint_stmt(ZaskroniecParser.Print_stmtContext ctx) {

    }

    @Override
    public void exitPrint_stmt(ZaskroniecParser.Print_stmtContext ctx) {
        String ID = ctx.ID().getText();
        String scopedID = "";
        VarType type = null;
        if (localVariables.containsKey("%" + ID)) {
            scopedID = "%" + ID;
            type = localVariables.get(scopedID);
        } else {
            scopedID = "@" + ID;
            type = globalVariables.get(scopedID);
        }

        if (type != null) {
            if (type == VarType.INT) {
                LLVMGenerator.printf_i32(scopedID);
            }
            if (type == VarType.REAL) {
                LLVMGenerator.printf_double(scopedID);
            }
        } else {
            error(ctx.getStart().getLine(), "unknown variable " + ID);
        }
    }

    @Override
    public void enterAssign_stmt(ZaskroniecParser.Assign_stmtContext ctx) {

    }

    @Override
    public void exitAssign_stmt(ZaskroniecParser.Assign_stmtContext ctx) {
        String ID = ctx.ID().getText();
        Value v = stack.pop();
        if (global)
            exitGlobalAssign_stmt(ctx, ID, v);
        else
            exitLocalAssign_stmt(ctx, ID, v);
    }

    private void createVariableWithValue(String id, String scopedID, Value v, Boolean global) {
        if (v.type == VarType.INT) {
            LLVMGenerator.declare_i32(id, global);
            LLVMGenerator.assign_i32(scopedID, v.name);
        }
        if (v.type == VarType.REAL) {
            LLVMGenerator.declare_double(id, global);
            LLVMGenerator.assign_double(scopedID, v.name);
        }
    }

    private void exitLocalAssign_stmt(ZaskroniecParser.Assign_stmtContext ctx, String id, Value v) {
        String localID = "%" + id;
        if (!localVariables.containsKey(localID)) {

            localVariables.put(localID, v.type);
            createVariableWithValue(id, localID, v, global);
        } else {
            if (v.type == localVariables.get(localID)) {
                assignToExistingVariable(localID, v);
            } else {
                error(ctx.getStart().getLine(), ctx.getChild(2).getText() + " type mismatch");
            }
        }
    }

    private void exitGlobalAssign_stmt(ZaskroniecParser.Assign_stmtContext ctx, String id, Value v) {
        String globalID = "@" + id;
        if (!globalVariables.containsKey(globalID)) {

            globalVariables.put(globalID, v.type);
            createVariableWithValue(id, globalID, v, global);
        } else {
            if (v.type == globalVariables.get(globalID)) {
                assignToExistingVariable(globalID, v);
            } else {
                error(ctx.getStart().getLine(), ctx.getChild(2).getText() + " type mismatch");

            }
        }
    }

    private void assignToExistingVariable(String scopedID, Value v) {
        if (v.type == VarType.INT) {
            LLVMGenerator.assign_i32(scopedID, v.name);
        }
        if (v.type == VarType.REAL) {
            LLVMGenerator.assign_double(scopedID, v.name);
        }
    }

    @Override
    public void enterNumber(ZaskroniecParser.NumberContext ctx) {

    }

    @Override
    public void exitNumber(ZaskroniecParser.NumberContext ctx) {
        if (ctx.REAL() == null) {
            stack.push(new Value(ctx.INT().getText(), VarType.INT));
        } else {
            stack.push(new Value(ctx.REAL().getText(), VarType.REAL));
        }
    }

    @Override
    public void enterExpression(ZaskroniecParser.ExpressionContext ctx) {

    }

    @Override
    public void exitExpression(ZaskroniecParser.ExpressionContext ctx) {
        if (ctx.getChildCount() > 1 && stack.size() >= 2) {
            Value v1 = stack.pop();
            Value v2 = stack.pop();
            if (v1.type == v2.type) {
                String operator = ctx.getChild(1).getText();
                switch (operator) {
                    case "+":
                        if (v1.type == VarType.INT) {
                            LLVMGenerator.add_i32(v1.name, v2.name);
                            stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT));
                        } else {
                            LLVMGenerator.add_double(v1.name, v2.name);
                            stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.REAL));
                        }
                        break;
                    case "*":
                        if (v1.type == VarType.INT) {
                            LLVMGenerator.mult_i32(v1.name, v2.name);
                            stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT));
                        } else {
                            LLVMGenerator.mult_double(v1.name, v2.name);
                            stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.REAL));
                        }
                        break;
                    case "/":
                        if (v1.type == VarType.INT) {
                            LLVMGenerator.div_i32(v1.name, v2.name);
                            stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT));
                        } else {
                            LLVMGenerator.div_double(v1.name, v2.name);
                            stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.REAL));
                        }
                        break;
                    case "-":
                        if (v1.type == VarType.INT) {
                            LLVMGenerator.sub_i32(v1.name, v2.name);
                            stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT));
                        } else {
                            LLVMGenerator.sub_double(v1.name, v2.name);
                            stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.REAL));
                        }
                        break;
                    case "%":
                        if (v1.type == VarType.INT) {
                            LLVMGenerator.mod_i32(v1.name, v2.name);
                            stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT));
                        } else {
                            error(ctx.getStart().getLine(), "wrong type on modulo operation, int expected");
                        }
                        break;
                }

            } else {
                error(ctx.getStart().getLine(), ctx.getChild(1).getText() + "type mismatch");
            }
        }
        if (ctx.ID() != null) {
            String ID = ctx.ID().getText();
            String scopedID = "";
            Boolean isFunction = false;
            VarType type = null;
            if(localVariables.containsKey("%"+ID)) {
                scopedID = "%"+ID;
                type = localVariables.get(scopedID);
            } else if(globalVariables.containsKey("@"+ID)) {
                scopedID = "@"+ID;
                type = globalVariables.get(scopedID);
            } else if(functions.contains(ID)) {
                isFunction = true;
            }

            if (type != null || isFunction) {
                if (type == VarType.INT) {
                    LLVMGenerator.load_i32(scopedID);
                    stack.push(new Value(scopedID.substring(0, 1) + (LLVMGenerator.reg - 1), VarType.INT));
                }
                if (type == VarType.REAL) {
                    LLVMGenerator.load_double(scopedID);
                    stack.push(new Value(scopedID.substring(0, 1) + (LLVMGenerator.reg - 1), VarType.INT));
                }
                if (isFunction) {
                    LLVMGenerator.callFunction(ID);
                }
            } else {
                error(ctx.getStart().getLine(), "unknown variable " + ID);
            }
        }
    }

    @Override
    public void enterParaphrase(ZaskroniecParser.ParaphraseContext ctx) {

    }

    @Override
    public void exitParaphrase(ZaskroniecParser.ParaphraseContext ctx) {

    }


    private void error(int line, String msg) {
        System.err.println("Error, line " + line + ", " + msg);
        System.exit(1);
    }
}
