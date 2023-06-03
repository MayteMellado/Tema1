package Principal;

import EntradaSalida.Tools;
import Metodos.Ejercicio4;

import javax.swing.*;

public class testEjercicio4 {
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
        int multi;
        String sel="";
        do {
            sel=boton(menu);
            switch(sel){
                case "Calcular":

                    multi = Ejercicio4.multiplicacionRusa(Tools.leerEntero("Ingresa el multiplicador"), Tools.leerEntero("Ingresa el multiplicando"));
                    Tools.imprimePantalla("El resultado de la multiplicacion ha sido : " + multi);
                break;
                case "Salir":;
                break;
            }//switch
        }while(!sel.equalsIgnoreCase("Salir"));
    }

}


