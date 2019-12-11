import java.util.ArrayList;

public class Grafo<T>{
    private T raiz;
    private ArrayList<Grafo<T>> hijos;

    public Grafo(T datosRaiz){
        raiz = datosRaiz;
        hijos = new ArrayList<Grafo<T>>();
    }
    public void addHijo(T datosHijo){
        hijos.add(new Grafo<T>(datosHijo));
    }

    public void sustituyeHijo(int indice, Grafo<T> sustituto){
        hijos.set(indice, sustituto);
    }

    public ArrayList<Grafo<T>> getHijos(){
        return hijos;
    }

    @Override
    public String toString() {
        return raiz.toString();
    }

    public void addHijo(Grafo<T> hijo){
        hijos.add(hijo);
    }

    public static void main(String[] args) {
    }
}