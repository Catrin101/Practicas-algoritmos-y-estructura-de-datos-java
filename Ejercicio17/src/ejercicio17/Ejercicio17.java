package ejercicio17;

import java.util.Random;

public class Ejercicio17 {

    public static void main(String[] args) {
        
        Random num = new Random();
        int lista[] = new int[250000];
        long inicio, fin, total = 0;
        for (int i = 0; i < lista.length; i++) {
           lista[i] = num.nextInt();
        } 

        int inc[] = lista.clone();
        int shell[] = lista.clone();

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
        System.out.println("Ordenacion por shell:");
        inicio = System.currentTimeMillis();
        System.out.println("Tiempo Inicial:" + inicio);
        int salto,i,j,k,aux;
        salto=shell.length/2;
        while(salto>0){
            for(i=salto;i<shell.length;i++){
                j=i-salto;
                while(j>=0){
                    k=j+salto;
                    if(shell[j]<=shell[k]){
                        j=-1;
                    }else{
                        aux=shell[j];
                        shell[j]=shell[k];
                        shell[k]=aux;
                        j-=salto;
                    }
                }
            }
            salto=salto/2;
        }
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("Tiempo Final: " + fin);
        System.out.println("Tiempo corriendo: " + total);
    }
    

}