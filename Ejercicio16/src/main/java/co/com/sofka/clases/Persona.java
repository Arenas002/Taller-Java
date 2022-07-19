package co.com.sofka.clases;
import lombok.Getter;
import lombok.Setter;
import java.util.Random;

import static util.PrintLogger.printMessage;


public class Persona {
    @Setter @Getter
    private String nombre;
    @Setter @Getter
    private Integer edad;
    @Setter @Getter
    private String DNI;
    @Setter @Getter
    private  char sexo ;
    @Setter @Getter
    private double peso;
    @Setter @Getter
    private double altura ;

    private final  char sexoPorDefecto = 'H';


    public Persona(){
    this.nombre = "";
    this.edad =0;
    this.sexo = sexoPorDefecto;
    this.peso = 0;
    this.altura =0;
    }

    public Persona(String nombre, Integer edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso=0;
        this.altura = 0;
    }

    public Persona(String nombre, Integer edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        generaDNI();
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        comprobarSexo();
    }

    private void comprobarSexo() {

        //Si el sexo no es una H o una M, por defecto es H
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = sexoPorDefecto;
        }
    }

    public int calcularIMC(){
        double pesoIdeal = (peso/(Math.pow(altura,2)));
        if(pesoIdeal<20){
            return -1;
        }
        else if(pesoIdeal >=20 || pesoIdeal <=25){

            return 0;
        }else

           return 1;
    }

    public boolean esMayorDeEdad(){
        boolean mayor = false;
        if (edad >= 18) {
            mayor =true;
        }

    return mayor;
    }



    public void generaDNI(){

        Random rnd = new Random();
        Integer number = rnd.nextInt(99999999);
        DNI = Integer.toString(number) + generarLetra(number);
        printMessage(DNI);
    }

    public static char generarLetra(Integer dniNumber){
        String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dniNumber%23;
       return caracteres.charAt(resto);

    }

    @Override
    public String toString() {
        String genero;
        if (this.sexo == 'H') {
            genero = "hombre";
        } else {
            genero = "mujer";
        }
        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + genero + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + DNI + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    }

}
