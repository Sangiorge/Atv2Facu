import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Requisito 1: Pedir numero
        System.out.print("Coloque um numero: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        scanner.close();

        // Requisito 2: Mostrar numero informado
        System.out.print("O numero informado foi: " + numero);

    }
}
