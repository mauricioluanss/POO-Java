import java.util.Scanner;

public class ContaBancaria {
    //atributos
    private String titular;
    private float saldo;
    private int numeroConta;
    private String cpf;


    Scanner scan = new Scanner(System.in);


    //metodo constructor
    public ContaBancaria(String titular, int numeroConta, String cpf) {
        this.titular = titular;
        this.saldo = 0f;
        this.numeroConta = numeroConta;
        this.cpf = cpf;
    }

    //metodo getter que vai mostrar os dados gerais do cliente
    public void getStatus(){
        System.out.println("### DADOS DO CLIENTE ###");
        System.out.println("Titular: " + this.titular);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Conta: " + this.numeroConta);
        System.out.printf("Saldo: R$%.2f\n.", getExibirSaldo());
    }

    //metodo setter pra realizar o deposito
    public void setDepositar() {
        System.out.println("Digite o valor que deseja despositar: ");
        float value = scan.nextFloat();

        if (value > 0f) {
            this.saldo += value;
            System.out.printf("Valor R$%.2f depositado na conta %d.", value, this.numeroConta);
        } else {
            System.out.println("Valor não permitido.");
        }
    }

    //metodo setter para sacar. verifica se tem o valor disponivel pra saque
    public void setSacar() {
        System.out.println("Digite o valor que deseja sacar: ");
        float saque = scan.nextFloat();

        if (saque>=this.saldo) {
            System.out.println("Saldo insuficiente... Seu pobre kkkkkkkkkkkkk");
        } else {
            this.saldo -= saque;
            System.out.printf("Saque relizado com sucesso.");
        }
    }

    //metodo getter para retornar o valor de 'saldo'.
    public float getExibirSaldo() {
        return this.saldo;
    }
}
