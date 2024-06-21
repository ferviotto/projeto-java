package ecommerce;

import java.util.Scanner;

import ecommerce.model.clientes;
import ecommerce.model.produtos;
import ecommerce.util.cores;

public class Menu {

	public static void main(String[] args) {
		
		
		//Teste Cadastro Cliente
	    clientes c1 = new clientes("Fernanda","04/10/1996","996543312","fer123@gmail.com","Rua Alberto de Souza","fer123","123$fer", "Fernanda V", 46378123, 456, "12/10/2030");
		c1.cadastrarCliente();
		c1.exibirDadosCartao();
		c1.exibirUsuario();
		
		//Teste Produtos
		
		produtos p1 = new produtos ("Vela Aromática Amare", "Óleos Essencias: gerânio, bergamota italiana e alecrim. Parafina vegetal.", 82.90, 1, 10, "Velas", true, 1554252);
		p1.exibirGestaoProduto();
		p1.exibirStatusAtividade();
		p1.exibirCarrinho();
		p1.exibirCheckout();	
		
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
				System.out.println("\n\n\tCadastro");
				c1.cadastrarCliente();
				System.out.println("\n\n\tDados do Cartão");
				c1.exibirDadosCartao();
				break;
			
			case 2:
				System.out.println("\n\n\tLogin");
				c1.exibirUsuario();
				break;
				
			case 3:
				System.out.println("\n\n\tGestão de produtos");
				p1.exibirGestaoProduto();
				p1.exibirStatusAtividade();
                break;
                
			case 4:
				System.out.println("\n\n\tCarrinho de compras");
				p1.exibirCarrinho();
                break;
                
			case 5:
				System.out.println("\n\n\tCheckout de compras");
				p1.exibirCheckout();
               	break;
               	
			case 6:
				System.out.println("\n\n\tListar pedidos");
               	break;
                
			default:
				System.out.println("\n\n\tOpção Inválida. Por favor, digite uma opção válida.");
                break;
			}
	
		}
		
		
	}

}
