public class Ejercicio15{
    public static void main(String[] args) {
        char claseAuto = 'b';

        switch (claseAuto) {
            case 'a':
                System.out.println("Características del auto de clase A:");
                System.out.println("- 4 ruedas");
                System.out.println("- Motor");
                break;
            case 'b':
                System.out.println("Características del auto de clase B:");
                System.out.println("- 4 ruedas");
                System.out.println("- Motor");
                System.out.println("- Cierre centralizado");
                System.out.println("- Aire acondicionado");
                break;
            case 'c':
                System.out.println("Características del auto de clase C:");
                System.out.println("- 4 ruedas");
                System.out.println("- Motor");
                System.out.println("- Cierre centralizado");
                System.out.println("- Aire acondicionado");
                System.out.println("- Airbag");
                break;
            default:
                System.out.println("La clase de auto ingresada no es válida.");
                break;
        }
    }
}
