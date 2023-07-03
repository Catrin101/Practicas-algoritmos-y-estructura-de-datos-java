package texto_vector;

import java.util.Scanner;

public class Texto_vector {
        
    public static void main(String[] args) {
        String texto="";
        boolean con=false;
        Scanner in = new Scanner(System.in);
        while(con != true){
            System.out.println("Ingrese un parafo:");
            texto = in.nextLine();
            if(texto.length() > 100){
                System.out.println("Su parafo tiene mas de 100 caracteres.");
            }else{
                con = true;
            }
        }
        char[] cadena = texto.toCharArray();
        for (int i=0; i<cadena.length; i++){
            if(Character.isUpperCase(cadena[i])){
                char letraMI = Character.toLowerCase(cadena[i]);
                cadena[i] = letraMI;
            }else{
                char letraMA = Character.toUpperCase(cadena[i]);
                cadena[i] = letraMA;
            }
            cadena[i]=convertir(cadena[i]);
            char y=cadena[i];
            if (y == 'a' || y == 'e' || y == 'i' || y == 'o'|| y == 'u'){
                cadena[i] = '&';
            }
            if (y == 'A' || y == 'E' || y == 'I' || y == 'O'|| y == 'U'){
                cadena[i] = '&';
            }
        }
        System.out.println(cadena);
    }
    
    static char convertir(char y){
        if(y == '1'){
            y = '2';
        }else if(y == '2'){
            y = '3';
        }else if(y == '3'){
            y = '4';
        }else if(y == '4'){
            y = '5';
        }else if(y == '5'){
            y = '6';
        }else if(y == '6'){
            y = '7';
        }else if(y == '7'){
            y = '8';
        }else if(y == '8'){
            y = '9';
        }else if(y == '9'){
            y = '0';
        }
        return y;
    }
}
