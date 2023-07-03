package interactivas_recursivas;

public class Interactivas_recursivas {

    public static void main(String[] args) {
        int num[]={15,100,550,1250};
        int sum=0;
        SumaRecursiva(num,0,sum);
        long tiempo = System.currentTimeMillis();
        System.out.println("tiempo:"+tiempo+" milisegundos");
    }
    
    public static void SumaRecursiva(int num[],int i,int sum){
        if(i != (num.length)){
            sum=sum+num[i];
            System.out.println("="+sum);
            SumaRecursiva(num,i+1,sum);
        }
    }
}
