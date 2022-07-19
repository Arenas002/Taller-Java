package co.com.sofka.clases;
import static util.PrintLogger.printMessage;
public class App {

    public static void main(String[] args) {

        for(Integer i = 0;i<=1000;i+=2){
            printMessage("->"+ i);
        }

    }
}
