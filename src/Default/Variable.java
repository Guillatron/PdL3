package Default;

import java.util.ArrayList;

enum Tipos{
    NUMERO, CADENA, BOOLEANO, UNDEFINED, VOID
}

public class Variable<T> {
    private String id;
    private ArrayList<T> valores;
    private Tipos tipo;
    private boolean array;

    //Default.Variable declarada, no inicializada
    Variable(Tipos tipo ,String id){
        this.id = id;
        this.tipo = tipo;
    }

    //Default.Variable inicializada a valor
    Variable(Tipos tipo,String id, T valor){
        this.tipo = tipo;
        this.id = id;
        valores = new ArrayList<T>();
        valores.add(valor);
    }

    //Devuelve si a la variable le ha sido asignado algún valor desde su creación
    boolean isInicializada(){
        return valores!=null;
    }

    //Default.Variable inicializada a Array;
    Variable(Tipos tipo, String id, ArrayList<T> valores){
        this.tipo = tipo;
        this.id = id;
        this.valores = (ArrayList<T>) valores.clone();
    }

    public String getId() {
        return id;
    }

    //Inicializar valor simple
    public void inicializar(T valor){
        valores.clear();
        valores.add(valor);
    }

    //Inicializar array
    public void inicializar(ArrayList<T> valores){
        this.valores.clear();
        this.valores = (ArrayList<T>) valores.clone();
    }

}
