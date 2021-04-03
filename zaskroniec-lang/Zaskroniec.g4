grammar Zaskroniec;

file: (stmt? ';')* EOF;

stmt: print_stmt
    | assign_stmt;

print_stmt: PRINT ID;

assign_stmt: ID ASSIGN number;

number: REAL
      | INT;

PRINT: 'wypisssz';

ID: [a-zA-Z_][a-zA-Z_0-9]+;

WHITESPACE: [ \t\n]* -> skip;

REAL: '0'..'9'+'.''0'..'9'+
    ;

INT: '0'..'9'+
    ;
ASSIGN : '=';
