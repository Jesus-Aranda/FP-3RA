package eva3_11_capturar_clientes;
import java.util.*;

public class EVA3_11_CAPTURAR_CLIENTES {

    public static void main(String[] args) {
        String[] clientes = new String[2];
        double[] credito = new double[2];
        capturarClientes(clientes, credito);
        System.out.println("CLIENTES:");
        imprimir(clientes);
        System.out.println("CREDITO: ");
        imprimir(credito);
        System.out.println("TODO:");
        imprimir(clientes, credito);  
    }
    public static void capturarClientes(String[] clientes, double[] credito){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < clientes.length; i++) {
            System.out.println("Nombre del cliente: ");
            clientes[i] = input.nextLine();
            System.out.println("Credito: ");
            credito[i] = Double.parseDouble(input.nextLine());
        }
    }
    public static void imprimir(String[] clientes){
        for (int i = 0; i < clientes.length; i++) {
            System.out.println("[" + clientes[i] + "]");
        }
        System.out.println();
    }
    public static void imprimir(double[] credito){
        for (int i = 0; i < credito.length; i++) {
            System.out.println("[" + credito[i] + "]");
        }
        System.out.println();
    }
    public static void imprimir(String[] clientes, double[] credito){
        for (int i = 0; i < credito.length; i++) {
            System.out.println("[" + clientes[i] + "]");
            System.out.println("[" + credito[i] + "]");
        }
        System.out.println();
    }
    
}
