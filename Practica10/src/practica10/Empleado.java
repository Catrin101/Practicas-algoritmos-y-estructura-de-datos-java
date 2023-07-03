package practica10;

public class Empleado {
    private int id,salario;
    private String nombre;
    
    public Empleado(int id,String nombre,int salario) {
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

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "\nID:" + id + "\nNombre:" + nombre + "\nSalario:" + salario;
    }
    
    
}
