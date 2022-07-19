package co.com.sofka.clases;
import  static util.PrintLogger.printMessage;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.util.Scanner;

@ToString
public class Numeros {
    @Getter @Setter
    private Integer numero1;
    @Getter @Setter
    private Integer numero2;

    public Numeros(){

    }

    public Numeros(Integer numero1,Integer numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;

    }
       public void validar (){
           if(numero1 > numero2){
                printMessage(numero1 +" es mayor que: "+ numero2);
           }
           else if(numero1.equals(numero2)) {
               printMessage(numero1 + " es igual a: " + numero2);
           }
           else{
               printMessage(numero1 + " es menor que: " + numero2);
           }
        }
        public void entrada (){
            Scanner entrada = new Scanner(System.in);

            printMessage("Ingrese el primer numero: ");
            numero1 = entrada.nextInt();

            printMessage("Ingrese el segundo numero: ");
            numero2 = entrada.nextInt();
        }




}

