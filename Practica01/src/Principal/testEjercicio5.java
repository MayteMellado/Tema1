package Principal;

import EntradaSalida.Tools;
import Metodos.Ejercicio5;
import Metodos.ExamenPOO;
       
import javax.swing.*;

public class testEjercicio5 {
    public static void main(String[] args) {

        String menu2="Calcular,Salir";
        menu3(menu2);

    }
    public static String boton(String menu) {
        String valores[]=menu.split(",");
        int n;
        n = JOptionPane.showOptionDialog(null," SELECCIONA DANDO CLICK ", " M E N U",
                JOptionPane.NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,null,
                valores,valores[0]);
        return ( valores[n]);
    }

    public static void menu3(String menu)
    {
        String impresion;
        String sel="";
        do {
            sel=boton(menu);
            switch(sel){
                case "Calcular": {

                    
                    Tools.imprimePantalla(ExamenPOO.binario(Tools.leerString("Ingresa el numero que se convertira a Binario")));
                }
                break;
                case "Salir":;
                break;
            }//switch
        }while(!sel.equalsIgnoreCase("Salir"));
    }

}
