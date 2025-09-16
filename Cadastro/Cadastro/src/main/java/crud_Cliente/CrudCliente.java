package crud_Cliente;

import java.util.Scanner;

public class CrudCliente {
	public static void executar(Scanner scanner) {
		Scanner scn = new Scanner(System.in);
        int escolha;
        
        do {
            System.out.println("\n==============================");
            System.out.println("#### Menu Clientes ####");
            System.out.println("==============================");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            escolha = Integer.parseInt(scn.nextLine());

            switch (escolha) {
                case 1:
                    cadastrarCliente(scn);
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha 0 ou 1.");
            }
        } while (escolha != 0);
    
