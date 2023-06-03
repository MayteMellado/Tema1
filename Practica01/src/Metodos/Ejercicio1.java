package Metodos;

public class Ejercicio1 {
    public static String cliente(String nCliente){

        return(nCliente);
    }

    public static double montoAdeudo(double consumo){


        double adeudo = 0;
        if(consumo <100)
            adeudo = consumo * 40;
        else
            if (consumo>=100 && consumo<500)
                adeudo = (consumo - 100) * 60 + 4000;
            else
                if (consumo>=500 && consumo<=1000)
                    adeudo = (consumo - 499) * 80 + 33940;
                else
                    if (consumo>1000)
                        adeudo = (consumo - 1000) * 100 + 113940;
        if (adeudo > 600)
            adeudo = (adeudo* .02) + adeudo;
        return(adeudo);
    }
}