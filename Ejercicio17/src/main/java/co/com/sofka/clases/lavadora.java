package co.com.sofka.clases;

import lombok.Getter;

public class lavadora extends Electrodomestico{

@Getter
    private double  carga ;

private final static double cargaPorDefecto = 5;

    public lavadora(){
        this.precioBase = precioBasePorDefecto;
        this.color = colorPorDefecto;
        this.consumoEnergetico = ConsumoEnergeticoPorDefecto;
        this.peso = pesoPorDefecto;
        this.carga = cargaPorDefecto;

    }


    public lavadora(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.carga =cargaPorDefecto;

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
