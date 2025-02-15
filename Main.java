/**Autor: Mauricio Silva
 * Data: 15/02/2025
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("### SISTEMINHA DE BANCO PARA ESTUDOS DE POO EM JAVA###\n\n");

        System.out.print("Digite o seu nome completo: ");
        String titular = scan.nextLine().toUpperCase();
        System.out.print("Digite o seu CPF: ");
        String cpf = scan.nextLine();
        int numeroConta = (int) (Math.random() * 1000); // gera n aleatorio de 0 a 999

        ContaBancaria cliente = new ContaBancaria(titular, numeroConta, cpf);
        System.out.println("\nConta criada com sucesso.");

        int opcao;
        do {
            System.out.println("\n##########################");
            System.out.println("##### MENU DE OPÇÕES #####");
            System.out.println("##########################");
            System.out.print("1-Saldo // 2-Sacar // 3-Depositar // 4-Consulta dados gerais // 0-SAIR\n");
            System.out.println("Digite a opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("\nSaldo: R$" + cliente.getExibirSaldo());
                case 2 -> cliente.setSacar();
                case 3 -> cliente.setDepositar();
                case 4 -> cliente.getStatus();
                case 0 -> System.out.println("\nSaindo...");
                default -> System.out.println("\nOpção inválida.");
            }
        } while (opcao != 0);
        scan.close();
    }
}