package practica7;

public class ListaCD <E extends Comparable<E>>{
    
    private Nodo lc;
    
    public ListaCD(){
        lc = null;
    } 
    //Insertar un nuevo elemento al final de la lista
    public void insertar(E elemento){
        Nodo nuevo;
        nuevo = new Nodo(elemento);
        if (lc != null){ // lista circular no vacía
            lc.getSiguiente().setAnterior(nuevo); //el primero se conecta al nuevo
            nuevo.setSiguiente(lc.getSiguiente());//el nuevo se conecta al primero
            lc.setSiguiente(nuevo); //el ultimo se conecta al nuevo
            nuevo.setAnterior(lc); //el nuevo se conecta al ultimo
        }
        lc = nuevo; //el nuevo se convierte en el ultimo
    }
    //Buscar elemento en la lista
    public Comparable buscar(E buscado){
        if (lc != null){
            Nodo p = lc.getSiguiente(); // siguiente nodo al de acceso
            do {
                if(p.getElemento().compareTo(buscado) == 0 ){
                    return p.getElemento();
                }
                p = p.getSiguiente();
            }while (p != lc.getSiguiente());
        }
        return null;
    }
    //Mostrar los elementos de la lista
    public void recorrer() {
        if (lc != null){
            Nodo p = lc.getSiguiente(); // siguiente nodo al de acceso
            do {
                System.out.println(p.getElemento());
                p = p.getSiguiente();
            }while (p != lc.getSiguiente());
            System.out.println("");
        } else
        System.out.println("\t Lista Circular vacía.");
    }
    //Mostrar los elementos a partir de un nodo específico
    public void recorrerNodo(Nodo nodo) {
        if (nodo != null){
            Nodo p = nodo;
            do {
                System.out.print(p.getElemento());
                p = p.getSiguiente();
            }while (p != nodo);
            System.out.println("");
        } else
        System.out.println("\t No existe el elemento en la lista.");
    }
    //Eliminar elementos de la lista
    public void eliminar(E entrada){
        boolean encontrado = false;
        if(lc == null) {
            System.out.println("\t Lista Circular vacía.");
            return;
        }
        //bucle de búsqueda
        Nodo actual = lc;
        while ((actual.getSiguiente() != lc) && (!encontrado)){
            encontrado = actual.getSiguiente().getElemento().compareTo(entrada) == 0;
            if (!encontrado){
                actual = actual.getSiguiente();
            }
        }
        encontrado = actual.getSiguiente().getElemento().compareTo(entrada) == 0;
        // Enlazar al nodo anterior al borrado con el siguiente del borrado
        if (encontrado){
            Nodo eliminar = actual.getSiguiente(); // Nodo a eliminar
            if (lc == lc.getSiguiente()){ // Lista con un solo nodo
                lc = null;
            }else {
                if (eliminar == lc){
                    lc = actual; // Se borra el elemento referenciado por lc,
                    // el nuevo acceso a la lista es el anterior al borrado
                }
                actual.setSiguiente(eliminar.getSiguiente());
                eliminar.getSiguiente().setAnterior(actual);
            }
            eliminar = null;
        }else{
            System.out.println("No existe el dato");
        }    
    }
}
