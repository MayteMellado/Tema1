package Metodos;

import EntradaSalida.Tools;

public class ExamenPOO {
    public static double binario(String numero){
        int x = 0, digito= 0;
        double binario=0;
        int num = Tools.leerEntero(numero);
        while(num!=0){
            digito = num%2;
            binario = binario + digito*Math.pow(10, x);
            x++;
            num /=2;
        }
        
        return binario;
    }
    
    
    
}
