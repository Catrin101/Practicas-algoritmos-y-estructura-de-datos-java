package interactivas_recursivas;

public class iteractiva {
    
    public static void main(String[] args) {
        int num[]={15,100,550,1250};
        int sum=0;
        for(int i=0; i<num.length; i++){
            sum=sum+num[i];
            System.out.println("="+sum);
        }
        long tiempo = System.currentTimeMillis();
        System.out.println("tiempo:"+tiempo+" milisegundos");
    }
}
