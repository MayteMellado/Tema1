package Metodos;

import EntradaSalida.Tools;

public class NumMayor {
    
    public static int mayorNum(int dato1,int dato2,int dato3){
        int a=Math.max(dato1,dato2);
        Tools.imprimePantalla("El mayor : "+(Math.max(a,dato3)));
        return a;
    }

    
}