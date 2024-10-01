import java.util.Scanner;

public class Ejercicio6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de curso: ");
        int curso = scanner.nextInt();
        
        String texto;
        
        if (curso == 0) {
            texto = "Jardín de infantes";
        } else if (curso >= 1 && curso <= 6) {
            texto = "Primaria";
        } else if (curso >= 7 && curso <= 12) {
            texto = "Secundaria";
        } else {
            texto = "Curso no válido";
        }
        
        System.out.println(texto);
    }
}
