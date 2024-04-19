import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero:");
        double a = scanner.nextDouble();
        
        System.out.println("Ingrese el segundo número:");
        double b = scanner.nextDouble();
        
        double suma = a + b;
        System.out.println("La suma es: " + suma);
        
    }
}

