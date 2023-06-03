package Principal;

import EntradaSalida.Tools;
import Metodos.VentaCubrebocas;
import javax.swing.JOptionPane;

public class TestExamen2 {
    public static void main(String [] args){
    
    String menu="Cotizar,Salir";
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
       
        String sel= "";
        
        do{
            sel= boton(menu);
            switch(sel){
                case "Cotizar": 
                    Tools.imprimePantalla("El costo total es:"+VentaCubrebocas.VenCubrebocas(Tools.leerEntero("Ingresar la cantidad de cajas que desea comprar ")));
                    
                break;
                
                case "Salir": ;
                break;
                    
                    
            }
        }while(!sel.equalsIgnoreCase("Salir"));
    }
}

    



