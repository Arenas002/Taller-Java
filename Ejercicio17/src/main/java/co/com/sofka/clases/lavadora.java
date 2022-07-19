package co.com.sofka.clases;

import lombok.Getter;

public class lavadora extends Electrodomestico{

@Getter
    private double  carga ;

private final static double CARGA_POR_DEFECTO = 5;

    public lavadora(){
        this.precioBase = PRECIO_BASE_POR_DEFECTO;
        this.color = COLOR_POR_DEFECTO;
        this.consumoEnergetico = CONSUMO_EJERGETICO_POR_DEFECTO;
        this.peso = PESO_POR_DEFECTO;
        this.carga = CARGA_POR_DEFECTO;

    }


    public lavadora(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.carga = CARGA_POR_DEFECTO;

    }

    public lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

@Override
    public double precioFinal(){
    double cable = super.precioFinal();

    if(carga>30){
        cable +=50;
    }
    return cable;
    }
}
