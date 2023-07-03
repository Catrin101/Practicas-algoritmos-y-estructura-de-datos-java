package practica6;

public class NodoDoble {
    
    public String usuario,mensaje;
    NodoDoble siguiente,anterior;
    //constructor para cuando no hay nodos
    public NodoDoble(String usu,String men){
        this(usu,men,null,null);
    }
    //constructor para cuando ya hay nodos
    public NodoDoble(String usu,String men,NodoDoble s,NodoDoble a){
        usuario=usu;
        mensaje=men;
        siguiente=s;
        anterior=a;
    }
}
