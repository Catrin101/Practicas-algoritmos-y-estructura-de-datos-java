package prectica5;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Prectica5 {

    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Lista listaA = new Lista();
        Lista listaB = new Lista();
        int opcion = 0;
        String actividad,fecha;
        do{
            try{
                System.out.println("+-----------------------------------------+");
                System.out.println("|  MENU PRINCIPAL                         |");
                System.out.println("|  1.-Registrar actividad.                |");
                System.out.println("|  2.-Lista de actividades a realizar.    |");
                System.out.println("|  3.-Marcar actividad realizada.         |");
                System.out.println("|  4.-Lista de las actividades realizadas.|");
                System.out.println("|  5.-Salir                               |");
                System.out.println("+-----------------------------------------+");
                System.out.print(":");
                opcion = in.nextInt();
                switch(opcion){
                    case 1:
                        System.out.println("Ingrese la actividad:");
                        actividad = in.nextLine();
                        System.out.println("Ingrese la fecha(0000-00-00) a la que se deve realisar:");
                        fecha = in.nextLine();
                        listaA.agregarAlInicio(actividad, fecha);
                        break;
                    case 2:
                        System.out.println("---------------------------------");
                        listaA.mostrarLista();
                        break;
                    case 3:
                        System.out.println("Incerte fecha(0000-00-0)de la actividad a marcar");
                        String fechaB=in.nextLine();
                        String actividadB=listaA.estaEnLaLista(fechaB);
                        listaB.agregarAlInicio(actividadB, fechaB);
                        listaA.eliminar(fechaB);
                        break;
                    case 4:
                        System.out.println("---------------------------------");
                        listaB.mostrarLista();
                        break;
                    case 5:
                        System.out.println("Adios.");
                        break;
                }
            }catch(Exception e){
            }
        }while(opcion!=3);
    }
    
}
