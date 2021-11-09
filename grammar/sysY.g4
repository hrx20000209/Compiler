grammar sysY;

compUnit: FuncDef;
funcDef: FuncType Ident '(' ')' Block;
funcType: 'int';
ident: 'main';
block: '{' Stmt '}';
stmt: 'return' Number ';';

Number             -> decimal-const | octal-const | hexadecimal-const
decimal-const      -> nonzero-digit | decimal-const digit
octal-const        -> '0' | octal-const octal-digit
HEXADECIMAL_CONST: HEXADECIMAL_PREFIX HEXADECIMAL_DIGIT | HEXADECIMAL_CONST HEXADECIMAL_DIGIT
HEXADECIMAL_PREFIX: '0x' | '0X';
NONZERO_DIGIT: [0-9];
OCTAL_DIGIT: [0-7];
DIGIT: '0' | NONZERO_DIGIT;
HEXADECIMAL_DIGIT: [0-9] | 'a'..'f' | 'A'..'F';
