package practica8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Parte1 {

    public static void main(String[] args) {
        Random num = new Random();
        int Lnum[] = new int[20];
        List <String> Lstg = new ArrayList<String>();
        int aux2;
        for (int i = 0; i < Lnum.length; i++) {
           Lnum[i] = num.nextInt(30);
        } 
        Lstg.add("s");Lstg.add("m");Lstg.add("u");Lstg.add("w");Lstg.add("k");Lstg.add("h");Lstg.add("a");Lstg.add("l");
        Lstg.add("z");Lstg.add("c");Lstg.add("b");Lstg.add("t");Lstg.add("y");Lstg.add("r");Lstg.add("d");Lstg.add("x");

        System.out.println("+-----------------------------------------------+");
        System.out.println("Ordenacion numeros:");
        for(int i=0; i<20;i++){
            System.out.print(","+Lnum[i]);
        }
        for (int i = 0; i < Lnum.length; i++) {
           int pos = i;
           int aux = Lnum[i];
           while ((pos > 0) && (Lnum[pos - 1] > aux)) {
               Lnum[pos] = Lnum[pos - 1];
               pos--;
           }
           Lnum[pos] = aux;
        }
        System.out.println("");
        System.out.println("+-----------------------------------------------+");
        for(int i=0; i<20;i++){
            System.out.print(","+Lnum[i]);
        }
        System.out.println("");
        System.out.println("+-----------------------------------------------+");
        System.out.println("Ordenacion por String:");
        System.out.println(Lstg);
        Collections.sort(Lstg);
        System.out.println("+-----------------------------------------------+");
        System.out.println(Lstg);
    }
    
}
