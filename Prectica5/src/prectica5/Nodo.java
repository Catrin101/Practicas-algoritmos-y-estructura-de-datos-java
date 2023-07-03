package prectica5;

import java.util.Date;

public class Nodo {
    
    public String actividad,fecha;
    public Nodo siguiente;
    //funcion para insertar el final
    public Nodo(String actividad,String fecha){
        this.actividad = actividad;
        this.fecha = fecha;
    }
    //funcion para insertar el inicio
    public Nodo(String act,String fec,Nodo n){
        actividad = act;
        fecha = fec;
        siguiente = n;
    }
}
