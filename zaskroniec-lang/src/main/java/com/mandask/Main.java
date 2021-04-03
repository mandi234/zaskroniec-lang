package com.mandask;

import com.mandask.frontend.ZaskroniecLexer;
import com.mandask.frontend.ZaskroniecParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        //ANTLRFileStream input = new ANTLRFileStream("function twojstary(ab, cd){return 2;}");
        String input = "";
        ZaskroniecLexer lexer = new ZaskroniecLexer(CharStreams.fromString(input));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ZaskroniecParser parser = new ZaskroniecParser(tokens);

        ParseTree tree = parser.file();
        System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new LLVMActions(),tree);
    }
}
