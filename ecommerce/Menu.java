package ecommerce;

import java.util.Scanner;
import ecommerce.util.cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		int op;
		
		while (true) {
			System.out.println(cores.TEXT_YELLOW_BOLD);
			System.out.println("\nBoas vindas ao MAGICAE, onde a magia acontece!");
			System.out.println(cores.TEXT_BLACK);
			System.out.println("**************************************************");
			System.out.println(cores.TEXT_YELLOW_BOLD);
            System.out.println("\t\tMENU MAGICAE");
            System.out.println(cores.TEXT_BLACK);
            System.out.println("**************************************************");
            System.out.println("\n1. Cadastro");
            System.out.println("\n2. Login");
            System.out.println("\n3. Gestão de produtos");
            System.out.println("\n4. Carrinho de compras");
            System.out.println("\n5. Checkout de compras");
            System.out.println("\n6. Listar pedidos");
            System.out.println("\n7. Sair");
            
            System.out.print("\nEscolha uma opção: ");
            op = read.nextInt();
            
           
            
            if (op == 7) {
            	System.out.println(cores.TEXT_YELLOW_BOLD + "\nObrigada por acessar a MAGICAE. Lhe desejamos uma vida mágica!");
				read.close();
				System.exit(0);
            }
            
            System.out.println(cores.TEXT_RESET);
            
            switch (op) {
			case 1:
				System.out.println("\nCadastro");
				break;
			
			case 2:
				System.out.println("\nLogin");
				break;
				
			case 3:
				System.out.println("\nGestão de produtos");
                break;
                
			case 4:
				System.out.println("\nCarrinho de compras");
                break;
                
			case 5:
				System.out.println("\nCheckout de compras");
               	break;
               	
			case 6:
				System.out.println("\nListar pedidos");
               	break;
                
			default:
				System.out.println(cores.TEXT_RED_BOLD + "\nOpção Inválida. Por favor, digite uma opção válida.");
                break;
			}
	
		}
		
		
	}

}
