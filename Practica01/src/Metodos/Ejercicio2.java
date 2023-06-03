package Metodos;

public class Ejercicio2 {
    public static String cliente(String nEstudiante){

        return(nEstudiante);
    }

    public static double calculaAdeudo(double prom, String cat){
        double adeudo = 0;
        int pago = 0;

        if(cat.equalsIgnoreCase("A"))
            pago = 1200;
        else
            if(cat.equalsIgnoreCase("B"))
                pago = 1000;
            else
                if(cat.equalsIgnoreCase("C"))
                    pago = 900;
                else
                    if(cat.equalsIgnoreCase("D"))
                        pago = 600;
        if(prom >80 && prom<=100)
            adeudo = pago- (pago*.15);
        else
            if(prom >75 && prom<=80)
                    adeudo=pago - (pago*.08);

        return(adeudo);
    }
}


