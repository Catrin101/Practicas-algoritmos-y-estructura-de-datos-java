package ejercicio15;

import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {
    
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
            
        Random num = new Random();
        int lista[] = new int[2000];
        long inicio, fin, total = 0;
        int aux2;
        for (int i = 0; i < lista.length; i++) {
           lista[i] = num.nextInt();
        } 

        int inc[] = lista.clone();
        int bur[] = lista.clone();
        int sel[] = lista.clone();

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
        System.out.println("Ordenacion por Burbuja:");
        inicio = System.currentTimeMillis();
        System.out.println("Tiempo inicial: " + inicio);
        for (int i = 0; i < bur.length; i++) {
           for (int j = 0; j < bur.length - 1; j++) {
               if (bur[j] > bur[j + 1]) {
                   aux2 = bur[j];
                   bur[j] = bur[j + 1];
                   bur[j + 1] = aux2;
               }
           }
        }
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("Tiempo Final: " + fin);
        System.out.println("Tiempo corriendo: " + total);
        System.out.println("+-----------------------------------------------16+");
        System.out.println("Ordenacion por Seleccion");
        inicio = System.currentTimeMillis();
        System.out.println("Tiempo Inicial: " + inicio);
        for(int i=0; i<sel.length; i++){
           int menor = sel[i];
           int pos=i;
           for(int j=i+1; j<sel.length-1; j++){
               if(sel[j]<menor){
                   menor=sel[j];
                   pos=j;
               }
           }
           if(pos!=i){
               int tem = sel[i];
               sel[i]=sel[pos];
               sel[pos]=tem;
           }
        }
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("Tiempo Final: " + fin);
        System.out.println("Tiempo corriendo: " + total);
    }  
}