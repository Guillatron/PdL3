package Default;

import java.util.ArrayList;

/*
* La clase almacena una estructura ejecutable con capacidad de almacenar variables
* y llamar a funciones.
* */
public abstract class Scope {
    private ArrayList<Variable> variables;
    private ArrayList<Scope> bifurcaciones;
    private ArrayList<Funcion> llamadasFunciones;
    private Scope actual=null;
    private int lineasEfectivas;
    private int numOperadores;

    Scope(){
        variables = new ArrayList<Variable>();
        bifurcaciones = new ArrayList<Scope>();
        llamadasFunciones = new ArrayList<Funcion>();
    }

    public int puntosFuncion(){

        return 0;
    }
    public ArrayList<Funcion> getLlamadas() {
        return llamadasFunciones;
    }
    public void addVariable(Variable nueva) {
        variables.add(nueva);
    }
    public int lineasEfectivas() {
        return lineasEfectivas;
    }
    public void nuevaLinea() {
        lineasEfectivas++;
    }
    public void addLlamada(Funcion callee) {
        llamadasFunciones.add(callee);
    }



}
