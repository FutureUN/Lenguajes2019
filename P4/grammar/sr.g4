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




r_elements: EXTEND ID_TOKEN (COMA ID_TOKEN)*
| IMPORT ID_TOKEN (COMA ID_TOKEN)*
| PROC ID_TOKEN parameters block END
| PROCEDURE ID_TOKEN parameters block END
| r_declaration SEMICOLON?
| function_id parameters  SEMICOLON? END?
| statement  SEMICOLON?
;



r_declaration: CONST ID_TOKEN ASSIG  expression
| TYPE ID_TOKEN ASSIG type
| OPTYPE ID_TOKEN ASSIG '('? ID_TOKEN (COLON type)? ')'? ('returns' ID_TOKEN COLON type)?
| OP ID_TOKEN parameters? (COMA ID_TOKEN parameters?)* (COLON type)?
| VAR var_id type_def? (ASSIG assign_dec)?

;
var_id : ID_TOKEN if_array (COMA ID_TOKEN if_array)* ;

assign_dec:  expression (COMA assign_dec)*
| ID_TOKEN if_array
;


type_def: (COLON type) ;

if_array:
 ('[' identifier (COLON type)? ( COMA identifier (COLON type)?)* ']')*
 |  ('[' identifier (COLON identifier)? ( COMA identifier (COLON identifier)?)* ']')*
 ;


b_params: 'b_params' ;



block:  r_elements statement* ;


type : T_INT | T_STRING | T_CAP ID_TOKEN | T_REAL | ID_TOKEN | T_CHAR
| T_REC '(' ID_TOKEN?  (COMA ID_TOKEN)*  type_def? ')'
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
 SSKIP
| EXIT
| NEXT
| IF expression EXECUTE block FI
| FA identifier ASSIG expression 'to' identifier  (COMA identifier ASSIG expression 'to' identifier)* EXECUTE block AF
| identifier (COMA identifier)* ASSIG expression ( COMA expression)
| identifier if_array SWAP identifier if_array
| identifier if_array ADD_ASSIGN identifier if_array

| identifier if_array ASSIG identifier if_array
| identifier if_array ASSIG CREATE identifier (DOT identifier)* ob_parameters (SEMICOLON identifier (DOT identifier)* ob_parameters)*
;
ob_parameters : '(' identifier ( COMA  identifier)*')' ;


identifier : ID_TOKEN | expression | '\'' ID_TOKEN '\'';


END : 'end' ;

CONST : 'const';
TYPE : 'type';
OPTYPE : 'optype';
OP : 'op';
VAR : 'var';

EXTEND: 'extend';
IMPORT: 'import';
PROC: 'proc';
PROCEDURE: 'procedure';

T_INT :'int' ;
T_STRING :'string' ;
T_CAP:'cap' ;
T_REAL:'real' ;
T_CHAR:'char' ;
T_REC : 'rec' ;

SSKIP: 'skip';
EXIT: 'exit';
NEXT: 'next';
IF: 'if';
FA: 'fa';
FI: 'fi';
AF: 'af';
CREATE: 'create';


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
