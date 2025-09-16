package main;

import java.util.Scanner;

import crud_Cliente.CrudCliente;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n==============================");
            System.out.println("#### Cadastro De Clientes ####");
            System.out.println("==============================");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Editar Cliente");
            System.out.println("4. Deletar Cliente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = Integer.parseInt(scn.nextLine());

            switch (opcao) {
                case 1:
                    CrudCliente.executar(scn);
                    break;
                case 0:
                    System.out.println("Saindo do sistema. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção entre 0 e 4.");
            }
        } while (opcao != 0);

        scn.close();
    }
}