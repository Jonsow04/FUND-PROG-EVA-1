package eva1_6_entradas_salidas;
import java.util.*;
import java.lang.Math;

public class EVA1_6_ENTRADAS_SALIDAS {
    private static Scanner input = new Scanner(System.in);
            
    public static void main(String[] args) {
      //Se declaran variables
      String marca;
      String modelo;
      int anio;
      double precio;
      
      //Se introducen datos
      System.out.println("Marca del auto:");
      marca = input.nextLine();
      System.out.println("Modelo del auto:");
      modelo = input.nextLine();
      System.out.println("Año del auto:");
      anio = input.nextInt();
      System.out.println("Precio del auto:");
      precio = input.nextDouble();
      
      //Se muestran los datos
      System.out.println("La marca del auto: " + marca);
      System.out.println("EL modelo del auto: " + modelo);
      System.out.println("El año del auto es: " + anio);
      System.out.println("El precio del auto es: " + precio);
    }
}
