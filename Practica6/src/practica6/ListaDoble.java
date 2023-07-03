package practica6;

import javax.swing.JOptionPane;

public class ListaDoble {
    
    private NodoDoble inicio,fin;
    
    public ListaDoble(){
        inicio=fin=null;
    }
    //metodo para saber cuando la lista esta vacia
    public boolean estVacia(){
        return inicio==null;
    }
    //metodo para agregar nodos al final
    public void agregarAlFinal(String usu,String men){
        if(!estVacia()){
            fin=new NodoDoble(usu,men,null,fin);
            fin.anterior.siguiente=fin;
        }else{
            inicio=fin=new NodoDoble(usu,men);
        }
    }
    //metodo para agregar al inicio
    public void agregarAlInicio(String usu,String men){
        if(!estVacia()){
            inicio=new NodoDoble(usu,men,inicio,null);
            inicio.siguiente.anterior=inicio;
        }else{
            inicio=fin=new NodoDoble(usu,men);
        }
    }
    //metodo para mostrar la lista de inicio a fin
    public void mostrarListaInicioFin(){
        if(!estVacia()){
            String datos="";
            NodoDoble auxiliar=inicio;
            while(auxiliar!=null){
                datos = datos+"["+auxiliar.usuario+"]\n ["+auxiliar.mensaje+"]";
                auxiliar=auxiliar.siguiente;
            }
            JOptionPane.showMessageDialog(null,datos,
                    "Mostrando lista de inicio a fini",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    //metodo para mostrar la lista de fin a inicio
    public void mostrarListaFinInicio(){
        if(!estVacia()){
            String datos="<=>";
            NodoDoble auxiliar=fin;
            while(auxiliar!=null){
                datos = datos+"["+auxiliar.usuario+"]\n ["+auxiliar.mensaje+"]";
                auxiliar=auxiliar.anterior;
            }
            JOptionPane.showMessageDialog(null,datos,
                    "Mostrando lista de inicio a fini",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    //metodo para eliminar del inicio
    public String eliminarDelInicio(){
        String elemento=inicio.usuario;
        if(inicio==fin){
            inicio=fin=null;
        }else{
            inicio=inicio.siguiente;
            inicio.anterior=null;
        }
        return elemento;
    }
    //metodo para eliminar del final
    public String eliminarDelFinal(){
        String elemento=fin.usuario;
        if(inicio==fin){
            inicio=fin=null;
        }else{
            fin=fin.anterior;
            fin.siguiente=null;
        }
        return elemento;
    }
}
