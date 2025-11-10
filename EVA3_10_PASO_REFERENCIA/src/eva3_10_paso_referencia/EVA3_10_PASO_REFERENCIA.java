package eva3_10_paso_referencia;


public class EVA3_10_PASO_REFERENCIA {

    public static void main(String[] args) {
        int[] arreglo = new int[10];
        int[] arreglo2 = new int[20];
        llenarArreglo(arreglo);
        imprimirArreglo(arreglo);
        llenarArreglo(arreglo2);
        imprimirArreglo(arreglo2);
        
    }
    public static void llenarArreglo(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
    }
    public static void imprimirArreglo(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println();
    }
}
