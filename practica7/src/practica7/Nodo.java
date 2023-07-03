package practica7;

public class Nodo <E extends Comparable<E>>{
    
    private E elemento;
    private Nodo anterior; //izquerda
    private Nodo siguiente; //derecha
    
    public Nodo(E elemento) {
        this.elemento = elemento;
        this.anterior = this;
        this.siguiente = this;
    }
    public void setElemento(E elemento) {
        this.elemento = elemento;
    }
    public E getElemento() {
        return elemento;
    }
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    public Nodo getAnterior() {
        return anterior;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
}
