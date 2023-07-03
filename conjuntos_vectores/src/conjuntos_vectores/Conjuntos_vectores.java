package conjuntos_vectores;

import java.util.Scanner;

public class Conjuntos_vectores {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean con=false;
        int tamanno,tamZ=0;
        System.out.println("#################################################");
        System.out.println("ingrese el tamanno del conjunto A");
        tamanno = in.nextInt();
        tamZ = tamZ+tamanno;
        int[] A = new int[tamanno];
        for(int i=0; i<A.length; i++){
            while(con != true){
                System.out.println("ingrese un balor positibo:");
                int num = in.nextInt();
                if(num < 0){
                    System.out.println("el numero es negativo ingrese un valor positivo.");
                }else{
                    A[i]=num;
                    con = true;
                }
            }
            con = false;
        }
        System.out.println("#################################################");
        System.out.println("ingrese el tamanno del conjunto B");
        tamanno = in.nextInt();
        tamZ = tamZ+tamanno;
        int[] B = new int[tamanno];
        for(int i=0; i<B.length; i++){
            while(con != true){
                System.out.println("ingrese un balor positibo:");
                int num = in.nextInt();
                if(num < 0){
                    System.out.println("el numero es negativo ingrese un valor positivo.");
                }else{
                    B[i]=num;
                    con = true;
                }
            }
            con = false;
        }
        System.out.println("#################################################");
        System.out.println("ingrese el tamanno del conjunto C");
        tamanno = in.nextInt();
        tamZ = tamZ+tamanno;
        int[] C = new int[tamanno];
        for(int i=0; i<C.length; i++){
            while(con != true){
                System.out.println("ingrese un balor positibo:");
                int num = in.nextInt();
                if(num < 0){
                    System.out.println("el numero es negativo ingrese un valor positivo.");
                }else{
                    C[i]=num;
                    con = true;
                }
            }
            con = false;
        }
        System.out.println("#################################################");
        int[] Z = new int[tamZ];
        System.out.println("Conjunto A");
        for(int i=0; i<A.length; i++){
            System.out.print("["+A[i]+"]");
        }
        System.out.println("\nConjunto B");
        for(int i=0; i<B.length; i++){
            System.out.print("["+B[i]+"]");
        }
        System.out.println("\nConjunto C");
        for(int i=0; i<C.length; i++){
            System.out.print("["+C[i]+"]");
        }
        System.out.println("\n#################################################");
        int j=0;
        for(int i=0; i<A.length; i++){
            Z[j] = A[i];
            j++;
        }
        for(int i=0; i<B.length; i++){
            Z[j] = B[i];
            j++;
        }
        for(int i=0; i<C.length; i++){
            Z[j] = C[i];
            j++;
        }
        
        System.out.println("Conjunto Z");
        for(int i=0; i<Z.length; i++){
            System.out.print("["+Z[i]+"]");
        }
    }
    
}
