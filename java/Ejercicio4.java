import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una categoría (a, b o c): ");
        char categoria = scanner.nextLine().toLowerCase().charAt(0);
        
        String palabra;
        
        switch (categoria) {
            case 'a':
                palabra = "hijos";
                break;
                
            case 'b':
                palabra = "padres";
                break;
                
            case 'c':
                palabra = "abuelos";
                break;
                
            default:
                palabra = "Categoría no válida";
                break;
        }
        
        System.out.println("La categoría " + categoria + " corresponde a: " + palabra);
    }
}
