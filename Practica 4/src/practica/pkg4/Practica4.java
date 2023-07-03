package practica.pkg4;

import java.util.Scanner;
import java.util.Random;

public class Practica4 {
    
    static Scanner in = new Scanner(System.in);
    static int nodo_informacion = 0;
    static int cantidad1,cantidad2,cantidad3,trafico1,trafico2,trafico3;
    static Cola cola1 = new Cola();
    static Cola cola2 = new Cola();
    static Cola cola3 = new Cola();

    public static void main(String[] args) {
        int opcion=0;
        do{
            try{
                System.out.println("+----------------------------+");
                System.out.println("|  MENU PRINCIPAL            |");
                System.out.println("|  1.-Ingresar avion.        |");
                System.out.println("|  2.-Retirar avion.         |");
                System.out.println("|  3.-Mostrar estadisticas.  |");
                System.out.println("|  4.-Salir.                 |");
                System.out.println("+----------------------------+");
                System.out.print(":");
                opcion = in.nextInt();
                switch(opcion){
                    case 1:
                        IngresarAvion();
                        break;
                    case 2:
                        retirarAvion();
                        break;
                    case 3:
                        System.out.println("---------------------------------");
                        System.out.println("Trafica Pista 1:"+trafico1);
                        System.out.println("Cantidad Pista 1:"+cantidad1);
                        System.out.print("Aviones:");
                        cola1.MostrarContenido();
                        System.out.println("Trafica Pista 2:"+trafico2);
                        System.out.println("Cantidad Pista 2:"+cantidad2);
                        System.out.print("Aviones:");
                        cola2.MostrarContenido();
                        System.out.println("Trafica Pista 3:"+trafico3);
                        System.out.println("Cantidad Pista 3:"+cantidad3);
                        System.out.print("Aviones:");
                        cola3.MostrarContenido();
                        break;
                    case 4:
                        opcion = 4;
                        System.out.println("Adios.");
                        break;
                    default:
                        System.out.println("ERROR. Ingrese 1, 2, 3 o 4");
                        break;
                }
            }catch (NumberFormatException e){
            }
        }while(opcion != 4);
    }
    
    static void IngresarAvion(){
        Random random = new Random();
        int numr = random.nextInt(3);
        switch(numr){
            case 1:
                if(cantidad1 ==5){
                    cola1.Extraer();
                    System.out.print("Ingrese una matricula de avion:");
                    int num = in.nextInt();
                    nodo_informacion = num;
                    cola1.Insertar(nodo_informacion);
                    trafico1 ++;
                }else{
                    System.out.print("Ingrese una matricula de avion:");
                    int num = in.nextInt();
                    nodo_informacion = num;
                    cola1.Insertar(nodo_informacion);
                    trafico1 ++;
                    cantidad1 ++;
                }
                break;
            case 2:
                if(cantidad2 ==5){
                    cola2.Extraer();
                    System.out.print("Ingrese una matricula de avion:");
                    int num = in.nextInt();
                    nodo_informacion = num;
                    cola2.Insertar(nodo_informacion);
                    trafico2 ++;
                }else{
                    System.out.print("Ingrese una matricula de avion:");
                    int num = in.nextInt();
                    nodo_informacion = num;
                    cola2.Insertar(nodo_informacion);
                    trafico2 ++;
                    cantidad2 ++;
                }
                break;
            case 3:
                if(cantidad3 ==5){
                    cola3.Extraer();
                    System.out.print("Ingrese una matricula de avion:");
                    int num = in.nextInt();
                    nodo_informacion = num;
                    cola3.Insertar(nodo_informacion);
                    trafico3 ++;
                }else{
                    System.out.print("Ingrese una matricula de avion:");
                    int num = in.nextInt();
                    nodo_informacion = num;
                    cola3.Insertar(nodo_informacion);
                    trafico3 ++;
                    cantidad3 ++;
                }
                break;
        }
    }
    
    static void retirarAvion(){
        System.out.println("De que pista quiere retirar un avion? :");
        int pista = in.nextInt();
        switch(pista){
            case 1:
                if(!cola1.ColaVacia()){
                    System.out.println("Se extrajo un nodo de la cola 1");
                    cola1.Extraer();
                    cantidad1 --;
                }else{
                    System.out.println("La cola 1 esta vacia");
                }
                break;
            case 2:
                if(!cola2.ColaVacia()){
                    System.out.println("Se extrajo un nodo de la cola 2");
                    cola2.Extraer();
                    cantidad2 --;
                }else{
                    System.out.println("La cola 2 esta vacia");
                }
                break;
            case 3:
                if(!cola3.ColaVacia()){
                    System.out.println("Se extrajo un nodo de la cola 3");
                    cola3.Extraer();
                    cantidad3 --;
                }else{
                    System.out.println("La cola 3 esta vacia");
                }
                break;
            default:
                System.out.println("ERROR. Ingrese 1, 2 o 3");
                break;
        }
        
    }
    
}
