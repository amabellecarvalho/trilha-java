import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();

        // Limpando o buffer do teclado
        scanner.nextLine();

        scanner.close();
    }
}