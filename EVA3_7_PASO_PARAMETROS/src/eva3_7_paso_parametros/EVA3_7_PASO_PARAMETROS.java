package eva3_7_paso_parametros;


public class EVA3_7_PASO_PARAMETROS {

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Original = " + num);
        incrementar(num);
        System.out.println("Despues de incrementar = " + num);
    }
    public static void incrementar(int valor){
        valor = valor + 1;
    }
}
