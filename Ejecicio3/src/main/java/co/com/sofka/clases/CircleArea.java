package co.com.sofka.clases;
import static  util.PrintLogger.printMessage;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Scanner;

@ToString
public class CircleArea {
    @Setter @Getter
    private double radio;
    @Setter @Getter
    private double pi;


    public void insertData(){
        Scanner enter = new Scanner(System.in);
        printMessage("Ingrese el radio del circulo");
        radio = enter.nextDouble();
        area();


    }

    public double area(){
        pi = Math.PI;
        double area = pi * Math.pow(radio,2);
        printMessage("El area del circulo de diametro "+radio +" es: "+area);
        return area;
    }

}
