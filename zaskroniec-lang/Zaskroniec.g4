grammar Zaskroniec;

file: stmt* EOF;

stmt: print_stmt ';'
    | scan_int_stmt ';'
    | scan_real_stmt ';'
    | assign_stmt ';'
    | if_stmt
    | while_stmt
    | function
    ;

function: FUNCTION fparam fblock;

fparam: ID;

fblock: '{' stmt* return_stmt '}';

return_stmt: 'zzzwroc' expression ';';

//assign_method: ID ASSIGN ID parameter_declaration;

//method: 'fcja' ID parameter_declaration method_block;

//method_block: '{' stmt* return_stmt '}';


//parameter_declaration: '(' ID? (',' ID)* ')';

if_stmt: 'jesssli' '(' boolean_exp ')' stmt* 'ssskonczjesssli';

boolean_exp
        : equals_exp
        | less_exp
        | greater_exp
        | leq_exp
        | geq_exp;

while_stmt: 'podczasss' '(' boolean_exp ')' stmt* 'ssskonczpodczasss';

geq_exp: value_exp '>=' value_exp;

leq_exp: value_exp '<=' value_exp;

greater_exp: value_exp '>' value_exp;

less_exp: value_exp '<' value_exp;

equals_exp: value_exp '==' value_exp;

value_exp: ID | number;

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

FUNCTION: 'funkcssja';

ENDFUNCTION: 'ssskonczfunkcssja';

PRINT: 'wypisssz';

REAL_DECLARATION : 'dabl';

INT_DECLARATION : 'int';

ID: [a-zA-Z_][a-zA-Z_0-9]*;


REAL: [-+]?'0'..'9'+'.''0'..'9'+
    ;

INT: [-+]?[0-9_]+
    ;

ASSIGN : '=';

ADD:        '+';
SUBSTRACT:  '-';
MULTIPLY:   '*';
DIVIDE:     '/';
MODULO:     '%';

WHITESPACE: [ \t\n\r]+ -> skip;
