package eva3_13_sobrecarga;
import java.util.*;

public class EVA3_13_SOBRECARGA {

    public static void main(String[] args) {
        String resu = inText("Introduce el nombre del cliente: ");
        System.out.println(resu);
        double valor;
        valor = inText("Salario del empleado: ", 0.0);
        System.out.println(valor);
        int edad;
        edad = inText("Edad del usuario: ", 1);
        System.out.println(edad);
    }
    public static String inText(String mensaje){
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        return input.nextLine();
    }
    public static double inText(String mensaje, double dummy){
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        return Double.parseDouble(input.nextLine());
    }
    public static int inText(String mensaje, int dummy){
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        return Integer.parseInt(input.nextLine());
    }
}
