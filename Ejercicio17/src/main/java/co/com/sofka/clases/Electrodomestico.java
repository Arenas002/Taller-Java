package co.com.sofka.clases;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Electrodomestico {
    //Atributos
@Getter
     public double precioBase ;
    @Getter
    public String color ;
    @Getter
    public char consumoEnergetico ;
    @Getter
    public double peso;

    //constantes por defecto
    protected  final static double PRECIO_BASE_POR_DEFECTO = 100;
    protected final static String COLOR_POR_DEFECTO = "blanco";
    protected  final static char CONSUMO_EJERGETICO_POR_DEFECTO = 'F';
    protected  final static double PESO_POR_DEFECTO = 5;

//construcores


   public Electrodomestico(){
      this.precioBase = PRECIO_BASE_POR_DEFECTO;
      this.color = COLOR_POR_DEFECTO;
      this.consumoEnergetico = CONSUMO_EJERGETICO_POR_DEFECTO;
      this.peso = PESO_POR_DEFECTO;
    }

    public Electrodomestico( double precioBase, double peso){
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoEnergetico = CONSUMO_EJERGETICO_POR_DEFECTO;
        this.color = COLOR_POR_DEFECTO;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {

        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;

    }

    //funciones

    public  void comprobarConsumoEnergetico(char letra){
        if(letra >=65 && letra<=70){
            consumoEnergetico = letra;
        }else {
            this.consumoEnergetico = CONSUMO_EJERGETICO_POR_DEFECTO;
        }


    }

    public void comprobarColor(String color){
        String [] colores ={"blanco","negro","rojo","azul","gris"};
        boolean encontrado = false;
        for (int i =0;i<colores.length && !encontrado;i++){
            if(colores[i].equals(color)){
                encontrado = true;
            }
        }
        if(encontrado){
            this.color =color;

        }else{
            this.color = COLOR_POR_DEFECTO;
        }
    }

    public double precioFinal(){
        double precio = 0;
        switch (consumoEnergetico){
            case 'A':
                precio+=100;
                break;
            case 'B':
                precio+=80;
                break;
            case 'C':
                precio+=60;
                break;
            case 'D':
                precio+=50;
                break;
            case 'E':
                precio+=30;
                break;
            case 'F':
                precio+=10;
                break;
            default:
        }

       if(peso>=0 && peso<19){
           precio+=10;

       }else if(peso>20 && peso<49){
           precio+=50;
       } else if (peso>50 && peso<=79) {
           precio+=80;
       } else if (peso>80) {
           precio +=100;
       }
       return precioBase +precio;

    }
}
