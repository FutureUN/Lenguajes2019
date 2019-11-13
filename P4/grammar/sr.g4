grammar sr;

init: global? resource+ ;

global: 'global' ID_TOKEN global_content  END;
<<<<<<< HEAD
resource: 'resource' ID_TOKEN parameters? r_elements  END?  body ;
=======
resource: 'resource' ID_TOKEN parameters? r_elements  END? body?;
>>>>>>> c3bdeea4a3f3bde5e1299240007bea6bb28ae412
body: 'body' ID_TOKEN? parameters? r_elements END;
global_content:  (constant SEMICOLON )+  global_content | (r_declaration SEMICOLON)+ global_content;
parameters: '('param_list? ( SEMICOLON? COMA?  param_list)*')' ;
param_list:  ID_TOKEN  if_array (COLON type)*
| ID_TOKEN COLON type (SEMICOLON ID_TOKEN COLON type )*
;


r_elements: 'extend' ID_TOKEN (COMA ID_TOKEN)* r_elements?
| 'import' ID_TOKEN (COMA ID_TOKEN)* r_elements?
| 'proc' ID_TOKEN parameters block END r_elements?
| 'procedure' ID_TOKEN parameters block END r_elements?
| r_declaration r_elements?
<<<<<<< HEAD
| function_id parameters  SEMICOLON?   END? r_elements?
=======
| function_id parameters SEMICOLON?   END?
>>>>>>> c3bdeea4a3f3bde5e1299240007bea6bb28ae412
| statement  r_elements?
;

r_declaration: 'const' ID_TOKEN ASSIG  expression
| 'type' ID_TOKEN EQUAL type
| 'optype' ID_TOKEN EQUAL '('? ID_TOKEN (COLON type)? ')'? ('returns' ID_TOKEN COLON type)?
| 'op' ID_TOKEN parameters? (COMA ID_TOKEN parameters?)* (COLON type)?
| 'var' ID_TOKEN if_array (COMA ID_TOKEN if_array)*  type_def? (ASSIG assign_dec)?
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



identifier : ID_TOKEN | expression | '\'' ID_TOKEN '\'';


constant: 'constant';
type_dec: 'type_dec';

expression: EXPRESSION | ID_TOKEN;

type : 'int' | 'string' | 'cap' ID_TOKEN | 'real' | ID_TOKEN | 'char'
| 'rec' '(' ID_TOKEN?  (COMA ID_TOKEN)*  type_def? ')'
;



function_id:
GETARG
| FINAL
| WRITE
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


END : 'end' ;
EXPRESSION : 'expression' | [0-9]+ (DOT [0-9])* ;
WRITE: 'write';
FINAL: 'final';
GETARG: 'getarg';
ASSIG: ':=' ;
SWAP: ':=:';
DIFF: '!=';
EQUAL: '=';
DOT: '.';
COLON: ':';
ADD: '+';
OR: '|';
DIV: '/';
MOD: 'mod';
POW: '^';
MULT: '*';
SUBS: '-';
BRACE_L: '[';
BRACE_R: ']';
COMA : ',';
PARENT_L: '(';
PARENT_R: ')';
SEMICOLON: ';';
EXECUTE: '->';
SEPARA: '[]';
LESS_THAN: '<';
GREAT_THAN: '>';
LESS_EQUAL: '<=';
GREAT_EQUAL: '>=';
ADD_ASSIGN: '+:=';
PERCENT: '%';
BRACK_L: '{';
BRACK_R: '}';
ID_TOKEN: [a-zA-Z]+[a-zA-Z0-9_]* ;
LINE_COMMENT 	: '#' ~[\n]* -> skip;

WP: [ \t\r\n] -> skip ;
