package co.com.sofka.clases;

import lombok.Getter;

public class Television extends Electrodomestico{


    @Getter

    private  double resolucion;
    @Getter
    private boolean sintonizadorTDT;

    private final static int RESOLUCION_POR_DEFECTO = 20;

    public Television(){
        this.precioBase = PRECIO_BASE_POR_DEFECTO;
        this.color = COLOR_POR_DEFECTO;
        this.consumoEnergetico = CONSUMO_EJERGETICO_POR_DEFECTO;
        this.peso = PESO_POR_DEFECTO;
        this.resolucion = RESOLUCION_POR_DEFECTO;
        this.sintonizadorTDT = false;
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television(double precioBase,String color,char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precioBase,color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

@Override
    public double precioFinal() {
        double cable = super.precioFinal();

        if(resolucion>40){
            cable +=precioBase*0.3;
        }
        if(sintonizadorTDT){
            cable +=50;
        }
        return cable;

    }
}
