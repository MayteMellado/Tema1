package Metodos;

import static Metodos.frecuencia.imprimeFrecuencia;

public class EjercicioClase {
    public static String cuentaVocales(String cadena){
        byte a=0,e=0,i=0,o=0,u=0;
        byte f=0;
        String cad="";
        while(f<cadena.length()){
            switch(cadena.charAt(f)){
                
                case 'A' :   
                case 'a' : a++;break;
                case 'E' :   
                case 'e' : e++;break;
                case 'I' :   
                case 'i' : i++;break;
                case 'O' :   
                case 'o' : o++;break;
                case 'U' :   
                case 'u' : u++;break;    
            }
            f++;
          
        }
        cad="a="+ imprimeFrecuencia(a)+"\n"+"e="+ imprimeFrecuencia(e)+"\n"+
                "i="+ imprimeFrecuencia(i)+"\n"+"o="+ imprimeFrecuencia(o)+"\n"+
                "u="+ imprimeFrecuencia(u)+"\n";
        return cad;
                
    }
}
