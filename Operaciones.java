import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);
        double num1, num2;
        int opcion;
        
        do {
            System.out.println("Ingresa el primer numero:");
            num1 = opc.nextDouble();
            
            System.out.println("Ingresa el segundo numero:");
            num2 = opc.nextDouble();
            
            System.out.println("Seleccione la operacion a realizar:");
            System.out.println("1. Para Suma");
            System.out.println("2. Para Resta");
            System.out.println("3. Para Multiplicacion");
            System.out.println("4. Para Division");
            System.out.println("5. Para Modulo");
            
            opcion = opc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("ha seleccionado Suma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("ha seleccionado Resta: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("ha seleccionado Multiplicacion: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("ha seleccionado Division: " + (num1 / num2));
                    } else {
                        System.out.println("No se puede dividir por cero");
                    }
                    break;
                case 5:
                    if (num2 != 0) {
                        System.out.println("Modulo: " + (num1 % num2));
                    } else {
                        System.out.println("No se puede calcular por cero");
                    }
                    break;
                default:
                    System.out.println("Opcion incorrecta, por favor seleccione una opción válida.");
            }
        } while (opcion < 1);
        
    }
}
