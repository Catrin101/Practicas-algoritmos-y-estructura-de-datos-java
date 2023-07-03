package ejercicio11;

public class Lista<E extends Comparable<E>>{
    
    private Nodo cabeza;
    
    public Lista() {
        cabeza = null;
    }
    
    public void insertarCabezaLista(E entrada ) {
        Nodo nuevo = new Nodo(entrada);
        nuevo.setSiguiente(cabeza);
        if (cabeza != null) {
            cabeza.setAnterior(nuevo);
        }
        cabeza = nuevo;
    }
    
    public void insertarUltimoLista(E entrada) {
        Nodo ultimo = cabeza;
        if (ultimo != null) {
            while (ultimo.getSiguiente() != null) {
                ultimo = ultimo.getSiguiente();
            }
            Nodo nuevo = new Nodo(entrada);
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
        } else {
            insertarCabezaLista(entrada);
        }
    }
    
    public Nodo buscarLista(E testigo) {
        for (Nodo indice = cabeza; indice != null; indice = indice.getSiguiente()) {
            if (indice.getElemento().compareTo(testigo) == 0) {
                return indice;
            }
        }
        return null;
    }
    
    public String mostrarLista(E x, E y) {
        String cadena = "";
        Nodo indice = buscarLista(x);
        Nodo aux = buscarLista(y);
        if (indice != null) {
            if (indice.getSiguiente() != null) {
                for(Nodo i = indice; i != aux; i = i.getSiguiente()){
                    cadena += (i.getElemento() + " >> ");
                } 
            }
            cadena+=(aux.getElemento());
        } 
        return cadena;
    }

    public String mostrarListaI(E x, E y) {
        String cadena = "";
        Nodo indice = buscarLista(x);
        Nodo aux = buscarLista(y);
        if (indice != null) {
            if (indice.getAnterior() != null) {
                for(Nodo i = indice; i != aux; i = i.getAnterior()){
                    cadena += (i.getElemento() + " >> ");
                } 
            }
            cadena+=(aux.getElemento());
        } 
        return cadena;
    }
}