import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la nota de la primera evaluación: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Ingrese la nota de la segunda evaluación: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Ingrese la nota de la tercera evaluación: ");
        double nota3 = scanner.nextDouble();
        
        double promedio = (nota1 + nota2 + nota3) / 3.0;
        
        if (promedio >= 7) {
            System.out.println("El alumno está aprobado con un promedio de " + promedio);
        } else {
            System.out.println("El alumno está reprobado con un promedio de " + promedio);
        }
    }
}
