package ejercicio11;

public class Ruta implements Comparable <Ruta> {
    
    private int num;
    private String nombre;
    
    public Ruta(int num, String nombre) {
        this.num = num;
        this.nombre = nombre;
    }
    
    public int getNum() {
        return num;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNum(int num) {
        this.num = num;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public int compareTo(Ruta t) {
        return num - t.num;
    }
    
    @Override
    public String toString() {
        return " "+ nombre;
    }
}
