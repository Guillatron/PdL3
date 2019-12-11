parser grammar FibonacciParser;
options{
tokenVocab = FibonacciLexer;
    }
prog : (incluir FINALSENTENCIA| definicionfuncion)+;
incluir: PR_INCLUDE IDENTIF;

/*
function nombre(tipo arg1, tipo arg2):
begin
    ...
end
*/
definicionfuncion: (PR_FUNCTION IDENTIF PI argumentos PD DOSPUNTOS PR_VOID PR_BEGIN (sentencia  | bifurcacion)* retornar? PR_END);

bifurcacion: mientras | si; //Alteraciones del flujo normal del codigo Ifs, Fors, Whiles ...

sentencia: (asignacion | declaracion | llamadafuncion) FINALSENTENCIA; //Una linea de codigo efectiva

declaracion : PR_TIPO variable ((ASIGNAR expr)? | NUM_ELEM_ARRAY ASIGNAR array);
asignacion: variable ASIGNAR expr;
llamadafuncion: IDENTIF PI parametros PD;

expr : llamadafuncion 
| variable
| expr(MULT|DIV) expr
| expr(SUMA|RESTA) expr
| expr OPLOGICOS expr
| CADENA 
| NUMERO;

parametros: (expr(COMA (expr))*)?;
argumentos: ( PR_TIPO variable (COMA(PR_TIPO variable))*)?;


si : PR_IF PI expr PD PR_THEN (sentencia | bifurcacion)* sino? PR_ENDIF ;
sino : PR_ELSE (sentencia | bifurcacion)*;

//ARRAYS
nElemArray: CI NUMERO CD;
array: PI ((NUMERO COMA)* NUMERO)? PD;    //Supongamos que de momento solo admite arrays de nums
retornar : PR_DEVOLVER expr? FINALSENTENCIA;    //Devolver x;
mientras:PR_WHILE PI expr PD PR_BEGIN (sentencia | bifurcacion)* PR_END;

variable : IDENTIF;

/*Deficiencias de la implementación
    Se permite definir una función dentro de otra, funciones dentro de ifs, barra libre de funciones
    Se permiten sentencias como "variable;"
    Estan incluidos los comentarios en la sintaxis del parser ¿?

*/




