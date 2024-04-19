import java.util.Scanner;

public class SumaClase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        MainSumaClase sumador = new MainSumaClase();
        
        System.out.println("Ingrese el primer número:");
        sumador.n1 = scanner.nextInt();
        
        System.out.println("Ingrese el segundo número:");
        sumador.n2 = scanner.nextInt();
        
        sumador.sm();
        
        scanner.close();
    }
}