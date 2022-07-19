package co.com.cosfka.clases;

import java.util.Scanner;

import static  util.PrintLogger.printMessage;
public class App 
{
    public static  Integer contarCaracteres(String cadenaTexto,char caracter){
        Integer posterior = 0;
        Integer contador = 0;
        posterior = cadenaTexto.indexOf(caracter);
        while (posterior!=-1){
            contador ++;
            posterior = cadenaTexto.indexOf(caracter,posterior+1);
        }
        return contador;


    }
    public static void main( String[] args )
    {

        Scanner enter = new Scanner(System.in);
        printMessage("Ingrese la cadena de texto: ");
        String cadena = enter.nextLine();
        Integer contadorCaracteres = contarCaracteres(cadena,'a');


        Integer contadorCaracterese = contarCaracteres(cadena,'e');


        Integer contadorCaracteresi = contarCaracteres(cadena,'i');


        Integer contadorCaractereso = contarCaracteres(cadena,'o');


        Integer contadorCaracteresu = contarCaracteres(cadena,'u');
        printMessage("el texto tiene:\na= "+contadorCaracteres+"\ne= "+contadorCaracterese+"\ni= "+contadorCaracteresi+"\no= "+contadorCaractereso+ "\nu= "+contadorCaracteresu);

    }
}
