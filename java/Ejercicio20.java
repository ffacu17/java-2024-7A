import java.util.Random;

public class Ejercicio20{
    public static void main(String[] args) {
        Random rand = new Random();
        int contador = 1;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        System.out.println("Generando 10 números aleatorios:");

        do {
            int numero = rand.nextInt(100); // Genera un número aleatorio entre 0 y 99
            System.out.println("Número " + contador + ": " + numero);

            if (numero > maximo) {
                maximo = numero;
            }

            if (numero < minimo) {
                minimo = numero;
            }

            contador++;
        } while (contador <= 10);

        System.out.println("El máximo es: " + maximo);
        System.out.println("El mínimo es: " + minimo);
    }
}
