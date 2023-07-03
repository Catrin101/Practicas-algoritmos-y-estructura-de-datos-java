package ejercicio23;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio23 {
    
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        Random num = new Random();
        int lista[] = new int[50000];
        long inicio, fin, total = 0;
        int aux2;
        for (int i = 0; i < lista.length; i++) {
           lista[i] = num.nextInt();
        } 

        int inc[] = lista.clone();
        int quick[] = lista.clone();
        
        System.out.println("+-----------------------------------------------+");
        System.out.println("Ordenacion por Insercion:");
        inicio = System.currentTimeMillis();
        System.out.println("Tiempo Inicial:" + inicio);
        for (int i = 0; i < inc.length; i++) {
           int pos = i;
           int aux = inc[i];
           while ((pos > 0) && (inc[pos - 1] > aux)) {
               inc[pos] = inc[pos - 1];
               pos--;
           }
           inc[pos] = aux;
        }
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("Tiempo Final: " + fin);
        System.out.println("Tiempo corriendo: " + total);
        System.out.println("+-----------------------------------------------+");
        System.out.println("Ordenacion por quicksort:");
        inicio = System.currentTimeMillis();
        System.out.println("Tiempo Inicial:" + inicio);
        int u=quick.length-1;
        quicksort(quick,0,u);
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("Tiempo Final: " + fin);
        System.out.println("Tiempo corriendo: " + total);
    }
    
    static void quicksort(int[] arreglo,int primero,int ultimo){
        int i,j,pivote,aux;
        i=primero;
        j=ultimo;
        pivote=arreglo[(primero+ultimo)/2];
        do{
            while(arreglo[i]<pivote){i++;}
            while(arreglo[j]>pivote){j--;}
            if(i<=j){
                aux=arreglo[i];
                arreglo[i]=arreglo[j];
                arreglo[j]=aux;
                i++;
                j--;
            }
        }while(i<=j);
        if(primero<j){
            quicksort(arreglo,primero,j);
        }
        if(i<ultimo){
            quicksort(arreglo,i,ultimo);
        }
    }
}
