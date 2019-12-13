package Default;

import ANTLR.FibonacciParser;
import ANTLR.FibonacciParserBaseListener;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/*
 * La tabla de símbolos se vale del esquema Listener para proveerse de información
 * Almacena (de primera mano) funciones y variables globales
 */

public class TablaSimbolos extends FibonacciParserBaseListener {
    private ArrayList<Funcion> listaFunciones;//Almacena las funciones y las llamadas entre ellas
    private Funcion funcionActual;            //Para conocer el contexto dentro del Listener
    private ArrayList<Variable> globales;     //Por si acaso
    private boolean primeraPasada;  //Cambia el comportamiento del analizador según la pasada

    TablaSimbolos() {

        listaFunciones = new ArrayList<Funcion>();
        String sistema[] = {"fwrite", "fclose", "fopen", "fread"};

        for(String s : sistema) //Se añaden estas funciones del sistema
            listaFunciones.add(new Funcion(Tipos.VOID, s));

        globales = new ArrayList<Variable>();
        primeraPasada = true;
    }

    Funcion getFuncion(String id) {
        for (Funcion f : listaFunciones) {
            if (id.equals(f.getNombre()))
                return f;
        }
        return null;
    }

    //NOTA: de acuerdo al programa de ejemplo NO es necesario declarar una funcion antes de
    //llamarla.
    @Override
    public void enterDefinicionfuncion(FibonacciParser.DefinicionfuncionContext ctx) {
        String idFuncion = ctx.IDENTIF().toString();
        System.out.println(idFuncion + ":" + ctx.PR_TIPO());

        //=======================FUNCION========================
        Funcion nueva = getFuncion(idFuncion);
        //Solo se añade a la tabla en caso de que no se conozca
        if (nueva == null) {
            nueva = new Funcion(Tipos.valueOf(ctx.PR_TIPO().toString().toUpperCase()),idFuncion);
            listaFunciones.add(nueva);
        }
        else
            nueva.setTipoRetorno(Tipos.valueOf(ctx.PR_TIPO().toString().toUpperCase()));

        //======================ARGUMENTOS=======================
        List<ParseTree> argumentos = ctx.argumentos().children;
        if(argumentos!=null)    //Peligro de nullptrExc si no hay argumentos
            for(int i = 0; i<argumentos.size() ; i+=3){
                Tipos tipoArg = Tipos.valueOf(argumentos.get(i).getText().toUpperCase()); //Tipo de la variable
                String nombre = argumentos.get(i+1).getText();                            //Identificador de variable
                nueva.addArgumento(new Variable(tipoArg, nombre));
            }

        funcionActual = nueva;
    }


    @Override
    public void enterDeclaracion(FibonacciParser.DeclaracionContext ctx) {
        Tipos tipoVar = Tipos.valueOf(ctx.PR_TIPO().toString().toUpperCase());
        String nombre = ctx.variable().getText();
        funcionActual.addVariable(new Variable(tipoVar, nombre));
    }

    @Override
    public void enterLlamadafuncion(FibonacciParser.LlamadafuncionContext ctx) {
        String idFuncion = ctx.IDENTIF().toString();
        Funcion nueva = getFuncion(idFuncion); //Busca la funcion en la tabla
        if(!primeraPasada)  //Tras la primera pasada todas las funciones están inicializadas
            if(!nueva.isInicializada()){ //Se detecta una función sin definir
                System.err.println("Error fatal: la función " + nueva.getNombre() + " no ha sido inicializada");
                System.exit(-1);
            }
        if (nueva == null) {      //Si no la tiene, la añade
            nueva = new Funcion(Tipos.UNDEFINED, idFuncion);
            listaFunciones.add(nueva);
        }
        funcionActual.addLlamada(nueva);  //Se enlaza la llamada en el grafo
    }

    @Override
    public void enterRetornar(FibonacciParser.RetornarContext ctx) {
        funcionActual.nuevaLinea(); //Los return también cuentan como línea
    }

    @Override
    public void enterSentencia(FibonacciParser.SentenciaContext ctx) {
        funcionActual.nuevaLinea();
    }

    @Override
    public void exitProg(FibonacciParser.ProgContext ctx) {
        primeraPasada = false;
    }

    public void resumen() {
        System.out.println("========RESUMEN DE FUNCIONES=======");
        for (Funcion f : listaFunciones) {
            f.resumen();
            System.out.println('\n');
        }
    }

}