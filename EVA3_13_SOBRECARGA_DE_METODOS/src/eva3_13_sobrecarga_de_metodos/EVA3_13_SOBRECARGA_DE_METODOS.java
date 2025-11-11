package eva3_13_sobrecarga_de_metodos;
import java.util.*;

public class EVA3_13_SOBRECARGA_DE_METODOS {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        generarMenu();
    }
    public static void area(double a){
        //Circulo
        double resu, radio;
        System.out.println("Escribe el radio del circulo: ");
        radio = Double.parseDouble(input.nextLine());
        resu = (radio*radio) * Math.PI;
        System.out.println("Tu resultado es: \n" + resu);
    }
    public static void area(int a){
        //Rectangulo
        double resu, largo, ancho;
        System.out.println("Escribe el largo del rectangulo: ");
        largo = Double.parseDouble(input.nextLine());
        System.out.println("Escribe el ancho del rectangulo: ");
        ancho = Double.parseDouble(input.nextLine());
        resu = ancho * largo;
        System.out.println("Tu resultado es: \n" + resu);
    }
    public static void area(double a, double b){
        //Trapecio
        double resu, areaMenor, areaMeyor, altura;
        System.out.println("Escribe el area mayor del trapecio: ");
        areaMeyor = Double.parseDouble(input.nextLine());
        System.out.println("Escribe el area menor del trapecio: ");
        areaMenor = Double.parseDouble(input.nextLine());
        System.out.println("Escribe la altura del trapecio: ");
        altura = Double.parseDouble(input.nextLine());
        resu = (areaMeyor + areaMenor) * (altura / 2);
        System.out.println("Tu resultado es: \n" + resu);
    }
    public static void generarMenu(){
        int respuesta;
        System.out.println("----MENU----");
        do{
            System.out.print("Que quieres hacer:"
                    + "\n1. Sacar area de Circulo"
                    + "\n2. Sacar area de Rectangulo"
                    + "\n3. Sacar area de Trapecio"
                    + "\n4. Salir\n");
            respuesta = Integer.parseInt(input.nextLine());
            switch(respuesta){
                case 1:
                    area(0.0);
                    break;
                case 2:
                    area(1);
                    break;
                case 3:
                    area(0.0, 0.0);
                    break;
                case 4:
                    break;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
                default:
                    System.out.println("Escribe algo valido");
            }
        }while(respuesta != 4);
    }
}
