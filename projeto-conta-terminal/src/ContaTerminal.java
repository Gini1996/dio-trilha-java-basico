import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o número da Conta");
        numero = scanner.nextInt();

        System.out.println("Digite o número de sua Agência");
        agencia = scanner.next();

        System.out.println("Digite seu nome");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite seu saldo atual");
        saldo = scanner.nextDouble();
        
        System.out.println("Olá ".concat(nomeCliente).concat(" , obrigado por criar uma conta em nosso banco, sua agência é ").concat (agencia).concat(" , conta ") + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
