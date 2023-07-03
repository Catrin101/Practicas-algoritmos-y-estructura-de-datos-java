package ejercicio19;

import java.util.Random;

public class Ejercicio19 {
    
    public static void main(String[] args) {
        Random num = new Random();
        int lista[] = new int[25000];
        long inicio, fin, total = 0;
        for (int i = 0; i < lista.length; i++) {
           lista[i] = num.nextInt();
        } 

        int shell[] = lista.clone();
        int quick[] = lista.clone();
        int mer[] = lista.clone();

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
        System.out.println("+-----------------------------------------------+");
        System.out.println("Ordenacion por marge:");
        inicio = System.currentTimeMillis();
        System.out.println("Tiempo Inicial:" + inicio);
        int s=mer.length-1;
        merge(mer,0,s);
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("Tiempo Final: " + fin);
        System.out.println("Tiempo corriendo: " + total);
        System.out.println("+-----------------------------------------------+");
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
    
    static int[] merge(int[] a,int primero,int ultimo){
        int centro;
        if(primero<ultimo){
            centro=(primero+ultimo)/2;
            merge(a,primero,centro);
            merge(a,centro+1,ultimo);
            mezclando(a,primero,centro,ultimo);
        }
        return a;
    }
    
    static void mezclando(int[] a,int izquierda,int medio,int derecha){
        int aux[] = new int[a.length];
        int x,y,z;
        x=z=izquierda;
        y=medio+1;
        while(x<=medio && y<=derecha){
            if(a[x]<=a[y]){
                aux[z++]=a[y++];
            }else{
                aux[z++]=a[y++];
            }
        }
        while(x<=medio){
            aux[z++]=a[x++];
        }
        while(y<=derecha){
            aux[z++]=a[y++];
        }
    }
}
