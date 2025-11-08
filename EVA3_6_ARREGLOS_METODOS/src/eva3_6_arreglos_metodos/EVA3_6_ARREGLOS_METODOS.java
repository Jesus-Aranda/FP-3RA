package eva3_6_arreglos_metodos;


public class EVA3_6_ARREGLOS_METODOS {
    static String[] menu = {"Productos", "Ventas", "Clientes", "Salir"};
    static String[] productos = {"Tacos", "Tortas", "Tamales", "Salir"};
    
    public static void main(String[] args) {
        imprimirArreglo(menu);
        imprimirArreglo(productos);
    }
    public static void imprimirArreglo(String[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println((i + 1) + ".- " + arreglo[i]);
        }
        System.out.println();
    }
}
