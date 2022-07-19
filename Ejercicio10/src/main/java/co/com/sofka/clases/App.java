package co.com.sofka.clases;

import  static util.PrintLogger.printMessage;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner enter = new Scanner(System.in);
        printMessage("Ingrese el texta al cual le quiere eliminar los espacios: ");
        String text = enter.nextLine();

        text = text.replaceAll("\\s+","");

        printMessage("Texto: "+ text);



    }
}
