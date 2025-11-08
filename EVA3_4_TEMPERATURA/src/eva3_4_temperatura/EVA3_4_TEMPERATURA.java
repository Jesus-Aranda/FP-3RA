package eva3_4_temperatura;
import java.util.*;


public class EVA3_4_TEMPERATURA {
    static Scanner input = new Scanner(System.in);
    static double resu;
    public static void main(String[] args) {
        short option;
        do{
            menuGeneral();
            option = Short.parseShort(input.nextLine());
            switch(option){
                case 1:
                    convertFarCelcius();
                    break;
                case 2:
                    convertCelFarenhait();
                    break;
                case 3:
                    convertCelKelvin();
                    break;
                case 4:
                    convertKelCelsius();
                    break;
            }
        }while(option!=5);        
    }
    public static void menuGeneral(){
        System.out.println("-- Convertidor de temperaturas --");
        System.out.println("Elige lo que quieres realizar"
                + "\n1. Celsius a Farenheit a Celsius"
                + "\n2. Farenheit a Celsius"
                + "\n3. Celsius a Kelvin"
                + "\n4. Kelvin a Celsius"
                + "\n5. Salir del programa");
    }
    public static void convertFarCelcius(){
        double far;
        System.out.println("-- Convertidor de Farenheit -> Celcius --");
        System.out.println("Escribe los farenheit: ");
        far = Double.parseDouble(input.nextLine());
        resu = (far - 32)/1.8;
        System.out.println("El resultado es: " + resu + " celsius");
    }
    public static void convertCelFarenhait(){
        double cel;
        System.out.println("-- Convertidor de Celcius -> Farenheit --");
        System.out.println("Escribe los celsius: ");
        cel = Double.parseDouble(input.nextLine());
        resu = (cel * 1.8) + 32;
        System.out.println("El resultado es: " + resu + " farenhait");
    }
    public static void convertCelKelvin(){
        double cel;
        System.out.println("-- Convertidor de Celcius -> Kelvin --");
        System.out.println("Escribe los celsius: ");
        cel = Double.parseDouble(input.nextLine());
        resu = cel + 273.15;
        System.out.println("El resultado es: " + resu + " kelvin");
    }
    public static void convertKelCelsius(){
        double kel;
        System.out.println("-- Convertidor de Kelvin -> Celcius --");
        System.out.println("Escribe los kelvin: ");
        kel = Double.parseDouble(input.nextLine());
        resu = kel - 273.15;
        System.out.println("El resultado es: " + resu + " celsius");
    }
}
