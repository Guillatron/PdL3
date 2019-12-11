import java.util.ArrayList;

public class Funcion {
    private String nombre;
    private ArrayList<Variable> argumentos;
    private ArrayList<Variable> variables;
    private ArrayList<Funcion> llamadasFunciones;
    private int lineasEfectivas;

    public Funcion(String nombre) {
        this.nombre = nombre;
        argumentos =  new ArrayList<Variable>();
        variables =  new ArrayList<Variable>();
        llamadasFunciones =  new ArrayList<Funcion>();
        lineasEfectivas=0;
    }

    public void nuevaLinea(){
        lineasEfectivas++;
    }

    @Override   //Para sacarla por pantalla
    public String toString() {
        return nombre;
    }

    public void addLlamada(Funcion callee){
        llamadasFunciones.add(callee);
    }

    public ArrayList<Funcion> getLlamadas(){
        return llamadasFunciones;
    }

    public String getNombre() {
        return nombre;
    }
}