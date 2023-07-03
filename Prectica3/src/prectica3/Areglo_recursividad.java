package prectica3;

import java.util.Scanner;

public class Areglo_recursividad {
    
    public static int num,sum;
    
    public static void main(String[] args) {
        int[] areglo =new int[10];
        int opc=0,pos=0;
        Scanner in = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("Ingrese el elemento .");
            areglo[i] = in.nextInt();
        }
        do{
            System.out.println("####################################");
            System.out.println("1.Hacer la busqueda de un elemento X.");
            System.out.println("2.Hcar la suma de los elementos del vector.");
            System.out.println("3.Salir.");
            System.out.println("####################################");
            opc = in.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Que numero ba avuscar?");
                    num = in.nextInt();
                    busqueda(areglo,pos);
                    break;
                case 2:
                    System.out.println(sumar(areglo,areglo.length - 1));
                    break;
                case 3:
                    System.out.println("adios");
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
        }while(opc!=3);
    }
    
    public static void busqueda(int areglo[],int pos){
        if(pos != (areglo.length)){
            if(areglo[pos]==num){
                System.out.println("Su numero esta en el areglo");
            }
            busqueda(areglo,pos+1);
        }
    }
    
    public static int sumar(int areglo[], int posAreglo) {
        int tam = posAreglo,rta;
        if (tam == 0) {
            return areglo[tam];
        } else {
            rta = (areglo[tam]) + sumar(areglo, tam - 1);

        }
        return rta;
    }
}
