grammar sr;

init: global? resource+ ;

global: 'global' ID_TOKEN global_content  global_content* END;
resource: 'resource' ID_TOKEN parameters? r_elements  r_elements* END? body?;
body: 'body' ID_TOKEN? parameters r_elements r_elements* END;
global_content:  r_declaration SEMICOLON? ;
parameters: '('param_list? ( SEMICOLON? COMA?  param_list)*')' ;
param_list:   identifier  if_array (COLON type)*
| '\'' identifier '\''
| ID_TOKEN COLON type (SEMICOLON ID_TOKEN COLON type )*
;


r_elements: 'extend' ID_TOKEN (COMA ID_TOKEN)*
| 'import' ID_TOKEN (COMA ID_TOKEN)*
| 'proc' ID_TOKEN parameters block END
| 'procedure' ID_TOKEN parameters block END
| r_declaration SEMICOLON?
| function_id parameters  SEMICOLON? END?
| statement  SEMICOLON?
;

r_declaration: 'const' ID_TOKEN ASSIG  expression
| 'type' ID_TOKEN ASSIG type
| 'optype' ID_TOKEN ASSIG '('? ID_TOKEN (COLON type)? ')'? ('returns' ID_TOKEN COLON type)?
| 'op' ID_TOKEN parameters? (COMA ID_TOKEN parameters?)* (COLON type)?
| 'var' ID_TOKEN if_array (COMA ID_TOKEN if_array)*  type_def? (ASSIG assign_dec)?
| 'const'  ID_TOKEN ASSIG expression
;
assign_dec:  expression (COMA assign_dec)*
| ID_TOKEN if_array
;

op_function : 'op_function';
op_return : 'op_return';


type_def: (COLON type) ;

if_array:
 ('[' identifier (COLON type)? ( COMA identifier (COLON type)?)* ']')*
 |  ('[' identifier (COLON identifier)? ( COMA identifier (COLON identifier)?)* ']')*
 ;


b_params: 'b_params' ;



block:  r_elements statement* ;




type : 'int' | 'string' | 'cap' ID_TOKEN | 'real' | ID_TOKEN | 'char'
| 'rec' '(' ID_TOKEN?  (COMA ID_TOKEN)*  type_def? ')'
;



function_id:
GETARG
| FINAL
| WRITE
| ID_TOKEN
;

// Expression

expression : expression BINOP expression
            |expression ROP expression
            |boolvar
            |SINGOP boolvar
            | e;


boolvar : ID_TOKEN | BINID ;
e : e MULOP e
    | e SUMOP e
    | DOUBLE
    | INT
    | PARENT_L e PARENT_R
    | ID_TOKEN
     ;

statement :
 'skip'
| 'exit'
| 'next'
| 'if' expression EXECUTE block 'fi'
| 'fa' identifier ASSIG expression 'to' identifier  (COMA identifier ASSIG expression 'to' identifier)* EXECUTE block 'af'
| identifier (COMA identifier)* ASSIG expression ( COMA expression)
| identifier if_array SWAP identifier if_array
| identifier if_array ADD_ASSIGN identifier if_array

| identifier if_array ASSIG identifier if_array
| identifier if_array ASSIG 'create' identifier (DOT identifier)* ob_parameters (SEMICOLON identifier (DOT identifier)* ob_parameters)*
;
ob_parameters : '(' identifier ( COMA  identifier)*')' ;


identifier : ID_TOKEN | expression | '\'' ID_TOKEN '\'';


END : 'end' ;

WRITE: 'write';
FINAL: 'final';
GETARG: 'getarg';
ASSIG: ':=' ;
SWAP: ':=:';
DIFF: '!=';
EQUAL: '=';
DOT: '.';
COLON: ':';
OR: '|';
BRACE_L: '[';
BRACE_R: ']';
COMA : ',';
PARENT_L: '(';
PARENT_R: ')';
SEMICOLON: ';';
EXECUTE: '->';
SEPARA: '[]';
ADD_ASSIGN: '+:=';
PERCENT: '%';
BRACK_L: '{';
BRACK_R: '}';

ROP : ( '<' | '<=' | '>=' | '>' | '=' | '!=' );
MULOP : ('*' | '/' | '%' );
SUMOP : ('+' | '-');
BINOP : ( '&' | '|');
SINGOP : '~';
BINID : ('true' | 'false');
INT:  [0-9]+;
DOUBLE : [0-9]+([.][0-9]+);
ID_TOKEN   : [a-zA-Z][a-zA-Z0-9_]*;
LINE_COMMENT 	: '#' ~[\n]* -> skip;

WP: [ \t\r\n] -> skip ;
