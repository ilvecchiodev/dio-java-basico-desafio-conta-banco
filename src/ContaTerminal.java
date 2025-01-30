/***
 * DIO - Trilha Java Básico - Sintaxe - Desafio Conta Banco
 * Crie um programa que simule a criação de uma conta em um banco.
 * O programa deve solicitar ao usuário o número da agência, o código da agência, o número da conta, o nome do cliente e o saldo da conta.
 * Ao final, o programa deve exibir uma mensagem com os dados da conta e o saldo disponível.
 * 
 * @numeroAgencia
 * @codigoAgencia
 * @numeroConta
 * @nomeCliente
 * @saldoConta
 * 
 * @author Gilberto vecchi Macedo
 * @date 29/01/2025
 */
import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        criarConta();
    }

    public static void criarConta() {
        
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("\nPor favor, digite o número da agência: ");
            String numeroAgencia = scanner.nextLine();

            System.out.println("Digite o código da agência: ");
            String codigoAgencia = scanner.nextLine();

            System.out.println("Digite o número da conta: ");
            String numeroConta = scanner.nextLine();

            System.out.println("Digite o seu nome: ");
            String nomeCliente = scanner.nextLine();

            System.out.println("Digite o seu saldo: ");
            double saldoConta = scanner.nextDouble();

            System.out.println("\nOlá " 
                    + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                    + "sua agência é " + codigoAgencia + ", "
                    + "o número da sua agência é o " + numeroAgencia + ". "
                    + "Sua conta é a " + numeroConta 
                    + " e o seu saldo de R$ " + String.format("%.2f", saldoConta) + " já está disponível para saque.\n");
        }
    }
}
