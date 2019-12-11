import ANTLR.FibonacciParser;
import ANTLR.FibonacciParserBaseListener;

import java.util.ArrayList;

/*
* La tabla de símbolos se vale del esquema Listener para proveerse de información
* Almacena (de primera mano) funciones y variables globales
*/

public class TablaSimbolos extends FibonacciParserBaseListener {
    private ArrayList<Funcion> listaFunciones;//Almacena las funciones y las llamadas entre ellas
    private Funcion funcionActual;            //Para conocer el contexto dentro del Listener
    private ArrayList<Variable> globales;     //Por si acaso

    TablaSimbolos() {
        super();
        listaFunciones = new ArrayList<Funcion>();
        globales = new ArrayList<Variable>();

    }

    int getFuncionIndex(String s) {
        for (int i = 0; i < listaFunciones.size(); i++) {

            if (s.equals(listaFunciones.get(i).toString()))
                return i;
        }
        return -1;
    }

    //NOTA: de acuerdo al programa de ejemplo NO es necesario declarar una funcion antes de
    //llamarla.
    @Override
    public void enterDefinicionfuncion(FibonacciParser.DefinicionfuncionContext ctx) {
        String idFuncion = ctx.IDENTIF().toString();
        int indice = getFuncionIndex(idFuncion);
        //Solo se añade a la tabla en caso de que no se conozca
        if (indice == -1) {
            Funcion nueva = new Funcion(idFuncion);
            funcionActual = nueva;
            listaFunciones.add(nueva);
        }
        else{
            funcionActual = listaFunciones.get(indice);
        }
    }

    @Override
    public void enterLlamadafuncion(FibonacciParser.LlamadafuncionContext ctx) {
        String idFuncion = ctx.IDENTIF().toString();
        int indice = getFuncionIndex(idFuncion); //Busca la funcion en la tabla
        if (indice == -1) {                      //Si no la tiene, la añade
            listaFunciones.add(new Funcion(idFuncion));
            indice= listaFunciones.size()-1; //La funcion queda colocada al final de la lista
        }

        funcionActual.addLlamada(listaFunciones.get(indice));  //Se enlaza la llamada en el grafo
    }


    public void resumen() {
        System.out.println("========RESUMEN DE FUNCIONES=======");
        for (Funcion f : listaFunciones) {
            System.out.println(f);
            ArrayList<Funcion> hijos = f.getLlamadas();
            for (int i = 0; i < hijos.size(); i++) {
                System.out.println("\t" + hijos.get(i));
            }
            System.out.println();
        }
    }

}