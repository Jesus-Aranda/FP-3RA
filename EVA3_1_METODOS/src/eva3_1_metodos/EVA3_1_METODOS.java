package eva3_1_metodos;
import java.util.*;

public class EVA3_1_METODOS {
    
    public static void main(String[] args) {
        //Invocar metodo
        //Llamada a procedimiento o funcion
        int resu;
        resu = calcularCuadrado(4);
        System.out.println("El area del cuadrado es \n" + resu);
        System.out.println("El area del cuadrado es \n" + calcularCuadrado(4));
        calcularCuadrado(4);
       
        
        
    }
    //Modificadores
    //Modificador de acceseo : public, protect, private, default
    //static --> se necesita para usar nuestros metodos en el main
    //public static
            //Valor de retorno (Tipo de dato)
                //Nombre del metodo (Usar verbos)
                    //Lista de parametros
                    //Cero o N cantidad
    
    public static int calcularCuadrado(int num){//Encabezado 
        int cuadrado = num + num;
        return cuadrado;//Regresa el resultado
        //ya no se ejecuta mas codigo despues del return
        
    }
    
    
}
