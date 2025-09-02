package Conta;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ///Declarando variáveis
        
        int ContaCorrente;
        String agencia;
        String nomeCliente;
        double saldo;

        ///Solicitando informações do cliente

        System.out.print("Número da agência: ");
        int agencia = sc.nextLine();
        sc.nextLine();

        System.out.print("Digite o número: ");
        int ContaCorrente = sc.nextLine();
        sc.nextLine();

        System.out.print("Digite o nome do titular:");
        String nomeCliente = sc.nextLine();
        sc.nextLine();

        System.out.print("Digite o Saldo:");
        String saldo = sc.nextLine();
        sc.nextLine();

        /// enquadrando as variáveis juntamente com o resultado

        System.out.print("Dados da conta: " + agencia + "\n");
        System.out.print("Número da conta corrente: " + ContaCorrente + "\n");
        System.out.print("Titular da conta: " + nomeCliente + "\n");
        System.out.print("Saldo da conta: R$ " + saldo + "\n");

        sc.close();

    }
}
