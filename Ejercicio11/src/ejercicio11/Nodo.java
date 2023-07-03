package ejercicio11;

public class Nodo {
    
    public String elemento;
    public Nodo siguiente,anterior;
    //funcion para insertar el final
    public Nodo(String elemento){
        this.elemento = elemento;
    }
    //funcion para insertar el inicio
    public Nodo(String elem,Nodo n,Nodo a){
        elemento = elem;
        siguiente = n;
        anterior = a;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    
}
