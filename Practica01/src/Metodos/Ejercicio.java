
package Metodos;

import EntradaSalida.Tools;

public class Ejercicio {

    public static boolean numArmstrong(int valor){
        
        int aux=valor, sum=0;
        
        while(aux>0){
            sum+=Math.pow(aux%10, 3);
            aux/=10;
        }
        
        return(sum== valor);
    }
    public static void sumaDigitos(int valor)
	{
		int suma=0;
		while(valor!=0)
		{
			suma+=valor%10;
			valor/=10;
		}
		Tools.imprimePantalla("Suma de digitos:"+suma);
	}
}
