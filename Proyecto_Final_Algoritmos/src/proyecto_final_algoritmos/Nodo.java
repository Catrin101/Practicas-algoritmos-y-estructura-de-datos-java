package proyecto_final_algoritmos;

public class Nodo{
    private int codigo;
    private String titulo;
    private int precio;
    private Nodo anterior;
    private Nodo siguiente;
    
    public Nodo(int codigo,String titulo,int precio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.precio = precio;
        this.anterior = this;
        this.siguiente = this;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
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

    @Override
    public String toString() {
        return "\nCodigo:" + codigo + "\nTitulo:" + titulo + "\nPrecio:" + precio;
    }
    
    
}
