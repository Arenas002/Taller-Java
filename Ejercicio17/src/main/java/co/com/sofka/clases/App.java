package co.com.sofka.clases;

import static util.PrintLogger.printMessage;

public class App 
{
    public static void main( String[] args )
    {
        Electrodomestico ListaElectrodomesticos []= new Electrodomestico[10];

        ListaElectrodomesticos[0]= new Electrodomestico(600,"negro",'D',20);
        ListaElectrodomesticos[1]= new lavadora(300,"blanco",'B',40,20);
        ListaElectrodomesticos[2]= new Television(250,70);
        ListaElectrodomesticos[3]= new Electrodomestico(50,10);
        ListaElectrodomesticos[4]= new Television(200,"rojo",'A',60,30,true);
        ListaElectrodomesticos[5]= new lavadora(400,"azul",'D',100,15);
        ListaElectrodomesticos[6]= new Electrodomestico();
        ListaElectrodomesticos[7]= new lavadora(150,30);
        ListaElectrodomesticos[8]= new Television(300,"gris",'C',70,40,false);
        ListaElectrodomesticos[9]= new Electrodomestico(200,"blanco",'E',60);



        double sumarElectrodomestico = 0;
        double sumarTelevision = 0;
        double sumarLavadora = 0;

        for(int i=0;i<ListaElectrodomesticos.length;i++){
            if(ListaElectrodomesticos[i] instanceof Electrodomestico){
                sumarElectrodomestico +=ListaElectrodomesticos[i].precioFinal();
            }
            if(ListaElectrodomesticos[i] instanceof lavadora){
                sumarLavadora+=ListaElectrodomesticos[i].precioFinal();

            }
            if (ListaElectrodomesticos[i] instanceof Television){
                sumarTelevision+=ListaElectrodomesticos[i].precioFinal();
            }
    }

        printMessage("La suma del precio de electrodomesticos es de "+sumarElectrodomestico);
        printMessage("La suma del precio las lavadoras es de "+sumarLavadora);
        printMessage("La suma del precio los televisores es de "+sumarTelevision);

    }
}
