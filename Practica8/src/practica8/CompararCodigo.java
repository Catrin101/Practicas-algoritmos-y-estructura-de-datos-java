package practica8;

import java.util.Comparator;

public class CompararCodigo implements Comparator<Libro>{

    @Override
    public int compare(Libro o1, Libro o2) {
        if(o1.getCodigo()<o2.getCodigo()){
            return -1;
        }else if(o1.getCodigo()<o2.getCodigo()){
            return 0;
        }else{
            return 1;
        }
    } 
}
