package Default;

import java.util.ArrayList;

public class Funcion extends Scope{
    private String nombre;
    private ArrayList<Variable> argumentos;
    private ArrayList<Variable> variables;
    private ArrayList<Funcion> llamadasFunciones;
    private int lineasEfectivas;
    private Tipos tipoRetorno;

    public void addArgumento(Variable v){
        argumentos.add(v);
    }

    public void setTipoRetorno(Tipos tipoRetorno) {
        this.tipoRetorno = tipoRetorno;
    }

    public Funcion(Tipos tipo, String nombre) {
        this.nombre = nombre;
        this.tipoRetorno = tipo;
        argumentos = new ArrayList<Variable>();
        variables = new ArrayList<Variable>();
        llamadasFunciones = new ArrayList<Funcion>();
        lineasEfectivas = 0;
    }

    public boolean isInicializada() {
        return tipoRetorno !=Tipos.UNDEFINED;
    }

    @Override  //De momento dos funciones son iguales si tienen el mismo nombre
    public boolean equals(Object obj) {
        return nombre.equals(((Funcion) obj).getNombre());
    }

    public boolean isVarDeclarada(String nombre) {
        for (Variable v : variables) {
            if (v.getId().equals(nombre)) return true;
        }
        return false;
    }

    @Override   //Para sacarla por pantalla
    public String toString() {
        return nombre+((tipoRetorno==null)? "" : ":"+tipoRetorno.toString());
    }

    public void resumen(){
        System.out.println(nombre + ":" + tipoRetorno.toString());
        System.out.println("nº variables declaradas: " + variables.size());
        System.out.println("nº lineas de codigo efectivas: " + lineasEfectivas);
        System.out.println("nº argumentos: " + argumentos.size());
        System.out.println("nº llamadas a función: "+ llamadasFunciones.size());
    }

    public String getNombre() {
        return nombre;
    }
}