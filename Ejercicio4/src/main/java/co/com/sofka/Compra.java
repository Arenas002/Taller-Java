package co.com.sofka;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static util.PrintLogger.printMessage;

import java.util.Scanner;
@ToString
public class Compra {
    @Getter @Setter
    private final double ivaPorcentaje;
    @Getter @Setter
    private double precio;


    public Compra(double ivaPorcentaje) {
        this.ivaPorcentaje = ivaPorcentaje;
    }

    public double calculate(){

        Scanner enter = new Scanner(System.in);
        printMessage("Ingrese el precio del producto");
        precio = enter.nextDouble();
        double calcular =  precio * ivaPorcentaje;
        printMessage("El iva del producto es de: "+calcular);
        return calcular;
    }
}
