package convercion_numeros;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Convercion_numeros {
    
    static Pila<String> pila1 = new Pila<>(100);
    static int i=0;
        
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int con=0,num,cos;
        do{
            System.out.println("\n#############################################");
            System.out.println("MENU");
            System.out.println("1.-Convertir a binario.");
            System.out.println("2.-Convertir a octal.");
            System.out.println("3.-Convertir a hexadecimal.");
            System.out.println("4.-Salir.");
            con = in.nextInt();
            switch(con){
                case 1:
                    System.out.println("Ingrese un numero:");
                    num=in.nextInt();
                    cos=2;
                    siclo(num,cos);
                    break;
                case 2:
                    System.out.println("Ingrese un numero:");
                    num=in.nextInt();
                    cos=8;
                    siclo(num,cos);
                    break;
                case 3:
                    System.out.println("Ingrese un numero:");
                    num=in.nextInt();
                    int res;
                    while(num!=0){
                        res=num%16;
                        num=num/16;
                        if(res==10){
                            pila1.apilar("A");
                        }else{
                            if(res==11){
                                pila1.apilar("B");
                            }else{
                                if(res==12){
                                    pila1.apilar("C");
                                }else{
                                    if(res==13){
                                        pila1.apilar("D");
                                    }else{
                                        if(res==14){
                                            pila1.apilar("E");
                                        }else{
                                            if(res==15){
                                                pila1.apilar("F");
                                            }else{
                                                String numca= String.valueOf(res);
                                                pila1.apilar(numca);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i++;
                    }
                    mostrar(pila1);
                    break;
                case 4:
                    System.out.println("Adios.");
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
            for(int j=0;j<i;j++){
                pila1.desapilar();
            }
            i=0;
        }while(con!=4);
    }
    
    public static <E>void mostrar(Pila<E>p){
        if(!p.esVacia()){
            E elem = p.desapilar();
            mostrar(p);
            System.out.print(elem +" ");
            p.apilar(elem);
        }
    }
    
    static void siclo(int num,int cos){
        int res;
        while(num!=0){
            res=num%cos;
            num=num/cos;
            String numca= String.valueOf(res);
            pila1.apilar(numca);
            i++;
        }
        mostrar(pila1);
    }
}
