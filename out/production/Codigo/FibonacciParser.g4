parser grammar FibonacciParser;
options{
tokenVocab = FibonacciLexer;
    }
prog : (incluir FINALSENTENCIA| definicionfuncion | COMENTARIOBLOQUE | COMENTARIOLINEA)+;
expr : llamadafuncion 
|llamadavariable
| expr(MULT|DIV) expr
| expr(SUMA|RESTA) expr
| CADENA 
|NUMERO;

llamadafuncion: IDENTIF PI parametros PD;
llamadavariable : IDENTIF;
parametros: (expr(COMA (expr))*)?;
parametros_definicion: (PR_TIPO (expr)(COMA(PR_TIPO expr))*)?;


expr_sin_devolver: asignacion 
|declaracion
|declaracion_asignacion
| definicionfuncion
|llaves  
| retornar 
| incluir 
|logica 
| mientras 
| COMENTARIOBLOQUE 
| COMENTARIOLINEA
|si
|variables_en_cadena;

llaves : PR_BEGIN (expr FINALSENTENCIA | expr_sin_devolver)* PR_END;
si : PR_IF PI logica PD PR_THEN (expr FINALSENTENCIA| expr_sin_devolver)* sino? PR_ENDIF ;
sino : PR_ELSE (expr FINALSENTENCIA| expr_sin_devolver)*;
declaracion_asignacion: PR_TIPO IDENTIF ASIGNAR expr FINALSENTENCIA;
declaracion_array: PR_TIPO IDENTIF NUM_ELEM_ARRAY ASIGNAR array FINALSENTENCIA;

//ARRAYS
nElemArray: CI NUMERO CD;
array: PI ((NUMERO COMA)* NUMERO)? PD;    //Supongamos que de momento solo admite arrays de nums

declaracion : PR_TIPO IDENTIF FINALSENTENCIA ;
asignacion: IDENTIF ASIGNAR expr FINALSENTENCIA;
definicionfuncion: (PR_FUNCTION IDENTIF PI parametros_definicion PD DOSPUNTOS PR_VOID PR_BEGIN (expr FINALSENTENCIA | expr_sin_devolver)* PR_END)| PR_FUNCTION IDENTIF PI parametros_definicion PD DOSPUNTOS PR_TIPO PR_BEGIN (expr FINALSENTENCIA|expr_sin_devolver)* retornar PR_END; 
retornar : PR_DEVOLVER PI  parametros PD FINALSENTENCIA;
incluir: PR_INCLUDE IDENTIF;
logica: (((NUMERO|llamadafuncion| llamadavariable)(OPLOGICOS)(NUMERO|llamadafuncion|llamadavariable))|TRUE|FALSE);
mientras:PR_WHILE PI logica PD (cuerpomientraslinea|cuerpomientras);
cuerpomientras: PR_BEGIN (expr FINALSENTENCIA| expr_sin_devolver)* PR_END;
cuerpomientraslinea: (expr FINALSENTENCIA| expr_sin_devolver)*;
variables_en_cadena: PI COMILLAS TIPO_CADENA COMILLAS COMA llamadavariable PD;





