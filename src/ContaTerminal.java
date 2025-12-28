import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu Saldo!");
        double saldo = scanner.nextDouble();

        scanner.close();
    }
}