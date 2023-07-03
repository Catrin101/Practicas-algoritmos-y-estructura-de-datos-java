package practica8;

public class Libro implements Comparable<Libro>{
    
    private int codigo,precio;
    private String titulo;

    public Libro(int codigo, int precio, String titulo) {
        this.codigo = codigo;
        this.precio = precio;
        this.titulo = titulo;
    }

    public Libro() {
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "\nCodigo:" + codigo + "\nPrecio:" + precio + "\nTitulo:" + titulo;
    }

    @Override
    public int compareTo(Libro o) {
        if(o.getCodigo()<codigo){
            return -1;
        }else if(o.getCodigo()<codigo){
            return 0;
        }else{
            return 1;
        }
    }
    
}
