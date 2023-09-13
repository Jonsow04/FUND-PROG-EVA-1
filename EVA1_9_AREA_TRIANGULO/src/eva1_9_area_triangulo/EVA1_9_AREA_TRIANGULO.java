
package eva1_9_area_triangulo;
import java.util.*;
import java.lang.Math;

public class EVA1_9_AREA_TRIANGULO {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        //Declaración de variables
        double base;
        double altura;
        double area;
        
        //Introducción de datos
        System.out.println("Introduzca la base del triángulo:");
        base = input.nextDouble();
        System.out.println("Introduzca la altura del triángulo:");
        altura = input.nextDouble();
        //Resultado
        area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
        
    }
    
}
