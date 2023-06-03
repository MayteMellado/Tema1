package Metodos;
import EntradaSalida.Tools;

public class CorridaEscritorio {
    
    public static String generaValores(byte n){
        String cad=" ";
        byte a=1,b=2,d=2,c=0;
            cad=a+" "+b+"\n";
         
        {
    
         do{
         c=(byte) (a+b);System.out.println(a+"  "+b+"\n");
         cad+=c+"\n";
         a=b;
         b=c;
         d++;
        }
        while(d<=n);
         Tools.imprimePantalla(cad);
         return cad;
        }
     
    }
}
    
    
