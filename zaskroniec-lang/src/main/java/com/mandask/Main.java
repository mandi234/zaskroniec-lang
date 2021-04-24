package com.mandask;

import com.mandask.frontend.ZaskroniecLexer;
import com.mandask.frontend.ZaskroniecParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        ANTLRFileStream input = new ANTLRFileStream("test.ntx");
        ZaskroniecLexer lexer = new ZaskroniecLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ZaskroniecParser parser = new ZaskroniecParser(tokens);

        ParseTree tree = parser.file();
        //System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new LLVMActions(),tree);
        System.out.println("################");
        String outString = LLVMGenerator.generate();
        try (PrintWriter outFile = new PrintWriter("test.ll")) {
            outFile.println(outString);
        }
    }
}
