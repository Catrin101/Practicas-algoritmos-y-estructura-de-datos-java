package prectica3;

import java.util.Scanner;

public class Texto_recursiva {
    public static int i=0;
    public static char con;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String texto;
        
        System.out.println("Ingrese un Texto.");
        texto = in.nextLine();
        char[] cadena = texto.toCharArray();
        System.out.println("Texto alreves:");
        i=cadena.length;
        alreves(cadena,0);
    }
    
    public static void alreves(char cadena[],int pos){
        if(pos != (cadena.length)){
            con =cadena[i];
            alreves(cadena,pos+1);
            i--;
        }
    }
}
