package co.com.sofka.clases;


import static util.PrintLogger.printMessage;
public class App 
{
    public static void main( String[] args )
    {

        for(Integer i = 0;i<=100;i ++ ){
            if(i%2==0){
                printMessage("--"+ i);
            }
        }

        for(Integer i=0;i< 100;i++){

            if(i % 2 !=0){
             printMessage("--"+ i);
            }
        }
    }
}
