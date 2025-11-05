package eva3_2_metodos;


public class EVA3_2_METODOS {

    public static void main(String[] args) {
        repetirMensaje("Hola", 5);
    }
    public static void repetirMensaje(String mensaje, int repetir){
        for (int i = 0; i < repetir; i++) {
            System.out.println(mensaje);
        }
    }
}
