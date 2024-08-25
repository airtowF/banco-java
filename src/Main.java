package src;

import dominios.Conta;
import dominios.Cliente;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Conta conta = new Conta();
        conta.titular = new Cliente();

        System.out.print("Digite o nome do titular: ");
        conta.titular.nome = scanner.nextLine();

        System.out.print("Digite o CPF do titular: ");
        conta.titular.cpf = scanner.nextLine();

        System.out.print("Digite a profissão do titular: ");
        conta.titular.profissao = scanner.nextLine();

        System.out.print("Digite o salário do titular: ");
        conta.titular.salario = scanner.nextDouble();

        System.out.println("Nome: " + conta.titular.nome);
        System.out.println("CPF: " + conta.titular.cpf);
        System.out.println("Profissão: " + conta.titular.profissao);
        System.out.println("Salário: " + conta.titular.salario);

        scanner.close();
    }
}