package prectica5;

public class Lista {
    
    protected Nodo inicio,fin;//punteros
    
    public Lista(){
        inicio = null;
        fin = null;
    }
    
    public boolean estaVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }
    //metodo para agregar un nodo al inicio de la lista
    public void agregarAlInicio(String act,String fec){
        inicio = new Nodo(act, fec, inicio);
        if(fin == null){
            fin  = inicio;
        }
    }
    //metodo para mostrar los datos
    public void mostrarLista(){
        Nodo recorrer = inicio;
        while(recorrer != null){
            System.out.println("---------------------------------------------");
            System.out.println("["+recorrer.actividad+"]");
            System.out.println("["+recorrer.fecha+"]");
            recorrer = recorrer.siguiente;
        }
    }
    //metodo para eliminar un nodo en especifico
    public void eliminar(String b){
        if(!estaVacia()){
            if(inicio==fin && b==inicio.fecha){
                inicio=fin=null;
            }else if(b==inicio.fecha){
                inicio=inicio.siguiente;
            }else{
                Nodo anterior,temporal;
                anterior=inicio;
                temporal=inicio.siguiente;
                while(temporal!=null && temporal.fecha!=b){
                    anterior=anterior.siguiente;
                    temporal=temporal.siguiente;
                }
                if(temporal!=null){
                    anterior.siguiente=temporal.siguiente;
                    if(temporal==fin){
                        fin=anterior;
                    }
                }
            }
        }
    }
    //metodo para buscar un elemento
    public String estaEnLaLista(String b){
        Nodo temporal = inicio;
        while(temporal!=null && temporal.fecha!=b){
            temporal=temporal.siguiente;
        }
        return temporal.actividad;
    }
}
