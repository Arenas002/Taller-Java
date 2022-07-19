package co.com.sofka.clases;
import static util.PrintLogger.printMessage;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int option;
        boolean salir = false;



        while (!salir) {

            printMessage("****** GESTION CINEMATOGRÁFICA ********\n" +
                    "1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n" +
                    "4-MODIFICAR ACTOR\n" +
                    "5-VER TODOS LOS ACTORES\n" +
                    "6- VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8-SALIR\n"
                    );

            try {


                option = sc.nextInt();

                switch (option) {
                    case 1:

                       break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:

                        break;
                    case 8:
                        salir = true;
                        break;
                    default:
                        printMessage(" ------OPCION INCORRECTO-------- ");
                }
            }catch(InputMismatchException e){
                printMessage("debe ser un numero");
                sc.next();
            }
        }

        printMessage("---------Menú finalizado--------- ");

    }
}
