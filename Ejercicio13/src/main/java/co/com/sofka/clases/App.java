package co.com.sofka.clases;
import util.PrintLogger;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import  static util.PrintLogger.printMessage;
public class App 
{
    public static void main( String[] args )
    {


        LocalDateTime fechaHoraActual = LocalDateTime.now();
        printMessage("Fecha y hora actuales "+ fechaHoraActual);

    }
}
