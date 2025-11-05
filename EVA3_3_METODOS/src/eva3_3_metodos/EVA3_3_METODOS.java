package eva3_3_metodos;
import java.util.*;

public class EVA3_3_METODOS {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor;
        do{
            menuGeneral();
            valor = Integer.parseInt(input.nextLine());
            switch(valor){
                case 1:
                    realizarSuma();
                    break;
                case 2:
                    realizarPotencia();
                    break;
                case 3:
                    break;
            }
        }while(valor != 4);
    }
    public static void menuGeneral(){
        System.out.println("---Menu---");
        System.out.println("Elige la opcion que necesitas:\n"
                + "1. Calcular una suma\n"
                + "2. Calcular una potencia\n"
                + "3. Imprimir un mensaje\n"
                + "4. Terminas");
    }
    //Calcular suma
    public static void realizarSuma(){
        Scanner input = new Scanner(System.in);
        int val, val2;
        System.out.println("Escribe primer termino: ");
        val = Integer.parseInt(input.nextLine());
        System.out.println("Escribe segundo termino: ");
        val2 = Integer.parseInt(input.nextLine());
        int resu = sumar(val, val2);
        System.out.println("La suma es " + resu);
    }
    public static int sumar(int num, int num2){
        return num + num2;
    }
    //Calcular potencia
    public static void realizarPotencia(){
        Scanner input = new Scanner(System.in);
        int val, val2;
        System.out.println("Escribe la base: ");
        val = Integer.parseInt(input.nextLine());
        System.out.println("Escribe el exponente: ");
        val2 = Integer.parseInt(input.nextLine());
        int resu = potencia(val, val2);
        System.out.println("El resultado es: " + resu);
        
    }
    public static int potencia(int num, int num2){
        int pot = 1;
        for (int i = 1; i <= num2; i++) {
            pot = pot * num;
        }
        return pot;
    }
}
