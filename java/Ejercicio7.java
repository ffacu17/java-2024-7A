import java.util.Scanner;

public class Ejercicio7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();
        
        System.out.print("Ingrese el tercer número entero: ");
        int numero3 = scanner.nextInt();
        
        int mayor = numero1; // Suponemos que el primer número es el mayor
        
        if (numero2 > mayor) {
            mayor = numero2;
        }
        
        if (numero3 > mayor) {
            mayor = numero3;
        }
        
        System.out.println("El número mayor es: " + mayor);
    }
}