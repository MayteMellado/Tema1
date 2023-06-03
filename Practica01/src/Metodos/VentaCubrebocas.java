package Metodos;

public class VentaCubrebocas {
    public static int VenCubrebocas(int cantidad){
        int costo=0;
        
        if(cantidad>10)
            costo=100;
        else 
            if(cantidad>=5&&cantidad<=10)
                costo=120;
        else
                if(cantidad<=4)
                    costo=150;
        
        return (cantidad*costo);
        
    }
    
}
