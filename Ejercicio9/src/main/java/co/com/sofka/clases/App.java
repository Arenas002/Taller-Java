package co.com.sofka.clases;
import static util.PrintLogger.printMessage;
import java.util.Scanner;
import java.util.function.Function;

public class App
{
    public Function<String,String> concatenar(String mensaje){
        return (String x)-> mensaje + x;
    }
    public static void main( String[] args )
    {
        App join = new App();
        Scanner enter = new Scanner(System.in);
        printMessage("Ingrese el texto que desea concatenar: ");
        String entrada = enter.nextLine();

        String concatenar = join.concatenar("La sonrisa sera la mejor arma contra la tristeza ").apply(entrada);
        printMessage("-> "+concatenar.replace('a','e') );


    }
}
