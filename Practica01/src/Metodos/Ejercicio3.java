package Metodos;
      
public class Ejercicio3 {
    public static boolean calculaPerfecto(int numero){

        boolean nPerfecto = false;
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma = suma + i;
            }
        }
        if(suma==numero)
            nPerfecto = true;

        return(nPerfecto);
    }
}
    

        
    
    
        


        
    
