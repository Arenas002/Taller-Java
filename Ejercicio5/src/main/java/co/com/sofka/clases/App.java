package co.com.sofka.clases;


import static util.PrintLogger.printMessage;

public class App 
{
    public static void main( String[] args )
    {
        Integer contadorPar = 0 ;
        while (contadorPar < 100){
            contadorPar = contadorPar + 1;
            if(contadorPar % 2 == 0){

                printMessage("--"+ contadorPar);

            }

        }
        Integer contadorImpar = 0;
        while (contadorImpar < 100){
            contadorImpar++;
            if(contadorImpar %2 != 0){
                printMessage(" -- "+ contadorImpar);
            }
        }


    }
}
