// Define a grammar called Hello
grammar Zaskroniec;

file: method* EOF;

method: 'function' NAME args_declaration block;

block: '{' statement* '}';

statement: (return_statement) (';' | NEWLINE);

return_statement: 'return' expression;

expression
    : paraphrase
    | expression MULTIPLY expression
    | expression DIVIDE expression
    | expression MODULO expression

    | expression ADD expression
    | expression SUBTRACT expression
    | NUMBER
    | NAME
    ;

paraphrase: '(' expression ')';

args_declaration: '(' NAME? (',' NAME)* ')';

NAME: [a-zA-Z_][a-zA-Z_0-9]+;
NUMBER: [0-9]+;

WHITESPACE: [ \t]* -> skip;

ADD: '+';
SUBTRACT: '-';
MULTIPLY: '*';
DIVIDE: '/';
MODULO: '%';
NEWLINE : [\n\r] -> skip;