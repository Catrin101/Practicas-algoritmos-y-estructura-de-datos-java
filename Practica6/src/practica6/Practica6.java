package practica6;

import javax.swing.JOptionPane;

public class Practica6 {

    public static void main(String[] args) {
        
        ListaDoble listita=new ListaDoble();
        int opcion=0;
        String usuario="",mensaje="";
        do{
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Agregar un nodo al inicio\n"
                                +"2.Agregar un nodo al final\n"
                                +"3.Mostrar la lista de inicio a fin\n"
                                +"4.Mostrr la lista de fin a inicio\n"
                                +"5.Eliminar del inicio\n"
                                +"6.Eliminar del final\n"
                                +"7.Salir\n"
                                +"Que quieres hacer","Menu de opciones",
                                JOptionPane.INFORMATION_MESSAGE));
                switch(opcion){
                    case 1:
                        listita.agregarAlInicio(usuario,mensaje);
                        break;
                    case 2:
                        listita.agregarAlFinal(usuario,mensaje);
                        break;
                    case 3:
                        if(!listita.estVacia()){
                            listita.mostrarListaInicioFin();
                        }else{
                            JOptionPane.showMessageDialog(null,"No hay nodos","lista vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!listita.estVacia()){
                            listita.mostrarListaFinInicio();
                        }else{
                            JOptionPane.showMessageDialog(null,"No hay nodos","lista vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if(!listita.estVacia()){
                            usuario=listita.eliminarDelInicio();
                            JOptionPane.showMessageDialog(null,"El elemento eliminado es "+usuario,"eliminado",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"Lista vacia","lista vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        if(!listita.estVacia()){
                            usuario=listita.eliminarDelFinal();
                            JOptionPane.showMessageDialog(null,"El elemento eliminado es "+usuario,"eliminado",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"Lista vacia","lista vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null,"Adios","fin",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"No existe esa opcion","ERROR",JOptionPane.INFORMATION_MESSAGE);
                        break;
                        
                }
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null,"ERROR"+n.getMessage());
            }
        }while(opcion!=7);
    }
    
}
