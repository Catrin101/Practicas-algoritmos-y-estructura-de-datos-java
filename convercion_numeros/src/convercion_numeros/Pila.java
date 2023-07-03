package convercion_numeros;

public class Pila <E>{
    
    E[] lista;
    int tope;
    
    public Pila(int size){
        lista = (E[]) new Object[size];
        tope = -1;
    }
    
    void apilar(E elem){
        if(!esLlena()){
            tope++;
            lista[tope] = elem;
        }
    }
    
    E desapilar(){
        if(esVacia()) return null;
        E elem = lista[tope];
        tope--;
        return elem;
    }
    
    E tope(){
        return esVacia() ? null : lista[tope];
    }
    
    boolean esVacia(){
        return tope==-1;
    }
    
    boolean esLlena(){
        return tope == (lista.length-1);
    }
}
