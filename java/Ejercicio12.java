public class Ejercicio12{
    public static void main(String[] args) {
        int numero = 28;

        // Utilizando el operador 'and' (&&)
        if (numero >= 1 && numero <= 12) {
            System.out.println("El número pertenece a la primer docena.");
        } else if (numero >= 13 && numero <= 24) {
            System.out.println("El número pertenece a la segunda docena.");
        } else if (numero >= 25 && numero <= 36) {
            System.out.println("El número pertenece a la tercer docena.");
        } else {
            System.out.println("El número " + numero + " está fuera de rango.");
        }

        // Utilizando el operador 'or' (||)
        if ((numero >= 1 && numero <= 12) || (numero >= 13 && numero <= 24) || (numero >= 25 && numero <= 36)) {
            System.out.println("El número pertenece a alguna de las docenas.");
        } else {
            System.out.println("El número " + numero + " está fuera de rango.");
        }
    }
}
