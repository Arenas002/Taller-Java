package co.com.sofka.clases;

import java.util.Scanner;

import static util.PrintLogger.printMessage;

public class App

{





    public static void main( String[] args )
    {





        Scanner enter = new Scanner(System.in);
        printMessage("Ingrese su nombre: ");
        String nombre = enter.nextLine();
        printMessage("Ingrese su edad: ");
        Integer old = enter.nextInt();
        printMessage("Ingrese su sexo: ");
        char sexo = enter.next().charAt(0);
        printMessage("Ingrese su peso: ");
        double peso = enter.nextDouble();
        printMessage("Ingrese su altura: ");
        double altura = enter.nextDouble();


        Persona persona1 = new Persona();
        Persona persona2 = new Persona(nombre, old, sexo);
        Persona persona3 = new Persona(nombre, old, sexo, peso, altura);


        persona1.setNombre("Leonardo");
        persona1.setEdad(48);
        persona1.setSexo('M');
        persona1.setPeso(70);
        persona1.setAltura(1.70);

        persona2.setPeso(90.5);
        persona2.setAltura(1.72);

        printMessage("Persona1");
        MensajePeso(persona1);
        MuestraMayorDeEdad(persona1);
        printMessage(persona1.toString());

        printMessage("Persona2");
        MensajePeso(persona2);
        MuestraMayorDeEdad(persona2);
        printMessage(persona2.toString());

        printMessage("Persona3");
        MensajePeso(persona3);
        MuestraMayorDeEdad(persona3);
        printMessage(persona3.toString());

    }

    public static void MensajePeso(Persona p) {
        int IMC = p.calcularIMC();
        switch (IMC) {
            case 0:
                printMessage("La persona esta en su peso ideal");
                break;
            case -1:
                printMessage("La persona esta por debajo de su peso ideal");
                break;
            case 1:
                printMessage("La persona esta por encima de su peso ideal");
                break;
            default:
        }
    }


    public static void MuestraMayorDeEdad(Persona p) {

        if (p.esMayorDeEdad()) {
            printMessage("La persona es mayor de edad");
        } else {
           printMessage("La persona no es mayor de edad");
        }
  }
}
