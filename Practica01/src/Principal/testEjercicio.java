
package Principal;
import javax.swing.*;
import EntradaSalida.Tools;
import Metodos.CorridaEscritorio;
import Metodos.Ejercicio;
import Metodos.Ejercicio1;
import Metodos.Ejercicio2;
import Metodos.Ejercicio3;
import Metodos.Ejercicio4;
import Metodos.Ejercicio5;
import Metodos.EjercicioClase;
import Metodos.NumMayor;
import Metodos.TotalDigitos;

public class testEjercicio {
    
    public static void main(String [] args){
    
    String menu="Numero Armstrong,Suma digitos,Monto Pagar,Pagos Estudiante,Entero Booleano,Multiplicacion Rusa,"
            + "Lista Impar,Frecuencia,Numero Mayor,Corrida Escritorio,Palindrome,Conversion,Total Digitos,Salir";
    menu3(menu);
    
    }
    
    public static String boton(String menu){
        
        String valores[] = menu.split(",");
        int n;
        
        n = JOptionPane.showOptionDialog(null, " Selecciona Dando Click", "M E N U", 
                JOptionPane.NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,null,
                valores,valores[0]);
        
        
        return (valores[n]);
        
    }
    public static void menu3(String menu){
        
        String cliente = "", estudiante ="", impresion ="";
        double cant=0;
        int multi =0;
        String sel= "";
        String cad="";
        int a;
        int num1,num2;
        int N,contador = 0;
        
        
        
        do{
            sel= boton(menu);
            switch(sel){
                case "Numero Armstrong": {boolean nArms = Ejercicio.numArmstrong(Tools.leerEntero("Ingresa el numero entero"));
                if(nArms)
                    Tools.imprimePantalla("Es un numero Armsrong");
                else
                    Tools.imprimePantalla("No es un numero Armstrong");
                }break;
                case "Suma digitos": Ejercicio.sumaDigitos(Tools.leerEntero("Ingresa el numero entero"));
                break;  
                case "Monto Pagar": {
                    cliente = Ejercicio1.cliente(Tools.leerString("Ingrese el nombre completo del cliente a capturar"));
                    cant = Ejercicio1.montoAdeudo(Tools.leerDouble("Ingrese la cantidad de agua utilizada en metros cubicos"));;
                    Tools.imprimePantalla("El cliente : " + cliente + " tiene un adeudo de: " + cant + " pesos.");
                }
                    break;
                case "Pagos Estudiante":{
                    estudiante = Ejercicio2.cliente(Tools.leerString("Ingrese el nombre completo del estudiante"));
                    cant = Ejercicio2.calculaAdeudo(Tools.leerDouble("Ingrese el promedio del estudiante"),
                            Tools.leerString("Ingrese la categoria en la que se encuentra el estudiante"));
                    Tools.imprimePantalla("El estudiante : " + estudiante + " tiene un adeudo de: " + cant + " pesos.");
                
                } ;
                break;
                case "Entero Booleano":
                    if(Ejercicio3.calculaPerfecto(Tools.leerEntero("Ingresa el numero a calcular")))
                        Tools.imprimePantalla("El numero es perfecto");
                    else Tools.imprimePantalla("El numero no es perfecto"); ;
                break;
                case "Multiplicacion Rusa":
                    multi = Ejercicio4.multiplicacionRusa(Tools.leerEntero("Ingresa el multiplicador"), Tools.leerEntero("Ingresa el multiplicando"));
                    Tools.imprimePantalla("El resultado de la multiplicacion ha sido : " + multi);;
                break;
                case "Lista Impar":{

                    impresion = Ejercicio5.filasDigitos(Tools.leerEntero("Ingresa el numero de filas"));
                    Tools.imprimePantalla(impresion);
                } ;
                
                break;
                
                case "Frecuencia":{  
                    cad=EjercicioClase.cuentaVocales(Tools.leerString("Ingresar una cadena"));
                    Tools.imprimePantalla(cad);
                    
                };
                
                 break;
                    
                case "Numero Mayor" : {
                    
                    a= NumMayor.mayorNum(Tools.leerEntero("Ingrese dato1"),Tools.leerEntero("Ingresar dato2"),Tools.leerEntero("Ingresar dato3"));
                    
                }
                 break;
                    
                case "Corrida Escritorio" : {
                    
                    
                }
                 break;
                
                case "Palindrome" : {
                    
                    
                }
                 break;
                    
                case "Conversion" : {
                    
                    
                }
                 break;
                    
                case "Total Digitos" :  {
                    
                
                }
                 break;
 
                case "Salir": ;
                break;
                    
                    
            }
        }while(!sel.equalsIgnoreCase("Salir"));
    }
}
