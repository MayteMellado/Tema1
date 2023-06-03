package Metodos;

public class Ejercicio4 {
    public static int multiplicacionRusa(int num1, int num2){
        int multiplicacion=0;
        while(num1!=0){
            if(num1 % 2 != 0){
                multiplicacion = multiplicacion + num2;
            }
           
            num1 =num1 / 2;
            num2 = num2 * 2;System.out.println(num1+"  "+num2+"\n");
        }
        return multiplicacion;
    }
}

