package Principal;
import Metodos.Examen;
import EntradaSalida.Tools;
import javax.swing.*;

public class TestExamen {
    public static void main(String[] args) {
    
        String menu="+,-,*,/,%,Salir";
        menu1(menu);
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
        public static void menu1(String menu){
        
            int result=0;
            String sel= "";
            int num1=0,num2=0;
            
            
            do{
                sel= boton(menu);
                switch(sel){
                    case "+":{
                        result=Examen.numeros(num1=Tools.leerEntero("Ingresar num1"),num2=Tools.leerEntero("Ingresar num2"), '+');
                        Tools.imprimePantalla(+num1+"+"+num2+"=" + result);            
                   }break; 
                   case "-":{
                        result=Examen.numeros(num1=Tools.leerEntero("Ingresar num1"),num2=Tools.leerEntero("Ingresar num2"),'-');
                        Tools.imprimePantalla(+num1+"-"+num2+"=" + result);            
                   }break;
                   case "*":{
                        result=Examen.numeros(num1=Tools.leerEntero("Ingresar num1"),num2=Tools.leerEntero("Ingresar num2"),'*');
                        Tools.imprimePantalla(+num1+"*"+num2+"=" + result);            
                   }break;
                   case "/":{
                        result=Examen.numeros(num1=Tools.leerEntero("Ingresar num1"),num2=Tools.leerEntero("Ingresar num2"),'/');
                        Tools.imprimePantalla(+num1+"/"+num2+"=" + result);            
                   }break;
                   case "%":{
                        result=Examen.numeros(num1=Tools.leerEntero("Ingresar num1"),num2=Tools.leerEntero("Ingresar num2"),'%');
                        Tools.imprimePantalla(+num1+"%"+num2+"=" + result);            
                   }break;
             
                   case "Salir": ;
                break;
                    
            }
        }while(!sel.equalsIgnoreCase("Salir"));
    }
}
            
            
