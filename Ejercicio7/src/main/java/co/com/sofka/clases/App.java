package co.com.sofka.clases;
import static util.PrintLogger.printMessage;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner enter = new Scanner(System.in);



        Integer entrada;
        do {
            printMessage("Ingrese un numero mayor a 0");
            entrada = enter.nextInt();

        } while (entrada <  0);

        printMessage("el numero Ingresado es: "+entrada);

    }
}
