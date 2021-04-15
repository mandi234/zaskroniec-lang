grammar Zaskroniec;

file: (stmt? ';')* EOF;

stmt: print_stmt
    | scan_int_stmt
    | scan_real_stmt
    | assign_stmt;

scan_int_stmt: SCAN INT_DECLARATION ID;

scan_real_stmt: SCAN REAL_DECLARATION ID;

print_stmt: PRINT ID;

assign_stmt: ID ASSIGN expression;

number: REAL
      | INT;

expression
    : paraphrase
    | expression ADD expression
    | expression SUBSTRACT expression
    | expression MULTIPLY expression
    | expression DIVIDE expression
    | expression MODULO expression
    | number
    | ID
    ;

paraphrase: '(' expression ')';

SCAN : 'ssskanuj';

PRINT: 'wypisssz';

REAL_DECLARATION : 'dabl';

INT_DECLARATION : 'int';

ID: [a-zA-Z_][a-zA-Z_0-9]+;

WHITESPACE: [ \t\n\r]* -> skip;

REAL: [-+]?'0'..'9'+'.''0'..'9'+
    ;

INT: [-+]?'0'..'9'+
    ;

ASSIGN : '=';

ADD:        '+';
SUBSTRACT:  '-';
MULTIPLY:   '*';
DIVIDE:     '/';
MODULO:     '%';

