package practica_10;

public class empleado {
    private int id;
    private String nombre;
    private int salario;

    public empleado(int id, String nombre, int salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nid:" + id + "\nnombre:" + nombre + "\nsalario:" + salario;
    }
    
    
}
