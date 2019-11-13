grammar sr;

init: global? resource+ ;

global: 'global' ID_TOKEN global_content  END;
resource: 'resource' ID_TOKEN parameters? r_elements  END? ;
body: 'body' ID_TOKEN? parameters? r_elements END;
global_content:  (constant ';' )+  global_content | (type_dec ';')+ global_content;
parameters: '('param_list? ( ';'? ','?  param_list)*')' ;
param_list:  ID_TOKEN  if_array (':' type)*
| ID_TOKEN ':' type (';' ID_TOKEN ':' type )*
;


r_elements: 'extend' ID_TOKEN (',' ID_TOKEN)* r_elements?
| 'import' ID_TOKEN (',' ID_TOKEN)* r_elements?
| 'proc' ID_TOKEN parameters block END r_elements?
| 'procedure' ID_TOKEN parameters block END r_elements?
| r_declaration r_elements?
| function_id ('(' identifier if_array? (',' identifier if_array?)* ')')? ';'?   END? r_elements?
| function_id '('')'
| statement  r_elements?
| body?
;

r_declaration: 'const' ID_TOKEN ':='  expression
| 'type' ID_TOKEN '=' type
| 'optype' ID_TOKEN '=' '('? ID_TOKEN (':' type)? ')'? ('returns' ID_TOKEN ':' type)?
| 'op' ID_TOKEN parameters? (',' ID_TOKEN parameters?)* (':' type)?
| 'var' ID_TOKEN if_array (',' ID_TOKEN if_array)*  type_def? (':=' assign_dec)?
;
assign_dec:  expression (',' assign_dec)*
| ID_TOKEN if_array
;

op_function : 'op_function';
op_return : 'op_return';


type_def: (':' type) ;

if_array:
 ('[' identifier (':' type)? ( ',' identifier (':' type)?)* ']')*
 |  ('[' identifier (':' identifier)? ( ',' identifier (':' identifier)?)* ']')*
 ;


b_params: 'b_params' ;



block:  r_elements statement* ;



identifier : ID_TOKEN | expression | '\'' ID_TOKEN '\'';


constant: 'constant';
type_dec: 'type_dec';

expression: EXPRESSION | ID_TOKEN;

type : 'int' | 'string' | 'cap' ID_TOKEN | 'real' | ID_TOKEN | 'char'
| 'rec' '(' ID_TOKEN?  (',' ID_TOKEN)*  type_def? ')'
;



function_id: 'getarg'
| 'final'
| 'write'
| ID_TOKEN
;

END : 'end' ;
EXPRESSION : 'expression' | [0-9]+ ('.' [0-9])* ;

ID_TOKEN: [a-zA-Z]+[a-zA-Z0-9_]* ;



statement :
 'skip'
| 'exit'
| 'next'
| 'if' expression '->' block 'fi'
| 'fa' identifier ':=' expression 'to' identifier  (',' identifier ':=' expression 'to' identifier)* '->' block 'af'
| identifier (',' identifier)* ':=' expression ( ',' expression)
| identifier if_array ':=:' identifier if_array
| identifier if_array '+:=' identifier if_array

| identifier if_array ':=' identifier if_array
| identifier if_array ':=' 'create' identifier ('.' identifier)* ob_parameters (';' identifier ('.' identifier)* ob_parameters)*
;
ob_parameters : '(' identifier ( ','  identifier)*')' ;


TK_LPAREN: [#][a-zA-Z0-9]* -> skip ;

WP: [ \t\r\n] -> skip ;
