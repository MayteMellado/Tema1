package Metodos;

public class Ejercicio5 {
    public static String filasDigitos(int filas){
        String calculo = "";
        for(int x=1;x<=filas;x++){

            for(int y=0;y<=((x-1)+y);x++){
                if(y%2==1){
                    calculo += y + " ";
                }

            }
            calculo+="\n";

        }
        return calculo;
    }


}
    
    

