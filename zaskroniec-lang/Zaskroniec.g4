grammar Zaskroniec;

file: (stmt? ';')* EOF;

stmt: print_stmt
    | scan_stmt
    | assign_stmt;

scan_stmt: SCAN type_declaration ID;

type_declaration: REAL_DECLARATION
                | INT_DECLATATION
                ;

print_stmt: PRINT ID;

assign_stmt: ID ASSIGN number;

number: REAL
      | INT;

SCAN : 'ssskanuj';

PRINT: 'wypisssz';

REAL_DECLARATION : 'dabl';

INT_DECLATATION : 'int';

ID: [a-zA-Z_][a-zA-Z_0-9]+;

WHITESPACE: [ \t\n\r]* -> skip;

REAL: '0'..'9'+'.''0'..'9'+
    ;

INT: '0'..'9'+
    ;

ASSIGN : '=';


