grammar calc;

LPAREN: '(';
RPAREN: ')';
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
NUMBER: [0-9]+ | [0-9]+ '.' [0-9]* | [0-9]* '.' [0-9]+;
RET: '\r\n' | '\n' | '\r';
WHITE_SPACE: [ \t] -> skip;

calculator: line*;
line: expr RET;
expr: expr ADD term | expr SUB term | term;
term: factor | term MUL factor | term DIV factor;
factor: LPAREN expr RPAREN | NUMBER;