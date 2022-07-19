package co.com.sofka.clases;
import static util.PrintLogger.printMessage;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner enter = new Scanner(System.in);
        printMessage("Ingrese un día de la semana: ");
        String response = enter.nextLine();
       String Semana =response.toLowerCase();


        switch (Semana){

            case "lunes":
                printMessage("Es un dia laboral");
                break;
            case "martes":
                printMessage("Es un dia laboral");
                break;
            case "miercoles":
                printMessage("Es un dia laboral");
                break;
            case "jueves":
                printMessage("es un dia laboral");
                break;
            case "viernes":
                printMessage("es un dia laboral");
                break;
            case "sabado":
                printMessage("no es un dia laboral");
                break;
            case "domingo":
                printMessage("no es un dia laboral");
                break;
        }
    }
}
